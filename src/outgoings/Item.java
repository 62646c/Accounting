/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package outgoings;

import java.util.Date;

/**
 *
 * @author BELAMBER
 */
public class Item {
    private int itemId;
    private String itemName;
    private int itemAmount;
    private String itemFrequency;
    private boolean isFinanced;
    private int financeRate;
    private Date withdrawnDate;
    private Date withdrawnDateBiYearly;
    public Item(){
       itemId = -1;
       itemName = "n/a";
       itemAmount = -1;
       itemFrequency = "n/a"; 
       isFinanced = false;
       financeRate = -1;
       withdrawnDate = null;
       withdrawnDateBiYearly = null;
    }

    /**
     * @return the itemId
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemAmount
     */
    public int getItemAmount() {
        return itemAmount;
    }

    /**
     * @param itemAmount the itemAmount to set
     */
    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    /**
     * @return the itemFrequency
     */
    public String getItemFrequency() {
        return itemFrequency;
    }

    /**
     * @param itemFrequency the itemFrequency to set
     */
    public void setItemFrequency(String itemFrequency) {
        this.itemFrequency = itemFrequency;
    }

    /**
     * @return the isFinanced
     */
    public boolean isIsFinanced() {
        return isFinanced;
    }

    /**
     * @param isFinanced the isFinanced to set
     */
    public void setIsFinanced(boolean isFinanced) {
        this.isFinanced = isFinanced;
    }

    /**
     * @return the financeRate
     */
    public int getFinanceRate() {
        return financeRate;
    }

    /**
     * @param financeRate the financeRate to set
     */
    public void setFinanceRate(int financeRate) {
        this.financeRate = financeRate;
    }

    /**
     * @return the withdrawnDate
     */
    public Date getWithdrawnDate() {
        return withdrawnDate;
    }

    /**
     * @param withdrawnDate the withdrawnDate to set
     */
    public void setWithdrawnDate(Date withdrawnDate) {
        this.withdrawnDate = withdrawnDate;
    }

    /**
     * @return the withdrawnDateBiYearly
     */
    public Date getWithdrawnDateBiYearly() {
        return withdrawnDateBiYearly;
    }

    /**
     * @param withdrawnDateBiYearly the withdrawnDateBiYearly to set
     */
    public void setWithdrawnDateBiYearly(Date withdrawnDateBiYearly) {
        this.withdrawnDateBiYearly = withdrawnDateBiYearly;
    }
    
}
