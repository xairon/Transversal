function diagramme(response){

test =  JSON.parse(response);
console.log(test);
       var value = test.value;
        var name = test.name;
     

       /* value.push(30);
        value.push(40);
        value.push(70);
        value.push(50);
        value.push(30);
       
        name.push('toto');
        name.push('titi');
        name.push('tyty');
        name.push('tete');
        name.push('tvtv');*/
        
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

function hide() {
    document.getElementById("pac-input2").disabled = true;
}
function show() {
    document.getElementById("pac-input2").disabled = false;
}
