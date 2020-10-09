<%-- 
    Document   : _header
    Created on : Oct 9, 2020, 2:11:34 AM
    Author     : pedro
--%>
<header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">DevWeb</a>

        <div class="collapse navbar-collapse">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="#">Início</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Sobre</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Registrar</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="text" id="cpf" placeholder="Digite seu CPF">
                <button class="btn btn-light my-2 my-sm-0" type="submit">Entrar</button>
            </form>
        </div>
    </nav>
</header>

<%-- TODO: fazer mascara do campo de CPF --%>
<script type="text/javascript">
    $(document).ready(function(){
        $('.cpf').mask('000.000.000-00', {reverse: true});
    });
</script>
