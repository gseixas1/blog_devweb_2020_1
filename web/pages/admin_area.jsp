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
        <link rel="stylesheet" href="../assets/bootstrap/bootstrap.min.css">
        <title>DevWeb</title>
    </head>
    <body>
        <%@include file="../_navbar.jsp" %>
        <%-- TODO: session == null || session.getAttribute("usuario") == null ? se sim, direcionar para pagina de login --%>
        <% if (session == null || session.getAttribute("usuario") == null) { %> <jsp:forward page="index.jsp" /> <% } %>
        
        <div class="titulo">
            <h1>Aprovar cadastros</h1>
        </div>
        <div class="lista-cards">
            <div class="card">
                <p>Nome</p>
                <p>Email</p>
                <div>
                    <button class="btn btn-danger">Recusar</button>
                    <button class="btn btn-primary">Aceitar</button>
                </div>
            </div>
            <div class="card">
                <p>Nome</p>
                <p>Email</p>
                <div>
                    <button class="btn btn-danger">Recusar</button>
                    <button class="btn btn-primary">Aceitar</button>
                </div>
            </div>  
        </div>
        
        
        <div class="titulo">
            <h1>Aprovar Artigos</h1>
        </div>
        <div class="lista-cards">
            <div class="card">
                <p>Nome usuario</p>
                <p>Categoria</p>
                <p>Descrição</p>
                <div>
                    <button class="btn btn-danger">Recusar</button>
                    <button class="btn btn-primary">Aceitar</button>
                </div>
            </div>
            <div class="card">
                <p>Nome usuario</p>
                <p>Categoria</p>
                <p>Descrição</p>
                <div>
                    <button onclick="" class="btn btn-danger">Recusar</button>
                    <button onclick="" class="btn btn-primary">Aceitar</button>
                </div>
            </div>
        </div>
        
        
        
        <style>
            .titulo {
                margin-top: 100px;
                margin-left: 50px;
            }
            .lista-cards {
                display: flex;
                flex-direction: row;
            }
            .card {
                margin: 50px;
                width: 20em;
                padding: 15px;
            }
            .btn {
                max-width: 100px;
                margin-right: 10px;
            }
        </style>
    </body>
</html>
