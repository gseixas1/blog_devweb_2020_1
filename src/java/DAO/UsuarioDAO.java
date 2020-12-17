/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author pedro
 */
@WebServlet(name = "UsuarioDAO", urlPatterns = {"/UsuarioDAO"})
public class UsuarioDAO extends HttpServlet {
    private Connection conexao;
    
    public UsuarioDAO() {
        try {
            conexao = Conexao.criaConexao();
        }
        catch( Exception e ) {
            System.out.println("Erro criação de conexao Usuario DAO");
            System.out.println(e);
        }
    }

    public UsuarioDTO getUsuario(String cpf, String senha) {
        UsuarioDTO usuario = new UsuarioDTO(cpf, senha);
        try {
            String SQL = "SELECT * FROM usuario WHERE cpf=? AND senha=?";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            
            ps.setString(1, usuario.getCpf());
            ps.setString(2, usuario.getSenha());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                usuario.setId(rs.getInt("id"));
                usuario.setPapel(rs.getInt("papel"));
                usuario.setEmail(rs.getString("email"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCadastro_aprovado(rs.getInt("cadastro_aprovado"));
                return usuario;
            }

        } catch( SQLException e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return null;
    }

}
