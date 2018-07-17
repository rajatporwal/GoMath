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
    <%!
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
    %>    
        
    
    
    <center style="padding: 30 30 30 30">
    <table class="table table-striped table-bordered container" style="background-color: whitesmoke; ">
	    <thead>
            <center><h1 style="color: red; font-family: cursive" >Postfix to Infix Conversion Step by Step</h1></center><br>
	        <tr>
		    <th><center> S.no. </center></th>
		    <th><center> Symbol </center></th>
		    <th><center> Stack </center></th>
		    <th><center> Expression </center></th>
		</tr>
	    </thead>
            <tbody>
    
            
  <%
    try {    
          
        //  ******************* Postfix To Infix Conversion *******************  //     
        
       String postfix=session.getAttribute("postfix").toString();
       char[] inputChar=postfix.toCharArray();
       Stack<String> stack=new Stack();
       String infix="",temp="";
       Character ch1 = new Character('+');
       Character ch2 = new Character('-');
       Character ch3 = new Character('/');
       Character ch4 = new Character('*');
       Character ch5 = new Character('^');
       
       for(int i=0;i<inputChar.length;i++)
       {
           char checkChar=inputChar[i];
           Character ch = new Character(checkChar);
           out.println("<tr>");
           out.println("<td><center>" + i + "</center></td>");
           out.println("<td><center>" + ch + "</center></td>");
           
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
             temp=infix;
             infix="";
             
           }
           
           out.println("<td><center>" + stack + "</center></td>");
           out.println("<td><center>" + temp + "</center></td>");   
           out.println("</tr>");
       }
     

       
    %>            
		
                
    </tbody>
    </table>
    </center>
    
    <!--Postfix to Infix conversion-->
    
    <div class="container blue_color well-lg" style="margin-bottom: 40px;">
    <div class="col-lg-6">
        <label class="col-lg-4 control-label heading_style">Postfix Expression</label>
        <div class="col-lg-8">
        <input type="text" value="<%=postfix%>" class="form-control text_style" readonly>
    </div>
    </div>
    <div class="col-lg-6">
        <label class="col-lg-4 control-label heading_style" >Infix Expression</label>
        <div class="col-lg-8">
        <input type="text" value="<%=stack.pop()%>" class="form-control text_style" readonly>
        </div>
    </div>
        </div>
    
    <!--Infix to postfix conversion-->
    
    
    <center style="padding: 30 30 30 30;">
    <table class="table table-striped table-bordered container" style="background-color: whitesmoke; ">
	    <thead>
            <center><h1 style="color: red; font-family: cursive">Postfix to Prefix Conversion Step by Step</h1></center><br>
	        <tr>
		    <th><center> S.no. </center></th>
		    <th><center> Symbol </center></th>
		    <th><center> Stack </center></th>
		    <th><center> Expression </center></th>
		</tr>
	    </thead>
            <tbody>
    
            
   <%
       //  ******************* Postfix To Prefix Conversion *******************  //
         
       String postfix1=session.getAttribute("postfix").toString();
       char[] inputChar1=postfix.toCharArray();
       Stack<String> stack1=new Stack();
       String prefix="",temp1="";
       
       for(int i=0;i<inputChar1.length;i++)
       {
           out.println("<tr>");
           char checkChar=inputChar1[i];
           Character ch = new Character(checkChar);
           
           out.println("<td><center>" + i + "</center></td>");
           out.println("<td><center>" + ch + "</center></td>");
           
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
             temp1=prefix;
             prefix="";
           }
           
           out.println("<td><center>" + stack1 + "</center></td>");
           out.println("<td><center>" + temp1 + "</center></td>");   
           out.println("</tr>");
       }
      //  ******************* Postfix To Prefix Conversion *******************  //

       
    %>             
		
                
    </tbody>
    </table>
    </center>
    
    
    
    <!--postfix to prefix conversion-->
    <div class="container blue_color well-lg" style="margin-bottom: 40px;">
    <div class="col-lg-6">
        <label class="col-lg-4 control-label heading_style">Postfix Expression</label>
        <div class="col-lg-8">
        <input type="text" value="<%=postfix%>" class="form-control text_style" readonly>
    </div>
    </div>
    <div class="col-lg-6" style="padding-bottom: 40px;">
        <label class="col-lg-4 control-label heading_style" >Prefix Expression</label>
        <div class="col-lg-8">
        <input type="text" value="<%=stack1.pop()%>" class="form-control text_style" readonly>
        </div>
    </div>
        <br><br>
        <center>
        <button  onclick="window.history.back();" class="btn btn-primary btn-lg btn3d"><span class="glyphicon glyphicon-backward "></span><strong> Go Back !! </strong></button>
        </center>
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