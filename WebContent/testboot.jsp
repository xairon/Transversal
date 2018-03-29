<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="transversal.*" %>
        <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil</title>  
  <meta charset="utf-8">  
  <meta name="viewport" content="width=device-width, initial-scale=1">  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> 
    <link rel="stylesheet" href="bootstrap/css/style.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>

</style>
</head>
<body>
<div class="row-md-2">
<div class="col-md-2">

	
			<canvas id="main" width="200" height="300" ></canvas>
			</div>
			</div>
		

<div><label><input id="toto" type="checkbox" value="toto"></label>
<label> <input id="titi" type="checkbox" value="titi"></label>
<label> <input id="tata" type="checkbox" value="tata"></label></div>
<div><button id = "bouton" onclick="diagramme()" type="button" class="btn btn-primary">Primary</button></div>
  <script type="text/javascript" src="js/testdouble.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>

  
</body>
</html>