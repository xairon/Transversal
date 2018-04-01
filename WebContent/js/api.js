function sendapi()
{
var body = "request1"+";"
+document.getElementById("pac-input").value+";"
+document.getElementById("pac-input2").value+";"
+document.getElementById("entreprise-emploi").value+";"
+document.getElementById("Services").checked+";"
+document.getElementById("Commerce").checked+";"
+document.getElementById("Construction").checked+";"
+document.getElementById("Industrie").checked+";"

+document.getElementById("pac-input").name+";"
+document.getElementById("pac-input2").name+";"
+document.getElementById("entreprise-emploi").name+";"
+document.getElementById("Services").value+";"
+document.getElementById("Commerce").value+";"
+document.getElementById("Construction").value+";"
+document.getElementById("Industrie").value+";";

    let server_domain = 'localhost:8080';
    function doRequest(body, callback) {
        const url = "http://" + server_domain + "/trans/API";
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
    	//liste(response);
        diagramme(response);
    
        //liste(lesdonnéesjson)//appel de function diagramme avec lib gson et JSON.parse(response)
    }
 
    doRequest(body, f);
}