let input

const validarFecha = (input) => {

    const match = input.match(/(\d{2})\/(\d{2})\/(\d{4})/)
    if (!match) return false

    // Hay que especificar que el parseo a int es en base 10 ya que pueden haber números tipo 02 09 etc
    const dia = parseInt(match[1], 10)
    const mes = parseInt(match[2], 10) - 1
    const anio = parseInt(match[3], 10)

    const fecha = new Date(anio, mes, dia)

    // Si pones una fecha inválida date le suma cosas
    // por ejemplo si le pones 31 a un mes date salta al mes siguiente y le pone un día random
    return fecha.getDate() === dia && fecha.getMonth() === mes && fecha.getFullYear() === anio

}

do {

    input = prompt("Introduce tu fecha de nacimiento en formato dd/mm/YYYY")

    if (!validarFecha(input)) {

        alert("Fecha inválida!!!!!!!!!!!!!!!!!!!!")

    } else break


} while (true)

const datos = input.split("/")

const fecha = new Date(datos[2], datos[1], datos[0])

const hoy = new Date()

let edad = hoy.getFullYear() - fecha.getFullYear()

// La resta de la edad coge literalmente los años que han pasado entre los años
// pero quiero sacar los años que han pasado entre los días 
// para eso compruebo que si el mes actual es menor que el mes de la fecha le resto 1 a edad ya que aún no hemos llegado a completar ese año
// si estamos en el mismo mes compruebo si el día de hoy es menor al día de la fecha entonces le resto 1 a edad ya que aún no hemos llegado a completar ese año, faltan unos días
if (hoy.getMonth() < fecha.getMonth() || (hoy.getMonth() === fecha.getMonth() && hoy.getDate() < fecha.getDate())) {

    edad--

}

alert(`Tienes ${edad} años!`)