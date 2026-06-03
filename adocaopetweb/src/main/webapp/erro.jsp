<%-- 
    Document   : erro
    Created on : 29 de mai. de 2026, 22:59:32
    Author     : br3no
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Falha na operação</title>
</head>
<body>

    <%
        String msg = (String) request.getAttribute("message");
    %>

    <h1><% out.println(msg); %> não realizado</h1>
    <br><br>
    <a href="<%=request.getContextPath()%>/index.html">Voltar</a>
</body>
</html>