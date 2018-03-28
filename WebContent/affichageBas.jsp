<div class="container-fluid margeZero">

	<div class="col-md-10">


		<div id="histogramme" style="width: 500px; height: 350px;"></div>
		<script type="text/javascript">
			// based on prepared DOM, initialize echarts instance
			var myChart = echarts.init(document.getElementById('histogramme'));

			// specify chart configuration item and data
			var option = {
				title : {
					text : ' '
				},
				tooltip : {},
				legend : {
					data : [ 'Sales' ]
				},
				xAxis : {
					data : [ "shirt", "cardign", "chiffon shirt", "pants",
							"heels", "socks" ]
				},
				yAxis : {},
				series : [ {
					name : 'Sales',
					type : 'bar',
					data : [ 5, 20, 36, 10, 10, 20 ]
				} ]
			};

			// use configuration item and data specified to show chart
			myChart.setOption(option);
		</script>
	</div>



	<div class="col-md-2 pasDepasserPage">
		
		<div class="enColonne">
			<a href="#" class="btn btn-primary btn-lg active boutonDroite"
				role="button" aria-pressed="mixed">Histogramme</a>
		

		
			<a href="#" class="btn btn-primary btn-lg active boutonDroite"
				role="button" aria-pressed="mixed">Camembert</a>
		
		
		</div>
</div>