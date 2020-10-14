package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedro
 */
@WebServlet(name = "Autenticacao", urlPatterns = {"/Autenticacao"})
public class Autenticacao extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String cpf = request.getParameter("cpf");
        String senha = request.getParameter("senha");
        
        if (!cpf.isEmpty() && !senha.isEmpty()) {
            request.setAttribute("logado", "S");
            RequestDispatcher resposta = request.getRequestDispatcher("/pages/blog.jsp");
            resposta.forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }
    }
}
