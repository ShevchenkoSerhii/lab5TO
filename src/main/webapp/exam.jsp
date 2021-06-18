<%-- 
    Document   : exam
    Created on : 17.06.2021, 14:06:07
    Author     : vshew
--%>

<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="IR12.IR12.Exam.FormulaCalculations"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exam</title>
    </head>
    <body>
        <h1>Theory of algorithms exam</h1>
        <h1>Made by Serhii Shevchenko (IP-12 group)</h1>
        <h1>Variant №24</h1>
        <%! FormulaCalculations FC = new FormulaCalculations();%>
        
        <%
        String text = "asjkldfklajs";
        int randomBottomValue = 0;
        int randomTopValue = 50;
        ////КІЛЬКІСТЬ
        int numberOfElementsInList = 87;
        List<Float> fineList = FC.makeRandomSequence(randomBottomValue, numberOfElementsInList, randomTopValue);
        
        float lol = 50;
        Float testFl = FC.formula(lol);
        //List<Float> lsWResult = FC.resLS(fineList);
        List<Float> resList = FC.makeResultList(fineList, numberOfElementsInList);

        
////////////////////////////////////СОРТУВАННЯ////////////////////////////////////
        
//від більшого до меншого
//Collections.sort(fineList , Collections.reverseOrder());

//від меншого до більшого
//Collections.sort(fineList);


//від більшого до меншого
//Collections.sort(resList , Collections.reverseOrder());

//від меншого до більшого
//Collections.sort(resList);

////////////////////////////////////ПОШУК ПОЗИЦІЇ ТА ВІДПОВІДНОГО ЕЛЕМЕНТА////////////////////////////////////
float givenValue = (float)47.0;
int positionVar = fineList.indexOf(givenValue);
int positionRes = resList.indexOf(FC.formula(givenValue));

        %>
        
        
        <h2></h2>
        <h2>Formula: f(x) = 9 / (9 * x - 10)</h2>
        <h2> </h2>
        <h2>List of <%=numberOfElementsInList%> random numbers</h2>
        <p><%=fineList%></p>
        <h2>List of <%=numberOfElementsInList%> results</h2>
        <p><%=resList%></p>
        <h2>Finding a result for a given random value</h2>
        <p>Random number: <%=givenValue%></p>
        <p>Applied to the formula: <%=FC.formula(givenValue)%></p>
        <p>Position in list of variables: <%=positionVar + 1%></p>        
        <p>Position in list of results <%=positionRes + 1%></p>


        
        <a href="index.jsp">Home</a>
    </body>
</html>
