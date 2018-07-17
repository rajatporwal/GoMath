<%-- 
    Document   : Enter_Decimal_Details
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
       
        <script>
           function validate()
         {   
            octal=document.getElementById("octal").value;
            if(octal!="")
            {
                    var valid="01234567";
                    var ch;
                    for(i=0;i<octal.length;i++)
                     {
                         ch=octal.charAt(i);
                         if(valid.indexOf(ch)==-1)
                         {
                             alert("only integer less then 8 are allowed");
                             document.getElementById("octal").focus();
                             return false;
                         }    
                     }   
            }    
            return true;
         }   
        </script>
       
    </head>
	<body>
		<div class="container">
                    <center><h1 class="well mainheading_style">Enter Octal Number</h1></center>
	<div class="col-lg-12 well blue_color" >
	<div class="row">
                 <form method="post" action="Octal_To_All.jsp">
                                    <center>
                                        <div class="form-group">
                                            <br>        
                                            <label class="col-md-2 control-label heading_style" ><b>Octal Number</b></label>
  <div class="col-md-3">
      <input type="text" id="octal" name="octal" class="form-control" maxlength="19" title="Only integers less then 8 are allowed" required="" > 
  </div><strong class="heading_style">Ex : 32767</strong><br><br>
      </center>
                     <br><br><br>                                    
					<div class="col-lg-12">
                                            <label class="col-lg-4 control-label" for="submit"></label>
                                            <center>
                                            <div class="col-lg-4">
                                                <button id="submit" name="submit" onclick=" return validate()" class="btn btn-primary btn-lg btn3d"><span class="glyphicon glyphicon-thumbs-up"></span><strong>Submit</strong></button>
                                                <button type="reset" id="reset" name="reset" class="btn btn-success btn-lg btn3d"><span class="glyphicon glyphicon-thumbs-down"></span><strong>Reset</strong></button>
                                            </div>
                                            </center>
                                </div>
		</form> 
            
				</div>
           
	</div>
	</div>
	</body>
</html>