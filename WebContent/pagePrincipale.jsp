<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="transversal.*"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>page Principale</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="bootstrap/css/stylemap.css">

<!-- seiyria-bootstrap-slider Plugin -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-slider/9.7.2/css/bootstrap-slider.min.css"
	rel="stylesheet">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-slider/9.7.2/bootstrap-slider.min.js"></script>

<script src="js/echarts.min.js"></script>





</head>
<body>


	<div class="navbar navbar-default margeZero">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="PagePrincipale">Nom</a>
			</div>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="index.jsp">Déconnexion</a></li>
			</ul>
		</div>
	</div>




	<div class="col-md-3">

		<%@include file="formulaire.jsp"%>

	</div>

	<div class="col-md-9 grisClair margeZero">

		<%@include file="affichageHaut.jsp"%>

		<%@include file="affichageBas.jsp"%>

	</div>




	<script type="text/javascript" src="js/autocompletes.js"></script>

	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDU8DD35Y8bbwiuNb6BVuOWAQviVqyORGU&libraries=places&callback=initMap"
		async defer></script>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>

	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>