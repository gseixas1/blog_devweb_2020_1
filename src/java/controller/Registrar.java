/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
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

        // TODO: Fazer DAO do registrar
        // UsuarioDTO usuario = new UsuarioDTO(nome, cpf, senha, email);
        // RegistrarDAO rDAO = new RegistrarDAO();
        // String result = rDAO.insert(usuario); 
        // response.getWriter().print(result);
        }
    }

