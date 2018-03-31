
<!-- ligne des boutons -->
<div class="row">

 


</div>

<!-- ligne du formulaire -->
<div class="row">
	<form action="#" method="get">
		<div class="panel-group" id="accordion">

			<%@include file="formEtudes.jsp"%>

			<%@include file="formPopulation.jsp"%>

			<%@include file="formTerritoire.jsp"%>

			<%@include file="formEntreprises.jsp"%>

		</div>

		<div class="col-md-offset-7">
			<input type="submit" value="Lancer la recherche" onclick="test()">
		</div>

	</form>
</div>

<div class="col-md-offset-7">
	<button id="bouton" onclick="diagramme()" type="button"
		class="btn btn-primary">Lancer graphe</button>
	<button id="bouton2" onclick="liste()" type="button"
		class="btn btn-primary">Lancer Liste</button>
</div>


