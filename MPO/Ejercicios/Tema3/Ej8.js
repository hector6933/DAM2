const input = prompt("Introduce tú nombre y apellidos separados por espacios").trim()

const match = input.match(/[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ]+/g)

alert(match.reverse().join(", ")) 