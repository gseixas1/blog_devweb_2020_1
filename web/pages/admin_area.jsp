<%-- 
    Document   : admin_area
    Created on : Oct 23, 2020, 4:41:45 PM
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DevWeb</title>
    </head>
    <body>
        <%-- TODO: session == null || session.getAttribute("usuario") == null ? se sim, direcionar para pagina de login --%>
        <% if (session == null || session.getAttribute("usuario") == null) { %> <jsp:forward page="index.jsp" /> <% } %>
        
        
        <h1>Area de Admin</h1>
    </body>
</html>
