<div class="panel panel-default">
	<div class="panel-heading">
		<h4 class="panel-title">
			<a data-toggle="collapse" data-parent="#accordion" href="#collapse1">Etudes</a>
		</h4>
	</div>
	<div id="collapse1" class="panel-collapse collapse grisClair">
		<div class="container ajusteAuto" >



			<div class="container margeSlider ajusteAuto">
			
				<h5>Nombre d'�tudiants</h5>

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
					"Universit�",
					"�coles param�dicales et sociales",
					"�coles juridiques et administratives",
					"�coles sup�rieures art et culture",
					"�cole de commerce, gestion et comptabilit�",
					"Autres �coles de sp�cialit�s diverses",
					"Autres formations ing�nieurs",
					"Section de techniciens sup�rieurs et assimil�s",
					"Universit� de technologie",
					"Grands �tablissement MENESR",
					"�coles normales sup�rieures",
					"Instituts nationaux polytechniques",
					"ESPE",
					"Classes pr�paratoires aux grandes �coles (CPGE)",
					"�tablissement d'enseignement universitaires priv�s"
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
					String[] listeSecteursEtu = { "Public", "Priv�" };
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