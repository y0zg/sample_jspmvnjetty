<%@ page import="com.packtpub.Calculator" %><%
    Calculator calculator = new Calculator();
    int sum = calculator.sum(1, 5);
    out.println("1 + 5 = " + sum);
    out.println("<br>");
    int multiply=calculator.multiply(2,3);
    out.println("2 x 3="+ multiply);
    out.println("<br>");
%>