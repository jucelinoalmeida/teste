/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author JucelinoAlmeida
 */

import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO { 
    private Connection connection;
    Long id;
    String cpf;
    String nome;
    String email;
    String codcargo;
    String codorgao;
    
    
    public UsuarioDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(Usuario usuario){ 
        String sql = "INSERT INTO usuario(cpf,nome,email,codcargo,codorgao) VALUES(?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getCpf());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getCodcargo());
            stmt.setString(5, usuario.getCodorgao());
                        
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    public void altera(Usuario usuario){ 
        String sql = "UPDATE usuario set nome=?, email=?, codcargo=?, codorgao=? where cpf=?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getCodcargo());
            stmt.setString(4, usuario.getCodorgao());
            stmt.setString(5, usuario.getCpf());
                        
            stmt.executeUpdate();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    }
     public void exclui(Usuario usuario){ 
        String sql = "DELETE usuario where cpf=?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getCpf());
                        
            stmt.executeUpdate();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    }
     //  cria array com todos os usuarios
     public List<Usuario> findAll() {

        String sql = "SELECT cpf, nome, codcargo, codorgao FROM usuario";

        ResultSet rs = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setCpf(rs.getString("cpf"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCodcargo(rs.getString("codcargo"));
                usuario.setCodorgao(rs.getString("codorgao"));
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } 

        return usuarios;
    }
    
}        