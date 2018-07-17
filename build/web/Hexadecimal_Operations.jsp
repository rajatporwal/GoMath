 <%@page import="java.math.BigInteger"%>
<%-- 
    Document   : EnterResultAnalysisData
    Author     : Rajat Porwal
--%>

<%@include file="header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
         
           String hexadecimal1=request.getParameter("hexadecimal1");
           String hexadecimal2=request.getParameter("hexadecimal2");
            BigInteger decimal1,decimal2,addition=BigInteger.ZERO,subtraction=BigInteger.ZERO,multiplication=BigInteger.ZERO,division=BigInteger.ZERO;
          
                   decimal1 = new BigInteger(hexadecimal1, 16);
                   decimal2 = new BigInteger(hexadecimal2, 16);
                   addition = decimal1.add(decimal2);
                   subtraction = decimal1.subtract(decimal2);
                   multiplication = decimal1.multiply(decimal2);
                   division = decimal1.divide(decimal2);
 
    %>  
            
    <div class="container">
            <center><h1 class="well mainheading_style">Hexadecimal Numbers Operations</h1></center>
	<div class="col-lg-12 well blue_color" >
	<div class="row">

  <div class="col-lg-6">
  <label class="col-lg-4 control-label heading_style " style="padding-top:20px; padding-bottom: 20">Hexadecimal No. 1</label>
  <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=hexadecimal1.toUpperCase()%>" class="form-control text_style" readonly>
  </div>
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Hexadecimal No. 2</label>
  <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=hexadecimal2.toUpperCase()%>" class="form-control text_style" readonly>
  </div>
  </div>
            <div class="col-lg-6">
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20" >Addition</label>
  <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=addition.toString(16).toUpperCase()%>" class="form-control text_style"  readonly>
  </div>
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Subtraction </label>
  <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=subtraction.toString(16).toUpperCase()%>" class="form-control text_style" readonly>
  </div>
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20" >Multiplication </label>
  <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=multiplication.toString(16).toUpperCase()%>" class="form-control text_style" readonly>
  </div>
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20" >Division </label>
  <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=division.toString(16).toUpperCase()%>" class="form-control text_style" readonly>(Decimals are Ignored)
  </div>
            </div>
  
  <div class="col-lg-12" style="padding-top:20px; padding-bottom: 20">
                        <label class="col-lg-4 control-label" for="submit"></label>
                        <center>
                        <div class="col-lg-4">
                            <button  onclick="window.history.back();" class="btn btn-primary btn-lg btn3d"><span class="glyphicon glyphicon-backward "></span><strong> Go Back !! </strong></button>
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