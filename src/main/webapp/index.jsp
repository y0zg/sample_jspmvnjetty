<%@ page import="com.packtpub.Calculator" %><%
    Calculator calculator = new Calculator();
    int sum = calculator.sum(1, 5);
    out.print("1 + 5 = " + sum);
%>