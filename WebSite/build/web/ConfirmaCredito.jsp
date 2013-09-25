<%-- 
    Document   : ConfirmaCredito
    Created on : 16/08/2013, 15:05:54
    Author     : willian
--%>

<%@page import="forms.NovoCredito"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Restaurante Universitário</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="estilo.css"/>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
    </head>
    <body>
         <ul class="nav nav-pills">
            <li class="active">
                <a href="inicial.jsp">Login</a>
            </li>
            <li><a href="ConsultarCredito">Consultar Crédito</a></li>
            <li><a href="ConfirmaCredito">Adicionar Crédito</a></li>
        </ul>
        
        <div class="container">
                <div class="page-header">
                    <h1>
                        Restaurante <br/>
                        Universitário
                    </h1>
                </div>
                <form class="form-horizontal" action="credito" method="POST">

                    <div class="panel panel-default">
                        <div class="panel-heading">Adicionar Crédito</div>
                        <div class="panel-body">
                            <form class="form-horizontal" role="form">
                                <div class="form-group">
                                    <label for="inputEmail1" class="col-lg-2 control-label">Email</label>
                                    <div class="col-lg-5">
                                        <input type="email" class="form-control" name="email" id="inputEmail1" placeholder="email">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputPassword1" class="col-lg-2 control-label">Password</label>
                                    <div class="col-lg-5">
                                        <input type="password" class="form-control" name="passoword" id="inputPassword1" placeholder="password">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputValor1" class="col-lg-2 control-label">R$</label>
                                    <div class="col-lg-5">
                                        <input type="valor" class="form-control" name="valor" id="inputPassword1" placeholder="valor">
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
                                    <button type="submit" class="btn btn-danger" onclick="ConsultaCredito.jsp;">Cancelar</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>

    </body>
</html>