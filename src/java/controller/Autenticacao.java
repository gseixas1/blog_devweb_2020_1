package controller;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String cpf = request.getParameter("cpf");
        String senha = request.getParameter("senha");

        
        if ((!cpf.isEmpty()) && (!senha.isEmpty())) {
            UsuarioDTO usuarioDTO = new UsuarioDAO().getUsuario(cpf, senha);

            if(usuarioDTO != null) {
                HttpSession session = request.getSession();
                session.setAttribute("usuario", usuarioDTO);
                
                RequestDispatcher resposta = request.getRequestDispatcher("blog.jsp");
                resposta.forward(request, response);
            } else {
                RequestDispatcher resposta = request.getRequestDispatcher("index.jsp");
                resposta.forward(request, response);
            }
        }
    }
}
