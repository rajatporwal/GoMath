<%@page import="java.io.IOException"%>
<%@page import="java.nio.charset.CharacterCodingException"%>
<%@page import="java.math.BigInteger"%>
    <%-- 
    Document   : EnterResultAnalysisData
    Author     : Rajat Porwal
--%>

        <%@include file="header.html" %>
            <%@page contentType="text/html" pageEncoding="UTF-8"%>
                <html lang="en">

                <head>
                    <meta name="viewport" content="width=device-width, hcf-scale=1">
                    <link rel="stylesheet" href="js/bootstrap.min.css" />
                    <link rel="stylesheet" href="js/awesome.min.css" />
                    <link rel="stylesheet" href="css/manual.css" />
                    <script type="text/javascript" src="js/jquery.min.js"></script>
                    <script type="text/javascript" src="js/Bootstrap.min.js">
                    </script>
                </head>

                <body>
        <%
      try
        {
           
          String s = request.getParameter("hcf");
          String[] stringValues = s.split("[,]");
          int[] numArray= new int[stringValues.length];
          int[] lcmArray= new int[stringValues.length];
          int n = stringValues.length-1;
 
        %>

                        <div class="container">
                            <a href="header.html"></a>
                            <center>
                                <h1 class="well mainheading_style">And Here are HCF and LCM</h1>
                            </center>
                            <div class="col-lg-12 well blue_color">
                                <div class="row">
                                <center>
                                    <div class="col-lg-12">
        <%
                for(int i =0;i<=n;i++)
                  {
                      numArray[i]= Integer.parseInt(stringValues[i]);
                      lcmArray[i]= Integer.parseInt(stringValues[i]);
                      if(numArray[i]==0)
                      throw new NumberFormatException();
        %>
                                            <input type="text" value="<%=numArray[i]%>" class="circle" readonly="">
        <%
                  }

                int hcf= numArray[0],temp=0,t=1;
                for (int i = 1; i <=n; i++) {
                while(numArray[i]!=0){
                temp=numArray[i];
                numArray[i]=hcf % numArray[i];
                hcf=temp;
            }
        }

    // **********************LCM OF N Numbers **********************
    
        long lcm = 1;
        int divisor = 2;
        while (true) {
            int cnt = 0;
            boolean divisible = false;
            for (int i = 0; i < lcmArray.length; i++) {
               
                if (lcmArray[i] == 0) {
                    lcm=0;
                    break;
                } else if (lcmArray[i] < 0) {
                    lcmArray[i] = lcmArray[i] * (-1);
                }
               
                if (lcmArray[i] == 1) {
                    cnt++;
                }
               
                if (lcmArray[i] % divisor == 0) {
                    divisible = true;
                    lcmArray[i] = lcmArray[i] / divisor;
                }
            }
          
            if (divisible) {
                lcm = lcm * divisor;
            } else {
                divisor++;
            }
           
            if (cnt == lcmArray.length) {
                break;
            }
        }
        %>
                                    </div>

                                    <div class="col-lg-12" style="margin-top: 50px; ">
                                        <div class="col-lg-6">
                                            <label class="col-lg-4 control-label heading_style_large" style="padding-top:20px; padding-bottom: 20">HCF </label>
                                            <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
                                                <input type="text" value="<%=hcf%>" class="form-control text_style_large" readonly>
                                            </div>
                                        </div>
                                        <div class="col-lg-6">
                                            <label class="col-lg-4 control-label heading_style_large" style="padding-top:20px; padding-bottom: 20">LCM </label>
                                            <div class="col-lg-6" style="padding-top:20px; padding-bottom: 20">
                                                <input type="text" value="<%=lcm%>" class="form-control text_style_large" readonly>
                                            </div>
                                        </div>
                                            <div class="col-lg-12">
                    <br><br><br>
                        <label class="col-lg-4 control-label" for="submit"></label>
                        <center>
                        <div class="col-lg-4">
                            <button  onclick="window.history.back();" class="btn btn-primary btn-lg btn3d"><span class="glyphicon glyphicon-backward "></span><strong> Go Back !! </strong></button>
                        </div>
                        </center>
                </div>
                                    </div>
                                </center>
                                </div>
                            </div>
                        </div>
        <%
         }
         catch(NumberFormatException n)
         {
         %>
         <pre class="blue_color heading_style" style="text-align: left">
                Use non zero values. <br>
                    By Definition:
                        HCF(0,0) is undefined
                    By Definition:
                        HCF(x,0) = x
                    So, one zero in your set is the same answer as no zeros in your set but two zeros is undefined. <br><br>
                And Also<br>
                    Only value upto 9 integers is allowed
                </pre>
         
         <%
         }
         catch(Exception e)
         {
             out.println(e);
         }
        %>
                </body>

                </html>