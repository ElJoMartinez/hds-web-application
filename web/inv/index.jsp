<%@ include file="/includes/header.jsp" %>

<!-- start the middle column -->
<div class="wrapper">
    <div class="header header-filter"  id="header-img">
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-2" id="header_text">
                    <h1 class="title text-center">Browse Our Inventory</h1><br />

                </div>
            </div>
        </div>
    </div>	
</div>
<div class="main main-raised" id="main-raised">
    <div class="container">
        <div class="profile" id="faq-icon" >
            <div class="avatar" >
                <img src="/images/inventory-icon.png" alt="Circle Image" class="img-circle img-responsive img-raised">
            </div>

        </div>
        <div class="section text-center section-landing">
            <table class="table">
                <thead>
                    <tr>
                        <th class="text-center">#</th>
                        <th>Brand</th>
                        <th>Model ID</th>
                        <th>Serial ID</th>
                        <th class="text-center">Description</th>
                        <th>Cost</th>
                        <Th>List Price</th>
                    </tr>
                    <jsp:include page="/includes/product_table.jsp" />
                </thead>
            </table>


        </div>
    </div>

</div>
<!-- end the middle column -->


<%@ include file="/includes/footer.jsp" %>