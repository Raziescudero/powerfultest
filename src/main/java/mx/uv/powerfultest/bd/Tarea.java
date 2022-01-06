package mx.uv.powerfultest.bd;

public class Tarea {

    private String id;
    private String descripcion;
    private String imagen;
    
    
    public Tarea() {
    }


    public Tarea(String id, String descripcion, String imagen) {
        this.id = id;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getImagen() {
        return imagen;
    }


    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    
    
}
