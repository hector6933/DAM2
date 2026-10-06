
document.write("<h1 class='titulo'>Tabla de 100x100 😎</h1>")

document.write("<table>")

document.write("<tr>")

for (let i = 1; i <= 10000; i++) {

    document.write(`<td>${i}</td>`)
    
    if (i % 100 === 0) {

        document.write("</tr>")
        document.write("<tr>")

    }

}

document.write("</tr>")
document.write("</table>")