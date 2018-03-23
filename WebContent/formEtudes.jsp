<div class="panel panel-default">
	<div class="panel-heading">
		<h4 class="panel-title">
			<a data-toggle="collapse" data-parent="#accordion" href="#collapse1">Etudes</a>
		</h4>
	</div>
	<div id="collapse1" class="panel-collapse collapse grisClair">
		<div class="container formulaireContainer">



			<div class="container margeSlider">
			
				<h5>Nombre d'étudiants</h5>

				<input id="nbEtu" type="text"
          data-provide="slider"
          data-slider-ticks="[1, 2, 3]"
          data-slider-ticks-labels='["peu", "moyennement", "beaucoup"]'
          data-slider-min="1"
          data-slider-max="3"
          data-slider-step="1"
          data-slider-value="2"
          data-slider-tooltip="hide" />

			</div>






			<div class="row">
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
		}; %>

				<%
				for (int i = 0; i < listeRegroupements.length; i++) {
			%>
				<div class="checkbox">
					<label> <input type="checkbox" value=""><%=listeRegroupements[i]%>
					</label>
				</div>
				<%
				}
			%>


				<h5>Secteur</h5>

				<%
	String [] listeSecteursEtu = { "Public", "Privé" };
%>


				<%
				for (int i = 0; i < listeSecteursEtu.length; i++) {
			%>
				<div class="checkbox">
					<label> <input type="checkbox" value=""><%=listeSecteursEtu[i]%>
					</label>
				</div>
				<%
				}
			%>

			</div>

		</div>
	</div>
</div>