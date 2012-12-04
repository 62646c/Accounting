/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jsmithaccounting;

/**
 *
 * @author JMARABLE
 */
public class Account {
  
  String accName;
  private int accBalance;
  
  
  public Account() {
    accBalance = 0; //when creating new instance, set balnce to 0.
    accName = new String(); //init new string
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
 
}