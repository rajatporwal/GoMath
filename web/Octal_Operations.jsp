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
         
           String octal1=request.getParameter("octal1");
           String octal2=request.getParameter("octal2");
            BigInteger decimal1,decimal2,addition=BigInteger.ZERO,subtraction=BigInteger.ZERO,multiplication=BigInteger.ZERO,division=BigInteger.ZERO;
          
                   decimal1 = new BigInteger(octal1, 8);
                   decimal2 = new BigInteger(octal2, 8);
                   addition = decimal1.add(decimal2);
                   subtraction = decimal1.subtract(decimal2);
                   multiplication = decimal1.multiply(decimal2);
                   division = decimal1.divide(decimal2);
 
    %>  
            
    <div class="container">
            <center><h1 class="well mainheading_style">Octal Numbers Operations</h1></center>
	<div class="col-lg-12 well blue_color" >
	<div class="row">

  <div class="col-lg-6">
  <label class="col-lg-4 control-label heading_style " style="padding-top:20px; padding-bottom: 20">Octal No. 1</label>
  <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=octal1%>" class="form-control text_style" readonly>
  </div>
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Octal No. 2</label>
  <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=octal2%>" class="form-control text_style" readonly>
  </div>
  </div>
            <div class="col-lg-6">
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20" >Addition</label>
  <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=addition.toString(8)%>" class="form-control text_style"  readonly>
  </div>
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Subtraction </label>
  <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=subtraction.toString(8)%>" class="form-control text_style" readonly>
  </div>
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20" >Multiplication </label>
  <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=multiplication.toString(8)%>" class="form-control text_style" readonly>
  </div>
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20" >Division </label>
  <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=division.toString(8)%>" class="form-control text_style" readonly>(Decimals are Ignored)
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