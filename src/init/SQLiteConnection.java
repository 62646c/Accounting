/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package init;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author BELAMBER
 */
public class SQLiteConnection {
    private Connection c;
    public boolean isSuccessfulConnection(){
         try{
             Class.forName("org.sqlite.JDBC");
             setConnection(null);
             setConnection(DriverManager.getConnection("jdbc:sqlite:./database/jsmith.db"));
             return true;
         } catch (Exception e){
             e.printStackTrace();
         }
        return false; 
    }

    /**
     * @return the c
     */
    public Connection getConnection() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setConnection(Connection c) {
        this.c = c;
    }
}
