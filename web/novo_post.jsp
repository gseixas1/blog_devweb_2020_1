<%-- 
    Document   : novo_post
    Created on : Oct 22, 2020, 7:00:42 PM
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/bootstrap/bootstrap.min.css">
        <title>DevWeb</title>
    </head>
    <body>
        <%-- Checa se usuário esta logado --%>
        <% if (session == null || session.getAttribute("usuario") == null) { %> <jsp:forward page="index.jsp" /> <% } %>
        <%@include file="_navbar.jsp" %>
        <%-- --%>
        
        <div class="wrapper">
            <div class="page-title">
                <h1>Novo Artigo</h1>
            </div>
            
            <div class="bootstrap-form">
                <div class="container">
                    <form>
                        <div class="form-group row">
                            <label class="col-sm-2 col-form-label text-right" for="titulo">Titulo</label>
                            <div class="col-sm-10">
                                <input class="form-control" id="titulo" type="text" placeholder="Titulo"/>
                            </div>
                        </div>
                        <%-- TODO: Fazer dropdown com a lista de categorias --%>
                        <div class="form-group row">
                          <label class="col-sm-2 col-form-label text-right" for="categoria">Categoria</label>
                            <div class="col-sm-10">
                                <input class="form-control" id="categoria" type="text" placeholder="Categoria"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-sm-2 col-form-label text-right" for="descricao">Descricao</label>
                            <div class="col-sm-10">
                                <textarea class="form-control" id="descricao" rows="5" placeholder="Corpo do artigo"></textarea>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-12 text-right">
                                <input class="btn btn-dark" type="submit" value="Submit"/>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        
        <%@include file="_footer.jsp" %>
        <style>
            .wrapper {
                height: 70vh;
                margin-top: 300px;
                width: 100%;
            }
            .page-title {
                padding: 15px;
                margin-left: 700px;
            }
        </style>
        
        <script type="text/javascript" src="../assets/jquery.min.js"></script>
        <script type="text/javascript" src="../assets/jquery.mask.min.js"></script>
        <script type="text/javascript" src="../assets/popper/popper.min.js"></script>
        <script type="text/javascript" src="../assets/bootstrap/bootstrap.min.js"></script>
        
        <script>
        </script>
    </body>
</html>
