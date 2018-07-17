<%-- 
    Document   : EnterResultAnalysisData
    Author     : Rajat Porwal
--%>

<%@include file="header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Stack"%>


<html lang="en">
    <head> 
       <meta name="viewport" content="width=device-width, initial-scale=1">
       <link rel="stylesheet" href="js/bootstrap.min.css" />
       <link rel="stylesheet" href="js/awesome.min.css" />
       <link rel="stylesheet" href="css/manual.css" />
       <script type="text/javascript" src="js/jquery.min.js"></script>
       <script type="text/javascript" src ="js/Bootstrap.min.js"> </script>
    </head>
    <body>
    <%
    try {    
        //  ******************* Postfix To Infix Conversion *******************  //     
        
       String postfix=request.getParameter("postfix");
       session.setAttribute("postfix", postfix);
       char[] inputChar=postfix.toCharArray();
       Stack<String> stack=new Stack();
       String infix="";
       Character ch1 = new Character('+');
       Character ch2 = new Character('-');
       Character ch3 = new Character('/');
       Character ch4 = new Character('*');
       Character ch5 = new Character('^');
       
       for(int i=0;i<inputChar.length;i++)
       {
           char checkChar=inputChar[i];
           Character ch = new Character(checkChar);
           
           if(!(ch.equals(ch1) || ch.equals(ch2) || ch.equals(ch3) || ch.equals(ch4) || ch.equals(ch5)))
           {
             stack.push(ch.toString());
           }
           else
           {
             if(!stack.empty())
             infix = stack.pop() + infix;
             infix = ch.toString() + infix;
             if(!stack.empty())
             infix = stack.pop() + infix;
             stack.push("(" + infix + ")");
             infix="";
           }
           
       }
        
        //  ******************* Postfix To Prefix Conversion *******************  //   
        
       String postfix1=request.getParameter("postfix");
       char[] inputChar1=postfix.toCharArray();
       Stack<String> stack1=new Stack();
       String prefix="";
       
       for(int i=0;i<inputChar1.length;i++)
       {
           char checkChar=inputChar1[i];
           Character ch = new Character(checkChar);
           
           if(!(ch.equals(ch1) || ch.equals(ch2) || ch.equals(ch3) || ch.equals(ch4) || ch.equals(ch5)))
           {
             stack1.push(ch.toString());
           }
           else
           {
             
             if(!stack1.empty())
             prefix = stack1.pop() + prefix;
             if(!stack1.empty())
             prefix = stack1.pop() + prefix;
             prefix = ch.toString() + prefix;
             stack1.push(prefix);
             prefix="";
           }
           
       }
           while(!stack1.isEmpty())
           prefix=stack1.pop() + prefix;
       
      //  ******************* Postfix To Prefix Conversion *******************  //

       
    %>  
       
    <div class="container">
            <center><h1 class="well mainheading_style">POSTFIX Conversion</h1></center>
	<div class="col-lg-12 well blue_color" >
	<div class="row">

            <div class="col-lg-6">
            
  <label class="col-lg-3 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Postfix Expression</label>
  <div class="col-lg-8" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=postfix%>" class="form-control text_style" readonly>
  </div>
            </div>
            <div class="col-lg-6">
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Infix Expression</label>
  <div class="col-lg-8" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=stack.pop()%>" class="form-control text_style" readonly>
  </div>
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Prefix Expression</label>
  <div class="col-lg-8" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=prefix%>" class="form-control text_style" readonly>
  </div>
            </div>
  
                <div class="col-lg-12" style="padding-top:40px; padding-bottom: 20">
                        <label class="col-lg-4 control-label"  for="submit"></label>
                        <center>
                        <div class="col-lg-4">
                             <form method="post" action="Postfix_Solution.jsp">   
                            <button id="submit" name="submit" class="btn btn-primary btn-lg btn3d"><span class="glyphicon glyphicon-level-up"></span><strong> Find Solution</strong></button>
                            </form>
                            <form method="post" action="Enter_Postfix_Details.jsp">   
                            <button  onclick="window.history.back();" class="btn btn-success btn-lg btn3d"><span class="glyphicon glyphicon-backward "></span><strong> Go Back !! </strong></button>
                            </form>
                        </div>
                        </center>
                </div>
  
  </div>
    </div>
   </div>
  
  <%
     }
    catch(Exception e)
     {
         out.println(e);
     }

  %>
	</body>
</html>