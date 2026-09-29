const input = prompt("Introduce una fecha en formato dd-mm-aaaa")

// 01
// 31
const correcto = input.match(/^(0[1-9]|[1-2][0-9]|3[01])-(0[1-9]|1[0-2])-\d{4}$/)

if (correcto) {

    alert("La fecha está en el formato correcto")

} else {

    alert("La fecha NO está en el formato correcto")

}
