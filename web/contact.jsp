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
         <div class="profile" id="faq-icon" >
            <div class="avatar" >
                <img src="/images/contact-icon.png" alt="Circle Image" class="img-circle img-responsive img-raised">
            </div>

        </div>

        <div class="section landing-section">
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <h2 class="text-center title">Have any more questions?
                        <br> Send us a message.</h2>
                    <h4 class="text-center description"> 
                        If you have any questions and need to reach us
                        through email, please fill in your name, email address
                        and your message  below. We generally respond
                        within 24 hours of our initial receipt of your message.
                    </h4>
                    <form class="contact-form" action="/message-sent.jsp">
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
                                <button class="btn btn-default btn-raised" id='btn' type="submit">
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
