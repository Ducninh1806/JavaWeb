<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 20/09/2019
  Time: 11:09 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login Page</title>
    <style>
      body{
        font-family: Arial, sans-serif;
        font-size: 11pt;
        margin-left: 2em;
        margin-right: 2em;
     
        border: 2px solid black;
      }
      h1{
        color: teal;
        text-align: center;
      }
      label{
        float: left;
        width: 10em;
        text-align: right;
        margin-right: .5em;
      }
      input{
        width: 15em;
        margin-left: .5em;
        margin-bottom: 1em;
        margin-bottom: 1em;
      }
      #id{
        width: 10em;
        text-align: center;
      }
      br{
        clear: both;
      }
    </style>

  </head>
  // Phần View
  <body>
  <h1>Login to the ATM</h1>
  <form action="LoginServlet" method="post">
    <%--@declare id="accountno"--%>
    <label for="accountNo">AccountNumber: </label>
    <input type="text" name="accountNo">
      <%--@declare id="passwd"--%>
    <label for="passwd">Password</label>
    <input type="password" name="password">
    <label>&nbsp;</label>
    <input type="submit" value="Login" id="submit">

  </form>

  </body>
</html>
