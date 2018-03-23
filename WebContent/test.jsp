<!DOCTYPE html>
<html>
  <head>
    <title>Place Autocomplete</title>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <link rel="stylesheet" href="bootstrap/css/style.css">
  </head>

  <body>
   <input id="pac-input" class="controls" type="text"
        placeholder="Enter a location">
    <div id="type-selector" class="controls">
    </div>
    <div id="map"></div>

 <script type="text/javascript" src="js/autocompletes.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDU8DD35Y8bbwiuNb6BVuOWAQviVqyORGU&libraries=places&callback=initMap"
        async defer></script>
  </body>
</html>