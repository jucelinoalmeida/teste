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
import modelo.Sistema;

/**
 *
 * @author JucelinoAlmeida
 */
public class SistemaDAO {
    
    private Connection connection;
    Long id;
    String sistema;
    String cpf;
    
    
    public SistemaDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    
    public void adicionasistema(Sistema sistema){ 
        String sql = "INSERT INTO sistema(sistema,cpf) VALUES(?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, sistema.getSistema());
            stmt.setString(2, sistema.getCpf());
                        
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    }
}
