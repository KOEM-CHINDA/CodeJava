
package Unit6.OOP.Class;

import PlugIn.SubDefaultTableModel;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StudentInfor extends javax.swing.JFrame {

  private ArrayList<Student> ls;
  private SubDefaultTableModel mod;
  private String gender[] = {"Male","Female"};
  private String address[] = { "Banteay Meanchey", "Battambang", "Kampong Cham", "Kampong Chhnang", "Kampong Speu", "Kampong Thom", "Kampot", "Kandal", "Kep", "Koh Kong", "Kratie", "Mondulkiri", "Phnom Penh", "Preah Vihear", "Prey Veng", "Pursat", "Ratanak Kiri", "Siem Reap", "Preah Sihanouk", "Stung Treng", "Svay Rieng", "Takeo", "Oddar Meanchey", "Pailin", "Tboung Khmum" };
  private String major[] = { "Mobile Developer", "Desktop Developer", "Web Developer", "Computer Science", "Mathematic", "Accounting", "Marketing", "Public Administrator", "Management" };

  public StudentInfor() {
    initComponents();
    
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    lbDate = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    txtID = new javax.swing.JTextField();
    txtName = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    comboGender = new javax.swing.JComboBox<>();
    jLabel5 = new javax.swing.JLabel();
    txtDate = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    comboAddress = new javax.swing.JComboBox<>();
    btnNew = new javax.swing.JButton();
    btnAdd = new javax.swing.JButton();
    jLabel7 = new javax.swing.JLabel();
    comboMajor = new javax.swing.JComboBox<>();
    btnViewData = new javax.swing.JButton();
    btnClose = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    table = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Student Information");
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    lbDate.setFont(new java.awt.Font("AKbalthom KhmerGothic", 1, 18)); // NOI18N
    lbDate.setForeground(new java.awt.Color(255, 0, 0));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lbDate, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        .addContainerGap())
    );

    jLabel1.setBackground(new java.awt.Color(116, 162, 235));
    jLabel1.setFont(new java.awt.Font("AKbalthom KhmerGothic", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 0, 0));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Student's Information");
    jLabel1.setToolTipText("");

    jPanel2.setBackground(new java.awt.Color(116, 162, 235));
    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Input"));

    jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel2.setText("ID");

    txtID.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    txtID.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtIDKeyTyped(evt);
      }
    });

    txtName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    txtName.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtNameKeyTyped(evt);
      }
    });

    jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel3.setText("Name");

    jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel4.setText("Gender");

    comboGender.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

    jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel5.setText("DOB");

    txtDate.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

    jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel6.setText("Address");

    comboAddress.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    comboAddress.setMaximumRowCount(4);

    btnNew.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    btnNew.setText("New");
    btnNew.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNewActionPerformed(evt);
      }
    });

    btnAdd.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/plus_x24.png"))); // NOI18N
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddActionPerformed(evt);
      }
    });

    jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel7.setText("Major");

    comboMajor.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    comboMajor.setMaximumRowCount(4);

    btnViewData.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    btnViewData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/next_x24.png"))); // NOI18N
    btnViewData.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnViewDataActionPerformed(evt);
      }
    });

    btnClose.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/powerOff_Color_x24.png"))); // NOI18N
    btnClose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCloseActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel6)
          .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(12, 12, 12)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(comboAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(comboMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(29, 29, 29)
            .addComponent(btnViewData, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(comboAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel6))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(comboMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel7))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnAdd))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnViewData))
        .addContainerGap(60, Short.MAX_VALUE))
    );

    jPanel3.setBackground(new java.awt.Color(116, 162, 235));
    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Student List"));

    table.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
    table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {

      }
    ));
    jScrollPane1.setViewportView(table);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(11, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents
  private Runnable r = new Runnable() {
    @Override
    public void run() {
      try {
          while(true){
            Date d = new Date();
            SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss a");
            lbDate.setText(df.format(d));
            Thread.sleep(1000);
          }
      } catch (Exception e) {
      }
    }
  };
  Thread th;
  private void addCombo(JComboBox combo,String str[]){
    combo.removeAllItems();
    for(String temp:str)
      combo.addItem(temp);
  }
  private void clearText(JTextField...txt){
    for(JTextField temp:txt)
      temp.setText("");
    txt[0].requestFocus();
  }
  private void setButton(boolean b,JButton...btn){
    //b = true;
    for(JButton temp:btn)
      temp.setEnabled(b);
  }
  private boolean checkText(JTextField...txt){
    for(JTextField temp:txt){
      String str = temp.getText();
      if(str.equals("")){
        txt[0].requestFocus();
        Toolkit.getDefaultToolkit().beep();
        return false;
      }
    }
    return true;
  }
  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    ImageIcon icon = new ImageIcon("Images_Icon/SRU_100.png");
    this.setIconImage(icon.getImage());
    th = new Thread(r);
    th.start();
    ls = new ArrayList<>();
    mod = new SubDefaultTableModel();
    table.setModel(mod);
    mod.addColumn("ID");
    mod.addColumn("Name");
    mod.addColumn("Gender");
    mod.addColumn("DOB");
    mod.addColumn("Address");
    mod.addColumn("Major");
    table.setRowHeight(20);
    table.getColumnModel().getColumn(0).setPreferredWidth(40);
    table.getColumnModel().getColumn(1).setPreferredWidth(130);
    table.getColumnModel().getColumn(2).setPreferredWidth(60);
    table.getColumnModel().getColumn(3).setPreferredWidth(80);
    table.getColumnModel().getColumn(4).setPreferredWidth(120);
    table.getColumnModel().getColumn(5).setPreferredWidth(140);
    ls = StudentData.ls;
    if(ls.size()>=0){
      for(Student temp:ls)
        mod.addRow(temp.toString().split("\t"));
    }
    addCombo(comboGender, gender);
    addCombo(comboAddress, address);
    addCombo(comboMajor, major);
    //setButton(false, btnUpdate,btnRemove);
  }//GEN-LAST:event_formWindowOpened

  private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    clearText(txtID,txtName,txtDate);
    addCombo(comboGender, gender);
    addCombo(comboAddress, address);
    addCombo(comboMajor, major);
  }//GEN-LAST:event_btnNewActionPerformed
  private static boolean check(List<Student> ls){
    for(int i=0; i<ls.size(); i++)
      for(int j=0; j<i; j++)
        if(ls.get(j).getId()==ls.get(i).getId()){
          JOptionPane.showMessageDialog(null, "ID is duplicate!!!");
          ls.remove(i);
          return false;
        }
    return true;
  }
  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    if(checkText(txtID,txtName,txtDate)){
      int id = Integer.parseInt(txtID.getText());
      String name = txtName.getText();
      String gender = comboGender.getSelectedItem().toString();
      String dob = txtDate.getText();
      String address = String.valueOf(comboAddress.getSelectedItem());
      String major = comboMajor.getSelectedItem()+"";
      Student stu = new Student(id, name, gender, dob, address, major);
      ls.add(stu);
      if(check(ls)){
        mod.addRow(stu.toString().split("\t"));
        btnNewActionPerformed(evt);
      }
      txtID.selectAll();
      txtID.requestFocus();
      System.out.println(ls.size());
    }
  }//GEN-LAST:event_btnAddActionPerformed

  private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
    if(!Character.isDigit(evt.getKeyChar())){
      evt.consume();
      Toolkit.getDefaultToolkit().beep();
    }
  }//GEN-LAST:event_txtIDKeyTyped

  private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
    if(Character.isDigit(evt.getKeyChar())){
      evt.consume();
      Toolkit.getDefaultToolkit().beep();
    }
  }//GEN-LAST:event_txtNameKeyTyped

  private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
    int click = JOptionPane.showConfirmDialog(this, "Are you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
    if(click == JOptionPane.YES_OPTION)
      System.exit(0);
  }//GEN-LAST:event_btnCloseActionPerformed

  private void btnViewDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDataActionPerformed
    StudentData.ls = ls;
    StudentListInfor.main(null);
    this.dispose();
 
  }//GEN-LAST:event_btnViewDataActionPerformed

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
      java.util.logging.Logger.getLogger(StudentInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(StudentInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(StudentInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(StudentInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new StudentInfor().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAdd;
  private javax.swing.JButton btnClose;
  private javax.swing.JButton btnNew;
  private javax.swing.JButton btnViewData;
  private javax.swing.JComboBox<String> comboAddress;
  private javax.swing.JComboBox<String> comboGender;
  private javax.swing.JComboBox<String> comboMajor;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbDate;
  private javax.swing.JTable table;
  private javax.swing.JTextField txtDate;
  private javax.swing.JTextField txtID;
  private javax.swing.JTextField txtName;
  // End of variables declaration//GEN-END:variables
}
