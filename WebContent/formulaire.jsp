<!-- ligne des boutons -->
<div class="row">

 


</div>

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
	
	<div class="col-md-offset-6">
	<form method="POST" onclick="sendform()" action="javascript:void(0)" accept-charset="UTF-8">
					
						<button type="submit" name="submit" class="btn btn-info btn-block boutons">Rechercher</button>
						
					</form>
					<div id="out"></div>
	</div>
</div>





