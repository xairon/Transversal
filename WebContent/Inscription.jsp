<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inscription</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"
	rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="bootstrap/css/stylepage.css">
<script
	src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

</head>
<body>
	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="index.jsp">Plateforme</a>
		</div>
		<ul class="nav navbar-nav navbar-right">




		</ul>
	</div>
	</nav>
	<div class="container">
		<div class="row">
			<div class="span4 offset4 well">
				<legend>Veuillez vous inscrire</legend>


				<% if (session.getAttribute("erreurnom") != null) { %>

				<div class="alert alert-error">

					<a class="close" data-dismiss="alert"
						onclick="this.parentElement.style.display='none';" href="#">×</a>Ce
					nom de compte est déjà prit
				</div>
				<% } else {%>

				<% } %>
				<% if (session.getAttribute("erreurmdp") != null) { %>

				<div class="alert alert-error">

					<a class="close" data-dismiss="alert"
						onclick="this.parentElement.style.display='none';" href="#">×</a>Les
					mots de passe doivent contenir entre 3 et 20 caractères
				</div>
				<% } else {%>

				<% } %>
				<% if (session.getAttribute("erreurmdpconf") != null) { %>

				<div class="alert alert-error">

					<a class="close" data-dismiss="alert"
						onclick="this.parentElement.style.display='none';" href="#">×</a>Les
					mots de passe entrés sont différents, merci de les saisir à nouveau
				</div>
				<% } else {%>

				<% } %>
				<% if (session.getAttribute("erreurcarac") != null) { %>

				<div class="alert alert-error">

					<a class="close" data-dismiss="alert"
						onclick="this.parentElement.style.display='none';" href="#">×</a>Veuillez
					saisir un nom d'utilisateur valide ne contenant ni caractère
					spéciale ou espace et faisant moins de 15 caractères
				</div>
				<% } else {%>

				<% } %>


				<form method="POST" action="Inscription" accept-charset="UTF-8">
					<input type="text" id="username" class="span3" name="user"
						placeholder="Nom d'Utilisateur*"> <input type="password"
						id="password" class="span3" name="pass"
						placeholder="Mot de passe*"> <input type="password"
						id="confpassword" class="span3" name="pass2"
						placeholder="Confirmation du Mot de passe*">

					<button type="submit" name="submit" class="btn btn-info btn-block">Valider</button>
				</form>
			</div>
		</div>
	</div>

</body>
</html>