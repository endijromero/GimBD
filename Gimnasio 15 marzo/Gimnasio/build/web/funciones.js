/**
 * Crea el formulario
 */



function crearFormulario(event) {
	var tipoDeFormulario = event.target.id;
        

	// Mostrar formulario al seleccionar empresa o cliente
	document.querySelector(".esconder").style.display = "block";

	// Añadir campos correspondientes a cada tipo de formulario
	mostrarCampos(tipoDeFormulario);
}

/**
 * Añade campos correspondientes a cada tipo de formulario
 * Muestra recomnedaciones si se crear
 * Muestra las predeterminadas si elige
 */


function mostrarCampos(tipo) {
	if (tipo === 'predet') {
		// Mostrar campos de crear rutina
		document.querySelector('.recomendacion').style.display = "block";
                document.querySelector('.rutinas').style.display = "block";

		// Ocultar campos de generar rutina
		
                document.querySelector('.elegir').style.display = "none";
                document.querySelector('.problemas-salud-inferior').style.display = "none";
		document.querySelector('.problemas-salud-superior').style.display = "none";

		// Añade el id del elemento seleccionado al form
		document.querySelector('form').setAttribute("id" , tipo);
                
                
	} else {
		// Mostrar campos de generar rutina
		
		document.querySelector('.elegir').style.display = "block";
                document.querySelector('.problemas-salud-inferior').style.display = "block";
		document.querySelector('.problemas-salud-superior').style.display = "block";
		// Ocultar campos de empresa
		document.querySelector('.recomendacion').style.display = "none";
		document.querySelector('.rutinas').style.display = "none";

		// Añade el id del elemento seleccionado al form
		document.querySelector('form').setAttribute("id", tipo);
                
	}
}



/*
 * Valida el formulario 
*/
function validar(event) {
	var formId = event.target.id,
		nombre = document.getElementById("nombre").value,
		tel = document.getElementById("tel").value,
		email = document.getElementById("email").value,
		edad = document.getElementById("edad").value,
                peso = document.getElementById("peso").value,
                genero = document.getElementById("generoSelect").value;
	// Validaciones compartidas entre los dos formularios
	if (nombre === "") {
		emitAlert("nombre");
		return false;
	} else if (tel === "") {
		emitAlert("telefono");
		return false;
	} else if (email === "") {
		emitAlert("email");
		return false;
	} else if (edad === ""){
		emitAlert("edad");
		return false;
	} else if (peso === ""){
		emitAlert("peso");
		return false;
	} else if (genero === ""){
		emitAlert("genero");
		return false;
	}
        /*
	// Validaciones específicas para empresa
	if (formId === "crear") {
            
                
		var nit = document.getElementById("NIT").value;

		if (nit === "") {
			emitAlert("nit");
			return false;
		}
	}
    */

	// Validaciones específicas para cliente
	if (formId === "predet") {
		var p = document.getElementByName("rutina").value;

		if (p === "") {
			emitAlert("rutina");
			return false;
		}
	}

	return true;
}

/**
 * Crea el alert para todos
 */
function emitAlert(param) {
	alert("no puedes dejar el " + param + " sin rellenar")
}

/**
 * Imprime el resultado del formulario después del submit
 */
function imprimir() {
	var datos = obtenerDatosDeUrl();

	document.getElementById("nombre").innerHTML = datos.nombre;
	document.getElementById("tel").innerHTML = datos.tel;
	document.getElementById("email").innerHTML = datos.email;
	document.getElementById("edad").innerHTML = datos.edad;
        document.getElementById("generoSelect").innerHTML = datos.generoSelect;
        /*
    // Cliente
	var cedula = document.getElementById("CC");
		
	
	cedula && (cedula.innerHTML = datos.CC);

	if(datos.CC===""){
	document.querySelector('.cc-print').style.display = "none";
	} 
	 

	// Empresa
	var empresa = document.getElementById("empresa"),
		nit = document.getElementById("NIT");
		


	empresa && (empresa.innerHTML = datos.empresa);
	nit && (nit.innerHTML = datos.NIT);

	if(datos.empresa===""){
	document.querySelector('.tipo-empresa-print').style.display = "none";
	}
	
	if (datos.NIT===""){
	document.querySelector('.nit-print').style.display = "none";
	}
    
    */

}


/*
	Limpia la url
*/
function obtenerDatosDeUrl() {
	var url = location.search.replace("?", "");

	var arrUrl = url.split("&");
	var urlObj = {};

	for (var i = 0; i < arrUrl.length; i++) {
		var x = arrUrl[i].split("=");
		urlObj[x[0]] = x[1].replace("+", " ").replace("%40", "@");
	}

	return urlObj;
}