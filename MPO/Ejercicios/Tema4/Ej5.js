function mostrarPos(evento) {

    console.log(`${evento.clientX} | ${evento.clientY}`)

}

document.getElementById("parrafo").onmousemove = mostrarPos
