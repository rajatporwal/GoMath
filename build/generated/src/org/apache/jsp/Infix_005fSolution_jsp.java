package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Stack;

public final class Infix_005fSolution_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


       public static int getPrecedence(char checkChar)
    {
        if(checkChar=='+'||checkChar=='-')
            return 1;
         if(checkChar=='*'||checkChar=='/')
            return 2;
         if(checkChar=='^')
            return 3;
         if(checkChar=='('||checkChar==')')
            return 0;
         return -1;
       
            
    }
    
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

      out.write('\n');
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
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown \">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"# \" >Exp. Conversion <i class=\"icon-angle-down \"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none; \" class=\"dropdown-menu bold \">\n");
      out.write("                                                            <li><a href=\"Enter_Infix_Details.jsp\">INFIX Conversion</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">POSTFIX Conversion</a></li>\n");
      out.write("                                                                <li><a href=\"# \">PREFIX Conversion</a></li>\n");
      out.write("                                                                <li class=\"dropdown \"><a href=\"# \"> 4 Sliders <i class=\" icon-angle-right \"></i></a>\n");
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
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Enter_Bubble_Details.jsp \">BUBBLE  Sort</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Enter_Insertion_Details.jsp \">INSERTION Sort</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Enter_Selection_Details.jsp \">SELECTION Sort</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"# \">QUICK Sort</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">MERGE Sort</a></li>\n");
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
      out.write("\t\t\t\t\t\t\t<a href=\"# \" >Scheduling Algo <i class=\"icon-angle-down \"></i></a>\n");
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
      out.write("\n");
      out.write("\n");
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
      out.write("    \n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <center style=\"padding: 30 30 30 30\">\n");
      out.write("    <table class=\"table table-striped table-bordered container\" style=\"background-color: whitesmoke; \">\n");
      out.write("\t    <thead>\n");
      out.write("            <center><h1 style=\"color: red; font-family: cursive\" >Infix to Postfix Conversion Step by Step</h1></center><br>\n");
      out.write("\t        <tr>\n");
      out.write("\t\t    <th><center> S.no. </center></th>\n");
      out.write("\t\t    <th><center> Symbol </center></th>\n");
      out.write("\t\t    <th><center> Stack </center></th>\n");
      out.write("\t\t    <th><center> Expression </center></th>\n");
      out.write("\t\t</tr>\n");
      out.write("\t    </thead>\n");
      out.write("            <tbody>\n");
      out.write("    \n");
      out.write("            \n");
      out.write("  ");

      try {    
       Stack<Character> stack=new Stack();
       String postfix="";
       String infix=session.getAttribute("infix").toString();
       char[] inputCharArray=infix.toCharArray();
       for(int i=0;i<inputCharArray.length;i++)
       {
           out.println("<tr>");
           out.println("<td><center>" + i + "</center></td>");
           
           char checkChar=inputCharArray[i];
           
           out.println("<td><center>" + checkChar + "</center></td>");
           
           if(checkChar!='+'&&checkChar!='-'&&checkChar!='/'&&checkChar!='*'&&checkChar!='^'&&checkChar!='('&&checkChar!=')')
           {
               postfix=postfix+checkChar;
           }
           
           
           else  
           {     
               if(checkChar!='('&&checkChar!=')')
               { 
                   if(stack.isEmpty())
               {
                   stack.push(checkChar);
               }
               else
               {
                 
                while(getPrecedence(stack.peek())>=getPrecedence(checkChar))
              {   
                  postfix=postfix+stack.pop();
                if(stack.isEmpty())
                    break;
              }
             stack.push(checkChar);
               }
               
               }
               else
               {
                   if(checkChar=='(')
                       stack.push(checkChar);
                   else
                   {
                       while(stack.peek()!='(')
                       {
                           postfix=postfix+stack.pop();
                       }
                       stack.pop();
                   }
               }
       }
        
      out.println("<td><center>" + stack + "</center></td>");
      out.println("<td><center>" + postfix + "</center></td>");   
           
    }
       while(!stack.isEmpty())
           postfix=postfix+stack.pop();
       
      out.println("</tr>");
      //  ******************* Infix To Prefix Conversion *******************  //

       
    
      out.write("            \n");
      out.write("\t\t\n");
      out.write("                \n");
      out.write("    </tbody>\n");
      out.write("    </table>\n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("    <!--Infix to postfix conversion-->\n");
      out.write("    <div class=\"container blue_color well-lg\">\n");
      out.write("    <div class=\"col-lg-6\">\n");
      out.write("        <label class=\"col-lg-3 control-label heading_style\">Infix Expression</label>\n");
      out.write("        <div class=\"col-lg-8\">\n");
      out.write("        <input type=\"text\" value=\"");
      out.print(infix);
      out.write("\" class=\"form-control text_style\" readonly>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-6\">\n");
      out.write("        <label class=\"col-lg-4 control-label heading_style\" >Postfix Expression</label>\n");
      out.write("        <div class=\"col-lg-8\">\n");
      out.write("        <input type=\"text\" value=\"");
      out.print(postfix);
      out.write("\" class=\"form-control text_style\" readonly>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    <!--Infix to Prefix conversion-->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <center style=\"padding: 30 30 30 30;\">\n");
      out.write("    <table class=\"table table-striped table-bordered container\" style=\"background-color: whitesmoke; \">\n");
      out.write("\t    <thead>\n");
      out.write("            <center><h1 style=\"color: red; font-family: cursive\">Infix to Prefix Conversion Step by Step</h1></center><br>\n");
      out.write("\t        <tr>\n");
      out.write("\t\t    <th><center> S.no. </center></th>\n");
      out.write("\t\t    <th><center> Symbol </center></th>\n");
      out.write("\t\t    <th><center> Stack </center></th>\n");
      out.write("\t\t    <th><center> Expression </center></th>\n");
      out.write("\t\t</tr>\n");
      out.write("\t    </thead>\n");
      out.write("            <tbody>\n");
      out.write("    \n");
      out.write("            \n");
      out.write("  ");

      String input=session.getAttribute("infix").toString();
      Stack<Character> stack1=new Stack();
      StringBuffer sb= new StringBuffer(input);
      sb.reverse();
      String result="";
      char inputChar[] = sb.toString().toCharArray();
      
      for(int i=0;i<sb.length();i++)
      {
        if(inputChar[i]=='(')
           inputChar[i]=')';
        else
        if(inputChar[i]==')')
           inputChar[i]='(';
      }
        System.out.println(inputChar);
      for(int i=0;i<inputChar.length;i++)
       {
           out.println("<tr>");
           out.println("<td><center>" + i + "</center></td>");
           char checkChar=inputChar[i];
           out.println("<td><center>" + checkChar + "</center></td>");
           if(checkChar!='+'&&checkChar!='-'&&checkChar!='/'&&checkChar!='*'&&checkChar!='^'&&checkChar!='('&&checkChar!=')')
           {
               result=result+checkChar;
           }
           
           
           else  
           {     
               if(checkChar!='('&&checkChar!=')')
               { 
                   if(stack1.isEmpty())
               {
                   stack1.push(checkChar);
               }
               else
               {
                 
                while(getPrecedence(stack1.peek())>=getPrecedence(checkChar))
              {   
                  result=result+stack1.pop();
                if(stack1.isEmpty())
                    break;
              }
             stack1.push(checkChar);
               }
               
               }
               else
               {
                   if(checkChar=='(')
                       stack1.push(checkChar);
                   else
                   {
                       while(stack1.peek()!='(')
                       {
                           result=result+stack1.pop();
                       }
                       stack1.pop();
                   }
               }
       }
           out.println("<td><center>" + stack1 + "</center></td>");
      out.println("<td><center>" + result + "</center></td>");   
       }
      while(!stack1.isEmpty())
      result=result+stack1.pop();
      
      StringBuffer prefix= new StringBuffer(result);
      System.out.println("Prefix :" + prefix.reverse());

      //  ******************* Infix To Prefix Conversion *******************  //

       
    
      out.write("            \n");
      out.write("\t\t\n");
      out.write("                \n");
      out.write("    </tbody>\n");
      out.write("    </table>\n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!--Infix to prefix conversion-->\n");
      out.write("    <div class=\"container blue_color well-lg\" style=\"margin-bottom: 40px;\">\n");
      out.write("    <div class=\"col-lg-6\">\n");
      out.write("        <label class=\"col-lg-3 control-label heading_style\">Infix Expression</label>\n");
      out.write("        <div class=\"col-lg-8\">\n");
      out.write("        <input type=\"text\" value=\"");
      out.print(infix);
      out.write("\" class=\"form-control text_style\" readonly>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-6\" style=\"padding-bottom: 40px;\">\n");
      out.write("        <label class=\"col-lg-4 control-label heading_style\" >Prefix Expression</label>\n");
      out.write("        <div class=\"col-lg-8\">\n");
      out.write("        <input type=\"text\" value=\"");
      out.print(prefix);
      out.write("\" class=\"form-control text_style\" readonly>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        <br><br>\n");
      out.write("        <center>\n");
      out.write("        <button  onclick=\"window.history.back();\" class=\"btn btn-primary btn-lg btn3d\"><span class=\"glyphicon glyphicon-backward \"></span><strong> Go Back !! </strong></button>\n");
      out.write("        </center>\n");
      out.write("    </div>    \n");
      out.write("    \n");
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
