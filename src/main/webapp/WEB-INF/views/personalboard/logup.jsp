<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../includes/header.jsp"%>


<div class="container">
    <div class="row mt-lg-n10 mt-md-n11 mt-n10">
        <div class="col-xl-4 col-lg-5 col-md-7 mx-auto" style="margin: 30px">
            <div class="card z-index-0">
                <div class="card-header text-center pt-4">
                    <h5>Register with</h5>
                </div>
                <div class="card-body">
                    <form role="form text-left">
                        <div class="mb-3">
                            <input type="text" class="form-control" placeholder="Name" aria-label="Name" aria-describedby="email-addon">
                        </div>
                        <div class="mb-3">
                            <input type="email" class="form-control" placeholder="Email" aria-label="Email" aria-describedby="email-addon">
                        </div>
                        <div class="mb-3">
                            <input type="password" class="form-control" placeholder="Password" aria-label="Password" aria-describedby="password-addon">
                        </div>
                        <div class="form-check form-check-info text-left">
                            <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault" checked>
                            <label class="form-check-label" for="flexCheckDefault">
                                I agree the <a href="javascript:;" class="text-dark font-weight-bolder">Terms and Conditions</a>
                            </label>
                        </div>
                        <div class="text-center">
                            <button type="button" class="btn bg-gradient-dark w-100 my-4 mb-2">Sign up</button>
                        </div>
                        <p class="text-sm mt-3 mb-0">Already have an account? <a href="javascript:;" class="text-dark font-weight-bolder">Sign in</a></p>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>


<%@include file="../includes/footer.jsp"%>

</body>
</html>
