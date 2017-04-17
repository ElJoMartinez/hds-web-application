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
        
        
        
        <div class="section landing-section">
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <h2 class="text-center title">Send us a Message</h2>
                    <h4 class="text-center description"> 
                        If you have any questions and need to reach us
                        through email, please fill in your name, email address
                        and your message  below. We generally respond
                        within 24 hours of our initial receipt of your message.
                    </h4>
                    <form class="contact-form">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group label-floating">
                                    <label class="control-label">Your Name</label>
                                    <input type="email" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group label-floating">
                                    <label class="control-label">Your Email</label>
                                    <input type="email" class="form-control">
                                </div>
                            </div>
                        </div>

                        <div class="form-group label-floating">
                            <label class="control-label">Your Messge</label>
                            <textarea class="form-control" rows="4"></textarea>
                        </div>

                        <div class="row">
                            <div class="col-md-4 col-md-offset-4 text-center">
                                <button class="btn btn-default btn-raised" id='btn'>
                                    Send Message
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

        </div>
    </div>
</div>
<!-- end the middle column -->


<jsp:include page="/includes/footer.jsp" />
