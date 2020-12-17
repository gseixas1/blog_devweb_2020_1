/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.PostagemDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class PostagemDAO {
    private Connection conexao;
    private PostagemDTO postagem;
    
    public PostagemDAO(Integer id_usuario, String categoria, String titulo, String conteudo) {
        postagem = new PostagemDTO(id_usuario, categoria, titulo, conteudo, false, false);
        try {
            conexao = Conexao.criaConexao();
        }
        catch( Exception e ) {
            System.out.println("Erro criação de conexao Postagem DAO");
            System.out.println(e);
        }
    }
    
    public boolean gravarPostagem() {
        try {
            conexao = Conexao.criaConexao();
            String SQL = "insert into artigo(id_usuario, id_categoria, titulo, conteudo, liberar, aprovado) values(?, ?, ?, ?, ?, ?)";
            PreparedStatement sql = conexao.prepareStatement(SQL);
            sql.setInt(1, postagem.getId_usuario());
            sql.setInt(2, 0);
            sql.setString(3, postagem.getTitulo());
            sql.setString(4, postagem.getConteudo());
            sql.setBoolean(5, false);
            sql.setBoolean(6, false);
            sql.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao gravar usuario no banco - PostagemDAO");
            System.out.println(e);
            
            return false;
        }
    }
}
