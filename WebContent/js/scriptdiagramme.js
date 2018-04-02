function diagramme(response){

	test =  JSON.parse(response);
var v1=true;
var v2=true;
	       var value2 = test.value2;
	       var value = test.value;
	        var name = test.name;
	        var name2 = test.name2;
	        console.log(test);
	    	console.log(value);
	    	console.log(value2);
	    	console.log(name);
	    	console.log(name2);
	    	
  if(value.length==0&&name.length==0) 
	  v1 = false;
  if(value2.length==0&&name2.length==0) 
	  v2 = false;
  
  console.log(v1);
  console.log(v2);
        var config = {
        		  type: 'bar',
        		  data: {
        		    labels: [],
        		    datasets: [{
        		      label: [],
        		      data: [],
        		      backgroundColor: 'rgba(255, 99, 132, 0.2)',
        	            borderColor: 'rgba(255,99,132,1)',
        	            borderWidth: 1
        		    }]
        		  },
        options: {
	        scales: { yAxes: [{ ticks: { beginAtZero: true   }  }] }  }
        		};
        var randomColorPlugin = {

        	    // We affect the `beforeUpdate` event
        	    beforeUpdate: function(chart) {
        	        var backgroundColor = [];
        	        var borderColor = [];
        	        
        	        // For every data we have ...
        	        for (var i = 0; i < chart.config.data.datasets[0].data.length; i++) {
        	        
        	        	// We generate a random color
        	        	var color = "rgba(" + Math.floor(Math.random() * 255) + "," + Math.floor(Math.random() * 255) + "," + Math.floor(Math.random() * 255) + ",";
        	            
        	            // We push this new color to both background and border color arrays
        	            backgroundColor.push(color + "0.2)");
        	            borderColor.push(color + "1)");
        	        }
        	        
        	        // We update the chart bars color properties
        	        chart.config.data.datasets[0].backgroundColor = backgroundColor;
        	        chart.config.data.datasets[0].borderColor = borderColor;
        	    }
        	};

        	// We now register the plugin to the chart's plugin service to activate it
        	Chart.pluginService.register(randomColorPlugin);
        		var ctx = document.getElementById("histogramme");
        		var myChart = new Chart(ctx, config);

if(v1==true&&v2==false){
	setTimeout(function(){
		for(var i = 0;i<value.length;i++){
		config.data.datasets[0].data.push(value[i]);
	
		}
		for(var j = 0;j<name.length;j++){
	  config.data.labels.push(name[j]);


		}
	  myChart.update();
	}, 1000)	
}
if(v1==true&&v2==true){
	setTimeout(function(){
		for(var i = 0;i<value.length;i++){
		config.data.datasets[0].data.push(value[i]);
		config.data.datasets[0].data.push(value2[i]);
		}
		for(var j = 0;j<name.length;j++){
	  config.data.labels.push(name[j]);
	  config.data.labels.push(name2[j]);

		}
	  myChart.update();
	}, 1000)
}
        		
}
function liste(response){
	deleteTableau();
	test ="";
	test =  JSON.parse(response);
	
	var myArray = new Array();
	myArray[0] = test.liste;
	myArray[1] = test.liste2;
	
	var myTable= "<table id=\"tableauVilles\" class=\"table table-fixed table-striped \">";
    myTable += "<thead> <tr> <th>Rang</th> <th>Ville</th> <th>Departement</th> <th>Region</th> <th>Score</th> </tr> </thead>";
    myTable += "<tbody>";
    
    for (var i=0; i<myArray.length; i++){

    	myTable += "<tr style=\"cursor:pointer;\" onclick=\"recupLigneCliqueListe('" + myArray[i][1] + "')\">";

    	for (var j=0; j<myArray[i].length; j++) {
    		myTable+="<td>" + myArray[i][j] + "</td>";
    	}

    	myTable += "</tr>";
    }
    
    myTable += "</tbody> </table>";
   
   
    document.getElementById('listeVilles').innerHTML = myTable;
    document.getElementById("containerListe").style.display = "none";
}
function deleteTableau(){
	if(document.getElementById('tableauVilles') != null)
		document.getElementById('tableauVilles').innerHTML = '';
}
function recupLigneCliqueListe(){
	alert(arguments[0]);
}

/* champ map */
function hide() {
	document.getElementById("pac-input2").disabled = true;
}
function show() {
	document.getElementById("pac-input2").disabled = false;
}

function comparaison(){
	
	if(document.getElementById("pac-input2").disabled){
		document.getElementById("pac-input2").disabled = false;
	}
	else{
		document.getElementById("pac-input2").disabled = true;
	}
}

function comparaison2(){
    if(document.getElementById("comparaison").checked)
    	document.getElementById("pac-input2").disabled = false;
    else
    	document.getElementById("pac-input2").disabled = true;
 }


function decision(){
	if(document.getElementById("decision").checked){
		document.getElementById("justePrDecision").style.display = "none";
		document.getElementById("comparer").style.display = "";
	}
    else{
    	document.getElementById("justePrDecision").style.display = "";
    	document.getElementById("comparer").style.display = "none";
    }
}


/* liste <=> map */
function afficheCarte(){
	document.getElementById("containerListe").style.display = "none";
	document.getElementById("containerCarte").style.display = "";
	document.getElementById("selectionner").style.display = "";
	document.getElementById("comparer").style.display = "";
}

function afficheListe(){
	document.getElementById("containerListe").style.display = "";
	document.getElementById("containerCarte").style.display = "none";
	document.getElementById("selectionner").style.display = "none";
	document.getElementById("comparer").style.display = "none";
}


/* gère le menu pour que les slider se chargent avec le menu ouvert mais pour que l'utilisateur n'ait pas à tout fermer
 à la main */
$(document).ready(function(){
	$("#collapse1").collapse('hide');
	$("#collapse2").collapse('hide');
	$("#collapse3").collapse('hide');
	$("#collapse4").collapse('hide');
});

function ouvreEtudes(){
	$("#collapse1").collapse('toggle');
	$("#collapse2").collapse('hide');
	$("#collapse3").collapse('hide');
	$("#collapse4").collapse('hide');
}

function ouvrePopulation(){
	$("#collapse1").collapse('hide');
	$("#collapse2").collapse('toggle');
	$("#collapse3").collapse('hide');
	$("#collapse4").collapse('hide');
}

function ouvreTerritoire(){
	$("#collapse1").collapse('hide');
	$("#collapse2").collapse('hide');
	$("#collapse3").collapse('toggle');
	$("#collapse4").collapse('hide');
}

function ouvreEntreprises(){
	$("#collapse1").collapse('hide');
	$("#collapse2").collapse('hide');
	$("#collapse3").collapse('hide');
	$("#collapse4").collapse('toggle');
}