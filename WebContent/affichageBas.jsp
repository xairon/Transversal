<div class="container-fluid">

	<div class="col-md-11">

		<div class="container">
			<div id="histogramme" style="width: 600px; height: 400px;"></div>
			<script type="text/javascript">
				// based on prepared DOM, initialize echarts instance
				var myChart = echarts.init(document
						.getElementById('histogramme'));

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

	</div>

	<div class="col-md-1">

			<div class="container containerCentrer">
				<div class="row">
					<a href="#" class="btn btn-primary btn-lg active" role="button"
						aria-pressed="mixed">Histogramme</a>
				</div>

				<div class="row">
					<a href="#" class="btn btn-primary btn-lg active" role="button"
						aria-pressed="mixed">Camembert</a>
				</div>
			</div>
		</div>
	</div>
</div>