<%-- 
    Document   : Paypal
    Created on : 24-mei-2015, 12:01:59
    Author     : jeffrey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
    </head>
    <body>
<!-- TestAccount voor payment
     Email:     JantjeContantje@Sandbox.nl 
     Password : Sandbox013-->
     
    <!--Paypal information-->
     <form name="_xclick" target="paypal" action="https://www.sandbox.paypal.com/us/cgi-bin/webscr" method="post">
    <input type="hidden" name="cmd" value="_cart">
    <input type="hidden" name="upload" value="1">
    <input type="hidden" name="business" value="Townofsalem@Sandbox.nl">
    <input name="return" type="hidden" value="http://localhost:8080/PaypalTest/index.html"> <!-- Return URL -->
    <input name="cancel_return" type="hidden" value="http://localhost:8080/PaypalTest/index.html"> <!-- Return URL on cancelling payment --> 
    <input type="hidden" name="no_shipping" value="0">
    <input type="hidden" name="no_note" value="1">
    <input type="hidden" name="currency_code" value="USD">
    <input type="hidden" name="lc" value="AU">
    <input type="hidden" name="bn" value="PP-BuyNowBF">
    
    <!--Items will be shown in the shopping cart-->
    <!--TODO: Gather items from a list:-->
    <input type="hidden" name="item_name_1" value="HTML book">  
    <input type="hidden" name="amount_1" value="24.99">
    <input type="hidden" name="quantity_1" value="2">
    
    <input type="hidden" name="item_name_2" value="Cat">
    <input type="hidden" name="amount_2" value="19.99">
    <input type="hidden" name="quantity_2" value="2">

    <input type="image" src="https://www.paypalobjects.com/en_US/i/btn/x-click-but6.gif" border="0" name="submit" alt="PayPal - The safer, easier way to pay online.">
<!--    <img alt="" border="0" src="https://www.paypal.com/en_AU/i/scr/pixel.gif" width="1" height="1">-->
    
    
</form>
        
    </body>
</html>
