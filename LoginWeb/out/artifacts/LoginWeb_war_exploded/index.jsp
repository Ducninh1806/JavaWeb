<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 18/09/2019
  Time: 13:51 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>Login</title>
    <style type="text/css">
      login{
        height:180px; width: 230px;
        margin: 0;
        padding: 10px;
        border: 1px #CCC solid;
      }
      login input{
        padding: 5px; margin: 5px;
      }
    </style>
  </head>
  <body>
  <form action="/Login" method="post">
    <div class="login">
      <h2>login</h2>
      <input type="text" name="username" size="30" placeholder="username">
      <input type="password" name="password" size="30" placeholder="password">
      <input type="submit" value="sign in">
    </div>
  </form>
  </body>
</html>
