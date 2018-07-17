<%-- 
    Document   : Enter_Binary_Details
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
                <script type="text/javascript" src="js/Bootstrap.min.js">
                </script>

                <script>
                    function validate()
                     {   
                       var hexadecimal1=document.getElementById("hexadecimal1").value;
                       var hexadecimal2=document.getElementById("hexadecimal2").value;
                        if(hexadecimal1!="")
                        {
                                var valid="0123456789ABCDEFabcdef";
                                var ch;
                                for(i=0;i<hexadecimal1.length;i++)
                                 {
                                     ch=hexadecimal1.charAt(i);
                                     if(valid.indexOf(ch)==-1)
                                     {
                                         alert("Enter Correct HexaDecimal Number");
                                         document.getElementById("hexadecimal1").focus();
                                         return false;
                                     }    
                                 }   
                        }    
                        if(hexadecimal2!="")
                        {
                                var valid="0123456789ABCDEFabcdef";
                                var ch;
                                for(i=0;i<hexadecimal2.length;i++)
                                 {
                                     ch=hexadecimal2.charAt(i);
                                     if(valid.indexOf(ch)==-1)
                                     {
                                         alert("Enter Correct HexaDecimal Number");
                                         document.getElementById("hexadecimal2").focus();
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
                    <center>
                        <h1 class="well mainheading_style">Enter Hexadecimal Number</h1>
                    </center>
                    <div class="col-lg-12 well blue_color">
                        <div class="row">
                            <form method="post" action="Hexadecimal_Operations.jsp">
                                <center>
                                    <div class="form-group">
                                        <br>
                                        <label class="col-md-2 control-label heading_style"><b>Number 1</b></label>
                                        <div class="col-md-3">
                                            <input type="text" id="hexadecimal1" name="hexadecimal1" class="form-control" maxlength="19" title="Only 0's and 1's are allowed" required="">
                                        </div>
                                        <label class="col-md-2 control-label heading_style"><b>Number 2</b></label>
                                        <div class="col-md-3">
                                            <input type="text" id="hexadecimal2" name="hexadecimal2" class="form-control" maxlength="19" title="Only 0's and 1's are allowed" required="">
                                        </div><strong class="heading_style">Ex : 01110101</strong><br><br>
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