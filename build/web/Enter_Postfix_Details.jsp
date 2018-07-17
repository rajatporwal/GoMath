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
                        postfix=document.getElementById("postfix").value;
                        if(postfix!="")
                        {
                                var valid="0123456789",asc;
                                var ch;
                                for(i=0;i<postfix.length;i++)
                                 {
                                     asc=postfix.charCodeAt(i);
                                     ch=postfix.charAt(i);
                                     if(!((asc>=65 && asc<=90) || (asc>=40 && asc<=47) || asc==94||(asc>=97 && asc<=122) || valid.indexOf(ch)!==-1))
                                     {
                                         alert("only +,-,*,/,^ and alphabets are allowed, Whitespaces are also not allowed");
                                         document.getElementById("postfix").focus();
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
                        <h1 class="well mainheading_style">Enter POSTFIX EXPRESSION</h1>
                    </center>
                    <div class="col-lg-12 well blue_color">
                        <div class="row">
                            <form method="post" action="Postfix_To_All.jsp">
                                <center>
                                    <div class="form-group">
                                        <br>
                                        <label class="col-md-2 control-label heading_style"><b>PostFix Expression</b></label>
                                        <div class="col-md-3">
                                            <input type="text" id="postfix" name="postfix" class="form-control"  title="Only 0's and 1's are allowed" required="">
                                        </div><strong class="heading_style">Ex : ABC*DE/G*-H^+</strong><br><br>
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