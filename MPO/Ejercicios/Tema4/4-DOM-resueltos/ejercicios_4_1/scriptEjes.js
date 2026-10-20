var seguir = false;
var miVar;

function anadirNumero() {
    var numAleatorio = Math.floor(Math.random() * 10);
    var textUl = document.getElementById("nums").innerHTML;
    textUl += "<li>" + numAleatorio + "</li>";
    document.getElementById("nums").innerHTML = textUl;
}

function esPrimo(num) {
    for(var i = 2; i < num; i++)
        if(num % i === 0) return false;
        return num > 1;
}

function comprobarCasiPrimo(num) {
    var bool = false;
    for (var i=Math.floor(num/2);i>1;i--) {
        //if (esPrimo(i)) {
            if (num % i == 0) {
                if (!bool) {
                    bool = true;
                } else {
                    return ">";
                }
            }
        //}
    }
    if (bool) {
        return " style='background-color:yellow;'>";
    } else {
        return ">";
    }
    
}

function generarTab() {
    var num = 1;
    var inHtml = "";
    for (var i=0;i<100;i++) {
        inHtml += "<tr>";
        for (var x=0;x<100;x++) {
            inHtml += "<td";
            inHtml += comprobarCasiPrimo(num);
            inHtml += num;
            num ++;
            inHtml += "</td>";
        }
        inHtml += "</tr>";
    }
    document.getElementById("tab").innerHTML = inHtml;
}

function generarChckb() {
    var numAleatorio;
    var inHtml = "";
    for (var i=0;i<100;i++) {
        numAleatorio = Math.floor(Math.random() * 10);
        inHtml += "<input type='checkbox' id='" + i + "'/>" + numAleatorio + "<br/>";
        document.getElementById("chckboxes").innerHTML = inHtml;
    }
}

function borrChckb() {
    for (var i=0;i<100;i++) {
        document.getElementById(i).checked = false;
    }
}

function marChckb() {
    for (var i=0;i<100;i++) {
        document.getElementById(i).checked = true;
    }
}

function elPar(id) {
    if (document.getElementById(id).style.opacity != "0") {
        document.getElementById(id).style.opacity = 0;
    } else {
        document.getElementById(id).parentNode.removeChild(document.getElementById(id));
    }
}

function resParr() {
    for (var i=1;i<4;i++) {
        if (document.getElementById("p"+i)!=null) {
            document.getElementById("p"+i).style.opacity = 100;
        }
    }
}

function insertPos(e) {
    alert ("bruh");
    inHtml = "Localización del puntero, X: " + e.clientX + ", Y: " + e.clientY;
    document.getElementById("pos").innerHTML = inHtml;
}

function empSal() {
    seguir = true;
    miVar = setInterval(function(){alert("Hola");},5000);
}

function parSal() {
    clearInterval(miVar);
}

function calcularDNIs() {
    var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
            'V', 'H', 'L', 'C', 'K', 'E', 'T']
    var letra = document.getElementById("letrDNI").value;
    letra = letra.toUpperCase();
    alert (letra);
    var num = letras.indexOf(letra);
    alert (num);
    num ++;
    var textSalida = "";
    for (var i=1;i<10000;i++) {
        if (i % 23 == num) {
            var numSad = i.toString();
            var lon = 4-numSad.length;
            for (var x=0;x<lon;x++) {
                 numSad = "0" + numSad;
            }
            textSalida += "<span>" + numSad + letra + " </span>";
        }
    }
    document.getElementById("resDNI").innerHTML = textSalida;
}

function cambiarFondoPant() {
    var randomColor = Math.floor(Math.random()*16777215).toString(16);
    document.getElementById("body").style.backgroundColor = "#" + randomColor;
}

function allowDrop(ev) {
    ev.preventDefault();
}
function drag(ev) {
    ev.dataTransfer.setData("text", ev.target.id);
}
function drop(ev) {
    //ev.preventDefault();
    document.getElementById('sol').src="imgEjercicio9/papeleraLLena.jpg";
    document.getElementById("arr").parentNode.removeChild(document.getElementById("arr"));
    //var data = ev.dataTransfer.getData("text");
    //ev.target.appendChild(document.getElementById(data));
}