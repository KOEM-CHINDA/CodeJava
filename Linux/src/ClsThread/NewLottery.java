
package ClsThread;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;

public class NewLottery extends javax.swing.JFrame {

  private JButton btn[];
  ClsThread th[];
  public NewLottery() {
    initComponents();
    btn =new JButton[]{btn1,btn2,btn3,btn4,btn5,btn6};
    th = new ClsThread[]{
        new ClsThread(txt1, btn1),
        new ClsThread(txt2, btn2),
        new ClsThread(txt3, btn3),
        new ClsThread(txt4, btn4),
        new ClsThread(txt5, btn5),
        new ClsThread(txt6, btn6)
    };
    for(JButton temp:btn)
      temp.setVisible(false);
  }
  

  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    lbDate = new javax.swing.JLabel();
    btnAll = new javax.swing.JButton();
    btnRefresh = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    txt4 = new javax.swing.JTextField();
    btn5 = new javax.swing.JButton();
    txt5 = new javax.swing.JTextField();
    btn6 = new javax.swing.JButton();
    txt6 = new javax.swing.JTextField();
    txt1 = new javax.swing.JTextField();
    btn1 = new javax.swing.JButton();
    btn2 = new javax.swing.JButton();
    txt2 = new javax.swing.JTextField();
    btn3 = new javax.swing.JButton();
    txt3 = new javax.swing.JTextField();
    btn4 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 518, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 51, Short.MAX_VALUE)
    );

    lbDate.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
    lbDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    btnAll.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    btnAll.setText("Start");
    btnAll.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAllActionPerformed(evt);
      }
    });

    btnRefresh.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    btnRefresh.setText("Refresh");
    btnRefresh.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRefreshActionPerformed(evt);
      }
    });

    txt4.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
    txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txt4.setText("0");
    txt4.setFocusable(false);

    btn5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    btn5.setText("Start");
    btn5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn5ActionPerformed(evt);
      }
    });

    txt5.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
    txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txt5.setText("0");
    txt5.setFocusable(false);

    btn6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    btn6.setText("Start");
    btn6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn6ActionPerformed(evt);
      }
    });

    txt6.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
    txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txt6.setText("0");
    txt6.setFocusable(false);

    txt1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
    txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txt1.setText("0");
    txt1.setFocusable(false);

    btn1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    btn1.setText("Start");
    btn1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn1ActionPerformed(evt);
      }
    });

    btn2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    btn2.setText("Start");
    btn2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn2ActionPerformed(evt);
      }
    });

    txt2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
    txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txt2.setText("0");
    txt2.setFocusable(false);

    btn3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    btn3.setText("Start");
    btn3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn3ActionPerformed(evt);
      }
    });

    txt3.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
    txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txt3.setText("0");
    txt3.setFocusable(false);

    btn4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    btn4.setText("Start");
    btn4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn4ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn1))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn2))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn3))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn4)))
            .addGroup(jPanel2Layout.createSequentialGroup()
              .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(20, 20, 20)
              .addComponent(btn5)))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(20, 20, 20)
            .addComponent(btn6)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(lbDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addGap(199, 199, 199)
        .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(90, 90, 90)
        .addComponent(btnRefresh)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnAll)
          .addComponent(btnRefresh))
        .addGap(22, 22, 22))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents
  private Runnable r = new Runnable() {
    @Override
    public void run() {
      try {
        while (true) {    
          Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss a");
          lbDate.setText(sdf.format(d));
          Thread.sleep(1000);
        }
      } catch (Exception e) {
      }
    }
  };
  Thread thDate;
  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    thDate = new Thread(r);
    thDate.start();
  }//GEN-LAST:event_formWindowOpened

  private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
    for(ClsThread temp:th)
        temp.click();
    if(btnAll.getText().equals("Start")){
      btnAll.setText("Stop");
      for(JButton temp:btn)
        temp.setVisible(true);
    }else
      btnAll.setEnabled(false);
  }//GEN-LAST:event_btnAllActionPerformed
  private static void check(JButton btn,JButton btn1){
    if(btn.getText().equals("Start"))
      btn.setEnabled(false);
    btn1.setVisible(false);
  }
  private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
    this.dispose();
    NewLottery.main(null);
  }//GEN-LAST:event_btnRefreshActionPerformed
  
  private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
    th[0].click();
    check(btn1, btnAll);
  }//GEN-LAST:event_btn1ActionPerformed

  private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
    th[1].click();
    check(btn2, btnAll);
  }//GEN-LAST:event_btn2ActionPerformed

  private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
    th[2].click();
    check(btn3, btnAll);
  }//GEN-LAST:event_btn3ActionPerformed

  private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
    th[3].click();
    check(btn4, btnAll);
  }//GEN-LAST:event_btn4ActionPerformed

  private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
    th[4].click();
    check(btn5, btnAll);
  }//GEN-LAST:event_btn5ActionPerformed

  private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
    th[5].click();
    check(btn6, btnAll);
  }//GEN-LAST:event_btn6ActionPerformed

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
      java.util.logging.Logger.getLogger(NewLottery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(NewLottery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(NewLottery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(NewLottery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new NewLottery().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn1;
  private javax.swing.JButton btn2;
  private javax.swing.JButton btn3;
  private javax.swing.JButton btn4;
  private javax.swing.JButton btn5;
  private javax.swing.JButton btn6;
  private javax.swing.JButton btnAll;
  private javax.swing.JButton btnRefresh;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel lbDate;
  private javax.swing.JTextField txt1;
  private javax.swing.JTextField txt2;
  private javax.swing.JTextField txt3;
  private javax.swing.JTextField txt4;
  private javax.swing.JTextField txt5;
  private javax.swing.JTextField txt6;
  // End of variables declaration//GEN-END:variables
}
