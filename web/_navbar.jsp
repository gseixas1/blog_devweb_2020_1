<%-- 
    Document   : _header
    Created on : Oct 9, 2020, 2:11:34 AM
    Author     : pedro
--%>
<%@page import="DTO.UsuarioDTO"%>
<% String papel = session.getAttribute("papel").toString(); %>

<header class="navbar-header">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
        <a class="navbar-brand" href="#">DevWeb</a>

        <div class="collapse navbar-collapse">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Início</a>
                </li>

                <% if (papel.equals("1")) { %>
                <li class="nav-item">
                    <a class="nav-link" href="novo_post.jsp">Novo Post</a>
                </li>
                <% } %>
                
                <% if (papel.equals("0")) { %>
                    <li class="nav-item">
                        <a class="nav-link" href="admin_area.jsp">Admin</a>
                    </li>
                <% } %>
                
                <li class="nav-item">
                    <a class="nav-link" href="Logout">Logout</a>
                </li>
                
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