// Creamos 100 checkbox con numeros aleatorios
function crearCheckbox(){
	for(i=0;i<100;i++)
	{
		document.body.innerHTML+="<br/>";
		var valorAleatorio=Math.random();
		// Creamos el checkbox con value aleatorio
		var checkbox = document.createElement('input');
		checkbox.type = "checkbox";
		checkbox.name = "name";
		checkbox.value = valorAleatorio;
		checkbox.id = "id"+i;
		// Al lado del checkbox tenemos un label con el mismo valor aleatorio
		var label = document.createElement('label');
		label.appendChild(document.createTextNode(valorAleatorio));
		// Anexamos checbox y etiqueta al body
		document.body.appendChild(checkbox);
		document.body.appendChild(label);

	}
}	

function borrar() {
	for (var i=0;i<100;i++) {
		document.getElementById("id"+i).checked = false;
	}
}

function marcar() {
	for (var i=0;i<100;i++) {
		document.getElementById("id"+i).checked = true;
	}
}

