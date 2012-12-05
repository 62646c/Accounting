/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jsmithaccounting;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import outgoings.Item;
import outgoings.Outgoings;

/**
 *
 * @author DBENTON & BELAMBER
 */
public class JoesGui extends javax.swing.JFrame {

    /**
     * Creates new form JoesGui
     */
    public Outgoings o;
    public JoesGui() {
        initComponents();
        o = new Outgoings(true);
    }
   
     private void disableFinance(){
      financeCheck.setSelected(false);                                    //finance is unchecked
            financeCheck.setEnabled(false);                                    //and finance checkbox is disabled
            interestLabel.setEnabled(false);
            interestField.setText("0");
            interestField.setEnabled(false);
  }

    public void initOptions(){
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        currentTab = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        savingsTab = new javax.swing.JPanel();
        recurringTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outgoingsList = new javax.swing.JList();
        newOutgoing = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        totalOutgoings = new javax.swing.JLabel();
        currentNameLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        freqLabel = new javax.swing.JLabel();
        yearlyButton = new javax.swing.JRadioButton();
        halfYearButton = new javax.swing.JRadioButton();
        monthlyButton = new javax.swing.JRadioButton();
        amountField = new javax.swing.JTextField();
        financeCheck = new javax.swing.JCheckBox();
        interestLabel = new javax.swing.JLabel();
        interestField = new javax.swing.JTextField();
        withdrawnLabel = new javax.swing.JLabel();
        yearlyWithdrawMonth = new javax.swing.JComboBox();
        yearlyWithdrawMonth1 = new javax.swing.JComboBox();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        date1Day = new javax.swing.JComboBox();
        date2Day = new javax.swing.JComboBox();
        andLabel = new javax.swing.JLabel();
        monthlyCostLabel = new javax.swing.JLabel();
        yearlyCostLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        yearsMonthsCombo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Summary", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Outgoings", jPanel5);

        javax.swing.GroupLayout currentTabLayout = new javax.swing.GroupLayout(currentTab);
        currentTab.setLayout(currentTabLayout);
        currentTabLayout.setHorizontalGroup(
            currentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        currentTabLayout.setVerticalGroup(
            currentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("  Current  ", currentTab);

        javax.swing.GroupLayout savingsTabLayout = new javax.swing.GroupLayout(savingsTab);
        savingsTab.setLayout(savingsTabLayout);
        savingsTabLayout.setHorizontalGroup(
            savingsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        savingsTabLayout.setVerticalGroup(
            savingsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("  Savings  ", savingsTab);

        outgoingsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        outgoingsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                outgoingsListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(outgoingsList);

        newOutgoing.setText("Add new outgoing...");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        totalOutgoings.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        totalOutgoings.setText("Total Monthly Outgoings: £0.00");

        currentNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentNameLabel.setText("Outgoing Name");

        amountLabel.setText("Amount:");

        freqLabel.setText("Frequency:");

        buttonGroup1.add(yearlyButton);
        yearlyButton.setSelected(true);
        yearlyButton.setText("Yearly");
        yearlyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(halfYearButton);
        halfYearButton.setText("Half-Yearly");
        halfYearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halfYearButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(monthlyButton);
        monthlyButton.setText("Monthly");
        monthlyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyButtonActionPerformed(evt);
            }
        });

        amountField.setText("0.00");

        financeCheck.setText("Financed");
        financeCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financeCheckActionPerformed(evt);
            }
        });

        interestLabel.setText("Interest:");

        interestField.setText("0%");

        withdrawnLabel.setText("Withdrawn on:");

        yearlyWithdrawMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        yearlyWithdrawMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyWithdrawMonthActionPerformed(evt);
            }
        });

        yearlyWithdrawMonth1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        yearlyWithdrawMonth1.setEnabled(false);
        yearlyWithdrawMonth1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyWithdrawMonth1ActionPerformed(evt);
            }
        });

        saveButton.setText("Save Details");

        deleteButton.setText("Delete Outgoing");

        date1Day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        date2Day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        date2Day.setEnabled(false);

        andLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        andLabel.setText("and:");
        andLabel.setEnabled(false);

        monthlyCostLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        monthlyCostLabel.setText("Monthly Cost: £0.00");

        yearlyCostLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        yearlyCostLabel.setText("Total Yearly Cost: £0.00");

        jLabel1.setText("Day of each month");
        jLabel1.setEnabled(false);

        jLabel2.setText("Ending after:");

        jTextField1.setText("1");

        yearsMonthsCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Months", "Years" }));

        javax.swing.GroupLayout recurringTabLayout = new javax.swing.GroupLayout(recurringTab);
        recurringTab.setLayout(recurringTabLayout);
        recurringTabLayout.setHorizontalGroup(
            recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recurringTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(recurringTabLayout.createSequentialGroup()
                        .addComponent(newOutgoing, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addButton)))
                .addGap(18, 18, 18)
                .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(recurringTabLayout.createSequentialGroup()
                        .addComponent(amountLabel)
                        .addGap(18, 18, 18)
                        .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recurringTabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalOutgoings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(monthlyCostLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yearlyCostLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(recurringTabLayout.createSequentialGroup()
                        .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(recurringTabLayout.createSequentialGroup()
                                .addComponent(freqLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(recurringTabLayout.createSequentialGroup()
                                        .addComponent(financeCheck)
                                        .addGap(18, 18, 18)
                                        .addComponent(interestLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(interestField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(recurringTabLayout.createSequentialGroup()
                                        .addComponent(yearlyButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(halfYearButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(monthlyButton))
                                    .addGroup(recurringTabLayout.createSequentialGroup()
                                        .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(withdrawnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(andLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(recurringTabLayout.createSequentialGroup()
                                                .addComponent(yearlyWithdrawMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(date2Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(recurringTabLayout.createSequentialGroup()
                                                .addComponent(yearlyWithdrawMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(date1Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1))))))
                            .addGroup(recurringTabLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearsMonthsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        recurringTabLayout.setVerticalGroup(
            recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recurringTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recurringTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newOutgoing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton)))
                    .addGroup(recurringTabLayout.createSequentialGroup()
                        .addComponent(currentNameLabel)
                        .addGap(18, 18, 18)
                        .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountLabel)
                            .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton)
                            .addComponent(deleteButton))
                        .addGap(18, 18, 18)
                        .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(freqLabel)
                            .addComponent(yearlyButton)
                            .addComponent(halfYearButton)
                            .addComponent(monthlyButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(financeCheck)
                            .addComponent(interestLabel)
                            .addComponent(interestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(withdrawnLabel)
                            .addComponent(yearlyWithdrawMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date1Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(8, 8, 8)
                        .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearlyWithdrawMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date2Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(andLabel))
                        .addGap(18, 18, 18)
                        .addGroup(recurringTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearsMonthsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yearlyCostLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthlyCostLabel)
                        .addGap(18, 18, 18)
                        .addComponent(totalOutgoings)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("  Recurring Outgoings  ", recurringTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void outgoingsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_outgoingsListValueChanged
        //currentNameLabel.setText(outgoingsList.getSelectedValue().toString());
        int currentItemIndex = outgoingsList.getSelectedIndex();
        Item currentSelectedItem = o.getItems().get(currentItemIndex);
        currentNameLabel.setText(currentSelectedItem.getItemName());
        int amountAsPence = currentSelectedItem.getItemAmount();
        String amountAsPounds = roundTwoDecimals((double) amountAsPence / 100);
        
        amountField.setText(amountAsPounds);
        
        SimpleDateFormat f = new SimpleDateFormat("MMMM");
        SimpleDateFormat d = new SimpleDateFormat("d");
        yearlyWithdrawMonth.setSelectedItem(f.format(currentSelectedItem.getWithdrawnDate()));
        
        date1Day.setSelectedItem(d.format(currentSelectedItem.getWithdrawnDate()));
        
        
        if(currentSelectedItem.getItemFrequency().equals("1")){
            yearlyButton.setSelected(true);
        } else if(currentSelectedItem.getItemFrequency().equals("12")) {
            monthlyButton.setSelected(true);
        } else if(currentSelectedItem.getItemFrequency().equals("6")){
            halfYearButton.setSelected(true);
        } else if(currentSelectedItem.getItemFrequency().equals("0")){
          System.out.println("Item should not exist");  
        }
        
        financeCheck.setSelected(currentSelectedItem.isIsFinanced());
        
    }//GEN-LAST:event_outgoingsListValueChanged
String roundTwoDecimals(double d) {
            DecimalFormat twoDForm = new DecimalFormat("#.##");
        return String.valueOf(twoDForm.format(d));
}
    private void yearlyWithdrawMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyWithdrawMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearlyWithdrawMonthActionPerformed

    private void yearlyWithdrawMonth1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyWithdrawMonth1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearlyWithdrawMonth1ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       
      
    }//GEN-LAST:event_addButtonActionPerformed

    private void monthlyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyButtonActionPerformed
       if (monthlyButton.isSelected()){                                         //if paid monthly
            disableFinance();                                                   //disable finance options
            jLabel1.setVisible(true);
            yearlyWithdrawMonth1.setEnabled(false);
            yearlyWithdrawMonth.setEnabled(false);
            date2Day.setEnabled(false);
       }
    }//GEN-LAST:event_monthlyButtonActionPerformed

    private void halfYearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halfYearButtonActionPerformed
        if (halfYearButton.isSelected()){
            disableFinance();
            jLabel1.setVisible(false);
            yearlyWithdrawMonth1.setEnabled(true);
            yearlyWithdrawMonth.setEnabled(true);
            date1Day.setEnabled(true);
            date2Day.setEnabled(true);
            
        }
    }//GEN-LAST:event_halfYearButtonActionPerformed

    private void yearlyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyButtonActionPerformed
        andLabel.setEnabled(false);
        yearlyWithdrawMonth1.setEnabled(false);
        date2Day.setEnabled(false);
        jLabel1.setVisible(false);
        financeCheck.setEnabled(true);
        yearlyWithdrawMonth.setEnabled(true);
    }//GEN-LAST:event_yearlyButtonActionPerformed

    private void financeCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financeCheckActionPerformed
       if(financeCheck.isSelected()){
           interestLabel.setEnabled(true);
           interestField.setEnabled(true);
           date1Day.setEnabled(true);
           jLabel1.setVisible(true);
           yearlyWithdrawMonth.setEnabled(false);
       }
       else
       {
          interestLabel.setEnabled(false);
           interestField.setEnabled(false);
          
           jLabel1.setVisible(false);
           yearlyWithdrawMonth.setEnabled(true);
       }
    }//GEN-LAST:event_financeCheckActionPerformed

 
    /**
     * @param args the command line arguments
     */
    public void setupOutgoing(){
        DefaultListModel d = new DefaultListModel();
        
        for(Item currentItem : o.getItems()){
           d.add(currentItem.getItemId()-1, currentItem.getItemName());   
        }
        this.outgoingsList.setModel(d);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JoesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JoesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JoesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JoesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new JoesGui().setVisible(true);
                
            }
            
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField amountField;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel andLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel currentNameLabel;
    private javax.swing.JPanel currentTab;
    private javax.swing.JComboBox date1Day;
    private javax.swing.JComboBox date2Day;
    private javax.swing.JButton deleteButton;
    private javax.swing.JCheckBox financeCheck;
    private javax.swing.JLabel freqLabel;
    private javax.swing.JRadioButton halfYearButton;
    private javax.swing.JTextField interestField;
    private javax.swing.JLabel interestLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton monthlyButton;
    private javax.swing.JLabel monthlyCostLabel;
    private javax.swing.JTextField newOutgoing;
    private javax.swing.JList outgoingsList;
    private javax.swing.JPanel recurringTab;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel savingsTab;
    private javax.swing.JLabel totalOutgoings;
    private javax.swing.JLabel withdrawnLabel;
    private javax.swing.JRadioButton yearlyButton;
    private javax.swing.JLabel yearlyCostLabel;
    private javax.swing.JComboBox yearlyWithdrawMonth;
    private javax.swing.JComboBox yearlyWithdrawMonth1;
    private javax.swing.JComboBox yearsMonthsCombo;
    // End of variables declaration//GEN-END:variables
}
