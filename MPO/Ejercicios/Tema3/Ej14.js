let input

do {

    input = parseInt(prompt("Introduce un año"))

    if (!Number.isInteger(input)) {

        alert("Introduce un número entero!!!")

    } else break

} while (true)

if ((input % 4 === 0 && input % 100 !== 0) || input % 400 === 0 ) {

    alert("Es un año bisiesto")

} else {

    alert("NOOOO es un año bisiesto")

}

// • Es divisible entre 4 y no es divisible entre 100.
// • Es divisible entre 400