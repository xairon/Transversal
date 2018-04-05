<!-- ligne des boutons -->
<div class="row">

 


</div>


<input id="comparaison" type="checkbox" onchange="comparaison()" data-on="Comparaison" data-off="Sélection" data-toggle="toggle" data-onstyle="info" data-offstyle="info">
<br/>
<input id="pac-input" class="controls" type="text" name="ville1" value
placeholder="Enter a location"> 
<input id="pac-input2" name="ville2" value
class="controls" type="text" disabled
placeholder="Enter a  second location">
<br/>
<br/>
<br/>
<h5>Formulaire</h5>

<!-- ligne du formulaire -->
<div class="row formPadding">
	<form action="#" method="get">
		<div class="panel-group" id="accordion">

			<%@include file="formEtudes.jsp"%>

			<%@include file="formPopulation.jsp"%>

			<%@include file="formTerritoire.jsp"%>

			<%@include file="formEntreprises.jsp"%>

		</div>

		

	</form>
	
	<div class="col-md-6">
		<button id="lancerSelectComp" onclick="sendselec()"name="lancerSelectComp" class="btn btn-info btn-block boutons">Infos ville(s)</button>
		<p>Formulaire optionnel</p>
	</div>
	
	<div class="col-md-6">
		<form method="POST" onclick="sendform()" action="javascript:void(0)" accept-charset="UTF-8">
			<button type="submit" name="submit" class="btn btn-info btn-block boutons">Top 5 des villes</button>
		</form>
		<p>Champs non pris en compte</p>
	<div id="out"></div>
	</div>
</div>





