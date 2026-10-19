let interval

const comenzar = () => {

    interval = setInterval(() => {
        alert("Hola")
    }, 5000);
}

const parar = () => {

    clearInterval(interval)

}