
document.write("<table>")

document.write("<tr>")

const esPrimo = (num) => {

    if (num === 1) return false

    for (let i = 2; i <= Math.sqrt(num); i++) {

        if (i !== 1 && num % i === 0) {

            return false

        }

    }

    return true

}

const esCasiPrimo = (num) => {

    if (esPrimo(num)) return false

    for (let i = 2; i <= Math.sqrt(num); i++) {

        if (num % i === 0) {

            const resultado = num / i

            if (esPrimo(resultado) && esPrimo(i)) {

                return true

            }


        }

    }

    return false

}

for (let i = 1; i <= 10000; i++) {

    if (esCasiPrimo(i)) {

        document.write(`<td class='casiPrimo'>${i}</td>`)

    } else {

        document.write(`<td>${i}</td>`)

    }


    if (i % 100 === 0) {

        document.write("</tr>")
        document.write("<tr>")

    }

}

document.write("</tr>")
document.write("</table>")