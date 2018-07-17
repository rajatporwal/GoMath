package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.math.BigInteger;

public final class HCF_005fLCM_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(' ');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<html class=\" js no-touch\" lang=\"en\"><head>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("<!--// css -->        \n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" \thref=\"css/chocolat.css\" type=\"text/css\" media=\"all\">\n");
      out.write("        <link href=\"css/menu.css\" rel=\"stylesheet\">\n");
      out.write("<!--// css -->\n");
      out.write("<!-- font -->\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Josefin+Sans:400,100,100italic,300,300italic,400italic,600,600italic,700,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- //font -->  \n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Math Is Fun</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"Your page description here\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <!-- css -->\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"w3l_header_left\"> \n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><span class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></span>+ (91) 8871347017</li>\n");
      out.write("\t\t\t\t\t<li><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span><a href=#\">rajatporwal1483@gmail.com</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"w3l_header_right\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("                                    <li class=\"agileits w3layouts\"><a  href=\"header.html\">HOME</a></li>\n");
      out.write("                                    <li class=\"agileits w3layouts\"><a  href=\"#\">Contact US</a></li>\n");
      out.write("                                    <li class=\"agileits w3layouts\"><a  href=\"#\">Sign Out</a></li>\n");
      out.write("                                  \n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <header style=\" \" >\t\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("                    <div class=\"logo-w3\">\n");
      out.write("                        <a href=\"#\"><h1><img src=\"images/Pie.JPG\" alt=\" \" /><span style=\"font-family: cursive; font-weight: bold\">Math is Fun</span></h1></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"navbar navbar-static-top\">\n");
      out.write("                                    <div class=\"navigation navbar\" style=\"background-color: #000; padding-top:8px;padding-bottom: 8px;\">\n");
      out.write("\t\t\t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav topnav bold\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("                                                            <a href=\"#\">Number Conversion <i class=\"icon-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu bold\">\n");
      out.write("                                                            <li><a href=\"Enter_Binary_Details.jsp\">BINARY To All</a></li>\n");
      out.write("                                                            <li><a href=\"Enter_Decimal_Details.jsp\">DECIMAL To All</a></li>\n");
      out.write("\t\t\t\t\t\t\t    <li><a href=\"Enter_Hexadecimal_Details.jsp\">HEXADECIMAL To All</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" >Expression Conversion <i class=\"icon-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\" class=\"dropdown-menu bold\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">INFIX Conversion</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">PREFIX Conversion</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">POSTFIX Conversion</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\">4 Sliders <i class=\"icon-angle-right\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul style=\"display: none;\" class=\"dropdown-menu sub-menu-level1 bold\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Lush slider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Layer slider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Flexslider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Flexslider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Sorting <i class=\"icon-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu bold\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">About us</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Pricing boxes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">404</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("<!--\t\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" >page <i class=\"icon-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\" class=\"dropdown-menu bold\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Portfolio 2 columns</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Portfolio 3 columns</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Portfolio 4 columns</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Portfolio detail</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>-->\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" >Blog <i class=\"icon-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu bold\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Blog left sidebar</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Blog right sidebar</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Post left sidebar</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Post right sidebar</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"Enter_HCF_Details.jsp\" style=\"color: #FFC107\">HCF-LCM</a>\n");
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
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\t<script src=\"js/custom.js\"></script>\n");
      out.write("\n");
      out.write("</body></html>");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head> \n");
      out.write("       <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("       <link rel=\"stylesheet\" href=\"js/bootstrap.min.css\" />\n");
      out.write("       <link rel=\"stylesheet\" href=\"js/awesome.min.css\" />\n");
      out.write("       <link rel=\"stylesheet\" href=\"css/manual.css\" />\n");
      out.write("       <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("       <script type=\"text/javascript\" src =\"js/Bootstrap.min.js\"> </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");

      try {  
          String s = request.getParameter("hcf");
         String[] stringValues = s.split("[,]");
         int[] numArray= new int[stringValues.length];

        for(int i=0; i<numArray.length; i++){
        numArray[i]= Integer.parseInt(stringValues[i]);
        System.out.println(numArray[i]);
    }
 
    
      out.write("  \n");
      out.write("            \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a href=\"header.html\"></a>\n");
      out.write("            <center><h1 class=\"well mainheading_style\">Binary Number Conversion</h1></center>\n");
      out.write("\t<div class=\"col-lg-12 well blue_color\" >\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("            \n");
      out.write("  <label class=\"col-lg-3 control-label heading_style\">Binary No.</label>\n");
      out.write("  <div class=\"col-lg-6\">\n");
      out.write("      <input type=\"text\" value=\"");
      out.print(10);
      out.write("\" class=\"form-control text_style\" readonly>\n");
      out.write("  </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("  <label class=\"col-lg-4 control-label heading_style\" >Decimal No.</label>\n");
      out.write("  <div class=\"col-lg-6\">\n");
      out.write("      <input type=\"text\" value=\"");
      out.print(10);
      out.write("\" class=\"form-control text_style\" readonly>\n");
      out.write("  </div>\n");
      out.write("  <br><br><br><br>\n");
      out.write("  <label class=\"col-lg-4 control-label heading_style\" >Octal No.</label>\n");
      out.write("  <div class=\"col-lg-6\">\n");
      out.write("      <input type=\"text\" value=\"");
      out.print(10);
      out.write("\" class=\"form-control text_style\" readonly>\n");
      out.write("  </div>\n");
      out.write("  <br><br><br><br>\n");
      out.write("  <label class=\"col-lg-4 control-label heading_style\" >HexaDecimal No.</label>\n");
      out.write("  <div class=\"col-lg-6\">\n");
      out.write("      <input type=\"text\" value=\"");
      out.print(10);
      out.write("\" class=\"form-control text_style\" readonly>\n");
      out.write("  </div>\n");
      out.write("            </div>\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("   </div>\n");
      out.write("  ");

     }
    catch(Exception e)
     {
         out.println(e);
     }

  
      out.write("\n");
      out.write("\t</body>\n");
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
