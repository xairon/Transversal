<div class="panel panel-default">
	<div class="panel-heading">
		<h4 class="panel-title">
			<a data-toggle="collapse" data-parent="#accordion" href="#collapse3">Territoire</a>
		</h4>
	</div>
	<div id="collapse3" class="panel-collapse collapse grisClair">
		<div class="container formulaireContainer ajusteAuto">
		
		
		
		<h5>Orientation économique</h5>

			<%
			String [] listeOrientationEco = {
					"Résidentiel",
					"Urbain",
					"Industriel",
					"Agroalimentaire",
					"Diversifié"
					}; 
					%>


			<%
			for (int i = 0 ; i < listeOrientationEco.length ; i++){ 
			%>

			<input type="checkbox" name="orientationEco" value=<%=listeOrientationEco[i] %>> <%=listeOrientationEco[i] %><br>

		
			<%} %>
		
		
		
		</div>
	</div>
</div>