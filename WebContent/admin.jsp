<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>  
  <meta charset="utf-8">  
  <meta name="viewport" content="width=device-width, initial-scale=1">  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">  
    

</head>
<body>
<% if (session.getAttribute("co") != null) { %>
    <nav class="navbar navbar-default">  
  <div class="container-fluid">  
    <div class="navbar-header">  
      <a class="navbar-brand" href="index.jsp">Plateforme</a>  
    </div>  
    <ul class="nav navbar-nav navbar-right">  
      <li class="active"><a href="index.jsp">Accueil</a></li>  
      <li><a href="admin.jsp">Admin</a></li>  
   
    </ul>  
  </div>  
</nav>  

 <div class="container">  
 <h1/>tu peux faire des trucs d'admin ici</h1>
 </div> 
            	
<% } else {%>
 <h1/>Nop</h1>
<% } %>
 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>  
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script> 
</body>
</html>