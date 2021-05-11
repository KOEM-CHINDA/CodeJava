
package UsingForm;

import PlugIn.MyInput;
import java.text.DecimalFormat;

public class DegreeEquation extends javax.swing.JFrame {

  public DegreeEquation() {
    initComponents();
    setResizable(false);
    setLocationRelativeTo(this);
    txtResult.setEditable(false);
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txtA = new javax.swing.JTextField();
    txtB = new javax.swing.JTextField();
    txtC = new javax.swing.JTextField();
    btnResult = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    txtResult = new javax.swing.JTextArea();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Kh Content", 1, 24)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("2nd Degree Equation");

    jLabel2.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("A");

    txtA.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    txtA.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtAKeyTyped(evt);
      }
    });

    txtB.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    txtB.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtBKeyTyped(evt);
      }
    });

    txtC.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    txtC.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtCKeyTyped(evt);
      }
    });

    btnResult.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    btnResult.setText("Result");
    btnResult.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnResultActionPerformed(evt);
      }
    });

    jLabel3.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("B");

    jLabel6.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel6.setText("C");

    txtResult.setColumns(20);
    txtResult.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    txtResult.setRows(5);
    jScrollPane1.setViewportView(txtResult);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))))
          .addGroup(layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(jScrollPane1)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnResult))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  public String showA(double a, double b, double c,double x){
    DecimalFormat df = new DecimalFormat("##.##");
    String str = "";
    if(a==1){
      if(b<0 && c<0)
        str ="x^2 "+df.format(b)+"x "+df.format(c)+" = 0\n"+
             "x1 = x2 = "+df.format(x)+"\r\n";
      else if(b<0)
        str ="x^2 "+df.format(b)+"x +"+df.format(c)+" = 0\n"+
             "x1 = x2 = "+df.format(x)+"\r\n";
      else if(c<0)
        str = "x^2 +"+df.format(b)+"x "+df.format(c)+" = 0\n"+
              "x1 = x2 = "+df.format(x)+"\r\n";  
      else
        str ="x^2 +"+df.format(b)+"x +"+df.format(c)+" = 0\n"+
             "x1 = x2 = "+df.format(x)+"\r\n";
          }    
    else{
      
    }
    return str;
  }
  private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
    DecimalFormat df = new DecimalFormat("##.##");
    if(MyInput.checkText(txtA,txtB,txtC)){
      double a = Double.parseDouble(txtA.getText());
      double b = Double.parseDouble(txtB.getText());
      double c = Double.parseDouble(txtC.getText());
      double x;
      String str = "";
      if(a!=0){
        double x1 = 0, x2 = 0;
        double delta = 0;
        delta = Math.pow(b,2)-4*a*c;
        if(delta==0){
          x = -b/c;
          
          
          }
          
         
        
      }else{
        x = c/b;
        if(c < 0)
          str = df.format(b)+"x "+df.format(c)+" = 0\n"+"x = "+df.format(x)+"\r\n";
        else
          str = df.format(b)+"x + "+df.format(c)+" = 0\n"+"x = "+df.format(x)+"\r\n";
        
      }
      txtResult.setText(str);
      MyInput.clearText(txtA,txtB,txtC);
    }
    // TODO add your handling code here:
  }//GEN-LAST:event_btnResultActionPerformed

  private void txtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAKeyTyped
    
    // TODO add your handling code here:
  }//GEN-LAST:event_txtAKeyTyped

  private void txtBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBKeyTyped
    
    // TODO add your handling code here:
  }//GEN-LAST:event_txtBKeyTyped

  private void txtCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyTyped
   
    // TODO add your handling code here:
  }//GEN-LAST:event_txtCKeyTyped

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
      java.util.logging.Logger.getLogger(DegreeEquation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(DegreeEquation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(DegreeEquation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(DegreeEquation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new DegreeEquation().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnResult;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField txtA;
  private javax.swing.JTextField txtB;
  private javax.swing.JTextField txtC;
  private javax.swing.JTextArea txtResult;
  // End of variables declaration//GEN-END:variables
}
