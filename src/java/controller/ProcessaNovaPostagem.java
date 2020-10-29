/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {} 

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        // TODO: Redirecionar para index se não estiver logado, ou para blog caso esteja logado.
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: Salvar nova postagem em banco
    }
}
