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
       String prefix=session.getAttribute("prefix").toString();
       StringBuffer sb1= new StringBuffer(prefix);
       sb1.reverse();
    %>    
    <center style="padding: 30 30 30 30">
    <table class="table table-striped table-bordered container" style="background-color: whitesmoke; ">
	    <thead>
            <center><h1 style="color: red; font-family: cursive" >Prefix to Infix Conversion Step by Step</h1></center><br>
            <h4><b>Note:</b> Reverse the Prefix expression and find infix conversion of the reversed expression, <b> i.e. Infix of: (<%=sb1%>) </b> </h4><br>
	        <tr>
		    <th><center> S.no. </center></th>
		    <th><center> Symbol </center></th>
		    <th><center> Stack </center></th>
		    <th><center> Expression </center></th>
		</tr>
	    </thead>
            <tbody>
    
            
  <%
      
       
       char[] inputChar=sb1.toString().toCharArray();
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
//             stack.push(infix);
             stack.push("(" + infix + ")");
             temp=stack.peek();
             infix="";
           }
           out.println("<td><center>" + stack + "</center></td>");
           out.println("<td><center>" + temp + "</center></td>");   
           out.println("</tr>");
           
       }
       temp="";
       while(!stack.isEmpty())
           temp=temp+stack.pop();
       
       
       
      //  ******************* Infix To Prefix Conversion *******************  //

       
    %>            
		
                
    </tbody>
    </table>
    <h4><b>Note:</b> Now Reverse the result of infix expression to get final infix expression, <b> i.e. Reverse of: (<%=temp%>) </b> </h4>		
    </center>
    
    <%
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
    %>
    
    <!--Infix to postfix conversion-->
    <div class="container blue_color well-lg">
    <div class="col-lg-6">
        <label class="col-lg-3 control-label heading_style">Prefix Expression</label>
        <div class="col-lg-8">
        <input type="text" value="<%=prefix%>" class="form-control text_style" readonly>
    </div>
    </div>
    <div class="col-lg-6">
        <label class="col-lg-4 control-label heading_style" >Infix Expression</label>
        <div class="col-lg-8">
        <input type="text" value="<%=inputCharrev%>" class="form-control text_style" readonly>
        </div>
    </div>
        </div>
    
    <!--Prefix to Postfix conversion-->
    <%
       String input=session.getAttribute("prefix").toString();
       Stack<String> stack1=new Stack();
       StringBuffer sb= new StringBuffer(input);
       sb.reverse();
       String result="",temp1="";
       char inputChar1[] = sb.toString().toCharArray();
    %>
    
    <center style="padding: 30 30 30 30;">
    <table class="table table-striped table-bordered container" style="background-color: whitesmoke; ">
	    <thead>
            <center><h1 style="color: red; font-family: cursive">Prefix to Postfix Conversion Step by Step</h1></center><br><br>
            <h4><b>Note:</b> Reverse the Prefix expression and find postfix conversion of the reversed expression, <b> i.e. Postfix of: (<%=inputChar%>) </b> </h4><br>
                <tr>
		    <th><center> S.no. </center></th>
		    <th><center> Symbol </center></th>
		    <th><center> Stack </center></th>
		    <th><center> Expression </center></th>
		</tr>
	    </thead>
            <tbody>
    
            
  <%
       
       
       for(int i=0;i<inputChar1.length;i++)
       {
           char checkChar=inputChar1[i];
           Character ch = new Character(checkChar);
           
           out.println("<tr>");
           out.println("<td><center>" + i + "</center></td>");
           out.println("<td><center>" + ch + "</center></td>");
           
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
             temp1=result;
             result="";
           }
           
           out.println("<td><center>" + stack1 + "</center></td>");
           out.println("<td><center>" + temp1 + "</center></td>");   
           out.println("</tr>");
           
       }
       
       
       
      //  ******************* Infix To Prefix Conversion *******************  //

       
    %>            
    </tbody>
    </table>
    <h4><b>Note:</b> Now Reverse the result of postfix expression to get final postfix expression, <b> i.e. Reverse of: (<%=stack1.peek()%>) </b> </h4>		
    </center>
    <%
       StringBuffer postfix= new StringBuffer(stack1.pop());
       postfix.reverse();
    %>
    
    
    
    <!--Infix to prefix conversion-->
    <div class="container blue_color well-lg" style="margin-bottom: 40px;">
    <div class="col-lg-6">
        <label class="col-lg-3 control-label heading_style">Prefix Expression</label>
        <div class="col-lg-8">
        <input type="text" value="<%=prefix%>" class="form-control text_style" readonly>
    </div>
    </div>
    <div class="col-lg-6" style="padding-bottom: 40px;">
        <label class="col-lg-4 control-label heading_style" >Postfix Expression</label>
        <div class="col-lg-8">
        <input type="text" value="<%=postfix%>" class="form-control text_style" readonly>
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