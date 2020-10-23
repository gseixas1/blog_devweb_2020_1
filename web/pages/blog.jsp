<%-- 
    Document   : login
    Created on : Oct 9, 2020, 3:16:53 PM
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="DAO.Usuario"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DevWeb</title>
    </head>
    <body>
        <%-- TODO: Checar se usuário esta logado --%>
        <% if (session == null || session.getAttribute("usuario") == null) { %> <jsp:forward page="index.jsp" /> <% } %>
        
        <h1>BLOG</h1>
        <%-- TODO: Listar postagens --%>
        <script type="text/javascript" src="assets/jquery.min.js"></script>
        <script type="text/javascript" src="assets/jquery.mask.min.js"></script>
        <script type="text/javascript" src="assets/popper/popper.min.js"></script>
        <script type="text/javascript" src="assets/bootstrap/bootstrap.min.js"></script>


    </body>
</html>
