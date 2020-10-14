<%-- 
    Document   : registro
    Created on : Oct 14, 2020, 11:46:07 AM
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

        <section class="login-section">
            <form method="POST" action="Registro" class="form-group w-25 login-form border border-secondary rounded p-2">
                
                <label for="cpf">CPF</label>
                <input type="text" name="cpf" id="cpf" placeholder="CPF" class="form-control" required/>
                
                <label for="nome">Nome Completo</label>
                <input type="text" name="nome" id="nome" placeholder="Nome" class="form-control" required/>
                
                <label for="email">Email</label>
                <input type="email" name="email" id="email" placeholder="Email" class="form-control" required/>
                
                <label for="senha">Senha</label>
                <input type="password" name="senha" id="senha" placeholder="Senha" class="form-control" required/>
                
                <label for="confirmacao_senha">Confirme a senha</label>
                <input type="password" name="confirmacao_senha" id="confirmacao_senha" placeholder="Confirme a senha" class="form-control" required/>
               
                
                <button type="submit" class="btn btn-dark mt-2">Registrar</button>
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
            var senha = document.getElementById("senha") , confirmacao_senha = document.getElementById("confirmacao_senha");

            function validatePassword(){
            if(senha.value != confirmacao_senha.value) {
                confirmacao_senha.setCustomValidity("Senhas diferentes!");
            } else {
                confirmacao_senha.setCustomValidity('');
                }
            }
            
            senha.onchange = validatePassword;
            confirmacao_senha.onkeyup = validatePassword;
        </script>
        
    </body>
</html>
