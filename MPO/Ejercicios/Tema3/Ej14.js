let input

do {

    input = parseInt(prompt("Introduce un año"))

    if (!Number.isInteger(input)) {

        alert("Introduce un número entero!!!")

    } else break

} while (true)


new Date().