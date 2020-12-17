/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.RegistrarDAO;
import DTO.UsuarioDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel
 */
@WebServlet(name = "Registrar", urlPatterns = {"/Registrar"})
public class Registrar extends HttpServlet {
        
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nome  = request.getParameter("nome");
        String cpf   = request.getParameter("cpf");
	String senha = request.getParameter("senha");
	String email = request.getParameter("email");
        String papelStr = request.getParameter("papel");
        Integer papelInt = papelStr == "admin" ? 0 : (papelStr == "autor" ? 1 : 2);
        
        if(!cpf.isEmpty() && !senha.isEmpty() && !nome.isEmpty() && !email.isEmpty()) {
            
            RegistrarDAO registrar = new RegistrarDAO(cpf, senha, nome, email, papelInt);
            
            if(registrar.gravarUsuario()) {
                RequestDispatcher rd = request.getRequestDispatcher("./index.jsp");
                rd.forward(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("./registrar.jsp");
                rd.forward(request, response);
            }
            
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("./registrar.jsp");
            rd.forward(request, response);
        }
        
    }

}

