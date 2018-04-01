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
	<form method="POST" onclick="sendapi()" action="javascript:void(0)" accept-charset="UTF-8">
					
						<button type="submit" name="submit" class="btn btn-info btn-block">Lancer</button>
						
					</form>
					<div id="out"></div>
	
</div>





