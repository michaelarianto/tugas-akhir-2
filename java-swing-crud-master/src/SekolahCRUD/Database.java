/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SekolahCRUD;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author michael
 */
public class Database {
    private static Connection connection;
    
    public static Connection getConnection(){
        //pengecekan koneksi database
        if (connection==null){
            try{
              String username = "root";
              String password = "";
              String url = "jdbc:mysql://localhost:3306/kamus";
              
              MysqlDataSource source = new MysqlDataSource();
              source.setUser(username);
              source.setPassword(password);
              source.setURL(url);
              
              connection = source.getConnection();
            } catch (SQLException ex){
              System.out.println("Error koneksi database");  
            }
        }       
        
        return connection;
    }
}
