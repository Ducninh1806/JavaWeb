<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 18/09/2019
  Time: 21:37 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>CurrencyConverter</title>
     
  </head>
  <body>
  <h2> Currency Converter</h2>
  <form action="/convert" method="post">
    Rate <br>
    <input type="text" placeholder="RATE" name="rate" value="23000"><br>
    USD <br>
    <input type="text" name="USD" placeholder="usd" value="0"><br>
    <input type="submit" id="submit" value="Converter"><br>
  </form>
  </body>
</html>
