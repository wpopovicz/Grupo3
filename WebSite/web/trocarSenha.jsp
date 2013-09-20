<%-- 
    Document   : trocarSenha
    Created on : 18/09/2013, 22:17:00
    Author     : willian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="keywords" content="cadastro do sistema RU">
        <link rel="shortcut icon" href="favicon.png">

        <title>Cadastro de clientes</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/personalizado.css" rel="stylesheet">

        <script src="js/jquery-1.10.2.js" type="text/javascript"></script>

    </head>

    <body>

        <!-- Wrap all page content here -->
        <div id="wrap">

            <!-- Fixed navbar -->
            <div class="navbar navbar-default navbar-fixed-top">
                <div class="container">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#">Restaurante RU</a>
                    </div>
                    <div class="collapse navbar-collapse">
                        <ul class="nav navbar-nav">
                            <li><a href="index.jsp">Início</a></li>
                            <li class="dropdown">
                                <a href="#" class="Credito" data-toggle="dropdown">Cliente <b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="ConsultaCredito.jsp">Consulta de Crédito</a></li>
                                    <li><a href="ConfirmaCredito.jsp">Creditar</a></li>
                                    <li class="divider"></li>
                                    <li class="dropdown-header"></li>
                                    <li><a href="trocarSenha.jsp">Trocar Senha</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div><!--/.nav-collapse -->
                </div>
            </div>

            <!-- Begin page content -->

            <div class="container">
                <div class="page-header">
                    <h1>Troca de Senha</h1>
                </div>
                <form class="form-horizontal">

                    <div class="panel panel-default">
                        <div class="panel-heading">altere sua senha</div>
                        <div class="panel-body">
                            <form class="form-horizontal" role="form">
                                <div class="form-group">
                                    <label for="inputEmail1" class="col-lg-2 control-label">Email</label>
                                    <div class="col-lg-5">
                                        <input type="email" class="form-control" id="inputEmail1" placeholder="Email">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputPassword1" class="col-lg-2 control-label">Password</label>
                                    <div class="col-lg-5">
                                        <input type="password" class="form-control" id="inputPassword1" placeholder="Password">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputPasswordnovo" class="col-lg-2 control-label">Novo Password</label>
                                    <div class="col-lg-5">
                                        <input type="password" class="form-control" id="inputPassword1" placeholder="Password">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputPasswordconfirma" class="col-lg-2 control-label">Confirma Password</label>
                                    <div class="col-lg-5">
                                        <input type="password" class="form-control" id="inputPassword1" placeholder="Password">
                                    </div>
                                </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">Opções</div>
                        <div class="panel-body">
                            <div class="form-group">
                                <div class="col-lg-offset-2 col-lg-10">
                                    <button type="submit" class="btn btn-success">Salvar</button>
                                    <button type="submit" class="btn btn-warning">Limpar</button>
                                    <button type="submit" class="btn btn-danger">Cancelar</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>

        <div id="footer">
            <div class="container">
                <p class="text-muted credit">Layout Bootstrap |<a href="#">Willian Lopes popovicz</a>.</p>
            </div>
        </div>


        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->

        <script src="js/bootstrap.js"></script>
    </body>
</html>
