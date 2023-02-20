package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.ListasPaises;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import Modelo.Comida;

public final class ListarArticulos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Lista de comidas</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <h1>Listado de las Comidas</h1>\n");
      out.write("\n");
      out.write("        ");
 
            Comida.getListacomidas().clear();
            Comida.RellenarLista();   
        
      out.write("\n");
      out.write("\n");
      out.write("        ");

            for (Map.Entry<String, Comida> entry : Comida.getListacomidas().entrySet()) {
                    
                if(entry.getValue().getPais().equalsIgnoreCase("Italia")){
                    ListasPaises.italia.add(entry.getValue());
                }else if(entry.getValue().getPais().equalsIgnoreCase("Alemania")){
                    ListasPaises.alemania.add(entry.getValue());
                }else if(entry.getValue().getPais().equalsIgnoreCase("Espana")){
                    ListasPaises.espana.add(entry.getValue());
                }else{
                    ListasPaises.otro.add(entry.getValue());
                }
        }
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <article>\n");
      out.write("            <h2>Italia</h2>\n");
      out.write("            ");
 for (Comida c:ListasPaises.italia){
                
      out.write("<p>");
 out.println(c.getNombre()); 
      out.write("</p>\n");
      out.write("                <img src=\"");
 c.getPais(); 
      out.write("\"></img\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </article>\n");
      out.write("        \n");
      out.write("        <article>\n");
      out.write("            <h2>Alemania</h2>\n");
      out.write("            ");
 for (Comida c:ListasPaises.alemania){
                
      out.write("<p>");
 out.println(c.getNombre()); 
      out.write("</p>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </article>\n");
      out.write("        \n");
      out.write("        <article>\n");
      out.write("            <h2>España</h2>\n");
      out.write("            ");
 for (Comida c:ListasPaises.espana){
                
      out.write("<p>");
 out.println(c.getNombre()); 
      out.write("</p>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </article>\n");
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
