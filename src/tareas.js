var btnRegistrarTarea = document.getElementById("registrarTarea")
btnRegistrarTarea.addEventListener("click", function (){
    axios.post("http://localhost:4567/usuario", {
        descripcion : document.getElementById("descripcion").value,
        imagen : document.getElementById("imagen").value
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

var btnAgregarTarea = document.getElementById("AgregarTarea")
btnAgregarTarea.addEventListener("click", function(){
    window.location.href="registroTarea.html"
})