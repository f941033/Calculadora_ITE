var precio;

window.addEventListener("load",programa);

function programa(){
	botonImprimir.disabled=true;
	cajaArticulosTotal.style.width="450px";
	cajaUnidades.style.width="40px";
	cvv.style.width="25px";
	importe.style.width="100px";
	cajaArticulo.focus();
	cajaPrecioTotal.value=0;

	botonImprimir.addEventListener("click", imprimir);
	botonReset.addEventListener("click", resetear);
	botonAñadir.addEventListener("click", añadir);
	checkBox.addEventListener("change", activarBoton);
	pago.addEventListener("change", cargarPago);

	cargarPago();
}

function imprimir(){
	if(pago.value == "nada"){
		alert("Seleccione una forma de pago");
	}else{
		alert("Los artículos de mi carrito son: " + cajaArticulosTotal.value + "\n"+ 
			"y el precio total es: "+cajaPrecioTotal.value+" €" + "\n"+ 
			"Forma de pago: "+pago.value);
	}
	
}

function resetear(){
	checkBox.checked=false;
	botonImprimir.disabled=true;
	cajaArticulo.focus();
	cajaPrecioTotal.value=0;  // no funciona
	errorArticulo.textContent="";
	errorPrecio.textContent="";
	cajaPrecioTotal.value=0;
}

function añadir(){
	var error=0;
	

	if(cajaArticulo.value.length==0){
		errorArticulo.textContent=" falta artículo";
		cajaArticulo.focus();
		error++;
	}else{
		errorArticulo.textContent="";
	}
	
	if(cajaPrecio.value.length==0)
	{
		errorPrecio.textContent=" falta precio";
		if(error==0) cajaPrecio.focus();
		error++;
	}
	else
	{
		if(isNaN(cajaPrecio.value))
		{
			errorPrecio.textContent=" tipo de dato incorrecto";
			error++;

		}else{

			errorPrecio.textContent="";
		}

	}

	if(error==0){
		if(cajaArticulosTotal.value!=""){
			cajaArticulosTotal.value+=", ";
		}
		cajaArticulosTotal.value+=cajaArticulo.value;

		var dinero=0;
		if(cajaPrecioTotal.value!="") dinero=cajaPrecioTotal.value;

		cajaPrecioTotal.value=parseFloat(dinero)+parseFloat(cajaPrecio.value)*parseFloat(cajaUnidades.value);

		cajaArticulo.value="";
		cajaPrecio.value="";
		cajaUnidades.value=1;
		cajaArticulo.focus();
		errorArticulo.textContent="";
		errorPrecio.textContent="";
	}



}



function activarBoton(){
	if(checkBox.checked){
		botonImprimir.disabled=false;
	}else{
		botonImprimir.disabled=true;
	}
}

function cargarPago(){

	if (pago.value == "tarjeta"){
		capaTarjeta.style.display="block";
		capaEfectivo.style.display="none";
	}
	if (pago.value == "efectivo"){
		capaTarjeta.style.display="none";
		capaEfectivo.style.display="block";
		importe.value=cajaPrecioTotal.value;
	}
	if (pago.value == "nada"){
		capaTarjeta.style.display="none";
		capaEfectivo.style.display="none";
	}
}