<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 19/09/2019
  Time: 22:13 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Distionary</title>
</head>
<body>
<%
    Map<String , String> dic = new HashMap<>();

%>
<%
    dic.put("Hello", "Xin chào");
    dic.put("how", "như thế nào");
    dic.put("book", "quyển sách");
    dic.put("computer", "máy tính");

    String search = request.getParameter("search");

    String result =dic.get (search);
    if (result != null){
        out.print("word: "+ search);
        out.print("result: "+ result);

    }else {
        out.print("Not found");
    }


%>

</body>
</html>
