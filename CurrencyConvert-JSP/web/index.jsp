<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 19/09/2019
  Time: 16:12 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currentcy Convert</title>
  </head>
  <body>

  <h1>Currentcy Convert</h1>
  <form action="converter.jsp" method="post">
    <label>Rate: </label>
    <input type="text" name="rate" placeholder="RATE" value="22000"/><br>
    <label>USD</label>
    <input type="text" name="usd" placeholder="USD" value="0"/><br>
    <input type="submit" id="submit" value="Convert">
  </form>


  </body>
</html>
