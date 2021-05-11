
package Unit6.OOP.Class;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author CHINDA
 */
public class AdminLogIn extends javax.swing.JFrame {
  public AdminLogIn() {
    initComponents();
    lbshowPass.setVisible(false);
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    txtUserName = new javax.swing.JTextField();
    txtPass = new javax.swing.JPasswordField();
    jPanel2 = new javax.swing.JPanel();
    lbshowPass = new javax.swing.JLabel();
    lbhidePass = new javax.swing.JLabel();
    btnLogIn = new javax.swing.JButton();
    btnReset = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    jLabel1.setFont(new java.awt.Font("sansserif", 0, 30)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("SVAY REING UNIVERSITY");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addContainerGap(16, Short.MAX_VALUE))
    );

    jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("ADMIN USER");

    jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
    jLabel3.setText("User Name");

    jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
    jLabel4.setText("PassWord");

    txtUserName.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
    txtUserName.setText("Admin");

    txtPass.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
    txtPass.setText("123");

    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbshowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/On_x24.png"))); // NOI18N
    lbshowPass.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbshowPassMouseClicked(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        lbshowPassMousePressed(evt);
      }
    });
    jPanel2.add(lbshowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

    lbhidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Off_x24.png"))); // NOI18N
    lbhidePass.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        lbhidePassMousePressed(evt);
      }
    });
    jPanel2.add(lbhidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

    btnLogIn.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
    btnLogIn.setText("Log In");
    btnLogIn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLogInActionPerformed(evt);
      }
    });

    btnReset.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
    btnReset.setText("Reset");
    btnReset.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnResetActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtUserName)
          .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(32, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnReset)
        .addGap(18, 18, 18)
        .addComponent(btnLogIn)
        .addGap(49, 49, 49))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jLabel2)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel3)
              .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel4)
              .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnLogIn)
          .addComponent(btnReset))
        .addGap(49, 49, 49))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void lbshowPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbshowPassMouseClicked

  }//GEN-LAST:event_lbshowPassMouseClicked

  private void lbhidePassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbhidePassMousePressed
    txtPass.setEchoChar((char)0);
    lbshowPass.setVisible(true);
    lbhidePass.setVisible(false);
  }//GEN-LAST:event_lbhidePassMousePressed

  private void lbshowPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbshowPassMousePressed
    txtPass.setEchoChar('*');
    lbshowPass.setVisible(false);
    lbhidePass.setVisible(true);
  }//GEN-LAST:event_lbshowPassMousePressed

  private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    txtPass.setText("");
    txtUserName.selectAll();
    txtUserName.requestFocus();
  }//GEN-LAST:event_btnResetActionPerformed

  private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
    if(!(txtUserName.getText().equals(""))){
      String user = txtUserName.getText().trim();
      String pass = String.valueOf(txtPass.getPassword());
      if(user.equalsIgnoreCase("Admin") && pass.equals("123")){
        JOptionPane.showMessageDialog(this, "Succes");
      }else
        JOptionPane.showMessageDialog(this, "fail");
    }
   
  }//GEN-LAST:event_btnLogInActionPerformed

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
      java.util.logging.Logger.getLogger(AdminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(AdminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(AdminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(AdminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new AdminLogIn().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnLogIn;
  private javax.swing.JButton btnReset;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel lbhidePass;
  private javax.swing.JLabel lbshowPass;
  private javax.swing.JPasswordField txtPass;
  private javax.swing.JTextField txtUserName;
  // End of variables declaration//GEN-END:variables
}
