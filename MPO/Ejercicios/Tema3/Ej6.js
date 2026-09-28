const input = prompt("Introduce un correo electrónico").trim()


const correcto = input.match("^([a-zA-Z]+)@([a-zA-Z]+\\.[a-zA-Z]{2,})$")

if (correcto) {

    // info@correoelectronico.com
    alert(`Correcto!!\nUsuario: ${correcto[1]} \nDominio ${correcto[2]}`)
    
} else {

    alert("Incorrecto!!")

}