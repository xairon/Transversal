function diagramme(){
      
        var value =[];
        var name =[];

        value.push(0);
        value.push(40);
        value.push(70);
        value.push(50);
        value.push(30);
       
        name.push('toto');
        name.push('titi');
        name.push('tyty');
        name.push('tete');
        name.push('tvtv');
        
        var config = {
        		  type: 'bar',
        		  data: {
        		    labels: ["January"],
        		    datasets: [{
        		      label: "My First dataset",
        		      data: [65],
        		      fill: false
        		    }]
        		  }
        		};

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
