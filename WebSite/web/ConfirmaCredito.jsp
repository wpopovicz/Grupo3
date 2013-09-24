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

        <h1>
            Restaurante <br/>
            Universitário
        </h1> 
        <h2>Adicionar Crédito</h2>
        Atenção! Você realmente deseja inserir crédito?
        <br/><br/>
        <% NovoCredito creditar = (NovoCredito) session.getAttribute("novoCredito"); 
            String nome = creditar.getNome();
            String email = creditar.getEmail();
            String valor = creditar.getValor();
        %>
        Nome: <%=nome%><br/>
        E-mail: <%=email%><br/>
        Telefone: <%=valor%><br/>
        <br/>
        <a href="GravarPalpiteServlet">Confirmar</a>
        <a href="palpiteForm.jsp">Modificar</a>
        <a href="index.jsp?cancelar=sim" >Cancelar</a>
    </body>
</html>