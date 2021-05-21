<%-- 
    Document   : lab3
    Created on : 17.05.2021, 19:11:23
    Author     : vshew
--%>

<%@page import="IR12.IR12.lab3.Lab3Fib"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 3</title>
    </head>
    <body>
         
        <h1>Input data:</h1>
        
        <%! Lab3Fib lFib = new Lab3Fib();%>
        
        <%
        int k = lFib.getK();
        
        
        k = 8;
        String seq = lFib.getResult(k);
        int result = lFib.getFibNumber(k);
        //printFibonacciNumbers(int n)
        %>
        <p>Number of element to be taken: <%=k%></p>
        <p><%=seq%></p>
        
        <h1>Result:</h1>
        <p><%=k%>th number of Fibonacci sequence equals <%=result%></p>
        <a href="index.jsp">Home</a>
    </body>
</html>
