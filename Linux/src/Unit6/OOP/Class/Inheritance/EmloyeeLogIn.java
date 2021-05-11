
package Unit6.OOP.Class.Inheritance;

import MySQL.DBMS.Product.EmployeeAdminRegister;
import MySQL.ConnectionDB;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author CHINDA
 */
public class EmloyeeLogIn extends javax.swing.JFrame {

  //private final RegisterAccDB db;
  private static Connection connect;
  private PreparedStatement ps;
  private ResultSet rs;
  public EmloyeeLogIn() {
    initComponents();
    addPlaceHolde(txtUserName);
    addPlaceHolde(txtPass);
    lbHide.setVisible(false);
    //db = new RegisterAccDB();
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    lbShow = new javax.swing.JLabel();
    lbHide = new javax.swing.JLabel();
    txtUserName = new javax.swing.JTextField();
    txtPass = new javax.swing.JPasswordField();
    btnRegister = new javax.swing.JButton();
    btnLogIn = new javax.swing.JButton();
    lbImage = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Black_Eye_24.png"))); // NOI18N
    lbShow.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbShowMouseClicked(evt);
      }
    });
    jPanel1.add(lbShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

    lbHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Black_Eye_hide_24.png"))); // NOI18N
    lbHide.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        lbHideMousePressed(evt);
      }
    });
    jPanel1.add(lbHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

    txtUserName.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    txtUserName.setText("UserName");
    txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtUserNameFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtUserNameFocusLost(evt);
      }
    });
    txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtUserNameKeyTyped(evt);
      }
    });
    jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 360, -1));

    txtPass.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
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
    jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 360, -1));

    btnRegister.setBackground(new java.awt.Color(51, 51, 255));
    btnRegister.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    btnRegister.setForeground(new java.awt.Color(255, 255, 255));
    btnRegister.setText("Register");
    btnRegister.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRegisterActionPerformed(evt);
      }
    });
    jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 360, -1));

    btnLogIn.setBackground(new java.awt.Color(51, 51, 255));
    btnLogIn.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
    btnLogIn.setText("Log In");
    btnLogIn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLogInActionPerformed(evt);
      }
    });
    jPanel1.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 360, -1));

    lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form_Login/Login_1_(600X400).png"))); // NOI18N
    jPanel1.add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
    if(txtUserName.getText().trim().equals("UserName")){
      removePlaceHolde(txtUserName);
      txtUserName.setText(null);
      txtUserName.requestFocus();
    }
  }//GEN-LAST:event_txtUserNameFocusGained

  private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
    if(txtUserName.getText().length()==0){
      addPlaceHolde(txtUserName);
      txtUserName.setText("UserName");
    }
  }//GEN-LAST:event_txtUserNameFocusLost

  private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    this.requestFocusInWindow();
  }//GEN-LAST:event_formWindowGainedFocus

  private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
    if(txtPass.getText().equals("Password")){
      removePlaceHolde(txtPass);
      txtPass.setText(null);
      txtPass.setEchoChar('*');
      txtPass.requestFocus();
    }
  }//GEN-LAST:event_txtPassFocusGained

  private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
    if(txtPass.getText().length()==0){
      addPlaceHolde(txtPass);
      txtPass.setText("Password");
      txtPass.setEchoChar('\u0000');
    }
  }//GEN-LAST:event_txtPassFocusLost

  private void lbShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbShowMouseClicked
    lbShow.setVisible(false);
    lbHide.setVisible(true);
    txtPass.setEchoChar((char)0);
  }//GEN-LAST:event_lbShowMouseClicked

  private void lbHideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHideMousePressed
    lbShow.setVisible(true);
    lbHide.setVisible(false);
    if(txtPass.getText().equals("Password"))
      txtPass.setEchoChar('\u0000');
    else
      txtPass.setEchoChar('*');
  }//GEN-LAST:event_lbHideMousePressed

  private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
    if(evt.getKeyChar()==10)
      txtPass.requestFocus();
  }//GEN-LAST:event_txtUserNameKeyTyped

  private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
    if(evt.getKeyChar()==10)
      addElement();
  }//GEN-LAST:event_txtPassKeyTyped

  private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
    addElement();
  }//GEN-LAST:event_btnLogInActionPerformed

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try {
      ConnectionDB.connectionDB("localhost:3306", "employee_db", "root", "");//"Da087629243"
      connect = ConnectionDB.getDataCon();
    } catch (Exception e) {
    }
    ImageIcon icon = new ImageIcon("src/Images_Icon/SRU_100.png");
    this.setIconImage(icon.getImage());
  }//GEN-LAST:event_formWindowOpened

  private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
    this.dispose();
    EmployeeAdminRegister.main(null);
  }//GEN-LAST:event_btnRegisterActionPerformed
  private void addElement(){
    String user = txtUserName.getText();
    String pass = String.valueOf(txtPass.getPassword());
    String sql = "Select * from tbluserregister where userName=? and password=?";
    try {
      ps = connect.prepareStatement(sql);
      ps.setString(1, user);
      ps.setString(2, pass);
      rs = ps.executeQuery();
      if(rs.next()){
            JOptionPane.showMessageDialog(this, "LogIn Success");
            EmployeeInput.main(null);
            this.dispose();
          }else
            JOptionPane.showMessageDialog(this, "LogIn fail");
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, e.getMessage());
    }
  }
//  private void addElement(){
//    String user = txtUserName.getText();
//    String pass = String.valueOf(txtPass.getPassword());
//    for(int i=0; i<db.size(); i++){
//      if(db.getIndex(i).getUserName().equals(user) && db.getIndex(i).getPass().equals(pass)){
//        EmployeeInput.main(null);
//        this.dispose();
//        return;
//      }
//    }
//  }
  private void addPlaceHolde(JTextField txt){
      Font font = txt.getFont();
      font = font.deriveFont(Font.PLAIN);
      txt.setFont(font);
      txt.setForeground(Color.GRAY);
    }
    private void removePlaceHolde(JTextField txt){
      Font font = txt.getFont();
      font = font.deriveFont(Font.BOLD);
      txt.setFont(font);
      txt.setForeground(Color.BLACK);
    }
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
      java.util.logging.Logger.getLogger(EmloyeeLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(EmloyeeLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(EmloyeeLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(EmloyeeLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new EmloyeeLogIn().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnLogIn;
  private javax.swing.JButton btnRegister;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lbHide;
  private javax.swing.JLabel lbImage;
  private javax.swing.JLabel lbShow;
  private javax.swing.JPasswordField txtPass;
  private javax.swing.JTextField txtUserName;
  // End of variables declaration//GEN-END:variables
}
