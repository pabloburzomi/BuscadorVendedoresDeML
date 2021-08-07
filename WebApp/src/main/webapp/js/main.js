//alert("que pasa amigo");

//var products = document.getElementById("products")
//
//document.appendChild(products * 6)
//
//a.setText("queee")

var btn = document.querySelector('#boton')
var counter = 0

btn.setAttribute('#la')

btn.addEventListener('click', () => {

	
	//lista_actividades.push(actividad.value)

	console.log('fuego, terremoto?')
	diagramar()
	alert("Esto es un alerta")
	counter += 150

})

function diagramar() {

	alert("Esto es 3 un alerta")
	var div = document.createElement('div')
	div.classList.add('carga')
	div.style.marginLeft = counter + 'px'
	document.body.appendChild(div)

}
