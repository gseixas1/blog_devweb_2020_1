<%-- 
    Document   : _header
    Created on : Oct 9, 2020, 2:11:34 AM
    Author     : pedro
--%>
<%@page import="DTO.UsuarioDTO"%>
<% UsuarioDTO usuario = (UsuarioDTO) session.getAttribute("usuario"); %>
<header class="navbar-header">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
        <a class="navbar-brand" href="#">DevWeb</a>
        
        
        
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Início</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="sobre.jsp">Sobre</a>
                </li>
                <%-- TODO: Se usuario == null, adicionar link para se registrar --%>
                <% if (usuario == null) { %>
                <li class="nav-item">
                    <a class="nav-link" href="registrar.jsp">Registrar</a>
                </li>
                <% } %>
                <%-- TODO: Se usuario != null, adicionar link para postagens --%>
                <% if (usuario.getPapel() == 1) { %>
                    <li class="nav-item">
                        <a class="nav-link" href="novo_post.jsp">Novo Post</a>
                    </li>
                <% } %>
                
                <%-- TODO: Checar se usuario tem papel ADMIN --%>
                <% if (usuario.getPapel() == 0) { %>
                    <li class="nav-item">
                        <a class="nav-link" href="admin_area.jsp">Admin</a>
                    </li>
                <% } %>
                <%-- TODO: Se usuario != null, adicionar link para fazer logout --%>
                <% if (usuario != null) { %>
                    <li class="nav-item">
                        <a class="nav-link" href="Logout">Logout</a>
                    </li>
                <% } %>
            </ul>
        </div>
    </nav>
</header>

<style>
    .navbar-header {
        width: 100%;
        position: absolute;
    }
</style>