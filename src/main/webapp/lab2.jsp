<%-- 
    Document   : lab2
    Created on : 17.05.2021, 15:26:38
    Author     : vshew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 2</title>
    </head>
    <body>
        <h1>Formula:</h1>
        <p>d / 2 * x * x + b * x + c</p>
        <h1>Result:</h1>
        <p><%=request.getAttribute("result")%></p>
        <a href="index.jsp">Home</a>
    </body>
</html>
