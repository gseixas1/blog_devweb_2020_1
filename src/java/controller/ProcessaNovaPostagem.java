/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.PostagemDAO;
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
 * @author pedro
 */
@WebServlet(name = "ProcessaNovaPostagem", urlPatterns = {"/ProcessaNovaPostagem"})
public class ProcessaNovaPostagem extends HttpServlet {

    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id_usuario  = Integer.parseInt(request.getParameter("id_usuario"));
        String titulo   = request.getParameter("titulo");
	String categoria = request.getParameter("categoria");
	String conteudo = request.getParameter("conteudo");
        
        if(!(titulo.isEmpty() && categoria.isEmpty() && conteudo.isEmpty())) {
            PostagemDAO postagem = new PostagemDAO(id_usuario, titulo, categoria, conteudo);
            if(postagem.gravarPostagem()) {
              RequestDispatcher rd = request.getRequestDispatcher("./blog.jsp");
                rd.forward(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("./novo_post.jsp");
                rd.forward(request, response);
            }
        } else {
            
        }
    }
}
