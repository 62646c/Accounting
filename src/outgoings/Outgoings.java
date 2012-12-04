/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package outgoings;

import java.util.ArrayList;

/**
 *
 * @author BELAMBER
 */
public class Outgoings {
    private ArrayList<Item> items;
    
    public Outgoings(boolean initFromDB){
        if(initFromDB == true){
            
        } else {
            items = new ArrayList<Item>();
        }
    }
    public void initFromDB(){
        
    }
}
