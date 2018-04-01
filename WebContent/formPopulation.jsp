<div class="panel panel-default">
	<div class="panel-heading">
		<h4 class="panel-title">
			<a data-toggle="collapse" data-parent="#accordion" href="#" onclick="ouvrePopulation()">Population</a>
		</h4>
	</div>
	<div id="collapse2" class="panel-collapse collapse interieurMenu in">
		<div class="container formulaireContainer ajusteAuto">



			<div class="container margeSlider ajusteAuto">

				<h5>Densité de la population</h5>
				<input id="population-densité" type="text" name="population-densité" data-provide="slider"
					data-slider-ticks="[1, 2, 3]"
					data-slider-ticks-labels='["faible", "moyenne", "forte"]'
					data-slider-min="1" data-slider-max="3" data-slider-step="1"
					data-slider-value="2" data-slider-tooltip="hide" />

			</div>





			<div class="container margeSlider ajusteAuto">

				<h5>Croissance de la population</h5>
				<input id="population-croissance" type="text" name="population-croissance" data-provide="slider"
					data-slider-ticks="[1, 2, 3]"
					data-slider-ticks-labels='["faible", "moyenne", "forte"]'
					data-slider-min="1" data-slider-max="3" data-slider-step="1"
					data-slider-value="2" data-slider-tooltip="hide" />

			</div>





			<div class="container margeSlider ajusteAuto">

				<h5>Taux de chômage</h5>
				<input id="population-chomage" type="text" name="population-chomage" data-provide="slider"
					data-slider-ticks="[1, 2, 3]"
					data-slider-ticks-labels='["faible", "moyen", "fort"]'
					data-slider-min="1" data-slider-max="3" data-slider-step="1"
					data-slider-value="2" data-slider-tooltip="hide" />

			</div>







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
		
			for (int i = 0; i < listeSecteursPop.length; i++) {
				String regroupementMotSepare[] = listeSecteursPop[i].split(" ");
				String regroupementMotColle = "";
				for (int j = 0; j < regroupementMotSepare.length; j++) {
					if (j != 0)
						regroupementMotColle += "_";
					regroupementMotColle += regroupementMotSepare[j];
				}
			%>



			<input type="checkbox"
				id=<%="population-secteur-" + regroupementMotColle%>
				name=<%="population-secteur-" + regroupementMotColle%>
				value=<%=regroupementMotColle%>>
			<%=listeSecteursPop[i]%><br>
			<%} %>




		</div>
	</div>
</div>