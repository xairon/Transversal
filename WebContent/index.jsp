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
    

</head>
<body>
<nav class="navbar navbar-default">  
  <div class="container-fluid">  
    <div class="navbar-header">  
      <a class="navbar-brand" href="index.jsp">Plateforme</a>  
    </div>  
    <ul class="nav navbar-nav navbar-right">  
      <li class="active"><a href="index.jsp">Accueil</a></li>  
      <li><a href="AdminServlet">Admin</a></li>   
    
   
    </ul>  
  </div>  
</nav>  

 <div class="container">  
 <% 
JDBCVilleDAO connection = new JDBCVilleDAO();
String nom =request.getParameter("nom");  
String departement =request.getParameter("departement");


Ville ville = new Ville(nom,departement);

connection.insert(ville);
connection.select();
connection.closeConnection();

  
 %>
<form action="index.jsp" method="post">

<p>

    <input type="text" name="nom" />
    <input type="text" name="departement" />

    <input type="submit" value="Valider" />

</p>

</form>
</div>  
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>  
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script> 
 

</body>
</html>