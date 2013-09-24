package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"keywords\" content=\"cadastro do sistema RU\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.png\">\n");
      out.write("\n");
      out.write("    <title>Cadastro de clientes</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"css/personalizado.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <script src=\"js/jquery-1.10.2.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <!-- Wrap all page content here -->\n");
      out.write("    <div id=\"wrap\">\n");
      out.write("\n");
      out.write("      <!-- Fixed navbar -->\n");
      out.write("      <div class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Restaurante RU</a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"collapse navbar-collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("              <li><a href=\"index.jsp\">Início</a></li>\n");
      out.write("              <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"Credito\" data-toggle=\"dropdown\">Cliente <b class=\"caret\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                  <li><a href=\"ConsultaCredito.jsp\">Consulta de Crédito</a></li>\n");
      out.write("                  <li><a href=\"ConfirmaCredito.jsp\">Creditar</a></li>\n");
      out.write("                  <li class=\"divider\"></li>\n");
      out.write("                  <li class=\"dropdown-header\">Nav header</li>\n");
      out.write("                  <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                  <li><a href=\"trocarSenha.jsp\">Trocar Senha</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div><!--/.nav-collapse -->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- Begin page content -->\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"page-header\">\n");
      out.write("          <h1>Página inical do sistema</h1>\n");
      out.write("        </div>\n");
      out.write("        <p class=\"lead\">Pin a fixed-height footer to the bottom of the viewport in desktop browsers with this custom HTML and CSS. A fixed navbar has been added within <code>#wrap</code> with <code>padding-top: 60px;</code> on the <code>.container</code>.</p>\n");
      out.write("        <p>Back to <a href=\"../sticky-footer\">the default sticky footer</a> minus the navbar.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"footer\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <p class=\"text-muted credit\">Layout Bootstrap |<a href=\"#\">Willian Lopes popovicz</a>.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\n");
      out.write("  </body>\n");
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
