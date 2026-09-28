const palabras = prompt("Introduce una frase").trim().split(" ")

const hola = "hola"

palabras.map(p => {

    if (p.length === 0) return ""

    return p[0].toUpperCase() + p.slice(1).toLowerCase()

})

