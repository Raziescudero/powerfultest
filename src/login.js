var btnLogin = document.getElementById("login")
var btnRegistro = document.getElementById("registrar")

btnLogin.addEventListener("click", function(){
    axios.get("http://localhost:4567/usuario", {
        usuario : document.getElementById("usuario").value,
        password : document.getElementById("password").value
    })
    .then(function(){
        window.location.href="tareas.html"
    })
})

btnRegistro.addEventListener("click", function(){
    window.location.href="registro.html"
})