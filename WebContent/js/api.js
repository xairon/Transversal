function sendapi()
{
var body = "request1"+";"
+document.getElementById("pac-input").value+";"
+document.getElementById("pac-input2").value+";"
+document.getElementById("entreprise-emploi").value+";"
+document.getElementById("entreprise-secteur-Services").checked+";"
+document.getElementById("entreprise-secteur-Commerce").checked+";"
+document.getElementById("entreprise-secteur-Construction").checked+";"
+document.getElementById("entreprise-secteur-Industrie").checked+";"

+document.getElementById("pac-input").name+";"
+document.getElementById("pac-input2").name+";"
+document.getElementById("entreprise-emploi").name+";"
+document.getElementById("entreprise-secteur-Services").value+";"
+document.getElementById("entreprise-secteur-Commerce").value+";"
+document.getElementById("entreprise-secteur-Construction").value+";"
+document.getElementById("entreprise-secteur-Industrie").value+";";

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
    	liste(response);
        diagramme(response);
    
        //liste(lesdonnéesjson)//appel de function diagramme avec lib gson et JSON.parse(response)
    }
 
    doRequest(body, f);
}