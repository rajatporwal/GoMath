<%-- 
    Document   : Enter_Bubble_Details
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
                        insertion=document.getElementById("insertion").value;
                        if(insertion!="")
                        {
                                var valid="0123456789,";
                                var ch;
                                for(i=0;i<insertion.length;i++)
                                 {
                                     ch=insertion.charAt(i);
                                     if(valid.indexOf(ch)==-1)
                                     {
                                         alert("only 0's and 1's are allowed");
                                         document.getElementById("insertion").focus();
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
                        <h1 class="well mainheading_style">Enter Numbers for INSERTION SORT</h1>
                    </center>
                    <div class="col-lg-12 well blue_color">
                        <div class="row">
                            <form method="post" action="Insertion_Sort.jsp">
                                <center>
                                    <div class="form-group">
                                        <br>
                                        <label class="col-md-2 control-label heading_style"><b>Enter Numbers</b></label>
                                        <div class="col-md-6">
                                            <input type="text" id="insertion" name="insertion" class="form-control" title="Only integers are allowed" required="">
                                        </div><strong class="heading_style">Ex : 32,45,78,14</strong><br><br>
                                        <br><br>
                                        <strong class="heading_style">Note: Separate numbers using comma ( , )</strong><br><br>
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