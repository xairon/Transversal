    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>  
<html lang="en">  
<head>  
  <title>Bootstrap Case</title>  
  <meta charset="utf-8">  
  <meta name="viewport" content="width=device-width, initial-scale=1">  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">  
    
</head>  
<body>  
  
<nav class="navbar navbar-default">  
  <div class="container-fluid">  
    <div class="navbar-header">  
      <a class="navbar-brand" href="#">Plateforme</a>  
    </div>  
    <ul class="nav navbar-nav navbar-right">  
      <li class="active"><a href="#">Accueil</a></li>  
      <li><a href="admin.jsp">Admin</a></li>  
      <li><a href="login.jsp">Login</a></li>  
   
    </ul>  
  </div>  
</nav>  
    

    <div class="container">
      <div class="row">
        <div class="col-sm-8 col-sm-offset-2">
          <hr>

          <form role="form" class="form-horizontal">
            <fieldset>
               <div class="form-group">
                <label class="col-sm-4 control-label">Address</label>
                <div class="col-sm-8">
                  <input id="user_input_autocomplete_address" name="user_input_autocomplete_address"
                         class="form-control" placeholder="Tapez ici le nom de la ville,région ou du département">
                </div>
              </div>
            </fieldset>

            <fieldset class="disabled">
              <div class="form-group">
                <label class="col-sm-4 control-label"><code>street_number</code></label>
                <div class="col-sm-8">
                  <input id="street_number" name="street_number" disabled="true" class="form-control">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-4 control-label"><code>route</code></label>
                <div class="col-sm-8">
                  <input id="route" name="route" disabled="true" class="form-control">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-4 control-label"><code>locality</code></label>
                <div class="col-sm-8">
                  <input id="locality" name="locality" disabled="true" class="form-control">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-4 control-label"><code>administrative_area_level_1</code></label>
                <div class="col-sm-8">
                  <input id="administrative_area_level_1" name="administrative_area_level_1" disabled="true" class="form-control">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-4 control-label"><code>postal_code</code></label>
                <div class="col-sm-8">
                  <input id="postal_code" name="postal_code" disabled="true" class="form-control">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-4 control-label"><code>country</code></label>
                <div class="col-sm-8">
                  <input id="country" name="country" disabled="true" class="form-control">
                </div>
              </div>
            </fieldset>
          </form>
        </div>
      </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>  
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>  
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDU8DD35Y8bbwiuNb6BVuOWAQviVqyORGU&libraries=places"></script>
<script type="text/javascript" src="js/autocomplete.js"></script>
</body>  
</html>  
