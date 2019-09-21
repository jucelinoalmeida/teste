/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Orgao;

/**
 *
 * @author JucelinoAlmeida
 */

public class OrgaoDAO { 
    private Connection connection;
    Long id;
    String codorgao;
    String nomeorgao;
    
    
    public OrgaoDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    
    public void adicionaorgao(Orgao orgao){ 
        String sql = "INSERT INTO orgao(codorgao,nomeorgao) VALUES(?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, orgao.getCodorgao());
            stmt.setString(2, orgao.getNomeorgao());
                        
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    }
}
