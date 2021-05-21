<%-- 
    Document   : lab5
    Created on : 20.05.2021, 15:38:24
    Author     : vshew
--%>

<%@page import="java.util.HashMap"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="IR12.IR12.lab5.Lab5"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 5</title>
    </head>
    <body>
        
        <%! Lab5 lST = new Lab5();%>
        
        <%
        int numberOfElementsInList = 11820;
        String sortedByWordsFrequency = "";
        String text = "Animals or people that are provided with unique identifiers (UIDs) and the ability to transfer data over a network without requiring human-to-human or human-to-computer interaction. A thing in the internet of things can be a person with a heart monitor implant, a farm animal with a biochip transponder, an automobile that has built-in sensors to alert the driver when tire pressure is low or any other natural or man-made object that can be assigned an Internet Protocol (IP) address and is able to transfer data over a network. Increasingly, organizations in a variety of industries are using IoT to operate more efficiently, better understand customers to deliver enhanced customer service, improve decision-making and increase the value of the business. How IoT works An IoT ecosystem consists of web-enabled smart devices that use embedded systems, such as processors, sensors and communication hardware, to collect, send and act on data they acquire from their environments. IoT devices share the sensor data they collect by connecting to an IoT gateway or other edge device where data is either sent to the cloud to be analyzed or analyzed locally. Sometimes, these devices communicate with other related devices and act on the information they get from one another. The devices do most of the work without human intervention, although people can interact with the devices -- for instance, to set them up, give them instructions or access the data. The connectivity, networking and communication protocols used with these web-enabled devices largely depend on the specific IoT applications deployed. IoT can also make use of artificial intelligence (AI) and machine learning to aid in making data collecting processes easier and more dynamic .The internet of things helps people live and work smarter, as well as gain complete control over their lives. In addition to offering smart devices to automate homes, IoT is essential to business. IoT provides businesses with a real-time look into how their systems really work, delivering insights into everything from the performance of machines to supply chain and logistics operations.";
        List<Short> fineList = lST.makeSequence(0, numberOfElementsInList);
        String listInText = Arrays.toString(fineList.toArray());
        int element = 7400;
        int elementPositionBinary = lST.binarySearch(fineList, element);
        int elementPositionLinear = lST.linearSearch(fineList, element);
        


HashMap<String, Integer> wordAndUsage = new HashMap<String, Integer>();



String[] keys = text.split(" ");
        String[] uniqueKeys;
        int count = 0;
        uniqueKeys = lST.getUniqueKeys(keys);

        for(String key: uniqueKeys)
        {
            if(null == key)
            {
                break;
            }           
            for(String s : keys)
            {
                if(key.equals(s))
                {
                    count++;
                }               
            }
            wordAndUsage.put(key, count);
            sortedByWordsFrequency += "Count of ["+key+"] is : " + count + "    ";
            count=0;
        }
        
        lST.setMap(wordAndUsage);
        String resultSorted = lST.sortByValue(false);
        
        %>
        
        <h1>Text:</h1>
        <p><%=text%></p>
        <h2>Frequency of words in text:</h2>
        <p>Word - count of usage</p>
        <p><%=resultSorted%></p>
        
        <h1>List of <%=numberOfElementsInList%> elements:</h1>
        <h3>Which starts with 1234 for checking purposes</h3>
        <p><%=listInText%></p>
        <h2>Binary-searched element</h2>
        <p>Searched element: <%=element%></p>
        <p>Element position in this list: <%=elementPositionBinary%></p>
        
        <h2>Lineary-searched element</h2>
        <p>Searched element: <%=element%></p>
        <p>Element position in this list: <%=elementPositionLinear%></p>
        
        <a href="index.jsp">Home</a>
    </body>
</html>
