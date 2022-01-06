package mx.uv.powerfultest;

import static spark.Spark.*;

import com.google.gson.*;

import mx.uv.powerfultest.*;
import mx.uv.powerfultest.bd.Tarea;

import java.util.Map;
import java.util.UUID;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App {

    private static Gson gson = new Gson();
    private static Map<String, Tarea> tarea = new HashMap<>();

    public static void main( String[] args ){
        options("/*", (request, response) -> {

            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
            }

            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
            }

            return "OK";
        });
        before((req, res) -> res.header("Access-Control-Allow-Origin", "*"));
    }
}
