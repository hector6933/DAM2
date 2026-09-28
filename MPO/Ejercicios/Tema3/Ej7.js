const input = prompt("Introduce un texto").trim().replaceAll(/[. ,]/g,"")
// Allí ves Sevilla
// AlliVes sev illa
// Le quito los espacios
console.log(input);
if (input === input.split("").reverse().join("")) {

    alert("Es un palíndromo!!!")

} else {

    alert("NO es un palíndromo...")

}