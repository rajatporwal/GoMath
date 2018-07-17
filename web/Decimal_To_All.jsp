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
          BigInteger decimal = new BigInteger(request.getParameter("decimal"));
          String binary= decimal.toString(2);
          String octal= decimal.toString(8);
          String hexadecimal= decimal.toString(16).toUpperCase();
    %>  
            
    <div class="container">
            <center><h1 class="well mainheading_style">Decimal Number Conversion</h1></center>
	<div class="col-lg-12 well blue_color" >
	<div class="row">

            <div class="col-lg-6">
            
  <label class="col-lg-3 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Decimal No.</label>
  <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=decimal%>" class="form-control text_style" readonly>
  </div>
            </div>
            <div class="col-lg-6">
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Binary No.</label>
  <div class="col-lg-8" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=binary%>" class="form-control text_style" readonly>
  </div>
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20">Octal No.</label>
  <div class="col-lg-8" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=octal%>" class="form-control text_style" readonly>
  </div>
  <label class="col-lg-4 control-label heading_style" style="padding-top:20px; padding-bottom: 20" >HexaDecimal No.</label>
  <div class="col-lg-8" style="padding-top:20px; padding-bottom: 20">
      <input type="text" value="<%=hexadecimal%>" class="form-control text_style" readonly>
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