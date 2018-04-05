<!-- ligne des boutons -->

<ul class="nav nav-tabs margeZero">
	<li  class="active"><a id="onglet1" data-toggle="tab" href="#ongletTop5" onclick="afficheTop5()">top5</a></li>
	<li><a id="onglet2" data-toggle="tab" href="#ongletInfosVilles" onclick="afficheInfosVilles()">infos Villes</a></li>
</ul>

<br/>

<div class="tab-content">
	<div id="ongletTop5" class="tab-pane fade">
		
	</div>
	<div id="ongletInfosVilles" class="tab-pane fade  in active">
		
	</div>
</div>


<div class="container-fluid" id="containerInfosVilles">
			<input id="comparaison" type="checkbox" onchange="comparaison2()" data-on="Comparaison" data-off="Sélection" data-toggle="toggle" data-onstyle="info" data-offstyle="info">
			<br/>
			<input id="pac-input" class="controls" type="text" name="ville1" value
			placeholder="Enter a location"> 
			<input id="pac-input2" name="ville2" value
			class="controls" type="text" disabled
			placeholder="Enter a  second location">
		</div>


<br/>
<h5>Formulaire</h5>
<p id="legendeOption">*optionnel </p>

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
	
	<div class="col-md-offset-6" id="boutonInfosVilles">
		<button id="lancerSelectComp" onclick="sendselec()"name="lancerSelectComp" class="btn btn-info btn-block boutons">Infos ville(s)</button>
	</div>
	
	<div class="col-md-offset-6" id="boutonTop5">
		<form method="POST" onclick="sendform()" action="javascript:void(0)" accept-charset="UTF-8">
			<button type="submit" name="submit" class="btn btn-info btn-block boutons">Top 5 des villes</button>
		</form>
	<div id="out"></div>
	</div>
</div>


<!-- 
<br/>
<br/>
<br/>
<button id="#" onclick="deleteAffichageTexteGraphe()"name="test" class="btn">test</button> -->




