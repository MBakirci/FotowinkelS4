<%-- 
    Document   : AccountInformation
    Created on : 11-mrt-2015, 11:06:43
    Author     : Dennis
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Test.NewClass" %>
<%@page import="Test.AccountInfo" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="favicon.ico">

        <title>Justified Nav Template for Bootstrap</title>

        <!-- Bootstrap core CSS -->
        <link href="CSS/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <!-- Custom styles for this template -->
        <link href="CSS/justified-nav.css" rel="stylesheet">

        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
        <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
        <script src="js/ie-emulation-modes-warning.js"></script>

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>
        <!--NAVIGATION-->
        <div class="container">
            <div class="masthead">
                <h3 class="text-muted">Fotowinkel</h3>
                <nav>
                    <ul class="nav nav-justified">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="#">Projects</a></li>
                        <li><a href="#">Services</a></li>
                        <li><a href="#">Downloads</a></li>
                        <li><a href="#">About</a></li>
                        <li><a href="#">Contact</a></li>
                        <li><a href="#">Login</a></li>
                    </ul>
                </nav>
            </div>


            <!-- Jumbotron -->
            <div class="jumbotron">
                <h2>Change profile
                </h2>
            </div>

            <!--Inputform-->
            <form>
                <div class="col-lg-6 col-md-offset-3">
                    <div class="form-group">
                        <label for="exampleInputEmail1">Email address</label>
                        <input type="email" name="email" class="form-control" id="exampleInputEmail1" placeholder=" " required="">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Telefoonnummer</label>
                        <input type="telnr" name="telnr" class="form-control bfh-phone" id="exampleInputPassword1" placeholder="" required="" data-format="+31 (ddd) dddddd">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Password</label>
                        <input type="password" name="pass" class="form-control" id="exampleInputPassword1" placeholder=" " required="">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Verify Password</label>
                        <input type="password" name="passv" class="form-control" id="exampleInputPassword1" placeholder=" " required="">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Firstname</label>
                        <input type="firstname" name="fname" class="form-control" id="exampleInputPassword1" placeholder=" " required="">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Lastname</label>
                        <input type="lastname" name="lname" class="form-control" id="exampleInputPassword1" placeholder=" " required="">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Address</label>
                        <input type="address" name="address" class="form-control" id="exampleInputPassword1" placeholder=" " required="">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">City</label>
                        <input type="city" name="city" class="form-control" id="exampleInputPassword1" placeholder=" " required="">
                    </div>

                    <button type="submit" name="btnSave" class="btn btn-default">Save changes</button>
                    <%
                        Test.AccountInfo accountInfo = new Test.AccountInfo();

                        //if no button was pressed, this is the first time loading this page
                        if (request.getParameter("btnSave") == null) {
                            //Load existing info
                            accountInfo.getDBInfo("SessionID");
                        }
                        
                        //if button was pressed, save changes
                        else if (request.getParameter("btnSave") != null) {
                            //Get Textbox values
                            String email = request.getParameter("email");
                            String telnr = request.getParameter("telnr");
                            String pass = request.getParameter("pass");
                            String passver = request.getParameter("passv");
                            String fname = request.getParameter("fname");
                            String lname = request.getParameter("lname");
                            String address = request.getParameter("address");
                            String city = request.getParameter("city");

                            ///todo
                            ///Change account info
                            accountInfo.changeAccountInfo(email, telnr, pass, passver, fname, lname, address, city);

                            //debug
                            response.sendRedirect("index.jsp");

                        }
                    %>
                </div>
            </form>

            <!-- Site footer -->
        </div>
        <footer class="footer" align="center">
            <p>&copy; Company 2015</p>
        </footer>
