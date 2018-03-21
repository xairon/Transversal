<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="transversal.*"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="bootstrap/css/style.css">
<script src="js/echarts.min.js"></script>


</head>
<body>


	<div class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="PagePrincipale">Nom</a>
			</div>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="index.jsp">Déconnexion</a></li>
			</ul>
		</div>
	</div>




	<div class="container-fluid fondEcr fill">
		<div class="row">

			<!-- partie formulaire -->

			<div class="col-md-3 blue">

				<!-- ligne des boutons -->
				<div class="row">
					<div class="col-md-6">
						<a href="#" class="btn btn-primary btn-lg active" role="button"
							aria-pressed="mixed">Comparer</a>
					</div>

					<div class="col-md-6">
						<a href="#" class="btn btn-primary btn-lg active" role="button"
							aria-pressed="mixed">Sélection</a>
					</div>
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


			</div>
			<!-- partie affichage -->

			<div class="col-md-9 yellow">
				<div class="row">
				partie gmap
				</div>

				<div class="row">
				partie graphes
				</div>
			</div>
		</div>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>