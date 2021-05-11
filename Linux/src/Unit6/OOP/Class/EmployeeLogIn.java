
package Unit6.OOP.Class;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;
import MySQL.ConnectionMysql;
import MySQL.ConnectionDB;
public class EmployeeLogIn extends javax.swing.JFrame {
    private static Connection connect;
    private PreparedStatement ps;
    private ResultSet rs;
    public EmployeeLogIn() {
        initComponents();
        addPlaceHolder(txtUser);
        addPlaceHolder(txtPass);
    }
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    lbUser = new javax.swing.JLabel();
    txtUser = new javax.swing.JTextField();
    lbpass = new javax.swing.JLabel();
    lbShow = new javax.swing.JLabel();
    lbHide = new javax.swing.JLabel();
    txtPass = new javax.swing.JPasswordField();
    btnLogIn = new javax.swing.JButton();

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

    jPanel2.setBackground(new java.awt.Color(255, 255, 253));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Khmer OS Content", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 0, 0));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/User_Group_x100.png"))); // NOI18N
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 330, -1));

    lbUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Black_user_24.png"))); // NOI18N
    jPanel2.add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

    txtUser.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
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
    jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 230, -1));

    lbpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Black_Locked_24.png"))); // NOI18N
    lbpass.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbpassMouseClicked(evt);
      }
    });
    jPanel2.add(lbpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

    lbShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Black_Eye_24.png"))); // NOI18N
    lbShow.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbShowMouseClicked(evt);
      }
    });
    jPanel2.add(lbShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

    lbHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Black_Eye_hide_24.png"))); // NOI18N
    lbHide.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbHideMouseClicked(evt);
      }
    });
    jPanel2.add(lbHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

    txtPass.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
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
    jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 230, -1));

    btnLogIn.setBackground(new java.awt.Color(0, 0, 204));
    btnLogIn.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
    btnLogIn.setText("LogIn");
    btnLogIn.setToolTipText("");
    btnLogIn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLogInActionPerformed(evt);
      }
    });
    jPanel2.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 230, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      try {
        //ConnectionDB.connectionDB("localhost:3306", "student", "root", "Da087629243");
        ConnectionDB.connectionDB("localhost:3306", "employee_db", "root", "");
        connect= ConnectionDB.getDataCon();
        //connect = ConnectionMysql.getConnection();
      } catch (Exception e) {
      }
      lbHide.setVisible(false);
      ImageIcon icon = new ImageIcon("src/Images_Icon/User_x64.png");
      this.setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowOpened

    private void lbShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbShowMouseClicked
        lbShow.setVisible(false);
        lbHide.setVisible(true);
        txtPass.setEchoChar((char)0);
    }//GEN-LAST:event_lbShowMouseClicked

    private void lbHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHideMouseClicked
       lbHide.setVisible(false);
       lbShow.setVisible(true);
       if(txtPass.getText().equals("Password"))
            txtPass.setEchoChar('\u0000');
        else
            txtPass.setEchoChar('*');
    }//GEN-LAST:event_lbHideMouseClicked
    
    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        logIn();
    }//GEN-LAST:event_btnLogInActionPerformed
    private void logIn(){
        String user = txtUser.getText().trim();
        String pass= String.valueOf(txtPass.getPassword());
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
      }
    }
    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        if(evt.getKeyChar()==10)
            txtPass.requestFocus();
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if(txtUser.getText().trim().equals("Username")){
            txtUser.setText(null);
            txtUser.requestFocus();
            removePlaceHolder(txtUser);
        }
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if(txtUser.getText().equals("")){
            addPlaceHolder(txtUser);
            txtUser.setText("Username");
        }
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        if(String.valueOf(txtPass.getPassword()).trim().equals("Password")){
            txtPass.setText(null);
            txtPass.requestFocus();
            txtPass.setEchoChar('*');
            removePlaceHolder(txtPass);
        }
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        if(txtPass.getText().equals("")){
            addPlaceHolder(txtPass);
            txtPass.setText("Password");
            txtPass.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtPassFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        if(evt.getKeyChar()==10){
            logIn();
        }
    }//GEN-LAST:event_txtPassKeyTyped

  private void lbpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbpassMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_lbpassMouseClicked
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
            java.util.logging.Logger.getLogger(EmployeeLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeLogIn().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnLogIn;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel lbHide;
  private javax.swing.JLabel lbShow;
  private javax.swing.JLabel lbUser;
  private javax.swing.JLabel lbpass;
  private javax.swing.JPasswordField txtPass;
  private javax.swing.JTextField txtUser;
  // End of variables declaration//GEN-END:variables
}
