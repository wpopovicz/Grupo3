<%-- 
    Document   : index
    Created on : 18/09/2013, 21:51:04
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
                  <li class="dropdown-header">Nav header</li>
                  <li><a href="#">Separated link</a></li>
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
          <h1>Página inical do sistema</h1>
        </div>
        <p class="lead">Pin a fixed-height footer to the bottom of the viewport in desktop browsers with this custom HTML and CSS. A fixed navbar has been added within <code>#wrap</code> with <code>padding-top: 60px;</code> on the <code>.container</code>.</p>
        <p>Back to <a href="../sticky-footer">the default sticky footer</a> minus the navbar.</p>
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
