package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroAluno_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/head.jsp", out, false);
      out.write("\n");
      out.write("        <script type=\"text/javascript\" >\n");
      out.write("                $(document).ready(function(){\n");
      out.write("                    $(\"#cpf\").mask(\"999.999.999-99\");\n");
      out.write("                    \n");
      out.write("                    $('#meu_form').validate({\n");
      out.write("                        rules:{ \n");
      out.write("                            nome:{ \n");
      out.write("                                required: true,\n");
      out.write("                                minlength: 3\n");
      out.write("                            },\n");
      out.write("                            email: {\n");
      out.write("                                required: true,\n");
      out.write("                                email: true\n");
      out.write("                            },\n");
      out.write("                            senha: {\n");
      out.write("                                required: true\n");
      out.write("                            },\n");
      out.write("                            conf_senha:{\n");
      out.write("                                required: true,\n");
      out.write("                                equalTo: \"#senha\"\n");
      out.write("                            },\n");
      out.write("                            termos: \"required\"\n");
      out.write("                        },\n");
      out.write("                        messages:{\n");
      out.write("                            nome:{ \n");
      out.write("                                required: \"O campo nome é obrigatorio.\",\n");
      out.write("                                minlength: \"O campo nome deve conter no mínimo 3 caracteres.\"\n");
      out.write("                            },\n");
      out.write("                            email: {\n");
      out.write("                                required: \"O campo email é obrigatorio.\",\n");
      out.write("                                email: \"O campo email deve conter um email válido.\"\n");
      out.write("                            },\n");
      out.write("                            senha: {\n");
      out.write("                                required: \"O campo senha é obrigatorio.\"\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                            },\n");
      out.write("                            conf_senha:{\n");
      out.write("                                required: \"O campo confirmação de senha é obrigatorio.\",\n");
      out.write("                                equalTo: \"O campo confirmação de senha deve ser identico ao campo senha.\"\n");
      out.write("                            },\n");
      out.write("                            termos: \"Para se cadastrar você deve aceitar os termos de uso.\"\n");
      out.write("                        }\n");
      out.write("\t\t\t\t\t\n");
      out.write("                    });\n");
      out.write("                \n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"conteudo\">\n");
      out.write("\n");
      out.write("            <form id=\"meu_form\" action=\"\" method=\"post\" >\n");
      out.write("                Nome:<br />\n");
      out.write("                <input type=\"text\" name=\"nome\" id=\"nome\" /><br />\n");
      out.write("                CPF:<br />\n");
      out.write("                <input type=\"text\" name=\"cpf\" id=\"cpf\" /><br />\n");
      out.write("                Email:<br />\n");
      out.write("                <input type=\"text\" name=\"email\" id=\"email\" /><br />\n");
      out.write("                Senha:<br />\n");
      out.write("                <input type=\"password\" name=\"senha\" id=\"senha\" /><br />\n");
      out.write("                Confirmação de Senha:<br />\n");
      out.write("                <input type=\"password\" name=\"conf_senha\" id=\"conf_senha\" /><br />\n");
      out.write("                Aceito os termos e condições:<br />\n");
      out.write("                <input type=\"checkbox\" name=\"termos\" id=\"termos\"><br />\n");
      out.write("                <input type=\"submit\" value=\"Cadastrar\" />\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
