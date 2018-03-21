<div class="panel panel-default">
	<div class="panel-heading">
		<h4 class="panel-title">
			<a data-toggle="collapse" data-parent="#accordion" href="#collapse4">Entreprises</a>
		</h4>
	</div>
	<div id="collapse4" class="panel-collapse collapse">
		<div class="container formulaireContainer">
		
		
		<h5>Taux d'emplois</h5>
			<p>slide</p>
			
			
			<h5>Secteur des entreprises</h5>
			
			<%
			String [] listeSecteursEntreprises = {
					"Services",
					"Commerce",
					"Construction",
					"Industrie"
					}; 
					%>


			<%
			for (int i = 0 ; i < listeSecteursEntreprises.length ; i++){ 
			%>

			<div class="checkbox">
				<label> <input type="checkbox" value=""><%=listeSecteursEntreprises[i] %>
				</label>
			</div>

			<%} %>
		
		
		
		</div>
	</div>
</div>