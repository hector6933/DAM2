// Simplemente, esta función cuando esta encima, controla el evento de "
// "estamos con la bola encima, podemos soltar"
function allowDrop(ev) {
  // Este código evita el comportamiento por defecto de este evento
  ev.preventDefault();
  console.log("allowdrop");
}

// Funcion a la que llamamos cuando se produce el "drag"
// Hacemos que el evento pueda transferir un dato ("informacion")

function drag(ev) {
  ev.dataTransfer.setData("Informacion", ev.target.id);
  console.log("drap");
}

// Funcion a la que llamamos cuando se produce el "drop"
function drop(ev) {
  // Prevenimos su comportamiento por defecto
  ev.preventDefault();
  // Hacemos que el evento reciba un dato ("informacion")
  var data = ev.dataTransfer.getData("Informacion");
  // Si el elemento que hemos soltado era la bola
  if(data=="bola"){
      document.getElementById("papelera").src="papeleraLLena.jpg";
      document.getElementById("bola").remove();
  }
  console.log("drop");
}
//lanzamos los eventos 
//document.ondragstart=drag;
