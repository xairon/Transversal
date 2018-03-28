<div class="panel panel-default">
	<div class="panel-heading">
		<h4 class="panel-title">
			<a data-toggle="collapse" data-parent="#accordion" href="#collapse4">Entreprises</a>
		</h4>
	</div>
	<div id="collapse4" class="panel-collapse collapse grisClair">
		<div class="container formulaireContainer ajusteAuto">



			<div class="container margeSlider ajusteAuto">

				<h5>Taux d'emplois</h5>
				<input id="tauxEmploi" type="text" name="tauxEmploi" data-provide="slider"
					data-slider-ticks="[1, 2, 3]"
					data-slider-ticks-labels='["faible", "moyen", "fort"]'
					data-slider-min="1" data-slider-max="3" data-slider-step="1"
					data-slider-value="2" data-slider-tooltip="hide" />

			</div>



			<h5>Secteur des entreprises</h5>

			<%
				String[] listeSecteursEntreprises = { "Services", "Commerce", "Construction", "Industrie" };
			%>


			<%
				for (int i = 0; i < listeSecteursEntreprises.length; i++) {
			%>

			<input type="checkbox" name="SecteurEntreprise"
				value=<%=listeSecteursEntreprises[i]%>>
			<%=listeSecteursEntreprises[i]%><br>

			<%
				}
			%>



		</div>
	</div>
</div>