<div class="panel panel-default">
	<div class="panel-heading">
		<h4 class="panel-title">
			<a data-toggle="collapse" data-parent="#accordion" href="#collapse2">Population</a>
		</h4>
	</div>
	<div id="collapse2" class="panel-collapse collapse">
		<div class="container formulaireContainer">

			<h5>Densité de la population</h5>
			<p>slide</p>
			
			
			<h5>Croissance de la population</h5>
			<p>slide</p>
			
			
			<h5>Taux de chômage</h5>
			<p>slide</p>




			<h5>Secteur</h5>

			<%
			String [] listeSecteursPop = {
					"Agriculture",
					"Industrie",
					"Construction",
					"Commerce et service",
					"Commerce",
					"Administration publique"
					}; 
					%>


			<%
			for (int i = 0 ; i < listeSecteursPop.length ; i++){ 
			%>

			<div class="checkbox">
				<label> <input type="checkbox" value=""><%=listeSecteursPop[i] %>
				</label>
			</div>

			<%} %>




		</div>
	</div>
</div>