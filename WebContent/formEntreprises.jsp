<div class="panel panel-default">
	<div class="panel-heading" data-toggle="collapse" data-parent="#accordion" href="#" onclick="ouvreEntreprises()">
		<h4 class="panel-title">
			<a">Entreprises</a>
		</h4>
	</div>
	<div id="collapse4" class="panel-collapse collapse interieurMenu in">
		<div class="container formulaireContainer ajusteAuto">



			<div class="container margeSlider ajusteAuto">

				<h5>Taux d'emplois</h5>
				<input id="entreprise-emploi" 
					type="text" 
					name="entreprise-emploi" 
					data-provide="slider"
					data-slider-ticks="[1, 2, 3]"
					data-slider-ticks-labels='["faible", "moyen", "fort"]'
					data-slider-min="1" 
					data-slider-max="3"
					data-slider-step="1"
					data-slider-value="2" 
					data-slider-tooltip="hide" />

			</div>




			<h5>Secteur des entreprises</h5>

			<%
				String[] listeSecteursEntreprises = { "Services", "Commerce", "Construction", "Industrie" };
			
				for (int i = 0; i < listeSecteursEntreprises.length; i++) {
			%>

			<input type="checkbox"
				id=<%="entreprise-secteur-" + listeSecteursEntreprises[i]%>
				name=<%="entreprise-secteur-" + listeSecteursEntreprises[i]%>
				value=<%=listeSecteursEntreprises[i]%>>
			<%=listeSecteursEntreprises[i]%><br>

			<%
				}
			%>



		</div>
	</div>
</div>