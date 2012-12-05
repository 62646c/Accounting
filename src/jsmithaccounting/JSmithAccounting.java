/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jsmithaccounting;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author BELAMBER
 */
public class JSmithAccounting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            try {
       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (UnsupportedLookAndFeelException ex) {
        System.out.println("Unable to load native look and feel");
    } catch (ClassNotFoundException cnfe) {
        System.out.println("Class not found");
    } catch (InstantiationException ie) {
        System.out.println("Instantiation exception");
    } catch (IllegalAccessException iae) {
        System.out.println("Illegal Action Exception");
    }
        
        
      JoesGui g = new JoesGui();
      g.setVisible(true);
      g.setupOutgoing();
    }
}
