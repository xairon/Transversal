<div class="panel panel-default">
	<div class="panel-heading">
		<h4 class="panel-title">
			<a data-toggle="collapse" data-parent="#accordion" href="#collapse2">Population</a>
		</h4>
	</div>
	<div id="collapse2" class="panel-collapse collapse grisClair">
		<div class="container formulaireContainer">



		<div class="container margeSlider">
			
				<h5>Densité de la population</h5>
				<input id="densitePop" type="text"
          data-provide="slider"
          data-slider-ticks="[1, 2, 3]"
          data-slider-ticks-labels='["faible", "moyenne", "forte"]'
          data-slider-min="1"
          data-slider-max="3"
          data-slider-step="1"
          data-slider-value="2"
          data-slider-tooltip="hide" />

			</div>
			
			
			
			<div class="container margeSlider">
				
				<h5>Croissance de la population</h5>
				<input id="croissancePop" type="text"
          data-provide="slider"
          data-slider-ticks="[1, 2, 3]"
          data-slider-ticks-labels='["faible", "moyenne", "forte"]'
          data-slider-min="1"
          data-slider-max="3"
          data-slider-step="1"
          data-slider-value="2"
          data-slider-tooltip="hide" />

			</div>
			
			
			
			<div class="container margeSlider">
			
				<h5>Taux de chômage</h5>
				<input id="tauxChomage" type="text"
          data-provide="slider"
          data-slider-ticks="[1, 2, 3]"
          data-slider-ticks-labels='["faible", "moyen", "fort"]'
          data-slider-min="1"
          data-slider-max="3"
          data-slider-step="1"
          data-slider-value="2"
          data-slider-tooltip="hide" />

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