<!doctype html>
<html>
    <head>
        <title>Google Maps - two autocomplete</title>
        <meta charset='utf-8' />
         <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDU8DD35Y8bbwiuNb6BVuOWAQviVqyORGU&libraries=places&callback=initMap"
        async defer></script>
        <script>
            function initMap(){
                /* some variables */
                var autocomplete;
                var infowindow;
                var marker;
                var options;
                var place;
                var obj;
                var url;
                var img;


                /* DOM elements */
                var oDiv     = document.getElementById('map');
                var oCard    = document.getElementById('pac-card');
                var oColInput= document.querySelectorAll('div#pac-container > input[data-type]');
                var oUsername= document.getElementById('name');



                /* Map initial config */
                options={
                    center: {
                        lat: 59.325,
                        lng: 18.070
                    },
                    zoom: 9                 
                };
                /* the map */
                var map = new google.maps.Map( oDiv, options );

                /*
                    Define objects associated with each of the input elements
                    used for places.

                    Each object created has a reference stored in `obj` which is
                    used as a bound object to the event listener so that each item
                    can be accessed within the listener using `this`
                */
                Array.prototype.slice.call( oColInput ).forEach( function( input ){
                    /* options for the autocomplete service */
                    options={
                        strictBounds: false
                    };

                    /* create the autocomplete object */
                    autocomplete = new google.maps.places.Autocomplete( input, options );
                    autocomplete.bindTo( 'bounds', map );

                    /* create the infowindow bound to this autocomplete object */
                    infowindow = new google.maps.InfoWindow( { maxWidth:320, disableAutoPan:false } );
                    infowindow.setContent( document.querySelector('div.iwin[ data-type="'+input.dataset.type+'" ]') );

                    /* ensure hidden content from infowindow does not alter layout */
                    google.maps.event.addListener( infowindow, 'closeclick', function( event ){
                        this.getContent().style.display='none';
                    }.bind( infowindow ));

                    /* add a marker bound to the autocomplete service */
                    marker=new google.maps.Marker({
                        map: map,
                        position: {
                            lat: parseFloat( input.dataset.lat ),
                            lng: parseFloat( input.dataset.lng )
                        },
                        anchorPoint: new google.maps.Point(0, -29)
                    });

                    /* Marker events */
                    google.maps.event.addListener( marker, 'click', function(e){
                        this.open( map );
                        this.getContent().style.display='block';
                        this.setPosition( e.latLng );
                        this.setOptions( { pixelOffset:new google.maps.Size(0,-32) } );
                    }.bind( infowindow ) );


                    /* 
                        add a reference to each object to our binding object used below
                    */
                    obj={
                        'input':input,
                        'type':input.dataset.type,
                        'marker':marker,
                        'autocomplete':autocomplete,
                        'infowindow':infowindow
                    }



                    /* Listen for changes and do some cool things */
                    autocomplete.addListener('place_changed',function(){
                        /* must have a username value to continue as it should appear on the infowindow */
                     
                        /* reset existing marker if it exists */
                        this.marker.setVisible( false );
                        this.marker.title='';

                      

                        place = this.autocomplete.getPlace();
                        console.info( place );

                        /* find suitable hidden inputs within form - using span as parent */
                    
                        if( place.geometry.viewport ) {
                            map.fitBounds( place.geometry.viewport );
                        } else {
                            map.setCenter( place.geometry.location );
                            map.setZoom(9);
                        }

                        this.marker.setPosition( place.geometry.location );
                        this.marker.setVisible( true );
                        this.marker.title=place.name;




                     
                });
            }
        </script>
        <style>
            html, body, #map {
                height: 100%;
                height:100vh;
                margin: 0px;
                padding: 0px
            }
            #map{
                width:800px;
                height:600px;
                float:none;
                margin:auto;
            }
            .iwin{/* hidden infowindow content elements */
                display:none;
                width:320px;
                height:240px;
                padding:1rem;
                border:1px solid gray;
                border-radius:1rem;
                box-sizing:border-box;
                font-family:calibri,verdana,arial;
            }
            .iwin > img{
                display:inline-block;
                clear:none;
                margin:0.5rem;
                float:left;
                outline:1px dotted rgba(133,133,133,0.25);
                padding:0.1rem;
                min-width:80px;
                min-height:120px;
            }
            .iwin > span{
                float:left;
                min-width:51%;
                margin:0 auto 0.25rem auto;
                display:inline-block;
                clear:right;
                color:gray;
            }
      
            .iwin > span[data-id='place-name1']{
                font-size:1rem;
            }
            .iwin > span[data-id='place-name2']{
                font-size:0.9rem;
            }
            .iwin > a{
                float:right;
                margin:1rem auto;
                font-size:0.75rem;
            }







            #pac-card{
                width:800px;
                float:none;
                margin:auto;
                padding:1rem;
                border:1px solid gray;
                box-sizing:border-box;
                display:flex;
                justify-content:space-around;
            }
            form{
                display:inline-block;
                clear:none;
                width:100%;
            }

            #pac-card > div {
                box-sizing:border-box;
                background:white;
                clear:none;
                margin:0;
                float:none;
                display:block;
            }
            input[type='text'],
            input[type='submit']{
                padding:1rem;
            }
            input[type='text'],
            #name{
                border:1px solid gray;
            }
            .warn{
                border:1px solid red!important;
                background:rgba(255,0,0,0.25);
                color:white;
            }
            input[value]:not([value=""]) + span:before{
                color:green;
                background:transparent;

                padding:0.25rem;
                clear:none;
                content:'L';
                display:inline-block;

                font-family: arial;
                font-weight:bold;
                font-size:1.5rem;

                -ms-transform: scaleX(-1) rotate(-35deg);
                -webkit-transform: scaleX(-1) rotate(-35deg);
                transform: scaleX(-1) rotate(-35deg);

                z-index:2;
                position:relative;
                left:-28rem!important;
            }

            input[type='submit']{
                text-transform:uppercase;
            }
        </style>
    </head>
    <body>
        <!-- // more or less original html content - less ID attributes but extensive use of dataset attributes // -->


        <div class='pac-card' id='pac-card'>
          <div id='pac-container'>
            <input data-type='stateside' data-lat='59.325' data-lng='18.070' type='text' placeholder='StateSide Guess' value='' />
            <input data-type='foreign' data-lat='50.325' data-lng='24.070' type='text' placeholder='Foreign Guess' value='' />
          </div>
          <div>
            <form class='guess-submit' style='text-align: center'>

                <span id='stateside'>
                    <input type='hidden' data-id='name' name='state' value='' /><span></span>
                    <input type='hidden' data-id='lat' name='stateLat' value='' />
                    <input type='hidden' data-id='lng' name='stateLng' value='' />
                </span>

                <span id='foreign'>
                    <input type='hidden' data-id='name' name='foreign' value='' /><span></span>
                    <input type='hidden' data-id='lat' name='foreignLat' value='' />
                    <input type='hidden' data-id='lng' name='foreignLng' value='' />
                </span>

                <input type='text' id='name' name='name' placeholder='Your Name' />
                <input type='submit' id='submit' class='btn btn-primary' value='submit' />
            </form>  
          </div>
        </div>


        <div id='map'></div>


        <!-- hidden elements - infowindow contents -->
        <div id='win_1' class='iwin' data-type='stateside'>
          <img src='' width='16' height='16' />
          <span data-id='user-name'  class='user'></span>
          <span data-id='place-name'  class='title'></span>
          <br />
          <span data-id='place-address'></span>
        </div>

        <div id='win_2' class='iwin' data-type='foreign'>
          <img src='' width='16' height='16' />
          <span data-id='user-name'  class='user'></span>
          <span data-id='place-name' class='title'></span>
          <br />
          <span data-id='place-address'></span>
        </div>


        <!-- // // -->
    </body>
</html>