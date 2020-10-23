package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author pedro
 */
@WebServlet(name = "Autenticacao", urlPatterns = {"/Autenticacao"})
public class Autenticacao extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cpf = request.getParameter("cpf");
        String senha = request.getParameter("senha");

        if (!cpf.isEmpty() && !senha.isEmpty()) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", cpf); // TODO: guardar uma instancia do objeto Usuario na sessão
            RequestDispatcher resposta = request.getRequestDispatcher("/pages/blog.jsp");
            resposta.forward(request, response);
        } else {
            request.setAttribute("erro", "Usuário não encontrado");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp.jsp");
            rd.forward(request, response);
        }
    }
}
