package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PrizeListEPM_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>CA Home EPM</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link href=\"External/fontawesome/css/all.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"External/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"External/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("         <script src=\"inventory/JS/calender.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Layout.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body onload=\"displayCalendar()\">\n");
      out.write("       \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"jumbotron\" style=\"width:100%; height:100%;\">\n");
      out.write("                        <div align=\"center\">            \n");
      out.write("                            <form class=\"form-inline\">\n");
      out.write("                                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\" style=\"width: 580px;\">\n");
      out.write("                                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                                    \n");
      out.write("\t\t\t<div class=\"card-group\">\n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                            <div class=\"card\" style=\"width: 5px; height: 300px\">\n");
      out.write("                                <img class=\"card-img-top\" src=\"pictures/tdicon2.jpg\"  alt=\"Card image cap\"  style=\"width: 185px; height: 180px;margin-left: 12px; margin-top: 10px;\" >\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h5 class=\"card-title\" align=\"center\"> <a href=\"#\" class=\"btn btn-primary\" style=\"width: 165px;\" onclick=\"location.href='BestPerformanceEPM.jsp'\">Best Performance</a></h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div class=\"card\" style=\"margin-left: 20px;width: 5px; height: 300px\">\n");
      out.write("                                <img class=\"card-img-top\" src=\"pictures/tdicon2.jpg\" alt=\"Card image cap\"  style=\"width: 185px; height: 180px; margin-left: 12px; margin-top: 10px;\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h5 class=\"card-title\" align=\"center\"> <a href=\"#popup1\" onclick=\"document.location.href='RelayChampion.jsp'\" class=\"btn btn-primary\" style=\"width: 165px;\">Relay Champion</a></h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div class=\"card\" style=\"margin-left: 20px;width: 5px; height: 300px\">\n");
      out.write("                                <img class=\"card-img-top\"  src=\"pictures/tdicon2.jpg\"  alt=\"Card image cap\"  style=\"width: 185px; height: 180px; margin-left: 12px; margin-top: 10px;\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h5 class=\"card-title\" align=\"center\"> <a href=\"#\" onclick=\"document.location.href='RecordHolders.jsp'\"  class=\"btn btn-primary \" style=\"width: 165px;\">Record Holders</a></h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                             \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                        <br><br>\n");
      out.write("                        \n");
      out.write("                        <div class=\"card-group\">\n");
      out.write("                           \n");
      out.write("                              <div class=\"card\" style=\"width: 5px; height: 300px\">\n");
      out.write("                            <img class=\"card-img-top\" src=\"pictures/tdicon2.jpg\" alt=\"Card image cap\" style=\"width: 185px; height: 180px; margin-left: 12px; margin-top: 10px;\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\" align=\"center\"> <a href=\"OutstandingAthleteOfTheMeet.jsp\" class=\"btn btn-primary\" style=\"width: 165px;\">Outstanding Athlete</a></h5>                                          </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div class=\"card\" style=\"margin-left: 20px;width: 5px; height: 300px\">\n");
      out.write("                            <img class=\"card-img-top\" src=\"pictures/tdicon2.jpg\" alt=\"Card image cap\" style=\"width: 185px; height: 180px; margin-left: 12px; margin-top: 10px;\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\" align=\"center\"> <a href=\"Points.jsp\" class=\"btn btn-primary\" style=\"width: 165px;\">Points</a></h5>                                          </div>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                            <div class=\"card\" style=\"margin-left: 20px;width: 5px; height: 300px\">\n");
      out.write("                            <img class=\"card-img-top\" src=\"pictures/tdicon2.jpg\" alt=\"Card image cap\" style=\"width: 185px; height: 180px; margin-left: 12px; margin-top: 10px;\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\" align=\"center\"> <a href=\"Places.html\" class=\"btn btn-primary\" style=\"width: 165px;\">Places</a></h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                          \n");
      out.write("                     \n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                   \n");
      out.write("                        <br>\n");
      out.write("                         <div class=\"card-group\">\n");
      out.write("                    \n");
      out.write("                           <div class=\"card\" style=\"width: 8px; height: 300px\">\n");
      out.write("                                <img class=\"card-img-top\"  src=\"pictures/tdicon2.jpg\"  alt=\"Card image cap\"  style=\"width: 185px; height: 180px; margin-left: 12px; margin-top: 10px;\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h5 class=\"card-title\"> <a href=\"#\" onclick=\"document.location.href='OverallPlaces.html'\"  class=\"btn btn-primary \" style=\"width: 165px;\">Overall Places</a></h5>\n");
      out.write("                                </div>\n");
      out.write("                           </div>\n");
      out.write("                       \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                         </div>\n");
      out.write("\t\t</div>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card mx-auto\" style=\"width: 20em; height: 59em\">\n");
      out.write("                        <img class=\"card-img-top mx-auto\" style=\"width:70%;\" src=\"pictures/humanicon2.jpg\" alt=\"Card image cap\">\n");
      out.write("\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t     <h5 class=\"card-title\">User Information</h5>\n");
      out.write("        \t\t   <p class=\"card-text\"><i class=\"fas fa-user\">&nbsp;</i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adminId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                           <p class=\"card-text\"><i class=\"fas fa-user\">&nbsp;</i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adminName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\t\t\t   <p class=\"card-text\"><i class=\"fa fa-user-cog\">&nbsp;</i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\t\t\t    <a href=\"#\" name=\"logout\" id=\"logout\" onclick=\"location.href='itpLogin.jsp'\" class=\"btn btn-primary\"><i class=\"fas fa-sign-out-alt\">&nbsp;</i>Logout</a>\n");
      out.write("\t\t\t      \n");
      out.write("                            <br><br><br><br><Br>\n");
      out.write("                            \n");
      out.write("                            <div id=\"calendar\">\n");
      out.write("                                \n");
      out.write("                            </div></div> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("\t</div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
