package org.apache.jsp.event;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class eventForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"icon\" type=\"image/jpeg\" href=\"icon.jpeg\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Event Management</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/forms.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "eventhome.jsp", out, false);
      out.write("\n");
      out.write("       <link href=\"../inventory/CSS/calender.css\" rel=\"stylesheet\" type=\"text/css\"/>         \n");
      out.write("        <script src=\"../inventory/JS/calender.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("            function regValidate(){\n");
      out.write("\n");
      out.write("            var name = document.forms[\"registerForm\"][\"name\"].value;            \n");
      out.write("\n");
      out.write("            \n");
      out.write("                if(isAlphebaticf(name))\n");
      out.write("                    if(MType())\n");
      out.write("                        if(selectEType())\n");
      out.write("                            if(maxNumber())\n");
      out.write("                                return true;\n");
      out.write("                            else\n");
      out.write("                                return false;\n");
      out.write("                        else\n");
      out.write("                            return false;\n");
      out.write("                    else\n");
      out.write("                        return false;\n");
      out.write("                else\n");
      out.write("                    return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        function isEmpty(elemValue, field){\n");
      out.write("            if(elemValue ==\"\"  || elemValue == null){\n");
      out.write("                alert(\"You cannot have \" + field + \" field empty\");\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("                return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        function isAlphebaticf(elemValue){\n");
      out.write("            var exp = /^[0-9a-zA-Z]+$/;\n");
      out.write("            if(!isEmpty(elemValue, \"Name\"))\n");
      out.write("            {\n");
      out.write("                if(elemValue.match(exp))\n");
      out.write("                {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter only numbers and letters for Event Name\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("                return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        function MType(){\n");
      out.write("            var listBoxSelection=document.getElementById(\"select_Mtype\").value;\n");
      out.write("            if(listBoxSelection==\"Select\")\n");
      out.write("            {\n");
      out.write("                alert(\"Please select a field\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("                return true;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function selectEType(){\n");
      out.write("            var listBoxSelection=document.getElementById(\"select_Etype\").value;\n");
      out.write("            if(listBoxSelection==\"Select\")\n");
      out.write("            {\n");
      out.write("                alert(\"Please select a field\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("                return true;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function maxNumber(){\n");
      out.write("            var listBoxSelection=document.getElementById(\"select_num\").value;\n");
      out.write("            if(listBoxSelection==\"Select\")\n");
      out.write("            {\n");
      out.write("                alert(\"Please select a field\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("                return true;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body onload=\"displayCalendar()\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"events.jsp\">Event Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"eventForm.jsp\">Add Events</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"eventShow.jsp\">Update Events</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Event Chart</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"MMhome.jsp\">Meet Manager</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    \n");
      out.write("    <br><br><br>\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <h1 style=\"color: darkslateblue\" align=\"center\">Event Registration Form</h1>\n");
      out.write("            \n");
      out.write("                    <form name=\"registerForm\" action=\"eventAdd.jsp\" method=\"post\" onsubmit=\"return regValidate()\" >\n");
      out.write("                        <table align=\"center\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Event Name :</td>\n");
      out.write("                                <td><input type=\"text\" name=\"name\" ></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Meet Type :</td>\n");
      out.write("                                <td><select id=\"select_Mtype\" name=\"select_Mtype\">\n");
      out.write("                                    <option value=\"Select\">Select</option>\n");
      out.write("                                    <option>Annual Meet</option>\n");
      out.write("                                    <option>Freshers Meet</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Event Type :</td>\n");
      out.write("                                <td><select id=\"select_Etype\" name=\"select_Etype\">\n");
      out.write("                                    <option value=\"Select\">Select</option>\n");
      out.write("                                    <option>Male</option>\n");
      out.write("                                    <option>Female</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Maximum number of students :</td>\n");
      out.write("                                <td><select id=\"select_num\" name=\"select_num\">\n");
      out.write("                                    <option value=\"Select\">Select</option>\n");
      out.write("                                    <option>5</option>\n");
      out.write("                                    <option>6</option>\n");
      out.write("                                    <option>7</option>\n");
      out.write("                                    <option>8</option>\n");
      out.write("                                    <option>9</option>\n");
      out.write("                                    <option>10</option>\n");
      out.write("                                    <option>11</option>\n");
      out.write("                                    <option>12</option>\n");
      out.write("                                    <option>13</option>\n");
      out.write("                                    <option>14</option>\n");
      out.write("                                    <option>15</option>\n");
      out.write("                                    <option>16</option>\n");
      out.write("                                    <option>17</option>\n");
      out.write("                                    <option>18</option>\n");
      out.write("                                    <option>19</option>\n");
      out.write("                                    <option>20</option>\n");
      out.write("                                    <option>25</option>\n");
      out.write("                                    <option>30</option>\n");
      out.write("                                    <option>35</option>\n");
      out.write("                                    <option>40</option>\n");
      out.write("                                    <option>45</option>\n");
      out.write("                                    <option>50</option>\n");
      out.write("                                    </select> \n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><button  type=\"submit\" name=\"submit\">Submit</button></td>\n");
      out.write("                                <td><button  type=\"reset\" name=\"\">Reset</button></td>                        \n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </div>   \n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card mx-auto\" style=\"width: 20em; height: 51em\">\n");
      out.write("                        <img class=\"card-img-top mx-auto\" style=\"width:60%\" src=\"pics/user.png\" alt=\"Card image cap\"/>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                              <h5 class=\"card-title\">User Information</h5>\n");
      out.write("                            <p class=\"card-text\"><i class=\"fas fa-user\">&nbsp;</i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adminId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <p class=\"card-text\"><i class=\"fas fa-user\">&nbsp;</i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adminName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <p class=\"card-text\"><i class=\"fa fa-user-cog\">&nbsp;</i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        \t\t    \n");
      out.write("                            <a href=\"#\" name=\"logout\" id=\"logout\" onclick=\"location.href='../itpLogin.jsp'\" class=\"btn btn-primary\"><i class=\"fas fa-sign-out-alt\">&nbsp;</i>Logout</a>\n");
      out.write("\t\t\t    \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <br><br><br><br>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div id=\"calendar\">\n");
      out.write("                                \n");
      out.write("                            </div></div>                                  \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>   \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\t\n");
      out.write("</body>\n");
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
