<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 19/09/2019
  Time: 4:41 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>

  </head>
  <body>
  <div id="content" >
      <h1>Product Discount Calculator</h1>
      <form action="/product" method="post">
          <div id="data">
              <label>Product Description: </label>
              <input type="text" name="product" value="book"> <br>
              <label>List Price: </label>
              <input type="text" name="price" value="50000"><br>
              <label>Discount Percent:</label>
              <input type="text" name="percent" value="3" > (%)<br>
          </div>
            <div id="button">
                <label>&nbsp;</label>
                <input type="submit" id="submit" value="Calculate Discount">
            </div>
      </form>
  </div>
  </body>
</html>
