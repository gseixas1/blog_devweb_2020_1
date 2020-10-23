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
        <link rel="stylesheet" href="assets/bootstrap/bootstrap.min.css">
        <title>DevWeb</title>
    </head>
    <body>
        <%-- TODO: Checar se usuário esta logado --%>
        <% if (session == null || session.getAttribute("usuario") == null) { %> <jsp:forward page="index.jsp" /> <% } %>
        <%@include file="../_navbar.jsp" %>
        
        <div class="blog-section">
            <h1>BLOG</h1>
        </div>
        <%-- TODO: Listar postagens --%>
        
        
        
        <%@include file="../_footer.jsp" %>
        
        <style>
            .blog-section {
                margin-top: 50px;
                height: 100vh;
            }
        </style>
        
        <script type="text/javascript" src="assets/jquery.min.js"></script>
        <script type="text/javascript" src="assets/jquery.mask.min.js"></script>
        <script type="text/javascript" src="assets/popper/popper.min.js"></script>
        <script type="text/javascript" src="assets/bootstrap/bootstrap.min.js"></script>
        
        <script>
        </script>
    </body>
</html>
