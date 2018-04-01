function diagramme(response){

test =  JSON.parse(response);
console.log(test);
       var value = test.value;
        var name = test.name;
     

        
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

        		setTimeout(function(){
        			for(var i = 0;i<value.length;i++){
        			config.data.datasets[0].data.push(value[i]);}
        			for(var j = 0;j<name.length;j++){
        		  config.data.labels.push(name[j]);
        	
        		  
        	
        			}
        		  myChart.update();
        		}, 1000)
}
function liste(){
	var myArray = new Array();
	myArray[0] = new Array("1", "villeA", "37", "3", "14");
	myArray[1] = new Array("2", "villeB", "41", "2", "13");
	myArray[2] = new Array("3", "villeC", "56", "4", "10");
	myArray[3] = new Array("4", "villeD", "29", "2", "5");
	myArray[4] = new Array("5", "villeA", "37", "3", "14");
	myArray[5] = new Array("6", "villeB", "41", "2", "13");
	myArray[6] = new Array("7", "villeC", "56", "4", "10");
	myArray[7] = new Array("8", "villeD", "29", "2", "5");
	myArray[8] = new Array("9", "villeA", "37", "3", "14");
	myArray[9] = new Array("10", "villeB", "41", "2", "13");

    var myTable= "<table id=\"tableau\" class=\"table table-fixed table-striped \">";
    myTable += "<thead> <tr> <th>Rang</th> <th>Ville</th> <th>Département</th> <th>Région</th> <th>Score</th> </tr> </thead>";
    myTable += "<tbody>";
    
    for (var i=0; i<myArray.length; i++){

    	myTable += "<tr>";

    	for (var j=0; j<myArray[i].length; j++) {
    		myTable+="<td>" + myArray[i][j] + "</td>";
    	}

    	myTable += "</tr>";
    }
    
    myTable += "</tbody> </table>";

    document.getElementById('listeVilles').innerHTML = myTable;
    document.getElementById("containerListe").style.display = "none";
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