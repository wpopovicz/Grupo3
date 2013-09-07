package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import forms.NovoCredito;

public final class ConfirmaCredito_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Restaurante Universitário</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilo.css\"/>\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("         <ul class=\"nav nav-pills\">\r\n");
      out.write("            <li class=\"active\">\r\n");
      out.write("                <a href=\"inicial.jsp\">Login</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a href=\"ConsultarCredito\">Consultar Crédito</a></li>\r\n");
      out.write("            <li><a href=\"ConfirmaCredito\">Adicionar Crédito</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <h1>\r\n");
      out.write("            Restaurante <br/>\r\n");
      out.write("            Universitário\r\n");
      out.write("        </h1> \r\n");
      out.write("        <h2>Adicionar Crédito</h2>\r\n");
      out.write("        Atenção! Você realmente deseja inserir crédito?\r\n");
      out.write("        <br/><br/>\r\n");
      out.write("        ");
 NovoCredito creditar = (NovoCredito) session.getAttribute("novoCredito"); 
            String nome = creditar.getNome();
            String email = creditar.getEmail();
            String valor = creditar.getValor();
        
      out.write("\r\n");
      out.write("        Nome: ");
      out.print(nome);
      out.write("<br/>\r\n");
      out.write("        E-mail: ");
      out.print(email);
      out.write("<br/>\r\n");
      out.write("        Telefone: ");
      out.print(valor);
      out.write("<br/>\r\n");
      out.write("        <br/>\r\n");
      out.write("        <a href=\"GravarPalpiteServlet\">Confirmar</a>\r\n");
      out.write("        <a href=\"palpiteForm.jsp\">Modificar</a>\r\n");
      out.write("        <a href=\"index.jsp?cancelar=sim\" >Cancelar</a>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
