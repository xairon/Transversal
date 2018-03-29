
<!-- ligne des boutons -->
<div class="row">
	<div class="col-md-6">
		<a id="comparer" href="#" class="btn btn-primary btn-lg active" onclick="show()" role="button"
			aria-pressed="mixed">Comparer</a>
	</div>

	<div class="col-md-6">
		<a id="selectionner" href="#" class="btn btn-primary btn-lg active" onclick="hide()" role="button"
			aria-pressed="mixed">Sélection</a>
	</div>
</div>

<!-- ligne du formulaire -->
<div class="row">
	<div class="panel-group" id="accordion">

		<%@include file="formEtudes.jsp"%>

		<%@include file="formPopulation.jsp"%>

		<%@include file="formTerritoire.jsp"%>

		<%@include file="formEntreprises.jsp"%>

	</div>
</div>

<div class="col-md-offset-10">
<button id = "bouton" onclick="diagramme()" type="button" class="btn btn-primary">Lancer</button>
</div>


