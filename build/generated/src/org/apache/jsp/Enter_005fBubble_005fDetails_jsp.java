package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Enter_005fBubble_005fDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.html");
  }

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
      out.write("    ");
      out.write("<html class=\" js no-touch\" lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("    <!--// css -->\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/chocolat.css\" type=\"text/css\" media=\"all\">\n");
      out.write("    <link href=\"css/menu.css\" rel=\"stylesheet\">\n");
      out.write("    <!--// css -->\n");
      out.write("    <!-- font -->\n");
      out.write("    <link href='//fonts.googleapis.com/css?family=Josefin+Sans:400,100,100italic,300,300italic,400italic,600,600italic,700,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("    <!-- //font -->\n");
      out.write("    <script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Math Is Fun</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"Your page description here\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <!-- css -->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"w3l_header_left\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><span class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></span>+ (91) 8871347017</li>\n");
      out.write("                    <li><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span><a href=# \">rajatporwal1483@gmail.com</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"w3l_header_right \">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("                                    <li class=\"agileits w3layouts \"><a  href=\"header.html \">HOME</a></li>\n");
      out.write("                                    <li class=\"agileits w3layouts \"><a  href=\"# \">Contact US</a></li>\n");
      out.write("                                    <li class=\"agileits w3layouts \"><a  href=\"# \">Sign Out</a></li>\n");
      out.write("                                  \n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"clearfix \"> </div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <header style=\" \" >\t\n");
      out.write("\t\t<div class=\"container \">\n");
      out.write("                    <div class=\"logo-w3 \">\n");
      out.write("                        <a href=\"# \"><h1><img src=\"images/Pie.JPG \" alt=\" \" /><span style=\"font-family: cursive; font-weight: bold \">Math is Fun</span></h1></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"navbar navbar-static-top \">\n");
      out.write("                                    <div class=\"navigation navbar \" style=\"background-color: #000; padding-top:8px;padding-bottom: 8px; \">\n");
      out.write("\t\t\t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav topnav bold \">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown \">\n");
      out.write("                                                            <a href=\"# \">Number Conversion <i class=\"icon-angle-down \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu bold \">\n");
      out.write("                                                            <li><a href=\"Enter_Binary_Details.jsp \">BINARY To All</a></li>\n");
      out.write("                                                            <li><a href=\"Enter_Decimal_Details.jsp \">DECIMAL To All</a></li>\n");
      out.write("                                                            <li><a href=\"Enter_Octal_Details.jsp \">OCTAL To All</a></li>\n");
      out.write("\t\t\t\t\t\t\t    <li><a href=\"Enter_Hexadecimal_Details.jsp \">HEXADECIMAL To All</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown \">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"# \" >Expression Conversion <i class=\"icon-angle-down \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none; \" class=\"dropdown-menu bold \">\n");
      out.write("                                                            <li><a href=\"# \">INFIX Conversion</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"# \">PREFIX Conversion</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"# \">POSTFIX Conversion</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown \"><a href=\"# \">4 Sliders <i class=\"icon-angle-right \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul style=\"display: none; \" class=\"dropdown-menu sub-menu-level1 bold \">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Lush slider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Layer slider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \"> Flexslider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Flexslider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown \">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"# \">Sorting <i class=\"icon-angle-down \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu bold \">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Enter_Bubble_Details.jsp\">BUBBLE  Sort</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Enter_Insertion_Details.jsp\">INSERTION Sort</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Enter_Selection_Details.jsp\">SELECTION Sort</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Enter_Quick_Details.jsp \">QUICK Sort</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Enter_Merge_Details.jsp\">MERGE Sort</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("<!--\t\t\t\t\t\t\t<li class=\"dropdown \">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"# \" >page <i class=\"icon-angle-down \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none; \" class=\"dropdown-menu bold \">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"# \">Portfolio 2 columns</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"# \">Portfolio 3 columns</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"# \">Portfolio 4 columns</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"# \">Portfolio detail</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>-->\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown \">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"# \" >Blog <i class=\"icon-angle-down \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu bold \">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"# \">Blog left sidebar</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"# \">Blog right sidebar</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"# \">Post left sidebar</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"# \">Post right sidebar</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"Enter_HCF_Details.jsp \" style=\"color: #FFC107 \">HCF-LCM</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- end navigation -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</header>\t\n");
      out.write("\t<!-- end header -->\n");
      out.write("\t\n");
      out.write("\n");
      out.write("    <!-- javascript================================================== -->\n");
      out.write("    <script src=\"js/jquery.js \"></script>\n");
      out.write("\t<script src=\"js/custom.js \"></script>\n");
      out.write("\n");
      out.write("</body></html>");
      out.write("\n");
      out.write("        \n");
      out.write("            <html lang=\"en\">\n");
      out.write("\n");
      out.write("            <head>\n");
      out.write("                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("                <link rel=\"stylesheet\" href=\"js/bootstrap.min.css\" />\n");
      out.write("                <link rel=\"stylesheet\" href=\"js/awesome.min.css\" />\n");
      out.write("                <link rel=\"stylesheet\" href=\"css/manual.css\" />\n");
      out.write("                <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"js/Bootstrap.min.js\">\n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    function validate()\n");
      out.write("                     {   \n");
      out.write("                        bubble=document.getElementById(\"bubble\").value;\n");
      out.write("                        if(bubble!=\"\")\n");
      out.write("                        {\n");
      out.write("                                var valid=\"0123456789,\";\n");
      out.write("                                var ch;\n");
      out.write("                                for(i=0;i<bubble.length;i++)\n");
      out.write("                                 {\n");
      out.write("                                     ch=bubble.charAt(i);\n");
      out.write("                                     if(valid.indexOf(ch)==-1)\n");
      out.write("                                     {\n");
      out.write("                                         alert(\"only 0's and 1's are allowed\");\n");
      out.write("                                         document.getElementById(\"bubble\").focus();\n");
      out.write("                                         return false;\n");
      out.write("                                     }    \n");
      out.write("                                 }   \n");
      out.write("                        }    \n");
      out.write("                        return true;\n");
      out.write("                     }\n");
      out.write("                </script>\n");
      out.write("            </head>\n");
      out.write("            <body>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <center>\n");
      out.write("                        <h1 class=\"well mainheading_style\">Enter Numbers for BUBBLE SORT</h1>\n");
      out.write("                    </center>\n");
      out.write("                    <div class=\"col-lg-12 well blue_color\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <form method=\"post\" action=\"Bubble_Sort.jsp\">\n");
      out.write("                                <center>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <br>\n");
      out.write("                                        <label class=\"col-md-2 control-label heading_style\"><b>Enter Numbers</b></label>\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <input type=\"text\" id=\"bubble\" name=\"bubble\" class=\"form-control\" title=\"Only integers are allowed\" required=\"\">\n");
      out.write("                                        </div><strong class=\"heading_style\">Ex : 32,45,78,14</strong><br><br>\n");
      out.write("                                        <br><br>\n");
      out.write("                                        <strong class=\"heading_style\">Note: Separate numbers using comma ( , )</strong><br><br>\n");
      out.write("                                </center>\n");
      out.write("                                <br><br><br>\n");
      out.write("                                <div class=\"col-sm-12\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <br>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"col-md-4 control-label\" for=\"submit\"></label>\n");
      out.write("                                            <div class=\"col-md-4\">\n");
      out.write("                                                <button id=\"submit\" name=\"submit\" onclick=\" return validate()\" class=\"btn btn-primary btn-lg btn3d\"><span class=\"glyphicon glyphicon-thumbs-up\"></span><strong>Submit</strong></button>\n");
      out.write("                                                <button type=\"reset\" id=\"reset\" name=\"reset\" class=\"btn btn-success btn-lg btn3d\"><span class=\"glyphicon glyphicon-thumbs-down\"></span><strong>Reset</strong></button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </body>\n");
      out.write("\n");
      out.write("            </html>");
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
