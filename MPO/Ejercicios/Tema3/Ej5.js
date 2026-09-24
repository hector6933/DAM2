// Lista de festivos de cada mes
const festivos = [[1, 6], [], [], [17, 18, 23], [1], [], [], [15], [], [12], [1], [6, 8, 25]]

// Lista de meses
const meses = ["enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"]

// Lista de los días de la semana
const dias = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"]

// Comprobar que el usuario me mete un més válido
do {

    const input = prompt("Introduce el mes").toLowerCase()
    var mes = meses.findIndex(m => m === input)
    console.log(mes)

    if (mes < 0) {

        alert("Introduce un mes válido, zopenco.")

    } else break


} while (true)

// Cuando tengo el mes guardo sus festivos en una lista que usaré a la hora de iterar los días
const festivosMes = festivos[mes]

// Me guardo el año actual
const anioActual = new Date().getFullYear()

// Cojo el primer día del mes para poder sacar en qué día de la semana empiez a el mes
const primerDiaMes = new Date(anioActual, mes, 1)
const primerDiaSemana = primerDiaMes.getDay() === 0 ? 7 : primerDiaMes.getDay()

// Para saber cuántos días tiene el mes saco el día anterior del mes siguiente
const ultimoDiaMes = new Date(anioActual, mes + 1, 0)

// Creo la tabla
document.write(`<h1 class="titulo">${meses[mes].toUpperCase()}</h1>`)
document.write("<table>")
document.write("<tr>")
dias.forEach(d => {

    document.write(`<th>${d}</th>`)

})
document.write("</tr>")



let num = 1
document.write("<tr>")
for (let i = 1; i <= 42; i++) {


    // Empiezo a escribir los días cuando la iteración está en el día de la semana que empieza y no se pasa del último día del mes
    // En caso contrario escribo una celda vacía
    if (i < primerDiaSemana || num > ultimoDiaMes.getDate()) {

        document.write(`<td></td>`)

    } else {

        // Al escribir cada día del mes compruebo si es festivo y le cambio el estilo
        document.write(`<td class="${festivosMes.includes(num) ? 'festivo' : ""}" >${num}</td>`)
        num++

    }


    // Para poder crear cada fila de la tabla cierro y abro una nueva fila cada vez que la iteración es múltiplo de 7
    // lo que quiere decir que es domingo
    // empiezo cerrando ya que siempre hay una abierta antes de llegar
    // y acabo abriendo para ir a la siguiente
    if (i !== 42 && i % 7 === 0) {

        document.write("</tr>")
        document.write("<tr>")

    }

}
// Acabo cerrando aquí ya que en la iteración 41 se queda sin cerrar el último tr
document.write("</tr>")
document.write("</table>")