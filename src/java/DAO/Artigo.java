/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author pedro
 */
public class Artigo {

    private Integer id;
    private Integer id_usuario;
    private Integer id_categoria;
    private String titulo;
    private String conteudo;
    private Boolean liberar; // Liberado pelo usuario
    private Boolean aprovado; // Aprovado pelo admin 
}
