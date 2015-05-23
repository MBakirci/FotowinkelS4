<%-- 
    Document   : FotograafRegister
    Created on : 19-mei-2015, 11:49:27
    Author     : Gebruiker
--%>
<jsp:include page="Masterpage_final.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Registeer fotograaf</h1>
            <hr>
        </div>

        <div class="container">
            <div class="row">
                <form role="form">
                    <div class="well well-sm"><strong><span class="glyphicon glyphicon-asterisk"></span>Required Field</strong></div>
                    <div class="col-md-6 col-sm-6 col-xs-12">
                        <div class="form-group col-md-12">
                            <label for="voornaam">Naam</label>
                            <div class="input-group col-md-12">
                                <input type="text" class="form-control" id="voornaam" name="voornaam" placeholder="Naam" required>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                        <div class="form-group col-md-4">
                            <label for="tussenvoegsel">Tussenvoegsel</label>
                            <div class="input-group">
                                <input type="text" class="form-control" id="tussenvoegsel" name="tussenvoegsel" placeholder="Tussenvoegsel">
                            </div>
                        </div>
                        <div class="form-group col-md-8">
                            <label for="achternaam">Achternaam</label>
                            <div class="input-group">
                                <input type="text" class="form-control" id="achternaam" name="achternaam" placeholder="Achternaam" required>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                        <div class="form-group col-md-12">
                            <label for="username">Email</label>
                            <div class="input-group">
                                <input type="email" class="form-control" id="username" name="username" placeholder="Email" required>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                        <div class="form-group col-md-12">
                            <label for="password">Wachtwoord</label>
                            <div class="input-group">
                                <input type="password" class="form-control" id="password" name="password" placeholder="Password" required>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-6 col-sm-6 col-xs-12">
                        <div class="form-group col-md-8">
                            <label for="straat">Straat</label>
                            <div class="input-group">
                                <input type="text" class="form-control" id="straat" name="straat" placeholder="Straat" required>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                        <div class="form-group col-md-4">
                            <label for="huisnummer">Huisnummer</label>
                            <div class="input-group">
                                <input type="text" class="form-control" id="huisnummer" name="huisnummer" placeholder="Huisnummer" required>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                        <div class="form-group col-md-4">
                            <label for="postcode">Postcode</label>
                            <div class="input-group">
                                <input type="text" class="form-control" id="postcode" name="postcode" placeholder="Postcode" required>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                        <div class="form-group col-md-8">
                            <label for="stad">Stad</label>
                            <div class="input-group">
                                <input type="text" class="form-control" id="stad" name="stad" placeholder="Stad" required>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                        <div class="form-group col-md-12">
                            <label for="voornaam">Telefoon</label>
                            <div class="input-group col-md-12">
                                <input type="text" class="form-control" id="telefoon" name="telefoon" placeholder="Telefoon" required>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <input type="submit" name="btnregistreer" id="btnregistreer" value="Registreer" class="btn btn-primary pull-right">
                    </div>
                </form>

            </div>

        </div>
        <%
            //  int id = 1;
            String email = request.getParameter("username");
            String pass = request.getParameter("password");
            String voornaam = request.getParameter("voornaam");
            String tussenvoegsel = request.getParameter("tussenvoegsel");
            String achternaam = request.getParameter("achternaam");
            int actief = 1;
            String error = "";
            String telefoon = request.getParameter("telefoon");
            String straat = request.getParameter("straat");
            String huisnr = request.getParameter("huisnummer");
            String postcode = request.getParameter("postcode");
            String stad = request.getParameter("stad");

            if (request.getParameter("btnregistreer") != null) {
                Test.User newUser = new Test.User(email, pass, voornaam, tussenvoegsel, achternaam, "fotograaf");
                if (newUser.Fotograaf(telefoon, straat, huisnr, postcode, stad)) {
                    out.print("<div class=\"alert alert-success col-md-8 col-md-offset-2\">registeren gelukt</div>");
                } else {
                    out.print("<div class=\"alert alert-danger col-md-8 col-md-offset-2\">registeren mislukt</div>");
                }
            }
        %>
                    <footer class="footer">
                <p>&copy; Company 2014</p>
            </footer>
    </body>
</html>
