package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
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
      out.write("    <title>Go Math!!</title>\n");
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
      out.write("                    <li><span class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></span>+ (91) **********</li>\n");
      out.write("                    <li><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span><a href=# \">abc@gmail.com</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"w3l_header_right \">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("                                    <li class=\"agileits w3layouts \"><a  href=\"home.jsp\">HOME</a></li>\n");
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
      out.write("                        <a href=\"# \"><h1><img src=\"images/b.JPG \" alt=\" \" /><span style=\"font-family: cursive; font-weight: bold \"> GO-MATH!</span></h1></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"navbar navbar-static-top \">\n");
      out.write("                                    <div class=\"navigation navbar \" style=\"background-color: #000; padding-top:8px;padding-bottom: 8px; \">\n");
      out.write("\t\t\t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav topnav bold \">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown \">\n");
      out.write("                                                            <a href=\"# \">No. Conversion <i class=\"icon-angle-down \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu bold \">\n");
      out.write("                                                            <li><a href=\"Enter_Binary_Details.jsp \">BINARY To All</a></li>\n");
      out.write("                                                            <li><a href=\"Enter_Decimal_Details.jsp \">DECIMAL To All</a></li>\n");
      out.write("                                                            <li><a href=\"Enter_Octal_Details.jsp \">OCTAL To All</a></li>\n");
      out.write("\t\t\t\t\t\t\t    <li><a href=\"Enter_Hexadecimal_Details.jsp \">HEXADECIMAL To All</a></li>\n");
      out.write("<!--                                                            <li class=\"dropdown \"><a href=\"# \" style=\"margin-right: 50px \">4 Sliders <i class=\" icon-angle-right \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul style=\"display: none; \" class=\"dropdown-menu sub-menu-level1 bold \">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Lush slider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Layer slider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \"> Flexslider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Flexslider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("                                                            </li>-->\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown \">\n");
      out.write("                                                            <a href=\"# \">No. Operations <i class=\"icon-angle-down \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu bold \">\n");
      out.write("                                                            <li><a href=\"Enter_Binary_Operations_Details.jsp \">BINARY Operations</a></li>\n");
      out.write("                                                            <li><a href=\"Enter_Octal_Operations_Details.jsp \">OCTAL Operations</a></li>\n");
      out.write("\t\t\t\t\t\t\t    <li><a href=\"Enter_Hexadecimal_Operations_Details.jsp \">HEXADECIMAL Operations</a></li>\n");
      out.write("<!--                                                            <li class=\"dropdown \"><a href=\"# \" style=\"margin-right: 50px \">4 Sliders <i class=\" icon-angle-right \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul style=\"display: none; \" class=\"dropdown-menu sub-menu-level1 bold \">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Lush slider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Layer slider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \"> Flexslider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Flexslider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("                                                            </li>-->\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("<!--                                                        <li class=\"dropdown \">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"# \" >No. Operations <i class=\"icon-angle-down \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu bold \">\n");
      out.write("\t\t\t\t\t\t\t    <li class=\"dropdown \"><a href=\"Enter_Binary_Operations_Details.jsp \" style=\"margin-right: 65px \">Binary Operations <i class=\" icon-angle-right \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul style=\"display: none; \" class=\"dropdown-menu sub-menu-level1 bold \">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Binary Addition </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Binary Subtraction</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \"> Binary Multiplication</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Binary Division</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li class=\"dropdown \"><a href=\"# \" style=\"margin-right: 56px \">Decimal Operations <i class=\" icon-angle-right \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul style=\"display: none; \" class=\"dropdown-menu sub-menu-level1 bold \">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Decimal Addition </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Decimal Subtraction</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \"> Decimal Multiplication</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Decimal Division</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li class=\"dropdown \"><a href=\"# \" style=\"margin-right: 71px \">Octal Operations <i class=\" icon-angle-right \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul style=\"display: none; \" class=\"dropdown-menu sub-menu-level1 bold \">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Octal Addition </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Octal Subtraction</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Octal Multiplication</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Octal Division</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li class=\"dropdown \"><a href=\"# \" style=\"margin-right: 26px \">Hexadecimal Operations <i class=\" icon-angle-right \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul style=\"display: none; \" class=\"dropdown-menu sub-menu-level1 bold \">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Hexadecimal Addition </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Hexadecimal Subtraction</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Hexadecimal Multiplication</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Hexadecimal Division</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("                                                            </li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>-->\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown \">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"# \" >Exp. Conversion <i class=\"icon-angle-down \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none; \" class=\"dropdown-menu bold \">\n");
      out.write("                                                            <li><a href=\"Enter_Infix_Details.jsp \">INFIX Conversion</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"# \">POSTFIX Conversion</a></li>\n");
      out.write("                                                                <li><a href=\"# \">PREFIX Conversion</a></li>\n");
      out.write("<!--                                                                <li class=\"dropdown \"><a href=\"# \" style=\"margin-right: 50px \"> 4 Sliders <i class=\" icon-angle-right \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul style=\"display: none; \" class=\"dropdown-menu sub-menu-level1 bold \">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Lush slider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Layer slider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \"> Flexslider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"# \">Flexslider</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>-->\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown \">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"# \">Sorting <i class=\"icon-angle-down \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu bold \">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Enter_Bubble_Details.jsp \">BUBBLE  Sort</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Enter_Insertion_Details.jsp \">INSERTION Sort</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Enter_Selection_Details.jsp \">SELECTION Sort</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"# \">QUICK Sort</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"# \">MERGE Sort</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\n");
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
      out.write("    \n");
      out.write("    <!-- javascript================================================== -->\n");
      out.write("    <script src=\"js/jquery.js \"></script>\n");
      out.write("\t<script src=\"js/custom.js \"></script>\n");
      out.write("\n");
      out.write("</body></html>");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Inspire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- css -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/popup-box.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" \thref=\"css/chocolat.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<!--// css -->\n");
      out.write("<!-- font -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Josefin+Sans:400,100,100italic,300,300italic,400italic,600,600italic,700,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- //font -->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\n");
      out.write("\t<!-- Popup-Box-JavaScript -->\n");
      out.write("\t<script src=\"js/modernizr.custom.97074.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.chocolat.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(function() {\n");
      out.write("\t\t\t$('.gallery-grids a').Chocolat();\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<!-- //Popup-Box-JavaScript -->\n");
      out.write("\t<!-- start-smooth-scrolling -->\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("\t<!-- //start-smoth-scrolling -->\n");
      out.write("\t\t<!-- here stars scrolling icon -->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t/*\n");
      out.write("\t\t\t\tvar defaults = {\n");
      out.write("\t\t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\t\teasingType: 'linear' \n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t*/\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/modernizr.custom.53451.js\"></script> \n");
      out.write(" <script>\n");
      out.write("\t\t\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t\t\t$('.popup-with-zoom-anim').magnificPopup({\n");
      out.write("\t\t\t\t\t\t\ttype: 'inline',\n");
      out.write("\t\t\t\t\t\t\tfixedContentPos: false,\n");
      out.write("\t\t\t\t\t\t\tfixedBgPos: true,\n");
      out.write("\t\t\t\t\t\t\toverflowY: 'auto',\n");
      out.write("\t\t\t\t\t\t\tcloseBtnInside: true,\n");
      out.write("\t\t\t\t\t\t\tpreloader: false,\n");
      out.write("\t\t\t\t\t\t\tmidClick: true,\n");
      out.write("\t\t\t\t\t\t\tremovalDelay: 300,\n");
      out.write("\t\t\t\t\t\t\tmainClass: 'my-mfp-zoom-in'\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("</script>\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"banner\">\n");
      out.write("\t\t</div>\n");
      out.write("\t<!-- about -->\n");
      out.write("\n");
      out.write("</body>\n");
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