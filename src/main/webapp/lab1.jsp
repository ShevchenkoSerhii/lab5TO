<%-- 
    Document   : lab1
    Created on : 15.05.2021, 22:14:34
    Author     : vshew
--%>
<%@page import="IR12.IR12.MyFirstJavaClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 1</title>
    </head>
    <body>
        <h1>This is my first lab!</h1>
         
        
        <%! MyFirstJavaClass mFJC = new MyFirstJavaClass(5);%>
        
        <% 
            
            int x = mFJC.getMyInt();
            x+=3;
            x%=3;


        %>
        <p>8mod3 = <%=x%></p>
        <a href="index.jsp">Home</a>
    </body>
</html>
