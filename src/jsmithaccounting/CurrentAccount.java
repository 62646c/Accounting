/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jsmithaccounting;

import jsmithaccounting.Account;

/**
 *
 * @author JMARABLE
 */
public class CurrentAccount extends Account {
    public CurrentAccount() {
             if(initFromDB == true){
            
        } else {
            items = new ArrayList<Item>();
        }
    }
}
}
