<%-- 
    Document   : lab6and7
    Created on : 20.05.2021, 8:17:50
    Author     : vshew
--%>

<%@page import="sun.reflect.generics.tree.Tree"%>
<%@page import="IR12.IR12.lab6and7.Recursion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 6 and 7</title>
    </head>
    <body>
        
        <%! Recursion l6 = new Recursion();%>
        <%
        int n = 2;
        int result = l6.getExponentiation(n);
        int resultCheck = l6.getCasualWay(n);

        %>
        

        
        <h1>Lab № 6:</h1>
        <p>There is a formula: n^2 = (n - 1)^2 + 2 * (n - 1) + 1 </p>
        <p>The n equals <%=n%> so the formula will look like <%=n%>^2 = (<%=n%> - 1)^2 + 2 * (<%=n%> - 1) + 1</p>
        <p>The method with recursion gets <%=result%></p>
        <p>The casual method with just entering <%=n%> instead of "n" gets <%=resultCheck%></p>
        
        <h1>Lab № 7:</h1>
        <p>The unsorted array: [4, 3, 1, 6, 5, 11, 9, 10]</p>
        <p>The sorted array: [1, 3, 4, 5, 6, 9, 10, 11]</p>
        <p>Preorder traversal of constructed BST</p>
        <p>5 3 1 4 9 6 10 11 </p>


</p>
        
        <a href="index.jsp">Home</a>
    </body>
</html>
