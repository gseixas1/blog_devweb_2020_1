<%-- 
    Document   : login
    Created on : Oct 9, 2020, 3:16:53 PM
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="DAO.UsuarioDAO"%>
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
        <%@include file="_navbar.jsp" %>

  <div class="container">

    <div class="row">

      <div class="col-md-8">

        <div class="card mb-4">
          <img class="card-img-top" src="http://placehold.it/750x300" alt="Card image cap">
          <div class="card-body">
            <h2 class="card-title">Título do post</h2>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!</p>
            <a href="post.jsp" class="btn btn-primary">Ler mais &rarr;</a>
          </div>
          <div class="card-footer text-muted">
            Enviado dia 27 de outubro por
            <a href="#">Gabriel Seixas</a>
          </div>
        </div>

        <div class="card mb-4">
          <img class="card-img-top" src="http://placehold.it/750x300" alt="Card image cap">
          <div class="card-body">
            <h2 class="card-title">Título do post</h2>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!</p>
            <a href="post.jsp" class="btn btn-primary">Ler mais &rarr;</a>
          </div>
          <div class="card-footer text-muted">
            Enviado dia 20 de outubro por
            <a href="#">Pedro Mello</a>
          </div>
        </div>

        <div class="card mb-4">
          <img class="card-img-top" src="http://placehold.it/750x300" alt="Card image cap">
          <div class="card-body">
            <h2 class="card-title">Título do post</h2>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!</p>
            <a href="post.jsp" class="btn btn-primary">Ler mais &rarr;</a>
          </div>
          <div class="card-footer text-muted">
            Enviado dia 20 de outubro por
            <a href="#">Pedro Mello</a>
          </div>
        </div>

        <ul class="pagination justify-content-center mb-4">
          <li class="page-item">
            <a class="page-link" href="#">&larr; Antigas</a>
          </li>
          <li class="page-item disabled">
            <a class="page-link" href="#">Novas &rarr;</a>
          </li>
        </ul>

      </div>

      <div class="col-md-4">
     
        <div class="card my-4">
          <h5 class="card-header">Categorias</h5>
          <div class="card-body">
            <div class="row">
              <div class="col-lg-6">
                <ul class="list-unstyled mb-0">
                  <li>
                    <a href="#">Web Design</a>
                  </li>
                  <li>
                    <a href="#">HTML</a>
                  </li>
                  <li>
                    <a href="#">Servlet</a>
                  </li>
                </ul>
              </div>
              <div class="col-lg-6">
                <ul class="list-unstyled mb-0">
                  <li>
                    <a href="#">JavaScript</a>
                  </li>
                  <li>
                    <a href="#">CSS</a>
                  </li>
                  <li>
                    <a href="#">Tutoriais</a>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>

      </div>

    </div>

  </div>
        
        
        
        <%@include file="_footer.jsp" %>
        
        <style>
            .container {
                margin-top: 85px;
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
