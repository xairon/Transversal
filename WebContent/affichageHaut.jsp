<div class="container-fluid margeZero">
  		
  		
  		
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
			<form method="POST" onclick="sendselec()" action="javascript:void(0)" accept-charset="UTF-8">
					
						<button id="lancerSelectComp" onclick="sendselec()" name="lancerSelectComp" class="btn btn-info">Lancer</button>
						
					</form>
			

		<div id="map" style="width: auto; height: 400px;"></div>

	</div>


	<div class="container-fluid" id="containerListe">
		<div id="listeVilles"></div>
		
	</div>
</div>