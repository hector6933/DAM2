const hoy = new Date()

const dias = ["Domingo","Lunes","Martes","Miércoles","Jueves","Viernes","Sábado"]
const meses = ["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Ocbubre","Noviembre","Diciembre"]
//  jueves, 26 de noviembre de 2015


alert(`${dias[hoy.getDay()]}, ${hoy.getDate()} de ${meses[hoy.getMonth()]} de ${hoy.getUTCFullYear()}`);


