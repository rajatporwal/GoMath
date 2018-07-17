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
        
    <%
      try {    
       Stack<Character> stack=new Stack();
       String postfix="";
       String infix=request.getParameter("infix");
       session.setAttribute("infix", infix);
       char[] inputCharArray=infix.toCharArray();
       for(int i=0;i<inputCharArray.length;i++)
       {
           char checkChar=inputCharArray[i];
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
           
           
    }
       while(!stack.isEmpty())
           postfix=postfix+stack.pop();
       
      //  ******************* Infix To Prefix Conversion *******************  //
      
      String input=request.getParameter("infix");
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
      for(int i=0;i<inputChar.length;i++)
       {
           char checkChar=inputChar[i];
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
       }
      while(!stack1.isEmpty())
      result=result+stack1.pop();
        
       StringBuffer prefix= new StringBuffer(result);
       prefix.reverse();

       
    %>  
     
    <div class="container">
            <center><h1 class="well mainheading_style">INFIX Conversion</h1></center>
	<div class="col-lg-12 well blue_color" >
	<div class="row">

            <div class="col-lg-6">
            
  <label class="col-lg-3 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Infix Expression</label>
  <div class="col-lg-8" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=infix%>" class="form-control text_style" readonly>
  </div>
            </div>
            <div class="col-lg-6">
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Postfix Expression</label>
  <div class="col-lg-8" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=postfix%>" class="form-control text_style" readonly>
  </div>
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Prefix Expression</label>
  <div class="col-lg-8" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%="Not Implemented Yet"%>" class="form-control text_style" readonly>
  </div>
            </div>
  <div class="col-lg-12" style="padding-top:40px; padding-bottom: 20">
                        <label class="col-lg-4 control-label" for="submit"></label>
                        <center>
                        <div class="col-lg-4">
                             <form method="post" action="Infix_Solution.jsp">     
                             <button id="submit" name="submit" class="btn btn-primary btn-lg btn3d"><span class="glyphicon glyphicon-level-up"></span><strong> Find Solution</strong></button>
                             </form>
                            <form method="post" action="Enter_Infix_Details.jsp">   
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