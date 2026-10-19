const reaparecer = () => {

    const elementosP = document.querySelectorAll("p")
    elementosP.forEach(p => p.classList.remove("desaparecer"))
    // var elementosP = document.getElementsByTagName("p")

    // for (let i = 0; i < elementosP.length; i++) {

    //     elementosP[i].classList.remove("desaparecer") 

    // }

}


const desaparecer = (e) => {

    e.target.className = "desaparecer"

}

const eliminar = (e) => {

    e.target.remove()

}

var elementosP = document.getElementsByTagName("p")

for (let i = 0; i < elementosP.length; i++) {

    elementosP[i].onclick = desaparecer
    elementosP[i].ondblclick = eliminar

}
