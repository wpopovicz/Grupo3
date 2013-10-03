<%-- 
    Document   : ConsultaCrédito
    Created on : 22/08/2013, 17:59:10
    Author     : willian
--%>
<jsp:useBean class="Beans.Pessoa" scope="request" id="pessoa"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
         <jsp:include page="includes/head.jsp" ></jsp:include>


    </head>
    <body>
       <jsp:include page="includes/menu.jsp"/>
        <h2>${pessoa.nome} seu Saldo ${pessoa.saldo} </h2>

        <div class="container">
            <div class="row">
                <div class="span12">
                    <form class="form-horizontal" action="credito" method="POST">
                        <div class="control-group">
                            <label class="control-label" for="inputCredito">Crédito</label>
                            <div class="controls">
                                <input type="text" name="credito" id="inputCredito" />
                            </div>
                        </div>                       
                        <div class="control-group">
                            <div class="controls">
                                <button type="submit" class="btn">Creditar</button>
                            </div>                           
                        </div>
                    </form>
                </div>
            </div>
        </div>



    </body>
</html>
