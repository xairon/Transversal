
<!-- ligne des boutons -->
<div class="row">

<div class="col-md-6">
		<a id="selectionner" href="#" class="btn btn-primary btn-lg active" onclick="hide()" role="button"
			aria-pressed="mixed">S�lection</a>
	</div>
	
	<div class="col-md-6">
		<a id="comparer" href="#" class="btn btn-primary btn-lg active" onclick="show()" role="button"
			aria-pressed="mixed">Comparer</a>
	</div>

	
</div>

<!-- ligne du formulaire -->
<div class="row">
	<form action="/action_page.php" method="get">
		<div class="panel-group" id="accordion">

			<%@include file="formEtudes.jsp"%>

			<%@include file="formPopulation.jsp"%>

			<%@include file="formTerritoire.jsp"%>

			<%@include file="formEntreprises.jsp"%>

		</div>
		
		<div class="col-md-offset-7">
			<input type="submit" value="Lancer la recherche">
		</div>
		
	</form>
</div>

<div class="col-md-offset-7">
<button id = "bouton" onclick="diagramme()" type="button" class="btn btn-primary">Lancer graphe</button>
</div>


