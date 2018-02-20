<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="transversal.*" %>
        <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
  <table border="0" cellpadding="10">
      <tr>
        <td>
          <img src="images/springsource.png">
        </td>
        <td>
          <h1>Sample "Hello, World" Application</h1>
        </td>
      </tr>
    </table>

</body>
</html>