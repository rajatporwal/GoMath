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
            <center><h1 style="color: red; font-family: cursive" >Infix to Postfix Conversion Step by Step</h1></center><br>
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

       
    %>            
		
                
    </tbody>
    </table>
    </center>
    
    <!--Infix to postfix conversion-->
    <div class="container blue_color well-lg">
    <div class="col-lg-6">
        <label class="col-lg-3 control-label heading_style">Infix Expression</label>
        <div class="col-lg-8">
        <input type="text" value="<%=infix%>" class="form-control text_style" readonly>
    </div>
    </div>
    <div class="col-lg-6">
        <label class="col-lg-4 control-label heading_style" >Postfix Expression</label>
        <div class="col-lg-8">
        <input type="text" value="<%=postfix%>" class="form-control text_style" readonly>
        </div>
    </div>
        </div>
    
    <!--Infix to Prefix conversion-->
    <%
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
    %>
    
    <center style="padding: 30 30 30 30;">
    <table class="table table-striped table-bordered container" style="background-color: whitesmoke; ">
	    <thead>
            <center><h1 style="color: red; font-family: cursive">Infix to Prefix Conversion Step by Step</h1></center><br><br>
            <h4><b>Note:</b> Reverse the infix expression and find postfix conversion of the reversed expression, <b> i.e. Postfix of: (<%=inputChar%>) </b> </h4><br>
                <tr>
		    <th><center> S.no. </center></th>
		    <th><center> Symbol </center></th>
		    <th><center> Stack </center></th>
		    <th><center> Expression </center></th>
		</tr>
	    </thead>
            <tbody>
    
            
  <%
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
      out.println("</tr>");
      while(!stack1.isEmpty())
      result=result+stack1.pop();
      
      StringBuffer prefix= new StringBuffer(result);
      System.out.println("Prefix :" + prefix.reverse());

      //  ******************* Infix To Prefix Conversion *******************  //

       
    %>            
    </tbody>
    </table>
    <h4><b>Note:</b> Now Reverse the result of postfix expression to get final prefix expression, <b> i.e. Reverse of: (<%=result%>) </b> </h4>		
    </center>
    
    
    
    
    <!--Infix to prefix conversion-->
    <div class="container blue_color well-lg" style="margin-bottom: 40px;">
    <div class="col-lg-6">
        <label class="col-lg-3 control-label heading_style">Infix Expression</label>
        <div class="col-lg-8">
        <input type="text" value="<%=infix%>" class="form-control text_style" readonly>
    </div>
    </div>
    <div class="col-lg-6" style="padding-bottom: 40px;">
        <label class="col-lg-4 control-label heading_style" >Prefix Expression</label>
        <div class="col-lg-8">
        <input type="text" value="<%=prefix%>" class="form-control text_style" readonly>
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