/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package init;

import java.io.File;
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
            
            File folder = new File("./database/");
            folder.mkdir();
            
            
            conn = DriverManager.getConnection("jdbc:sqlite:./database/jsmith.db");
            Statement s = conn.createStatement();
            //Current Account init
            s.executeUpdate("DROP Table Currentaccount");
            s.executeUpdate("CREATE TABLE Currentaccount (AccountID INTEGER PRIMARY KEY, AccountName TEXT, AccountBalance NUMERIC);");
            //Savings account
            s.executeUpdate("DROP TABLE Savingsaccount");
            s.executeUpdate("CREATE TABLE Savingsaccount (AccountID INTEGER PRIMARY KEY, Accountname TEXT, Accountbalance NUMERIC);");
            //Items init
            s.executeUpdate("DROP TABLE Items");
           s.executeUpdate("CREATE TABLE Items ( ID INTEGER PRIMARY KEY,isFinance NUMERIC, Itemname TEXT, Itemamount NUMERIC, Itemfreq NUMERIC, financeInterest NUMERIC, Withdrawndate TEXT, Withdrawndatebyyearly TEXT);");
           
        }catch (ClassNotFoundException e){
            System.out.println("Class not found exception");
            e.printStackTrace();
        } catch (SQLException e){
            System.out.println("SQLException");
            e.printStackTrace();
        }
    }
    
}
