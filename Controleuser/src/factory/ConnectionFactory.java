/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author JucelinoAlmeida
 */
import java.sql.Connection; 
// conexão SQL para Java 
import java.sql.DriverManager; 
// driver de conexão SQL para Java 
import java.sql.SQLException; 
// classe para tratamento de exceções 
public class ConnectionFactory {
     public Connection getConnection() {
		 try {
			// conexao ao banco mysql
                    return DriverManager.getConnection("jdbc:mysql://localhost/controleuser","jucelino","bmw@20");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
                 }
     }
} 

