function sendapi()
{
var etude = new Array;
	
	etude.push(document.getElementById("etudes-nombre").name +";"+
  document.getElementById("etudes-nombre").value);
  
	etude.push(";"+document.getElementById("etudes-regroupement-ecoles_paramedicales_et_sociales").value +";"+
  document.getElementById("etudes-regroupement-ecoles_paramedicales_et_sociales").checked);
  
	etude.push(";"+document.getElementById("etudes-regroupement-Universite").value+";"+
  document.getElementById("etudes-regroupement-Universite").checked);
  
	etude.push(";"+document.getElementById("etudes-regroupement-ecoles_juridiques_et_administratives").value+";"+
  document.getElementById("etudes-regroupement-ecoles_juridiques_et_administratives").checked);
  
	etude.push(";"+document.getElementById("etudes-regroupement-ecoles_superieures_art_et_culture").value+";"+
  document.getElementById("etudes-regroupement-ecoles_superieures_art_et_culture").checked);
  
	etude.push(";"+document.getElementById("etudes-regroupement-ecole_de_commerce,_gestion_et_comptabilite").value +";"+
  document.getElementById("etudes-regroupement-ecole_de_commerce,_gestion_et_comptabilite").checked);
  
	etude.push(";"+document.getElementById("etudes-regroupement-Formations_ingenieurs").value+";"+
  document.getElementById("etudes-regroupement-Formations_ingenieurs").checked);
  
	etude.push(";"+document.getElementById("etudes-regroupement-Section_de_techniciens_superieurs_et_assimiles").value+";"+
  document.getElementById("etudes-regroupement-Section_de_techniciens_superieurs_et_assimiles").checked);
  
	etude.push(";"+document.getElementById("etudes-regroupement-Universite_de_technologie").value+";"+
  document.getElementById("etudes-regroupement-Universite_de_technologie").checked);
  
	etude.push(";"+document.getElementById("etudes-regroupement-Grands_etablissement_MENESR").value+ ";"+
  document.getElementById("etudes-regroupement-Grands_etablissement_MENESR").checked);
  
	etude.push(";"+document.getElementById("etudes-regroupement-ecoles_normales_superieures").value+";"+ 
  document.getElementById("etudes-regroupement-ecoles_normales_superieures").checked);
  
	etude.push(";"+document.getElementById("etudes-regroupement-Instituts_nationaux_polytechniques").value+";"+
  document.getElementById("etudes-regroupement-Instituts_nationaux_polytechniques").checked); 
  
	etude.push(";"+document.getElementById("etudes-regroupement-ESPE").value+";"+
  document.getElementById("etudes-regroupement-ESPE").checked);
  
	etude.push(";"+document.getElementById("etudes-regroupement-Classes_preparatoires_aux_grandes_ecoles_(CPGE)").value+";"+
  document.getElementById("etudes-regroupement-Classes_preparatoires_aux_grandes_ecoles_(CPGE)").checked);
  
	etude.push(";"+document.getElementById("etudes-secteur-public").value+";"+
  document.getElementById("etudes-secteur-public").checked); 
  
	etude.push(";"+document.getElementById("etudes-secteur-prive").value+";"+
  document.getElementById("etudes-secteur-prive").checked);






	var population=new Array;
	  
	population.push(";"+document.getElementById("population-densite").name+";"+
  document.getElementById("population-densite").value);
  
	population.push(";"+document.getElementById("population-croissance").name+";"+
  document.getElementById("population-croissance").value);
  
	population.push(";"+document.getElementById("population-chomage").name+";"+
  document.getElementById("population-chomage").value);
  
	
	
	var territoire=new Array;	

	territoire.push(";"+document.getElementById("territoire-orientation-Residentiel").value+";"+document.getElementById("territoire-orientation-Residentiel").checked); 
	territoire.push(";"+document.getElementById("territoire-orientation-Urbain").value+";"+document.getElementById("territoire-orientation-Urbain").checked);  
	territoire.push(";"+document.getElementById("territoire-orientation-Industriel").value+";"+document.getElementById("territoire-orientation-Industriel").checked); 
	territoire.push(";"+document.getElementById("territoire-orientation-Agroalimentaire").value+";"+document.getElementById("territoire-orientation-Agroalimentaire").checked); 
	territoire.push(";"+document.getElementById("territoire-orientation-Diversifie").value+";"+document.getElementById("territoire-orientation-Diversifie").checked); 

	var entreprise=new Array;
	
	entreprise.push(";"+document.getElementById("entreprise-emploi").name+";"+document.getElementById("entreprise-emploi").value); 
	entreprise.push(";"+document.getElementById("entreprise-secteur-Services").value+";"+document.getElementById("entreprise-secteur-Services").checked); 
	entreprise.push(";"+document.getElementById("entreprise-secteur-Commerce").value+";"+document.getElementById("entreprise-secteur-Commerce").checked);  
	entreprise.push(";"+document.getElementById("entreprise-secteur-Construction").value+";"+document.getElementById("entreprise-secteur-Construction").checked); 
	entreprise.push(";"+document.getElementById("entreprise-secteur-Industrie").value+";"+document.getElementById("entreprise-secteur-Industrie").checked); 

	var body="";

	body="request1"+";" 
		+document.getElementById("pac-input").name+";"
		+document.getElementById("pac-input2").name+";"+etude+population+territoire+entreprise; 
		



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
		


	}

	doRequest(body, f);
}