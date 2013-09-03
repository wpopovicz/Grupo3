package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicial_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Bootstrap 101 Template</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilo.css\"/>\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("          <script src=\"../../assets/js/html5shiv.js\"></script>\r\n");
      out.write("          <script src=\"../../assets/js/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>\r\n");
      out.write("            Restaurante <br/>\r\n");
      out.write("            Universitário\r\n");
      out.write("        </h1>\r\n");
      out.write("        \r\n");
      out.write("        <ul id=\"menubv\" style=\"background:transparent; border:0; margin-bottom:20px;\">\r\n");
      out.write("            <li><a href=\"#\" title=\"Pagina Inicial\">Home</a></li>\r\n");
      out.write("            <li><a href=\"ConfirmaCredito.jsp\" title=\"ConfirmaCredito\">Cadastarar</a></li>\r\n");
      out.write("            <li><a href=\"\" title=\"ConfirmaCredito\">Adicionar Crédito</a></li>\r\n");
      out.write("            <li><a href=\"ConsultaCrédito.jsp\" title=\"ConfirmaCredito\">Consultar Crédito</a></li>\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("        <form class=\"form-horizontal\" role=\"form\" action=\"NewServlet\" method=\"POST\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"inputEmail1\" class=\"col-lg-2 control-label\">Email</label>\r\n");
      out.write("                <div class=\"col-lg-10\">\r\n");
      out.write("                    <input type=\"email\" class=\"form-control\" id=\"inputEmail1\" name=\"email\" placeholder=\"Email\" >\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"inputPassword1\" class=\"col-lg-2 control-label\">Password</label>\r\n");
      out.write("                <div class=\"col-lg-10\">\r\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"inputPassword1\" name=\"senha\" placeholder=\"Password\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <div class=\"col-lg-offset-2 col-lg-10\">\r\n");
      out.write("                    <div class=\"checkbox\">\r\n");
      out.write("                        <label>\r\n");
      out.write("                            <input type=\"checkbox\"> Remember me\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <div class=\"col-lg-offset-2 col-lg-10\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">Sign in</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("        <script src=\"//code.jquery.com/jquery.js\"></script>\r\n");
      out.write("        <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
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
