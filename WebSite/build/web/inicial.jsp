<%-- 
    Document   : inicialjsp
    Created on : 16/08/2013, 13:57:21
    Author     : willian
--%>
<!DOCTYPE html>
<html>
    <head>
        <title>Retaurante Universitário</title>
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
        <ul class="nav nav-pills">
            <li class="active">
                <a href="inicial.jsp">Login</a>
            </li>
            <li class="disabled"><a href="ConsultarCredito">Consultar Crédito</a></li>
            <li class="disabled"><a href="ConfirmaCredito">Adicionar Crédito</a></li>
        </ul>

        <h1>
            Restaurante <br/>
            Universitário
        </h1>     

        <form class="form-horizontal">
            <div class="control-group">
                <label class="control-label" for="inputEmail">Email</label>
                <div class="controls">
                    <input type="text" id="inputEmail" placeholder="Email">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputPassword">Senha</label>
                <div class="controls">
                    <input type="password" id="inputPassword" placeholder="Senha">
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <label class="checkbox">
                        <input type="checkbox"> Lembre-se de mim
                    </label>
                    <button type="submit" class="btn">Entrar</button>
                </div>
            </div>
        </form>


        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="//code.jquery.com/jquery.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>