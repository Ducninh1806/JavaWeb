<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 19/09/2019
  Time: 4:11 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<meta http-equiv="Content-Type" content="text/html", charset="utf-8"/>
  <head>
    <title>Simple Dictionary</title>
  </head>
  <body>
  <h2>VietNam Dictionary</h2>
  <form action="/translate" method="post" >
    <input type="text" name="txtSearch" placeholder="Enter your word: "/>
    <input type="submit" id="submit" value="Search"/>
  </form>
  </body>
</html>
