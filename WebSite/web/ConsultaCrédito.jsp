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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css" />
    </head>
    <body>
        <h1>Seu Saldo</h1>
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
                    out.println("<td class=\"esquerda\">"+UsuarioDAO.find(c.getId_usuario()).getNome()+"</td>");
                    out.println("<td>"+c.getValor()+"</td>");
                    out.println("</tr>");
                }
            %>
        </table>
        <%
            }
        %>
    </body>
</html>
