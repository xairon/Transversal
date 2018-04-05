<div class="panel panel-default">
	<div class="panel-heading" data-toggle="collapse" data-parent="#accordion" href="#" onclick="ouvreEtudes()">
		<h4 class="panel-title">
			<a>Etudes</a>
		</h4>
	</div>
	<div id="collapse1" class="panel-collapse collapse interieurMenu in">
		<div class="container formulaireContainer ajusteAuto">



			<div class="container margeSlider ajusteAuto">

				<h5>Nombre d'etudiants</h5>

				<input id="etudes-nombre" type="text" 
					name="etudes-nombre"
					data-provide="slider" 
					data-slider-ticks="[1, 2, 3]"
					data-slider-ticks-labels='["peu", "moyennement", "beaucoup"]'
					data-slider-min="1" 
					data-slider-max="3" 
					data-slider-step="1"
					data-slider-value="2" 
					data-slider-tooltip="hide" />

			</div>





			<h5>Regroupement</h5>

			<%String [] listeRegroupements = {
					"Universite",
					"ecoles paramedicales et sociales",
					"ecoles juridiques et administratives",
					"ecoles superieures art et culture",
					"ecole de commerce, gestion et comptabilite",
					"Formations ingenieurs",
					"Section de techniciens superieurs et assimiles",
					"Universite de technologie",
					"Grands etablissement MENESR",
					"ecoles normales superieures",
					"Instituts nationaux polytechniques",
					"ESPE",
					"Classes preparatoires aux grandes ecoles (CPGE)"
					}; 

			for (int i = 0; i < listeRegroupements.length; i++) {
				String regroupementMotSepare[] = listeRegroupements[i].split(" ");
				String regroupementMotColle = "";
				for (int j = 0; j < regroupementMotSepare.length; j++) {
					if (j != 0)
						regroupementMotColle += "_";
					regroupementMotColle += regroupementMotSepare[j];
				}
			%>

			<input type="checkbox"
				id=<%="etudes-regroupement-" + regroupementMotColle%>
				name=<%="etudes-regroupement-" + regroupementMotColle%>
				value=<%=regroupementMotColle%>>
			<%=listeRegroupements[i]%><br>

			<%
				}
			%>





			<h5>Secteur</h5>

			<input type="checkbox" id="etudes-secteur-public" name="etudes-secteur-public"
				value="Public">
			Public<br>
			<input type="checkbox" id="etudes-secteur-prive" name="etudes-secteur-prive"
				value="Prive">
			Prive<br>




		</div>
	</div>
</div>