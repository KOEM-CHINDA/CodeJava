
package MySQL.DBMS.Product;

import MySQL.ConnectionDB;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;
public class LogIn extends javax.swing.JFrame {
  Connection connection = null;
  PreparedStatement ps = null;
  ResultSet rs = null;
  public LogIn() {
    initComponents();
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    lbShow = new javax.swing.JLabel();
    lbHide = new javax.swing.JLabel();
    txtUser = new javax.swing.JTextField();
    txtPass = new javax.swing.JPasswordField();
    btnSignIn = new javax.swing.JButton();
    btnSignUp = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("User LogIn");
    setResizable(false);
    addWindowFocusListener(new java.awt.event.WindowFocusListener() {
      public void windowGainedFocus(java.awt.event.WindowEvent evt) {
        formWindowGainedFocus(evt);
      }
      public void windowLostFocus(java.awt.event.WindowEvent evt) {
      }
    });
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    jPanel1.setBackground(new java.awt.Color(204, 204, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/User_Group_x64.png"))); // NOI18N
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 277, 74));

    lbShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Black_Eye_24.png"))); // NOI18N
    lbShow.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbShowMouseClicked(evt);
      }
    });
    jPanel1.add(lbShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 30, 20));

    lbHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Black_Eye_hide_24.png"))); // NOI18N
    lbHide.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        lbHideMousePressed(evt);
      }
    });
    jPanel1.add(lbHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 30, 20));

    txtUser.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtUser.setText("Username");
    txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtUserFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtUserFocusLost(evt);
      }
    });
    txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtUserKeyTyped(evt);
      }
    });
    jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 216, -1));

    txtPass.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtPass.setText("Password");
    txtPass.setEchoChar('\u0000');
    txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtPassFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtPassFocusLost(evt);
      }
    });
    txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPassKeyTyped(evt);
      }
    });
    jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 127, 216, 40));

    btnSignIn.setBackground(new java.awt.Color(51, 0, 255));
    btnSignIn.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
    btnSignIn.setText("Sign In");
    btnSignIn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSignInActionPerformed(evt);
      }
    });
    jPanel1.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 216, -1));

    btnSignUp.setBackground(new java.awt.Color(51, 0, 255));
    btnSignUp.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
    btnSignUp.setText("Sign Up");
    btnSignUp.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSignUpActionPerformed(evt);
      }
    });
    jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 233, 216, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
    if(txtUser.getText().equals("Username")){
      removePlaceHolder(txtUser);
      txtUser.setText(null);
      txtUser.requestFocus();
    }
  }//GEN-LAST:event_txtUserFocusGained

  private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    this.requestFocusInWindow();
  }//GEN-LAST:event_formWindowGainedFocus

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try {
        //ConnectionDB.connectionDB("localhost:3306", "student", "root", "Da087629243");
        ConnectionDB.connectionDB("localhost:3306", "employee_db", "root", "");
        connection = ConnectionDB.getDataCon();
        //connect = ConnectionMysql.getConnection();
      } catch (Exception e) {
      }
    lbHide.setVisible(false);
    addPlaceHolder(txtUser);
    addPlaceHolder(txtPass);
    ImageIcon icon = new ImageIcon("src/Images_Icon/SRU_64.png");
    this.setIconImage(icon.getImage());
  }//GEN-LAST:event_formWindowOpened

  private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
    if(txtUser.getText().equals("")){
      addPlaceHolder(txtUser);
      txtUser.setText("Username");
    }
  }//GEN-LAST:event_txtUserFocusLost

  private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
    if(txtPass.getText().equals("Password")){
      removePlaceHolder(txtPass);
      txtPass.setText(null);
      //check lbShow
      if(click == 1){
        txtPass.setEchoChar('\u0000');
        //click = 0;
      }else{
        txtPass.setEchoChar('*');
        txtPass.requestFocus();
      }
      
    }
  }//GEN-LAST:event_txtPassFocusGained

  private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
    if(txtPass.getText().equals("")){
      addPlaceHolder(txtPass);
      txtPass.setText("Password");
      txtPass.setEchoChar('\u0000');
    }
  }//GEN-LAST:event_txtPassFocusLost
  private int click =0;
  private void lbShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbShowMouseClicked
    lbShow.setVisible(false);
    lbHide.setVisible(true);
    txtPass.setEchoChar('\u0000');
    click = 1;
    
  }//GEN-LAST:event_lbShowMouseClicked

  private void lbHideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHideMousePressed
    lbShow.setVisible(true);
    lbHide.setVisible(false);
    click = 0;
    if(txtPass.getText().equals("Password"))
      txtPass.setEchoChar('\u0000');
    else
      txtPass.setEchoChar('*');
  }//GEN-LAST:event_lbHideMousePressed

  private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
    logIn();
  }//GEN-LAST:event_btnSignInActionPerformed

  private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
    this.dispose();
    EmployeeAdminRegister.main(null);
  }//GEN-LAST:event_btnSignUpActionPerformed

  private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
    if(evt.getKeyChar()==10)
      txtPass.requestFocus();
  }//GEN-LAST:event_txtUserKeyTyped

  private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
    if(evt.getKeyChar()==10)
      logIn();
  }//GEN-LAST:event_txtPassKeyTyped
  private void logIn(){
        String user = txtUser.getText().trim();
        String pass= String.valueOf(txtPass.getPassword());
        String sql = "Select * from tbluserregister where userName=? and password=?";
        try {
          ps = connection.prepareStatement(sql);
          ps.setString(1, user);
          ps.setString(2, pass);
          rs = ps.executeQuery();
          if(rs.next()){
            JOptionPane.showMessageDialog(this, "LogIn Success");
            connection.close();
          }else
            JOptionPane.showMessageDialog(this, "LogIn fail");
      } catch (Exception e) {
      }
   }
  
  private void addPlaceHolder(JTextField txt){
    Font font = txt.getFont();
    font = font.deriveFont(Font.PLAIN);
    txt.setFont(font);
    txt.setForeground(Color.GRAY);
  }
  private void removePlaceHolder(JTextField txt){
    Font font = txt.getFont();
    font = font.deriveFont(Font.BOLD);
    txt.setFont(font);
    txt.setForeground(Color.BLACK);
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
      java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LogIn().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnSignIn;
  private javax.swing.JButton btnSignUp;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lbHide;
  private javax.swing.JLabel lbShow;
  private javax.swing.JPasswordField txtPass;
  private javax.swing.JTextField txtUser;
  // End of variables declaration//GEN-END:variables
}
