<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
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

	<div class="col-md-offset-4">
		<h1>Où étudier.com</h1>
	</div>

	
		<div class="col-sm-7">
			<div class="Container margeLeft">
				<h2>Bienvenue sur cette magnifique plateforme</h2>
				<h4>Etudiant, futur entrepreneur, curieux ? Ce site est fait
					pour vous.</h4>
				<br /> <br /> <br /> <br />
				<div class="col-sm-offset-3">
					<img src="images/truc.jpg" alt="fgh" height=auto width=auto>
				</div>
			</div>
		</div>




		<div class="col-sm-5 margeZero">
			<div class="container containerConnection margeZero">

				<div class="span4 well">
					<legend>Veuillez vous connecter</legend>


					<%
						if (session.getAttribute("erreur") != null) {
					%>

					<div class="alert alert-error">

						<a class="close" data-dismiss="alert"
							onclick="this.parentElement.style.display='none';" href="#">×</a>Mot
						de passe ou Nom d'Utilisateur incorrect
					</div>
					<%
						} else {
					%>

					<%
						}
					%>


					<form method="POST" action="Connexion" accept-charset="UTF-8">
						<input type="text" id="username" class="span3" name="user"
							placeholder="Nom d'Utilisateur*"> <input type="password"
							id="password" class="span3" name="pass"
							placeholder="Mot de passe*"> <label class="checkbox">
							<input type="checkbox" name="remember" value="1"> Se
							souvenir de moi
						</label>
						<button type="submit" name="submit" class="btn btn-info btn-block">Se
							connecter</button>

						<a href="Inscription.jsp">Pas de compte ? Inscrivez-vous ici.</a>
					</form>

				</div>
			</div>
		</div>
	
</body>
</html>