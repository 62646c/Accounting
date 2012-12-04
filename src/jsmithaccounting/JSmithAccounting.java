/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jsmithaccounting;

/**
 *
 * @author BELAMBER
 */
public class JSmithAccounting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JoesGui g = new JoesGui();
      g.setVisible(true);
      g.setupOutgoing();
    }
}
