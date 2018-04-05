<div class="panel panel-default">
	<div class="panel-heading" data-toggle="collapse" data-parent="#accordion" href="#" onclick="ouvrePopulation()">
		<h4 class="panel-title">
			<a>Population</a>
		</h4>
	</div>
	<div id="collapse2" class="panel-collapse collapse interieurMenu in">
		<div class="container formulaireContainer ajusteAuto">



			<div class="container margeSlider ajusteAuto">

				<h5>Densite de la population</h5>
				<input id="population-densite" type="text" name="population-densite" data-provide="slider"
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


		</div>
	</div>
</div>