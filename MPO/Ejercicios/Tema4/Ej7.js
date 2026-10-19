const letras = ["T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"]


document.addEventListener("keydown", function (event) {

    const contenedor = document.getElementById("contenedor")

    contenedor.innerHTML = ""
    const letra = event.key.toUpperCase()

    if (!letras.includes(letra)) {

        contenedor.innerHTML = "<p>¡¡Letra inválida!!</p>"

    }

    for (let i = 1; i <= 9999; i++) {

        const resto = i % 23

        const letraResto = letras[resto]

        if (letra === letraResto) {

            contenedor.innerHTML += `<p>${i}</p>`

        }

    }

})