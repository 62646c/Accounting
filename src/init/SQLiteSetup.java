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
            //s.executeUpdate("DROP Table Currentaccount");
            //s.executeUpdate("CREATE TABLE Currentaccount (AccountID INTEGER PRIMARY KEY, AccountName TEXT, AccountBalance NUMERIC);");
            //Savings account
            //s.executeUpdate("DROP TABLE Savingsaccount");
            //s.executeUpdate("CREATE TABLE Savingsaccount (AccountID INTEGER PRIMARY KEY, Accountname TEXT, Accountbalance NUMERIC);");
            //Items init
            s.executeUpdate("DROP TABLE Items");
            s.executeUpdate("CREATE TABLE Items (id INTEGER PRIMARY KEY, isFinance NUMERIC, itemName TEXT, itemAmount NUMERIC, itemFreq NUMERIC, financeInterest NUMERIC, withdrawDate TEXT, withdrawDateBiYearly TEXT);");
            s.executeUpdate("INSERT INTO ITEMS(isFinance, itemName, itemAmount, itemFreq, financeInterest, withdrawDate, withdrawDateBiYearly) VALUES ('0','Phone Bill','1500','0','0','5/12','5/12')");
            s.executeUpdate("INSERT INTO ITEMS(isFinance, itemName, itemAmount, itemFreq, financeInterest, withdrawDate, withdrawDateBiYearly) VALUES ('1','Food','1332','12','0','20/01','20/01')");
            
            //s.executeUpdate("INSERT INTO ITEMS(isFinance, Itemname, Itemamount, Itemfreq, financeInterest, Withdrawndate, Withdrawndatebyyearly) VALUES ('0','Shoes and shit', '1042', '0' , '0', '04/12' , '') ");
        }catch (ClassNotFoundException e){
            System.out.println("Class not found exception");
            e.printStackTrace();
        } catch (SQLException e){
            System.out.println("SQLException");
            e.printStackTrace();
        }
    }
    
}
