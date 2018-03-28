<div class="panel panel-default">
	<div class="panel-heading">
		<h4 class="panel-title">
			<a data-toggle="collapse" data-parent="#accordion" href="#collapse1">Etudes</a>
		</h4>
	</div>
	<div id="collapse1" class="panel-collapse collapse grisClair">
		<div class="container ajusteAuto" >



			<div class="container margeSlider ajusteAuto">
			
				<h5>Nombre d'étudiants</h5>

				<input id="nbEtu" type="text" name="nbEtudiants"
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
					"Université",
					"Écoles paramédicales et sociales",
					"Écoles juridiques et administratives",
					"Écoles supérieures art et culture",
					"École de commerce, gestion et comptabilité",
					"Autres écoles de spécialités diverses",
					"Autres formations ingénieurs",
					"Section de techniciens supérieurs et assimilés",
					"Université de technologie",
					"Grands établissement MENESR",
					"Écoles normales supérieures",
					"Instituts nationaux polytechniques",
					"ESPE",
					"Classes préparatoires aux grandes écoles (CPGE)",
					"Établissement d'enseignement universitaires privés"
					}; 
					%>

				<%
				for (int i = 0; i < listeRegroupements.length; i++) {
				%>

				<input type="checkbox" name="regroupement" value=<%=listeRegroupements[i]%>> <%=listeRegroupements[i]%><br>
			
				<%
				}
				%>


				<h5>Secteur</h5>

				<%
					String[] listeSecteursEtu = { "Public", "Privé" };
				%>


				<%
					for (int i = 0; i < listeSecteursEtu.length; i++) {
				%>

				<input type="checkbox" name="secteurEtude" value=<%=listeSecteursEtu[i]%>> <%=listeSecteursEtu[i]%><br>

				<%
					}
				%>

			

		</div>
	</div>
</div>