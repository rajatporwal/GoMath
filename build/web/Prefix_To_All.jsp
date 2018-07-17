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
        //  ******************* Prefix To Infix Conversion *******************  //     
        
       String prefix=request.getParameter("prefix");
       session.setAttribute("prefix", prefix);
       Stack<String> stack=new Stack();
       StringBuffer sb1= new StringBuffer(prefix);
       sb1.reverse();
       String infix="",temp="";
       
       Character ch1 = new Character('+');
       Character ch2 = new Character('-');
       Character ch3 = new Character('/');
       Character ch4 = new Character('*');
       Character ch5 = new Character('^');
       
       char inputChar[] = sb1.toString().toCharArray();
       
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
       while(!stack.isEmpty())
           temp=temp+stack.pop();
        //  ******************* Prefix To Postfix Conversion *******************  //   
        
       String input=request.getParameter("prefix");
       Stack<String> stack1=new Stack();
       StringBuffer sb= new StringBuffer(input);
       sb.reverse();
       String result="";
       char inputChar1[] = sb.toString().toCharArray(),op1,op2;
       
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
             result = stack1.pop() + result;
             if(!stack1.empty())
             result = stack1.pop() + result;
             result = ch.toString() + result ; 
             stack1.push(result);
             result="";
           }
           
       }
       
       StringBuffer postfix= new StringBuffer(stack1.pop());
       postfix.reverse();
       
       StringBuffer str = new StringBuffer(temp);
       str.reverse();
       char inputCharrev[] = str.toString().toCharArray();
       for(int i=0;i<inputCharrev.length;i++)
      {
        if(inputCharrev[i]=='(')
           inputCharrev[i]=')';
        else
        if(inputCharrev[i]==')')
           inputCharrev[i]='(';
      }
       
      //  ******************* Postfix To Prefix Conversion *******************  //

       
    %>  
       
    <div class="container">
            <center><h1 class="well mainheading_style">PREFIX Conversion</h1></center>
	<div class="col-lg-12 well blue_color" >
	<div class="row">

            <div class="col-lg-6">
            
  <label class="col-lg-3 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Prefix Expression</label>
  <div class="col-lg-8" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=prefix%>" class="form-control text_style" readonly>
  </div>
            </div>
            <div class="col-lg-6">
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Infix Expression</label>
  <div class="col-lg-8" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=inputCharrev%>" class="form-control text_style" readonly>
  </div>
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Postfix Expression</label>
  <div class="col-lg-8" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=postfix%>" class="form-control text_style" readonly>
  </div>
            </div>
  
                <div class="col-lg-12" style="padding-top:20px; padding-bottom: 20">
                        <label class="col-lg-4 control-label"  for="submit"></label>
                        <center>
                        <div class="col-lg-4">
                             <form method="post" action="Prefix_Solution.jsp">   
                            <button id="submit" name="submit" class="btn btn-primary btn-lg btn3d"><span class="glyphicon glyphicon-level-up"></span><strong> Find Solution</strong></button>
                            </form>
                            <form method="post" action="Enter_Prefix_Details.jsp">   
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