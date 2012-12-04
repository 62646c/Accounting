/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

/**
 *
 * @author JMARABLE
 */
public class Account {
  int accID;
  private String accName;
  private int accBalance;
  
  
  public Account() {
      accID = -1;
    accBalance = 0; //when creating new instance, set balnce to 0.
    accName = "Account" ;//init new string
}
  
 public int getBalance() { //retrieve the balance
     return accBalance;
 }
 public void setBalance(int balance) {
    accBalance = balance; //set the account balance to the passed int argument
}
 public void addBalance(int balanceAdd) {
     accBalance = accBalance + balanceAdd;
 }
 public void subtractBalance(int balanceSub) {
     accBalance = accBalance - balanceSub;
 }
 public void setAccName(String name) {
    accName = name;
    }
 public String getAccName() {
     return accName;
 }
 public void setAccId () {
     accID++;
 }
 public int getAccId () {
     return accID;
 }
}