var btnRegistrar = document.getElementById("registrarUsuario")
btnRegistrar.addEventListener("click", function (){
    axios.post("http://localhost:4567/usuario", {
        usuario : document.getElementById("Usuario").value,
        password : document.getElementById("Password").value
    })
    .then(function (response){
        alert("mensaje: usuario creado "+response.data.status+" con id: "+response.data.id);
        id = response.data.id;
        estado=response.data.status;
    })
    .catch(function (error) {
        console.log(error);
    })
})
