<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 20/09/2019
  Time: 7:24 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h2>Simple Calculator</h2>
  <form action="/operator" method="get">
    <div id="tong">
      <div>
          <label>First Operator</label>
          <input type="text" name="firstOperator" placeholder="First" value="0">
      </div>
      <div>
          <label>Operator</label>
          <select name="operator">
              <option>Addition</option>
              <option>Subtraction</option>
              <option>Multiplication</option>
              <option>Vivision</option>
          </select>
      </div>
        <div>
            <label>Second Operator</label>
            <input type="text" name="secondOperator" placeholder="Second" value="0">
        </div>
        <div>
            <label>&nbsp;</label>
            <input type="submit" name="submit" placeholder="Submit" value="Caltulate">
        </div>
    </div>
  </form>
  </body>
</html>
