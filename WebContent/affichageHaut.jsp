<div class="container-fluid margeZero">


	

		<ul class="nav nav-tabs margeZero">
			<li class="pull-right"><a id="onglet1" data-toggle="tab" href="#ongletListe">Liste</a></li>
			<li class="active pull-right"><a id="onglet2" data-toggle="tab" href="#ongletCarte">Carte</a></li>
		</ul>

		<div class="tab-content">
			<div id="ongletCarte" class="tab-pane fade in active">
				<div class="container-fluid" id="containerCarte">
					<input id="comparaison" type="checkbox" onchange="comparaison2()" data-on="Comparaison" data-off="Sélection" data-toggle="toggle" data-onstyle="info" data-offstyle="info">
					<br/>
					<input id="pac-input" class="controls" type="text" name="ville1" value
					placeholder="Enter a location"> 
					<input id="pac-input2" name="ville2" value
					class="controls" type="text" disabled
					placeholder="Enter a  second location">
					<button id="lancerSelectComp" onclick="sendselec()"name="lancerSelectComp" class="btn btn-info boutons">infos</button>
		
					<div id="map" style="width: auto; height: 400px;"></div>

				</div>
			</div>
			<div id="ongletListe" class="tab-pane fade">
				<div class="container-fluid" id="containerListe">
					<div id="listeVilles"></div>
		
				</div>
			</div>
		</div>
	


<!-- 	<a href="#" class="btn btn-primary btn-lg active pull-right boutonDroite" onclick="afficheCarte()" role="button" aria-pressed="mixed">Carte</a> 
		<a href="#"	class="btn btn-primary btn-lg active pull-right boutonDroite" onclick="afficheListe()" role="button" aria-pressed="mixed">Liste</a>
 -->
		
	


	
</div>