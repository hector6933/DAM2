    // 5. Crea un calendario del mes que le pidas al usuario.
   // Marca en color rojo los días festivos. Guarda los festivos en un array doble indexado por
   // el número del mes (0 a 11), así:
   // Este array nos dice que en enero hay 2 festivos, el 1 Y el 6 de enero. En febrero, ninguno
   // Array de festivos de 2025:
   var anio = 2025
   var festivos = [[1, 6], [], [], [17, 18, 23], [1], [], [], [15], [], [12], [1], [6, 8, 25]];
   var meses = ["enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"]
   // var mesUsuario = prompt("Dime el mes que quieras consultar")
   var mesUsuario = "octubre"
   // document.write(`${mesUsuario}`)


   var numeroMes;
   for (let i = 0; i <= 11; i++) {
      if (meses[i].includes(mesUsuario.toLowerCase())) {
         numeroMes = i;
      }


   }

   var festivosDelMes = festivos[numeroMes]

   if (numeroMes == null) {
      alert("Mes indicado invalido, autocompletando con enero")
      numeroMes = 0
   }



   // Aqui creo los date con el dia 1 para el primer dia del mes y el dia 0 del mes siguiente que nos devuelve el ultimo dia del mes anterior
   var primerDia = new Date(anio, numeroMes, 1)
   var ultimoDia = new Date(anio, numeroMes + 1, 0)

   // Aqui consigo las variables de el num de el dia de la semana (1 = Lunes, 7 = Domingo)
   var primerDiaNombreSemana = primerDia.getDay();
   var ultimoDiaNombreSemana = ultimoDia.getDay();


   // Aqui hago el calculo para pasar a metodo español en el que 1 es lunes y 7 es domingo
   if (primerDiaNombreSemana == 0) {
      primerDiaNombreSemana = 7
   }

   // La cantidad total de dias es el ultimo dia del mes
   var cantidadDias = ultimoDia.getDate()

   console.log(`El mes empieza en ${primerDiaNombreSemana}`);
   console.log(`El mes termina en ${ultimoDiaNombreSemana}`);
   console.log(`El mes tiene ${cantidadDias}`);
   console.log(`Este mes tiene los siguientes dias festivos: ${festivosDelMes}`);


   // Array de dias de semana para evitar picar a mano
   var semana = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"]

   // Contador para escribir los numeros reales
   var contadorReal = 1;

   // Contador que escribira un salto de linea en la tabla (tr) cada vez que sea domingo
   var contadorPasarSemana = 1;

   document.write(`${meses[numeroMes]}`)
   document.write("<table>")
   document.write("<tr>")
   semana.forEach(element => {
      document.write(`<th> ${element} </th>`)
   });
   document.write("</tr>")
   for (let i = 1; i < cantidadDias + primerDiaNombreSemana; i++) { // Se hace esto: cantidadDias+primerDiaNombreSemana porque aunque no este escrito el numero, ocupa un hueco que hay que tener en cuenta para el total

      // Si no ha llegado al primer dia donde empieza escribo un hueco en blanco pero aumento la variable contadorPasarSemana++ porque los huevos cuentan
      if (i < primerDiaNombreSemana) {
         document.write(`<td>  </td>`)
         contadorPasarSemana++
      }
      // Si ya hemos llegado al primer dia comenzamos a escribir y a contar
      if (i >= primerDiaNombreSemana) {

         // Y ahora hacemos la ultima comprobacion de si en los Festivos de este mes incluye el numero de el contador en cada iteracion
         // Si es asi hacemos lo mismo que si no fuera festivo pero en color rojo para indicar el festivo
         if (festivosDelMes.includes(contadorReal)) {
            document.write(`<td style=" color:red"> ${contadorReal} </td>`)
            contadorReal++
            contadorPasarSemana++

         } else {
            document.write(`<td> ${contadorReal} </td>`)
            contadorReal++
            contadorPasarSemana++
         }


      }

      // Y aqui miramos cada vez si ha llegado a 8 que entonces habria que hacer salto de linea por llegar a domingo en la tabla
      if (contadorPasarSemana == 8) {
         document.write(`<tr>  </tr>`)
         contadorPasarSemana = 1
      }
   }