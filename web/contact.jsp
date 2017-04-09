<jsp:include page="/includes/header.jsp" />


<!-- start the middle column -->
<div class="wrapper">
    <div class="header header-filter"  id="header-img">
        <div class="container">
            <div class="row" id="headerRow">
                <div class="col-md-12 text-center" id="header_text">
                    <h1 class="title" id="faq">Contact Us</h1>
                    <br />

                </div>
            </div>
        </div>
    </div>	
</div>
<div class="main main-raised" id="main-raised">
    <div class="container">
        <div id="mapouter" class="col-md-8">
            <div id="gmap_canvas"><iframe width="600" height="500" frameborder="0" scrolling="no" marginheight="0" src="https://maps.google.com/maps?q= Phoenix, AZ 85001, &t=&z=12&ie=UTF8&iwloc=&output=embed" marginwidth="0">

                </iframe>
                <a href="http://www.maps-erstellen.de">maps-erstellen.de</a>
            </div>
            <style>
                #gmap_canvas{height:500px;width:600px;}#mapouter{overflow:hidden;height:500px;width:600px;}
            </style>
        </div>
        <div class="col-md-4" id="maptext">
            <h3>Phoenix Location</h3>
        </div>
    </div>
</div>
<!-- end the middle column -->


<jsp:include page="/includes/footer.jsp" />
