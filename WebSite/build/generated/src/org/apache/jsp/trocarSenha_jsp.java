package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trocarSenha_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/head.jsp", out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" >\r\n");
      out.write("                $(document).ready(function(){\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    $('#meu_form').validate({\r\n");
      out.write("                        rules:{ \r\n");
      out.write("                            email: {\r\n");
      out.write("                                required: true,\r\n");
      out.write("                                email: true\r\n");
      out.write("                            },\r\n");
      out.write("                            senha: {\r\n");
      out.write("                                required: true\r\n");
      out.write("                            },\r\n");
      out.write("                            conf_senha:{\r\n");
      out.write("                                required: true,\r\n");
      out.write("                                equalTo: \"#senha\"\r\n");
      out.write("                            },\r\n");
      out.write("                            termos: \"required\"\r\n");
      out.write("                        },\r\n");
      out.write("                        messages:{\r\n");
      out.write("                            nome:{ \r\n");
      out.write("                                required: \"O campo nome é obrigatorio.\",\r\n");
      out.write("                                minlength: \"O campo nome deve conter no mínimo 3 caracteres.\"\r\n");
      out.write("                            },\r\n");
      out.write("                            email: {\r\n");
      out.write("                                required: \"O campo email é obrigatorio.\",\r\n");
      out.write("                                email: \"O campo email deve conter um email válido.\"\r\n");
      out.write("                            },\r\n");
      out.write("                            senha: {\r\n");
      out.write("                                required: \"O campo senha é obrigatorio.\"\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                            },\r\n");
      out.write("                            senha_nova:{\r\n");
      out.write("                                required: \"O campo confirmação de senha é obrigatorio.\",\r\n");
      out.write("                                equalTo: \"O campo confirmação de senha deve ser identico ao campo senha.\"\r\n");
      out.write("                            },\r\n");
      out.write("                            conf_senha:{\r\n");
      out.write("                                required: \"O campo confirmação de senha é obrigatorio.\",\r\n");
      out.write("                                equalTo: \"O campo confirmação de senha deve ser identico ao campo senha.\"\r\n");
      out.write("                            },\r\n");
      out.write("                            termos: \"Para se cadastrar você deve aceitar os termos de uso.\"\r\n");
      out.write("                        }\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                    });\r\n");
      out.write("                \r\n");
      out.write("                });\r\n");
      out.write("            </script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/menu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"conteudo\">\r\n");
      out.write("\r\n");
      out.write("            <form id=\"meu_form\" action=\"\" method=\"post\" >             \r\n");
      out.write("                Email:<br />\r\n");
      out.write("                <input type=\"text\" name=\"email\" id=\"email\" /><br />\r\n");
      out.write("                Senha:<br />\r\n");
      out.write("                <input type=\"password\" name=\"senha\" id=\"senha\" /><br />\r\n");
      out.write("                Nova senha:<br />\r\n");
      out.write("                <input type=\"password\" name=\"senha_nova\" id=\"senha_nova\" /><br />\r\n");
      out.write("                Confirmação de Senha:<br />\r\n");
      out.write("                <input type=\"password\" name=\"conf_senha\" id=\"conf_senha\" /><br />\r\n");
      out.write("                Aceito os termos e condições:<br />\r\n");
      out.write("                <input type=\"checkbox\" name=\"termos\" id=\"termos\"><br />\r\n");
      out.write("                <input type=\"submit\" value=\"Cadastrar\" />\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
