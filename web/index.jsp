<%-- 
    Document   : index
    Created on : Feb 9, 2020, 8:28:45 AM
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/bootstrap/bootstrap.min.css">
        <title>Dev Web 2020.1</title>
    </head>
    <body>
        <%@include file="_header.jsp" %>
        
        <%-- TODO: session != null && session.getAttribute("usuario") != null ? se sim, direcionar para pagina do blog --%>
        <% if (session != null && session.getAttribute("usuario") != null) { %> <jsp:forward page="pages/blog.jsp" /> <% } %>
        
        <section class="login-section">
            <form method="POST" action="Autenticacao" class="form-group w-25 login-form border border-secondary rounded p-2">
                
                <label for="cpf">CPF</label>
                <input type="text" name="cpf" id="cpf" placeholder="CPF" class="cpf form-control" required/>
                
                <label for="senha">Senha</label>
                <input type="password" name="senha" id="senha" placeholder="Senha" class="form-control" required/>
                
                <button type="submit" class="btn btn-dark mt-2">Entrar</button>
            </form>
        </section>

        <%@include file="_footer.jsp" %>
        
        <style>
            .login-section {
                width: 100%;
                height: 70vh;
                padding-top: 60px;
            }
            .login-form {
                margin: 15vh auto auto auto;
            }
        </style>
        
        
        <script type="text/javascript" src="assets/jquery.min.js"></script>
        <script type="text/javascript" src="assets/jquery.mask.min.js"></script>
        <script type="text/javascript" src="assets/popper/popper.min.js"></script>
        <script type="text/javascript" src="assets/bootstrap/bootstrap.min.js"></script>

        <script>
            $(document).ready(function(){
               $('.cpf').mask('000.000.000-00', { reverse: true });
            });
        </script>

    </body>
</html>
