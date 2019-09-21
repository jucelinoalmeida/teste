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
import modelo.Cargo;
import java.sql.*;
import java.sql.PreparedStatement;


public class CargoDAO { 
    private Connection connection;
    Long id;
    String codcargo;
    String nomecargo;
    
    
    public CargoDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    
    public void adicionacargo(Cargo cargo){ 
        String sql = "INSERT INTO cargo(codcargo,nomecargo) VALUES(?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cargo.getCodcargo());
            stmt.setString(2, cargo.getNomecargo());
                        
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    }
}