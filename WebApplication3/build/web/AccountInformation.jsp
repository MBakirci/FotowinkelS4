<%-- 
    Document   : AccountInformation
    Created on : 11-mrt-2015, 11:06:43
    Author     : Dennis
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <h3 class="text-muted">Project name</h3>
                <nav>
                    <ul class="nav nav-justified">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="Adminpage.jsp">Accountinformatie</a></li>
                        <li><a href="fotograafProfiel.jsp">Profiel</a></li>
                        <li><a href="Registreren.jsp">Registreren</a></li>
                        <li><a href="Inlogscherm.jsp">login</a></li>
                        <li><a href="logout.jsp">Logout</a></li>
                        <li><a href="Upload.jsp">Upload</a></li>
                    </ul>
                </nav>
            </div>
            <!-- Jumbotron -->
            <div class="jumbotron">
                <h2>Change profile
                </h2>
            </div>

            


            <%
                //if no button was pressed, this is the first time loading this page
                String SessionEmail = (String) session.getAttribute("Name");
                Test.User user = new Test.User(SessionEmail);
                if(session.getAttribute("Role").equals("fotograaf"))
                {
                user.AdditionalInfo();
                }
                
                 if (request.getParameter("btnSaveEmailPass") != null) {
                     if(request.getParameter("passv").length() > 4){
                     if(request.getParameter("passv").equals(request.getParameter("pass"))){
                        out.println("<script type=\"text/javascript\">");  
                        out.println("alert('Uw wachtwoord is veranderd.');");  
                        out.println("</script>");
                      user.changePass(request.getParameter("pass"));
                     }
                     }
                 }

                //if button was pressed, save changes
                if (request.getParameter("btnSave") != null) {
                    //Get Textbox values
                    user.setVoornaam(request.getParameter("fname"));
                    user.setTussenvoegsel(request.getParameter("tname"));
                    user.setAchternaam(request.getParameter("lname"));
                    user.setStraat(request.getParameter("street"));
                    user.setHuisnr(request.getParameter("housenumber"));
                    user.setPostcode(request.getParameter("zipcode"));
                    user.setStad(request.getParameter("city"));
                    user.setTelefoon(request.getParameter("telnr"));
                    user.UpdateUser();
                }
            %>
                
            <!--Inputform-->
            <div class="row vdivide">
                <form id="info-form">
                <div class="col-md-4 col-sm-6 col-xs-12">
                    <h3>Account informatie:</h3>
                    <div class="text-center">
                        <img src="http://simpleicon.com/wp-content/uploads/account.png" class="avatar img-circle img-thumbnail" alt="avatar">
                    </div>
                    <div class="form-group">
                        <label for="Email">Email address</label>
                        <input type="email" name="email" class="form-control" id="Email" placeholder="<%=user.geteMail()%>" readonly>
                    </div>
                    <div class="form-group">
                        <label for="Wachtwoord">Password</label>
                        <input type="password" name="pass" class="form-control" id="Wachtwoord" placeholder="Nieuw wachtwoord" >
                    </div>
                    <div class="form-group">
                        <label for="VerifyWachtwoord">Verify Password</label>
                        <input type="password" name="passv" class="form-control" id="VerifyWachtwoord" placeholder="Verifieer Nieuw Wachtwoord" oninput="check(this)" >
                    </div>
                    <script language='javascript' type='text/javascript'>
                        function check(input) {
                            var pass = document.getElementById('Wachtwoord').value;
                            if (input.value != pass ) {
                                input.setCustomValidity('De wachtwoorden moeten overeenkomen!');
                            }
                            else if(pass.length < 5){
                                input.setCustomValidity('Uw wachtwoord moet minimaal 5 karakters bevatten!');
                            }
                            else {
                                // input is valid -- reset the error message
                                input.setCustomValidity('');
                           }
                        }
                    </script>
                    <button type="submit" name="btnSaveEmailPass" class="btn btn-default">Save changes</button>
                </div>
                </form>
                    
                    <form>
                <div class="col-md-8 col-sm-6 col-xs-12">
                    <h3>Persoonlijke informatie:</h3>
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <label for="Voornaam">Firstname</label>
                        <input type="text" name="fname" class="form-control" id="Voornaam" value="<%=user.getVoornaam()%>" required>
                    </div>
                    <div class="form-group col-md-6 col-sm-6 col-xs-12">
                        <label for="Tussenvoegsel">Tussenvoegsel</label>
                        <input type="text" name="tname" class="form-control" id="Tussenvoegsel" value="<%=user.getTussenvoegsel()%> " >
                    </div>
                    <div class="form-group col-md-6 col-sm-6 col-xs-12">
                        <label for="Achternaam">Lastname</label>
                        <input type="text" name="lname" class="form-control" id="Achternaam" value="<%=user.getAchternaam()%> " required >
                    </div>
                    <%if(session.getAttribute("Role").equals("fotograaf")){%>
                    <div class="form-group col-md-6 col-sm-6 col-xs-12">
                        <label for="Straat">Street</label>
                        <input type="text" name="street" class="form-control" id="Straat" value="<%=user.getStraat()%> " >
                    </div>
                    <div class="form-group col-md-6 col-sm-6 col-xs-12">
                        <label for="Huisnr">Housenumber</label>
                        <input type="text" name="housenumber" class="form-control" id="Huisnr" value="<%=user.getHuisnr()%> " >
                    </div>
                    <div class="form-group col-md-6 col-sm-6 col-xs-12">
                        <label for="Postcode">Zipcode</label>
                        <input type="text" name="zipcode" class="form-control" id="Postcode" value="<%=user.getPostcode()%>" >
                    </div>
                    <div class="form-group col-md-6 col-sm-6 col-xs-12">
                        <label for="Stad">City</label>
                        <input type="text" name="city" class="form-control" id="Stad" value="<%=user.getStad()%> ">
                    </div>
                    
                    <div class="form-group col-md-12 col-sm-12 col-xs-12">
                        <label for="Telefoon">Telefoonnummer</label>
                        <input type="tel" name="telnr" class="form-control bfh-phone" id="Telefoon" value="<%=user.getTelefoon()%>"  data-format="+31 (ddd) dddddd" required>
                    </div>
                    
                     <%}%>
                </div>
                   <div class="col-md-6 col-sm-6 col-xs-12"> 
                    <button type="submit" name="btnSave" class="btn btn-default">Save changes</button>
                    </div>
                    
            </form>
            </div>

            <!-- Site footer -->
            <footer class="footer">
                <p>&copy; Company 2014</p>
            </footer>
        </div>
    </body>
</html>
