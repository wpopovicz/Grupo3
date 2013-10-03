<%-- 
    Document   : inicialjsp
    Created on : 16/08/2013, 13:57:21
    Author     : willian
--%>
<!DOCTYPE html>
<html>
    <head>
         <jsp:include page="includes/head.jsp" ></jsp:include>


    </head>
    <body>
       <jsp:include page="includes/menu.jsp"/>

        </br>
        </br>
        <div class="container-left">
            <form class="form-horizontal" action="NewServlet" method="POST">
                <div class="form-group">
                    <label for="inputEmail1" class="col-lg-5 control-label">Email</label>
                    <div class="col-lg-3">
                        <input type="email" class="form-control" name="email" id="inputEmail1" placeholder="email">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputPassword1" class="col-lg-5 control-label">Password</label>
                    <div class="col-lg-3">
                        <input type="password" class="form-control" name="senha" id="inputPassword1" placeholder="password">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-offset-5 col-lg-4">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox"> Remember me
                            </label>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-offset-5 col-lg-4">
                        <button type="submit" class="btn btn-default">Sign in</button>
                    </div>
                </div>
            </form>
        </div>
    
    </body>
</html>