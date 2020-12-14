/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    Connection conn = null;
    
    private enum PAPEL {
        admin,
        autor,
        comentarista
    }
    public void init() throws ServletException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/blog", "root", "");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nome  = request.getParameter("nome");
        String cpf   = request.getParameter("cpf");
	String senha = request.getParameter("senha");
	String email = request.getParameter("email");
        String papel = request.getParameter("papel");
        
        try {
            if(!cpf.isEmpty() && !senha.isEmpty() && !nome.isEmpty() && !email.isEmpty()) {
                
                if(papel.equals(PAPEL.admin.toString())) {
                    papel = "0";
                } else if(papel.equals(PAPEL.autor.toString())) {
                    papel = "1";
                } else {
                    papel = "2";
                }
                
                PreparedStatement sql = 
                        conn.prepareStatement("insert into usuario(email, senha, nome, cpf, papel) values(?, ?, ?, ?, ?)");
                sql.setString(1, email);
                sql.setString(2, senha);
                sql.setString(3, nome);
                sql.setString(4, cpf);
                sql.setString(5, papel);
                sql.executeUpdate();

                RequestDispatcher rd = request.getRequestDispatcher("./index.jsp");
                rd.forward(request, response);
                System.out.println("sucesso");
            } else {
                System.out.println("erro");
                RequestDispatcher rd = request.getRequestDispatcher("./sobre.jsp");
                rd.forward(request, response);
            }
        } catch (SQLException ex) {
            PrintWriter out = response.getWriter();
            out.println("<h1>erro de execusao SQL</h1>");
        }
    }
    
    @Override
    public void destroy() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("não foi possível fechar a conexão com o banco!");
        }
    }
}

