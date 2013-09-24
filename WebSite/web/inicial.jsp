<%-- 
    Document   : inicialjsp
    Created on : 16/08/2013, 13:57:21
    Author     : willian
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="keywords" content="cadastro do sistema RU">
        <link rel="shortcut icon" href="favicon.png">
        <title>Retaurante Universitário</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="estilo.css"/>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">

        <link href="css/bootstrap.css" rel="stylesheet">

        <script src="js/jquery-1.10.2.js" type="text/javascript"></script>

    </head>
    <body>
        <ul class="nav nav-pills">
            <li class="active">
                <a href="inicial.jsp">Login</a>
            </li>
            <li class="disabled"><a href="#">Consultar Crédito</a></li>
            <li class="disabled"><a href="#">Adicionar Crédito</a></li>
            <li class="disabled"><a href="#">Trocar Senha</a></li>
        </ul>

        <h1>
            Restaurante <br/>
            Universitário
        </h1>  
        </br>
        </br>
        <div class="container-left">
            <form class="form-horizontal" role="form" action="NewServlet" method="POST">
                <div class="form-group">
                    <label for="inputEmail1" class="col-lg-5 control-label">Email</label>
                    <div class="col-lg-3">
                        <input type="email" class="form-control" name="email" id="inputEmail1" placeholder="Email">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputPassword1" class="col-lg-5 control-label">Password</label>
                    <div class="col-lg-3">
                        <input type="password" class="form-control" name="senha" id="inputPassword1" placeholder="Password">
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

        <script src="js/bootstrap.min.js"></script>
    </body>
</html>