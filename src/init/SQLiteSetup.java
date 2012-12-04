/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package init;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author BELAMBER
 */
public class SQLiteSetup {
    private Connection conn;
    public SQLiteSetup(){
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:./jsmith.db");
            Statement s = conn.createStatement();
           
        }catch (ClassNotFoundException e){
            System.out.println("Class not found exception");
            e.printStackTrace();
        } catch (SQLException e){
            System.out.println("SQLException");
            e.printStackTrace();
        }
    }
    
}
