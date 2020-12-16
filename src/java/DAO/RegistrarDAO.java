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
@WebServlet(name="UsuarioDAO", urlPatterns={"/UsuarioDAO"})
public class RegistrarDAO extends HttpServlet  {
    private Connection conexao;
    private UsuarioDTO usuario;
    
    public RegistrarDAO(String cpf, String senha, String nome, String email, Integer papel) {
        usuario = new UsuarioDTO(cpf, senha);
        usuario.setPapel(papel);
        usuario.setEmail(email);
        usuario.setNome(nome);
        usuario.setCadastro_aprovado(0);
    }
    
    public boolean gravarUsuario() {
        try {
            conexao = Conexao.criaConexao();
            String SQL = "insert into usuario(email, senha, nome, cpf, papel) values(?, ?, ?, ?, ?)";
            PreparedStatement sql = conexao.prepareStatement(SQL);
            sql.setString(1, usuario.getEmail());
            sql.setString(2, usuario.getSenha());
            sql.setString(3, usuario.getNome());
            sql.setString(4, usuario.getCpf());
            sql.setInt(5, usuario.getPapel());
            sql.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao gravar usuario no banco - RegistrarDAO");
            System.out.println(e);
            
            return false;
        }
    }
}
