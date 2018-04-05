function sendselec()
{






	
	var body="";

	body= 
		document.getElementById("pac-input").name+";"
		+document.getElementById("pac-input2").name; 
		



	let server_domain = 'localhost:8080';
	function doRequest(body, callback) {
		const url = "http://" + server_domain + "/trans/APIselec";
		let xhr = new XMLHttpRequest();

		function internCallback() {
			if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
				callback(xhr.responseText);
			}
		}
		xhr.open('POST', url);
		xhr.onreadystatechange = internCallback;
		xhr.send(body);
	}
	function f(response) {
		
		liste(response);
		diagramme(response);
		


	}

	doRequest(body, f);
}