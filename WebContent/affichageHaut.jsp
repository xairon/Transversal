<div class="container-fluid margeZero">

		<!-- les  boutons selectionner et comparer, j'ai pas supprimé parce que ce que je vais peut ne pas convenir.. à voir..
		<a id="selectionner" href="#" class="btn btn-primary btn-lg active"	onclick="hide()" role="button" aria-pressed="mixed">Sélection</a> 
		<a id="comparer" href="#" class="btn btn-primary btn-lg active" onclick="comparaison()" role="button" aria-pressed="mixed">Comparer</a> 
  		-->
  		
  		
  		
		<a href="#" class="btn btn-primary btn-lg active pull-right boutonDroite" onclick="afficheCarte()" role="button" aria-pressed="mixed">Carte</a> 
		<a href="#"	class="btn btn-primary btn-lg active pull-right boutonDroite" onclick="afficheListe()" role="button" aria-pressed="mixed">Liste</a>
		
		
	<div class="container-fluid" id="containerCarte">
	<input id="comparaison" type="checkbox" onchange="comparaison2()" data-on="Comparaison" data-off="Sélection" data-toggle="toggle">
	<br/>
		<input id="pac-input" class="controls" type="text" name="ville1" value
			placeholder="Enter a location"> 
			<input id="pac-input2" name="ville2" value
			class="controls" type="text" disabled
			placeholder="Enter a  second location">
			

		<div id="map" style="width: auto; height: 400px;"></div>

	</div>


	<div class="container-fluid" id="containerListe">
		<div id="listeVilles"></div>
		
	</div>
</div>