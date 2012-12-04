/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package outgoings;

import init.SQLiteConnection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author BELAMBER
 */
public class Outgoings {
    private ArrayList<Item> items;
    
    public Outgoings(boolean initFromDB){
        if(initFromDB == true){
             items = new ArrayList<Item>();
            this.initFromDB();
            
        } else {
            items = new ArrayList<Item>();
        }
    }
    public void add(Item i){
        //create temp varible to hold item and then
        Item tempItem = new Item();
        tempItem.setItemAmount(i.getItemAmount());
        tempItem.setItemId(i.getItemId());
        tempItem.setItemName(i.getItemName());
        tempItem.setItemFrequency(i.getItemFrequency());
        tempItem.setFinanceRate(i.getFinanceRate());
        tempItem.setIsFinanced(i.isIsFinanced());
        tempItem.setWithdrawnDate(i.getWithdrawnDate());
        tempItem.setWithdrawnDateBiYearly(i.getWithdrawnDateBiYearly());
        items.add(tempItem);
    }
    public void displayItems(){
        for(Item currentItem:items){
            System.out.println(currentItem.getItemId() + " - " + currentItem.getItemName() );
        }
    }
    public void initFromDB(){
        //init from sql
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
        SQLiteConnection sqlc = new SQLiteConnection();
        if(sqlc.isSuccessfulConnection()){
         try{
            Statement s = sqlc.getConnection().createStatement();
            ResultSet allItems = s.executeQuery("select * from Items");
            while(allItems.next()){
                Item tempItem = new Item();
                int currentId = allItems.getInt("id");
                int isFinance = allItems.getInt("isFinance");
                boolean isFinanced = false;
                if(isFinance == 1){isFinanced = true;}
                String itemName = allItems.getString("itemName");
                int itemAmount = allItems.getInt("itemAmount");
                int financeInterest = allItems.getInt("financeInterest");
                Date withdrawDate = sdf.parse(allItems.getString("withdrawDate"));
                Date withdrawDateBiYearly = sdf.parse(allItems.getString("withdrawDateBiYearly"));
                
                
                tempItem.setItemId(currentId);
                tempItem.setIsFinanced(isFinanced);
                tempItem.setItemName(itemName);
                tempItem.setItemAmount(itemAmount);
                tempItem.setFinanceRate(financeInterest);
                tempItem.setWithdrawnDate(withdrawDate);
                tempItem.setWithdrawnDateBiYearly(withdrawDateBiYearly);
                
                items.add(tempItem);
            }
         }catch (Exception e){
             e.printStackTrace();
         }
         this.displayItems();
        }
    }
    public void saveChangesToDB(){
        //write changes to db
    }
    public void getNextId(){
        //get next itemid
    }
}
