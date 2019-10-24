function loadJsonData() {
	var xhttp;
	if(window.XMLHttpRequest) {
		xhttp = new XMLHttpRequest();
	} else {
		xhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	// alert(xhttp);
	xhttp.onreadystatechange = function() {
		if(this.readyState == 4 && this.status == 200) {
			document.getElementById('displayArea').innerHTML = this.responseText;
		}
	}

	xhttp.open("GET","http://localhost:8000/data.json",true);
	xhttp.send();
}