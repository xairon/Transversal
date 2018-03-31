<div class="panel panel-default">
	<div class="panel-heading">
		<h4 class="panel-title">
			<a data-toggle="collapse" data-parent="#accordion" href="#" onclick="ouvreEtudes()">Etudes</a>
		</h4>
	</div>
	<div id="collapse1" class="panel-collapse collapse grisClair in">
		<div class="container formulaireContainer ajusteAuto">



			<div class="container margeSlider ajusteAuto">

				<h5>Nombre d'�tudiants</h5>

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
					"Universit�",
					"�coles param�dicales et sociales",
					"�coles juridiques et administratives",
					"�coles sup�rieures art et culture",
					"�cole de commerce, gestion et comptabilit�",
					"Formations ing�nieurs",
					"Section de techniciens sup�rieurs et assimil�s",
					"Universit� de technologie",
					"Grands �tablissement MENESR",
					"�coles normales sup�rieures",
					"Instituts nationaux polytechniques",
					"ESPE",
					"Classes pr�paratoires aux grandes �coles (CPGE)"
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
				value="Priv�">
			Public<br>




		</div>
	</div>
</div>