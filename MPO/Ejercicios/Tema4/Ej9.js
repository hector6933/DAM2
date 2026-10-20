function llenarPapelera(event) {

    // console.log(event);
    event.target.src = "papeleraLlena.png"

}

document.getElementById("papelera").ondragleave = llenarPapelera