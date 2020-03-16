/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class synset {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String USER = "root";
    static final String PASS = "";
    static final String DB_URL = "jdbc:mysql://localhost/kamus";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static ResultSet rs1;

    private static void synsetsearch() throws SQLException {
       String txtCari = null;
       String tampil= null;
       Scanner keyboard = new Scanner(System.in);
       txtCari= keyboard.nextLine();
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql1 = "SELECT * FROM wordnet where lemma '%"+txtCari+ "%'";

            rs = stmt.executeQuery(sql1);
            List<String> jawaban_mhs = new ArrayList<>();
            while (rs.next()) {
               
            }

        } catch (SQLException e)

   {
    }

}
}

