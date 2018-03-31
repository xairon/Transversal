<div class="container-fluid margeZero">


		<a id="selectionner" href="#" class="btn btn-primary btn-lg active"	onclick="hide()" role="button" aria-pressed="mixed">Sélection</a> 
		<a id="comparer" href="#" class="btn btn-primary btn-lg active" onclick="show()" role="button" aria-pressed="mixed">Comparer</a> 
		<a href="#" class="btn btn-primary btn-lg active pull-right boutonDroite" onclick="afficheCarte()" role="button" aria-pressed="mixed">Carte</a> 
		<a href="#"	class="btn btn-primary btn-lg active pull-right boutonDroite" onclick="afficheListe()" role="button" aria-pressed="mixed">Liste</a>

	<div class="container-fluid" id="containerCarte">
		<input id="pac-input" class="controls" type="text"
			placeholder="Enter a location"> <input id="pac-input2"
			class="controls" type="text" disabled
			placeholder="Enter a  second location">

		<div id="map" style="width: auto; height: 400px;"></div>

	</div>


	<div class="container-fluid" id="containerListe">
		<div id="listeVilles"></div>
		
	</div>
</div>








