<div class="panel panel-default">
	<div class="panel-heading" data-toggle="collapse" data-parent="#accordion" href="#" onclick="ouvreTerritoire()">
		<h4 class="panel-title">
			<a>Territoire</a>
		</h4>
	</div>
	<div id="collapse3" class="panel-collapse collapse interieurMenu in">
		<div class="container formulaireContainer ajusteAuto">
		
		
		
		<h5>Orientation economique</h5>

			<%
			String [] listeOrientationEco = {
					"Residentiel",
					"Urbain",
					"Industriel",
					"Agroalimentaire",
					"Diversifie"
					}; 
			
			for (int i = 0; i < listeOrientationEco.length; i++) {
			%>

			<input type="checkbox"
				id=<%="territoire-orientation-" + listeOrientationEco[i]%>
				name=<%="territoire-orientation-" + listeOrientationEco[i]%>
				value=<%=listeOrientationEco[i]%>>
			<%=listeOrientationEco[i]%><br>


			<%} %>



		</div>
	</div>
</div>