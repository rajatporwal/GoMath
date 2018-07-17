<%@page import="java.util.Arrays"%>
<%@page import="java.math.BigInteger"%>
    <%-- 
    Document   : Selection_Sort
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
                </head>

                <body>
                    <%
      try
      {
           
          String s = request.getParameter("selection");
          String[] stringValues = s.split("[,]");
          int[] numArray= new int[stringValues.length];
          int[] sortedArray= new int[stringValues.length];
          int n = stringValues.length-1;
 
    %>
                        <div class="container">
                            <center>
                                <h1 class="well mainheading_style"> SELECTION SORT ALGORITHM</h1>
                                <div class=" well blue_color">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <label class="control-label heading_style_large">INPUT </label>
                                            <%
                  for(int i =0;i<=n;i++){
                  
                      numArray[i]= Integer.parseInt(stringValues[i]);
                      sortedArray[i]= numArray[i];
                  
        %>
                    <input type="text" value="<%=numArray[i]%>" class="circle" style="color: black" readonly="">
        <%
                }
                  Arrays.sort(sortedArray);
                out.println("<br>");
               for (int i = 0; i <=n; i++) {
                
                    for (int j = i+1; j <=n; j++) {
                    
                        if(numArray[i]>numArray[j])
                        {    
                        int temp;
                        temp = numArray[i];
                        numArray[i] = numArray[j];
                        numArray[j] = temp;
                        }
                    }
                if(i%2==0){
        %>
                <label class="control-label heading_style_large" style="color: green">Step <%=i+1%> </label>
        <%
               }
               else
              {
        %>
                <label class="control-label heading_style_large" style="color: #ac2925 ">Step <%=i+1%> </label>
        <%
              }
                    for (int q = 0; q <=n; q++) 
                    {
                        if(i%2==0)
                        {
        %>
                        <input type="text" value="<%=numArray[q]%>" class="circle" style="color: green" readonly="">
        <%
                        }
                        else
                        {
        %>
                         <input type="text" value="<%=numArray[q]%>" class="circle" style="color: #ac2925" readonly="">
        <%
                        }
                    }
                    out.println("<br>");
                    if(Arrays.equals(numArray, sortedArray))
                    break;
                }  
        %>
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
                            </div>
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