
package UsingForm;

import java.text.DecimalFormat;
import javax.swing.JLabel;

public class BigPizza extends javax.swing.JFrame {

  public BigPizza() {
    initComponents();
    txtResult.setText("No\tName\tQty\tPrice\tDiscount\tFree\tPayment\n");
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    cmbDate = new javax.swing.JComboBox<>();
    jLabel3 = new javax.swing.JLabel();
    cmbPizza = new javax.swing.JComboBox<>();
    jLabel4 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    txtResult = new javax.swing.JTextArea();
    cmbQty = new javax.swing.JComboBox<>();
    btnNew = new javax.swing.JButton();
    btnSale = new javax.swing.JButton();
    btnClose = new javax.swing.JButton();
    lb1 = new javax.swing.JLabel();
    lb3 = new javax.swing.JLabel();
    lbTotalQty = new javax.swing.JLabel();
    lbPayment = new javax.swing.JLabel();
    lb4 = new javax.swing.JLabel();
    lbDis = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);

    jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("BIG PIZZA");

    jLabel2.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    jLabel2.setText("Day");

    cmbDate.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    cmbDate.setMaximumRowCount(7);
    cmbDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thurday", "Friday", "Saturday", "Sunday" }));

    jLabel3.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    jLabel3.setText("Pizza");

    cmbPizza.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    cmbPizza.setMaximumRowCount(3);
    cmbPizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Big Pizza", "Mid-Pizza", "Small Pizza" }));

    jLabel4.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    jLabel4.setText("Qty");

    txtResult.setEditable(false);
    txtResult.setColumns(20);
    txtResult.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    txtResult.setRows(5);
    jScrollPane1.setViewportView(txtResult);

    cmbQty.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    cmbQty.setMaximumRowCount(7);
    cmbQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

    btnNew.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    btnNew.setText("New");
    btnNew.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNewActionPerformed(evt);
      }
    });

    btnSale.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    btnSale.setText("Sale");
    btnSale.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSaleActionPerformed(evt);
      }
    });

    btnClose.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    btnClose.setText("Close");
    btnClose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCloseActionPerformed(evt);
      }
    });

    lb1.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lb1.setText("Total Qty");

    lb3.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lb3.setText("Payment");

    lbTotalQty.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N

    lbPayment.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N

    lb4.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lb4.setText("Discount");

    lbDis.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jScrollPane1)
              .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)
                    .addComponent(cmbPizza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)
                    .addComponent(cmbQty, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)
                    .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(btnSale, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)))
            .addContainerGap())
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(lb3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(lb1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(lb4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(lbTotalQty, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
              .addComponent(lbPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
              .addComponent(lbDis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(0, 0, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnNew))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(cmbPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnSale))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(cmbQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnClose))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(26, 26, 26)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lb1)
          .addComponent(lbTotalQty))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lb3)
          .addComponent(lbPayment))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lb4)
          .addComponent(lbDis))
        .addContainerGap(48, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents
  
  private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    JLabel []lb = {lbTotalQty,lbPayment,lbDis };
    for(JLabel temp:lb)
      temp.setText("");
    txtResult.setText("No\tName\tQty\tPrice\tDiscount\tFree\tPayment\n");
    // TODO add your handling code here:
  }//GEN-LAST:event_btnNewActionPerformed

  private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
    System.exit(0);
    // TODO add your handling code here:
  }//GEN-LAST:event_btnCloseActionPerformed
  int n=1;
  double totalPayment = 0;
  double payment = 0;
  int totalQty = 0;
  
  private void btnSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleActionPerformed
    DecimalFormat df = new DecimalFormat("$#,###.00");
    int dis = 0,free=0;
    double price = 0;
//    String day = ""+cmbDate.getSelectedItem();
//    String pizza = ""+cmbPizza.getSelectedItem();
//    qty = Integer.parseInt(String.valueOf(cmbQty.getSelectedItem()));
    int day = cmbDate.getSelectedIndex();
    int pizza = cmbPizza.getSelectedIndex();
    int qty = Integer.parseInt(String.valueOf(cmbQty.getSelectedItem()));
    switch(pizza){
      case 0:
        price = 10;
        break;
      case 1:
        price = 7;
      case 2:
        price = 5;
        break;
    }
    switch(day){
      case 1,4 -> {
        dis = 0;
        totalQty = qty*2;
        free = qty;
        break;
      }
      default -> {
        dis = 2;
        totalQty += qty;
        free = 0;
      }    
    }
    payment = qty*price - qty*price*dis/100;
    totalPayment +=payment;
    String st = n+"\t"+cmbPizza.getSelectedItem()+"\t"+qty+"\t"+price+"\t"+dis+"%\t"+free+"\t"+df.format(totalPayment)+"\r\n";
    txtResult.append(st);
    n++;
    lbDis.setText(dis+"");
    lbPayment.setText(df.format(totalPayment));
    lbTotalQty.setText(totalQty+"");
    
    // TODO add your handling code here:
  }//GEN-LAST:event_btnSaleActionPerformed

  /**
   * @param args the command line arguments
   */
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
      java.util.logging.Logger.getLogger(BigPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(BigPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(BigPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(BigPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new BigPizza().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnClose;
  private javax.swing.JButton btnNew;
  private javax.swing.JButton btnSale;
  private javax.swing.JComboBox<String> cmbDate;
  private javax.swing.JComboBox<String> cmbPizza;
  private javax.swing.JComboBox<String> cmbQty;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lb1;
  private javax.swing.JLabel lb3;
  private javax.swing.JLabel lb4;
  private javax.swing.JLabel lbDis;
  private javax.swing.JLabel lbPayment;
  private javax.swing.JLabel lbTotalQty;
  private javax.swing.JTextArea txtResult;
  // End of variables declaration//GEN-END:variables
}
