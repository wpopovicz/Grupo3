<%-- 
    Document   : cadastroAluno
    Created on : 02/10/2013, 20:46:15
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <jsp:include page="includes/head.jsp" ></jsp:include>
        <script type="text/javascript" >
                $(document).ready(function(){
                    $("#cpf").mask("999.999.999-99");
                    
                    $('#meu_form').validate({
                        rules:{ 
                            nome:{ 
                                required: true,
                                minlength: 3
                            },
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
                            termos:{
                            required: "required"
                            }
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
                            conf_senha:{
                                required: "O campo confirmação de senha é obrigatorio.",
                                equalTo: "O campo confirmação de senha deve ser identico ao campo senha."
                            },
                            termos:{
                            required: "Para se cadastrar você deve aceitar os termos de uso."
                            }
                        }
					
                    });
                
                });
            </script>

            
        <jsp:include page="includes/menu.jsp"/>

        <div id="conteudo">

            <form id="meu_form" action="" method="post" >
                Nome:<br />
                <input type="text" name="nome" id="nome" /><br />
                CPF:<br />
                <input type="text" name="cpf" id="cpf" /><br />
                Email:<br />
                <input type="text" name="email" id="email" /><br />
                Senha:<br />
                <input type="password" name="senha" id="senha" /><br />
                Confirmação de Senha:<br />
                <input type="password" name="conf_senha" id="conf_senha" /><br />
                Aceito os termos e condições:<br />
                <input type="checkbox" name="termos" id="termos"><br />
                <input type="submit" value="Cadastrar" />
            </form>


        </div>



    </body>
</html>
