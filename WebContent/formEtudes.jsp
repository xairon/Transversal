<div class="panel panel-default">
	<div class="panel-heading">
		<h4 class="panel-title">
			<a data-toggle="collapse" data-parent="#accordion" href="#collapse1">Etudes</a>
		</h4>
	</div>
	<div id="collapse1" class="panel-collapse collapse">
		<div class="container formulaireContainer">

			<h5>Nombre d'�tudiant</h5>
			<p>slide</p>
			
			
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
	String [] listeSecteursEtu = { "Public", "Priv�" };
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