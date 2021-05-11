
package Unit6.OOP.Class;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author chinda
 */
public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        addPlaceHolder(txtUser);
        addPlaceHolder(txtPass);
        lbHide.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        lbShow = new javax.swing.JLabel();
        lbHide = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
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
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 41, 263, -1));

        txtPass.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
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
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 90, 263, -1));

        lbShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Black_Eye_24.png"))); // NOI18N
        lbShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbShowMouseClicked(evt);
            }
        });
        jPanel1.add(lbShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 99, -1, -1));

        lbHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Black_Eye_hide_24.png"))); // NOI18N
        lbHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbHideMousePressed(evt);
            }
        });
        jPanel1.add(lbHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 99, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if(txtUser.getText().equals("Username")){
            txtUser.setText(null);
            txtUser.requestFocus();
            removePlaceHolder(txtUser);
        }
    }//GEN-LAST:event_txtUserFocusGained

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        if(txtPass.getText().equals("Password")){
            txtPass.setText(null);
            txtPass.requestFocus();
            txtPass.setEchoChar('*');
            removePlaceHolder(txtPass);
        }
    }//GEN-LAST:event_txtPassFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if(txtUser.getText().length()==0){
            addPlaceHolder(txtUser);
            txtUser.setText("Username");
        }
    }//GEN-LAST:event_txtUserFocusLost

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

    private void lbShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbShowMouseClicked
        lbHide.setVisible(true);
        lbShow.setVisible(false);
        txtPass.setEchoChar((char)0);
    }//GEN-LAST:event_lbShowMouseClicked

    private void lbHideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHideMousePressed
        lbHide.setVisible(false);
        lbShow.setVisible(true);
        if(txtPass.getText().equals("Password"))
            txtPass.setEchoChar('\u0000');
        else
            txtPass.setEchoChar('*');
    }//GEN-LAST:event_lbHideMousePressed

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        if(evt.getKeyChar()==10){
            String user = txtUser.getText();
            String pass = String.valueOf(txtPass.getPassword());
            if(user.equals("Admin") && pass.equals("123"))
                JOptionPane.showMessageDialog(this, "Hello");
            else JOptionPane.showMessageDialog(this, "Sorry");
        }
    }//GEN-LAST:event_txtPassKeyTyped
    
    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        if(evt.getKeyChar()==10){
            txtPass.requestFocus();
        }
            
    }//GEN-LAST:event_txtUserKeyTyped
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbHide;
    private javax.swing.JLabel lbShow;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
