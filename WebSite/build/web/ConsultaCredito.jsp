<%-- 
    Document   : ConsultaCrédito
    Created on : 22/08/2013, 17:59:10
    Author     : willian
--%>
<%@page import="Beans.Creditar"%>
<%@page import="daos.UsuarioDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Consulta de Crédito</title>
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
        <h2>Seu Saldo</h2>
        <hr>
        <%
            List<Creditar> listacreditos = (List<Creditar>) session.getAttribute("listaCreditos");
            if (listacreditos == null || listacreditos.isEmpty()) {
        %>
        Não há Crédito!
        <% } else {
        %>
        <table>
            <tr>
                <th class="esquerda">Usuário</th>
                <th>Crédito</th>

            </tr>
            <%
                for (Creditar c : listacreditos) {
                    out.println("<tr>");
                    out.println("<td class=\"esquerda\">" + UsuarioDAO.find(c.getId_usuario()).getNome() + "</td>");
                    out.println("<td>" + c.getValor() + "</td>");
                    out.println("</tr>");
                }
            %>
        </table>
        <%
            }
        %>
    </body>
</html>
