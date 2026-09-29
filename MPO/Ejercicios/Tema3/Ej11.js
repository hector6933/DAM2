let inicio
let fin

const empezar = () => {

    inicio = new Date()

}

const finalizar = () => {

    fin = new Date()

    const diferencia = new Date(fin-inicio).getTime() / 1000
    console.log(`Han pasado ${diferencia} segundos `);

}

