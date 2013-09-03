<%-- 
    Document   : inicialjsp
    Created on : 16/08/2013, 13:57:21
    Author     : willian
--%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bootstrap 101 Template</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="estilo.css"/>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="../../assets/js/html5shiv.js"></script>
          <script src="../../assets/js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <h1>
            Restaurante <br/>
            Universitário
        </h1>
        
        <ul id="menubv" style="background:transparent; border:0; margin-bottom:20px;">
            <li><a href="#" title="Pagina Inicial">Home</a></li>
            <li><a href="ConfirmaCredito.jsp" title="ConfirmaCredito">Cadastrar</a></li>
            <li><a href="" title="ConfirmaCredito">Adicionar Crédito</a></li>
            <li><a href="ConsultaCrédito.jsp" title="ConfirmaCredito">Consultar Crédito</a></li>
            

        </ul>
        <form class="form-horizontal" role="form" action="NewServlet" method="POST">
            <div class="form-group">
                <label for="inputEmail1" class="col-lg-2 control-label">Email</label>
                <div class="col-lg-10">
                    <input type="email" class="form-control" id="inputEmail1" name="email" placeholder="Email" >
                </div>
            </div>
            <div class="form-group">
                <label for="inputPassword1" class="col-lg-2 control-label">Password</label>
                <div class="col-lg-10">
                    <input type="password" class="form-control" id="inputPassword1" name="senha" placeholder="Password">
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-2 col-lg-10">
                    <div class="checkbox">
                        <label>
                            <input type="checkbox"> Remember me
                        </label>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-2 col-lg-10">
                    <button type="submit" class="btn btn-default">Sign in</button>
                </div>
            </div>
        </form>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="//code.jquery.com/jquery.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>