<%-- 
    Document   : trocarSenha
    Created on : 18/09/2013, 22:17:00
    Author     : willian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include page="includes/head.jsp" ></jsp:include>
<script type="text/javascript" >
                $(document).ready(function(){
                    
                    
                    $('#meu_form').validate({
                        rules:{ 
                            email: {
                                required: true,
                                email: true
                            },
                            senha: {
                                required: true
                            },
                            conf_senha:{
                                required: true,
                                equalTo: "#senha"
                            },
                            termos: "required"
                        },
                        messages:{
                            nome:{ 
                                required: "O campo nome é obrigatorio.",
                                minlength: "O campo nome deve conter no mínimo 3 caracteres."
                            },
                            email: {
                                required: "O campo email é obrigatorio.",
                                email: "O campo email deve conter um email válido."
                            },
                            senha: {
                                required: "O campo senha é obrigatorio."
							
                            },
                            senha_nova:{
                                required: "O campo confirmação de senha é obrigatorio.",
                                equalTo: "O campo confirmação de senha deve ser identico ao campo senha."
                            },
                            conf_senha:{
                                required: "O campo confirmação de senha é obrigatorio.",
                                equalTo: "O campo confirmação de senha deve ser identico ao campo senha."
                            },
                            termos: "Para se cadastrar você deve aceitar os termos de uso."
                        }
					
                    });
                
                });
            </script>
    </head>

    <body>

         <jsp:include page="includes/menu.jsp"/>

        <div id="conteudo">

            <form id="meu_form" action="" method="post" >             
                Email:<br />
                <input type="text" name="email" id="email" /><br />
                Senha:<br />
                <input type="password" name="senha" id="senha" /><br />
                Nova senha:<br />
                <input type="password" name="senha_nova" id="senha_nova" /><br />
                Confirmação de Senha:<br />
                <input type="password" name="conf_senha" id="conf_senha" /><br />
                Aceito os termos e condições:<br />
                <input type="checkbox" name="termos" id="termos"><br />
                <input type="submit" value="Cadastrar" />
            </form>

        </div>
    </body>
</html>
