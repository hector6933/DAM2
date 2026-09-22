const mes = "octubre"

const festivos = [[1, 6], [], [], [17, 18, 23], [1], [], [], [15], [], [12], [1], [6, 8, 25]];

const anioActual = new Date().getFullYear();

const primerDiaMes = new Date(2026, 9, 1)
const ultimoDiaMes = new Date(2026, 9 + 1, 0);

const primerDiaSemana = primerDiaMes.getDay()
const ultimoDiaSemana = ultimoDiaMes.getDay()

document.write(`<h1 class="titulo">${mes}</h1>`)
document.write("<table>")
document.write("<tr>")
document.write("<th>Lunes</th>")
document.write("<th>Martes</th>")
document.write("<th>Miércoles</th>")
document.write("<th>Jueves</th>")
document.write("<th>Viernes</th>")
document.write("<th>Sábado</th>")
document.write("<th>Domingo</th>")
document.write("</tr>")
document.write("<tr>")

for (let i = 1; i <= ultimoDiaMes.getDate(); i++) {

    document.write("<tr>")
    
    for (let j = 0; j < 7; j++) {

        document.write(`<td> ${i}</td>`)

        // if (i < primerDiaSemana || i > ultimoDiaMes) {

        //     document.write(`<td> </td>`)

        // } else {

        //     document.write(`<td>numero</td>`)

        // }

    }

    document.write("</tr>")

}
document.write("</tr>")
document.write("</table>")



