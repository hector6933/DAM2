document.write('<h1 class="titulo mt-4">Tabla tope de guapa👌</h1>')
const random = (max, min) => {

    return Math.floor(Math.random() * (max - min + 1)) + min;

}

const marcarTodos = () => {

    const checks = document.querySelectorAll('input[type="checkbox"]')

    checks.forEach(check => {

        check.checked = true

    })

}

const desMarcarTodos = () => {

    const checks = document.querySelectorAll('input[type="checkbox"]')

    checks.forEach(check => {

        check.checked = false

    })

}
document.write("<div class='container d-flex justify-content-center mt-3'>")
document.write("<table>")

document.write("<tr>")

for (let i = 1; i < 101; i++) {

    document.write("<td>")
    document.write(`<input type="checkbox" id="${i}">`)
    document.write(`<label for="${i}">${random(0, 1000)}</label>`)
    document.write("</td>")

    if (i % 10 === 0) {

        document.write("</tr>")
        document.write("<tr>")

    }

}
document.write("</tr>")

document.write("</table>")

document.write("</div>")