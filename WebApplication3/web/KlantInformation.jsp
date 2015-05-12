<%-- 
    Document   : KlantInformation
    Created on : 22-apr-2015, 11:47:19
    Author     : jeffrey
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Test.NewClass" %>
<%@page import="Test.AccountInfo" %>
<%@page import="Test.KlantInfo" %>
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
        <nav>
          <ul class="nav nav-justified">
            <li><a href="KlantFotos.jsp">fotos</a></li>
            <li class="active"><a href="KlantInformation.jsp">gegevens</a></li>
            <li><a href="#">one more thing</a></li>
          </ul>
        </nav>
            <!-- Jumbotron -->
            <div class="jumbotron">
                <h2>Change profile
                </h2>
            </div>


            <%
                //if no button was pressed, this is the first time loading this page
                Test.KlantInfo accountInfo = new Test.KlantInfo();
                String sessionName = (String) session.getAttribute("Name");
                sessionName = "p.de.beer@fontys.nlrejkw"; //For test purposes
                List userinfo1 = accountInfo.getDBInfo(sessionName);
                String emailDB = userinfo1.get(0).toString();
                //String telnrDB = userinfo1.get(1).toString();
                String fnameDB = userinfo1.get(1).toString();
                String lnameDB = userinfo1.get(3).toString();
                //String streetDB = userinfo1.get(4).toString();
                //String housenumDB = userinfo1.get(5).toString();
                //String zipcodeDB = userinfo1.get(6).toString();
                //String cityDB = userinfo1.get(7).toString();

                //if button was pressed, save changes
                if (request.getParameter("btnSave") != null) {
                    //Get Textbox values
                    String email = request.getParameter("email");
                    String telnr = request.getParameter("telnr");
                    String pass = request.getParameter("pass");
                    String passver = request.getParameter("passv");
                    String fname = request.getParameter("fname");
                    String lname = request.getParameter("lname");
                    String street = request.getParameter("street");
                    String housenumber = request.getParameter("housenumber");
                    String zipcode = request.getParameter("zipcode");
                    String city = request.getParameter("city");

                    ///todo
                    ///Change account info
                    accountInfo.changeAccountInfo(sessionName, email, telnr, pass, passver, fname, lname, street, housenumber, zipcode, city);

                    //debug
                    //response.sendRedirect("index.jsp");
                }
            %>
            <!--Inputform-->
            <form>
                <div class="col-lg-6 col-md-offset-3">
                    <div class="form-group">
                        <label for="exampleInputEmail1">Email address</label>
                        <input type="email" name="email" class="form-control" id="exampleInputEmail1" placeholder="<%=emailDB%>" required="">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Telefoonnummer</label>
                        <input type="telnr" name="telnr" class="form-control bfh-phone" id="exampleInputPassword1" placeholder="<%//=telnrDB%>" required="" data-format="+31 (ddd) dddddd">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Password</label>
                        <input type="password" name="pass" class="form-control" id="exampleInputPassword1" placeholder="password " required="">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Verify Password</label>
                        <input type="password" name="passv" class="form-control" id="exampleInputPassword1" placeholder="password " required="">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Firstname</label>
                        <input type="firstname" name="fname" class="form-control" id="exampleInputPassword1" placeholder="<%=fnameDB%>" required="">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Lastname</label>
                        <input type="lastname" name="lname" class="form-control" id="exampleInputPassword1" placeholder="<%=lnameDB%> " required="">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Street</label>
                        <input type="address" name="street" class="form-control" id="exampleInputPassword1" placeholder="<%//=streetDB%> " required="">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Housenumber</label>
                        <input type="housenumber" name="housenumber" class="form-control" id="exampleInputPassword1" placeholder="<%//=housenumDB%> " required="">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Zipcode</label>
                        <input type="zipcode" name="zipcode" class="form-control" id="exampleInputPassword1" placeholder="<%//=zipcodeDB%> " required="">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">City</label>
                        <input type="city" name="city" class="form-control" id="exampleInputPassword1" placeholder="<%//=cityDB%> " required="">
                    </div>

                    <button type="submit" name="btnSave" class="btn btn-default">Save changes</button>
                </div>
            </form>

            <!-- Site footer -->
        </div>
        <footer class="footer" align="center">
            <p>&copy; Company 2015</p>
        </footer>

