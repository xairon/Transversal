
<!-- ligne des boutons -->
<div class="row">

<div class="col-md-6">
		<a id="selectionner" href="#" class="btn btn-primary btn-lg active" onclick="hide()" role="button"
			aria-pressed="mixed">Sélection</a>
	</div>
	
	<div class="col-md-6">
		<a id="comparer" href="#" class="btn btn-primary btn-lg active" onclick="show()" role="button"
			aria-pressed="mixed">Comparer</a>
	</div>
<div id = ville1 value ></div>
<div id = ville2 value ></div>
	
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

<div class="col-md-offset-7">
<form method="POST" onclick="sendapi()" action="javascript:void(0)" accept-charset="UTF-8">
					
						<button type="submit" name="submit" class="btn btn-info btn-block">Lancer</button>
						
					</form>
					<div id="out"></div>

</div>


