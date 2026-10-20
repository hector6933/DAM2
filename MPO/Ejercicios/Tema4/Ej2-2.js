const esCasiPrimoPasc = (numero) => {



}

const crearTabla = () => {

    document.getElementById("boton").style = "display: none;"

    const tabla = document.createElement("table")

    let num = 0
    for (let i = 0; i < 100; i++) {

        const fila = document.createElement("tr")

        for (let j = 0; j < 100; j++) {

            const celda = document.createElement("td") 

            celda.appendChild(document.createTextNode(num))

            fila.appendChild(celda)
            num++

        }

        tabla.appendChild(fila)

    }

    document.body.appendChild(tabla)

}