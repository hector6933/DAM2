const lista = document.getElementById("lista")

function random(myMin, myMax) {
    
    return Math.floor(Math.random() * (myMax - myMin + 1)) + myMin

}


const append = () => {

    lista.innerHTML += `<li>${random(1, 100)}</li>`

}
