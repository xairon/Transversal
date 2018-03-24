<!DOCTYPE html>
<html> 
<head> 
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" /> 
  <title>Google Maps Multiple Markers</title> 
  

</head> 
<body>
<body onload="initialize()">



    <input id="pac-input" class="controls" type="text"
        placeholder="Enter a location">	
            <input id="pac-input2" class="controls" type="text"
        placeholder="Enter a location">	

  <div id="map" style="width: 500px; height: 400px;"></div>
  <script type="text/javascript" src="js/initmap.js"></script>


  <script src="http://maps.google.com/maps/api/js?key=AIzaSyDU8DD35Y8bbwiuNb6BVuOWAQviVqyORGU&libraries=places&callback=initMap" 
          type="text/javascript"></script>
</body>
</html>