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
    <script src="js/echarts.min.js"></script>
    

</head>
<body>



<nav class="navbar navbar-default">  
  <div class="container-fluid">  
    <div class="navbar-header">
      <a class="navbar-brand" href="PagePrincipale">Nom</a>  
    </div>  
    <ul class="nav navbar-nav navbar-right">  
      <li class="active"><a href="index.jsp">Accueil</a></li>  
      <li><a href="AdminServlet">Admin</a></li> 
    </ul>
  </div>  
</nav>  

<div class="container-fluid red">
test
</div>

<div class="container-fluid">
	<div class="container">
		<div class="row">
			<article class="col-md-1 col-sm-12">
				<h1>Article</h1>
				<p>
					ds m f k , sd l k fs l kn sd fn sd fn ev zj kf vh jksd jn kv nj gn qjn dj ndfb ns lj jnd fl
 				</p>
			</article>
			<article class="col-md-1 col-sm-12">
				<h1>Article</h1>
				<p>
					ds m f k , sd l k fs l kn sd fn sd fn ev zj kf vh jksd jn kv nj gn qjn dj ndfb ns lj jnd fl 				</p>
			</article>
			<article class="col-md-1 col-sm-12">
				<h1>Article</h1>
				<p>
					ds m f k , sd l k fs l kn sd fn sd fn ev zj kf vh jksd jn kv nj gn qjn dj ndfb ns lj jnd fl
 				</p>
			</article>
		</div>
		
			<button class="btn btn-default">test</button>
		
	</div>
</div>


 <div class="container">  
  <div id="main" style="width: 600px;height:400px;"></div>
   <script type="text/javascript">
        // based on prepared DOM, initialize echarts instance
        var myChart = echarts.init(document.getElementById('main'));

        // specify chart configuration item and data
        var option = {
            title: {
                text: ' '
            },
            tooltip: {},
            legend: {
                data:['Sales']
            },
            xAxis: {
                data: ["shirt","cardign","chiffon shirt","pants","heels","socks"]
            },
            yAxis: {},
            series: [{
                name: 'Sales',
                type: 'bar',
                data: [5, 20, 36, 10, 10, 20]
            }]
        };

        // use configuration item and data specified to show chart
        myChart.setOption(option);
    </script>
 
<!--<form action="index.jsp" method="post">

<p>

    <input type="text" name="nom" />
    <input type="text" name="departement" />

    <input type="submit" value="Valider" />

</p>

</form>-->
</div>
<!--  -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>  
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script> 
 

</body>
</html>