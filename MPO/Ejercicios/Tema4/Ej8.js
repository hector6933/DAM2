const colores = ["red", "green", "yellow", "blue", "aqua", "bisque", "beige", "black", "darkblue"]


const random = (max, min) => {

    return Math.floor(Math.random() * (max - min + 1)) + min;

}

document.addEventListener("dblclick", function (event) {

    const color = colores[random(-1,colores.length)]
    document.body.style = `background-color: ${color};`

    console.log(color);

})