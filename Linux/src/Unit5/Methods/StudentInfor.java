
package Unit5.Methods;

import PlugIn.SubDefaultTableModel;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author CHINDA
 */
public class StudentInfor extends javax.swing.JFrame {

  SubDefaultTableModel mod;
  ArrayList<String> ls = new ArrayList<>();
  public StudentInfor() {
    initComponents();
  }
  private String address[] = { "Banteay Meanchey", "Battambang", "Kampong Cham", "Kampong Chhnang", "Kampong Speu", "Kampong Thom", "Kampot", "Kandal", "Kep", "Koh Kong", "Kratie", "Mondulkiri", "Phnom Penh", "Preah Vihear", "Prey Veng", "Pursat", "Ratanak Kiri", "Siem Reap", "Preah Sihanouk", "Stung Treng", "Svay Rieng", "Takeo", "Oddar Meanchey", "Pailin", "Tboung Khmum" };
  private String gender[] = {"Male","Female"};
  private void checkButton(boolean b, JButton...btn){
    for(JButton temp:btn)
      temp.setEnabled(b);
  }
  private boolean checkText(JTextField...txt){
    for(JTextField temp:txt){
      String str = temp.getText().trim();
      if(str.equals("")){
        Toolkit.getDefaultToolkit().beep();
        txt[0].requestFocus();
        return false;
      }
    }
    return true;
  }
  private void clearText(JTextField...txt){
    for(JTextField temp:txt)
      temp.setText("");
    txt[0].requestFocus();
  }
  private void addComboBox(JComboBox combo,String[] str){
    combo.removeAllItems();
    for(String temp:str)
      combo.addItem(temp);
  }
  private void eventCharacter(JTextField txt, KeyEvent evt){
    if(Character.isDigit(evt.getKeyChar())){
      evt.consume();
      Toolkit.getDefaultToolkit().beep();
    }
  }
  private void eventPhone(KeyEvent evt,JTextField txt,int length){
    if(!Character.isDigit(evt.getKeyChar())){
      evt.consume();
      Toolkit.getDefaultToolkit().beep();
    }
    else{
      String str = txt.getText();
      if(!str.equals(""))
        if(str.length()>length-1){
          evt.consume();
          Toolkit.getDefaultToolkit().beep();
        }
    }
  }
  private void addElement(ArrayList ls,SubDefaultTableModel mod){
    int n = 1;
    mod.removeAllRows();
    for(int i=0; i<ls.size(); i+=6){
      for(int j=0; j<i; j+=6){
        if(ls.get(j).equals(ls.get(i))){
          JOptionPane.showMessageDialog(this, "ID is Duplicate!!");
          for(int k=6-1; k>=0; k--)
            ls.remove(i+k);
          /*
          plus i
          row 1 has 6 elements
          i+k
          example: list has 6 element{0->5}
          if(row 1 has id is duplicate row 0)
            row 0 has index   0 1 2
            row 0 has element 1 2 3
            row 1 has index   3 4 5
            row 1 has element 0 1 2
            i=0+3;
               i+k that k=3-1; k>=0; k--
                   remove index in array list
                   k=2=>k+3 = 5
                   k=1=>k+3 = 4
                   k=0=>k+3 = 3
                   
          */
          txtID.selectAll();
          txtID.requestFocus();
          return;
        }
      }
       mod.addRow(new Object[]{n,ls.get(i),ls.get(i+1),ls.get(i+2),ls.get(i+3),ls.get(i+4),ls.get(i+5)});
       n++;
    }
    clearText(txtID,txtName,txtDOB,txtPhone);
    table.setModel(mod);
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    txtID = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtName = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    comboGender = new javax.swing.JComboBox<>();
    jLabel6 = new javax.swing.JLabel();
    comboAddress = new javax.swing.JComboBox<>();
    jLabel7 = new javax.swing.JLabel();
    txtDOB = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    txtPhone = new javax.swing.JTextField();
    btnNew = new javax.swing.JButton();
    btnAdd = new javax.swing.JButton();
    btnDelete = new javax.swing.JButton();
    btnUpdate = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    table = new javax.swing.JTable();
    jPanel4 = new javax.swing.JPanel();
    jLabel9 = new javax.swing.JLabel();
    txtSearchName = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Java\\Y2S1\\src\\Images_Icon\\SRU_64.png")); // NOI18N
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

    jLabel1.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("SVAY REING UNIVERSITY");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, 970, -1));

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Infor"));

    jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel3.setText("ID");

    txtID.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    txtID.setText("12");

    jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel4.setText("Name");

    txtName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    txtName.setText("phat srey neang");
    txtName.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtNameKeyTyped(evt);
      }
    });

    jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel5.setText("Gender");

    comboGender.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    comboGender.setMaximumRowCount(2);

    jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel6.setText("Address");

    comboAddress.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    comboAddress.setMaximumRowCount(6);

    jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel7.setText("DOB");

    txtDOB.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    txtDOB.setText("12/04/2000");

    jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel8.setText("Telephone");

    txtPhone.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPhoneKeyTyped(evt);
      }
    });

    btnNew.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    btnNew.setText("New");
    btnNew.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNewActionPerformed(evt);
      }
    });

    btnAdd.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    btnAdd.setText("Add");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddActionPerformed(evt);
      }
    });

    btnDelete.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    btnDelete.setText("Delete");
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDeleteActionPerformed(evt);
      }
    });

    btnUpdate.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    btnUpdate.setText("Update");
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnUpdateActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(48, 48, 48)
              .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(27, 27, 27)
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtDOB)
                .addComponent(comboAddress, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(txtPhone)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete)))))
        .addGap(0, 48, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel7))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(comboAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel8))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnNew)
          .addComponent(btnAdd))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnUpdate)
          .addComponent(btnDelete))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Student List"));

    table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {

      }
    ));
    table.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tableMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(table);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addComponent(jScrollPane1)
        .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1)
        .addContainerGap())
    );

    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Name"));

    jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel9.setText("Name");

    txtSearchName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    txtSearchName.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtSearchNameKeyPressed(evt);
      }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(27, 27, 27)
        .addComponent(txtSearchName)
        .addGap(42, 42, 42))
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel9))
        .addContainerGap(16, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(0, 26, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    mod = new SubDefaultTableModel();
    table.setModel(mod);
    mod.addColumn("No");
    mod.addColumn("ID");
    mod.addColumn("Name");
    mod.addColumn("Gender");
    mod.addColumn("DOB");
    mod.addColumn("Address");
    mod.addColumn("Telephone");
    table.getColumnModel().getColumn(0).setPreferredWidth(40);
    table.getColumnModel().getColumn(1).setPreferredWidth(50);
    table.getColumnModel().getColumn(2).setPreferredWidth(120);
    table.getColumnModel().getColumn(3).setPreferredWidth(80);
    table.getColumnModel().getColumn(4).setPreferredWidth(100);
    table.getColumnModel().getColumn(5).setPreferredWidth(140);
    table.getColumnModel().getColumn(6).setPreferredWidth(130);
    addComboBox(comboGender, gender);
    addComboBox(comboAddress, address);
    checkButton(false, btnUpdate,btnDelete);
  }//GEN-LAST:event_formWindowOpened

  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    if(checkText(txtID,txtName,txtDOB)){
      ls.add(txtID.getText().trim());
      ls.add(txtName.getText().trim());
      ls.add(comboGender.getSelectedItem().toString());
      ls.add(txtDOB.getText().trim());
      ls.add(comboAddress.getSelectedItem().toString());
      ls.add(txtPhone.getText().trim());
      addElement(ls, mod);
      clearText(txtID,txtName,txtDOB,txtPhone);
      addComboBox(comboGender, gender);
      addComboBox(comboAddress, address);
    }
    
  }//GEN-LAST:event_btnAddActionPerformed

  private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    int click = JOptionPane.showConfirmDialog(this, "Do you want to exit", "Exit", JOptionPane.YES_NO_OPTION);
    if(click == JOptionPane.YES_OPTION)
      System.exit(0);
  }//GEN-LAST:event_formWindowClosing

  private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
    eventPhone(evt, txtPhone, 10);
  }//GEN-LAST:event_txtPhoneKeyTyped

  private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
    eventCharacter(txtName, evt);
  }//GEN-LAST:event_txtNameKeyTyped

  private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    clearText(txtID,txtName,txtDOB,txtPhone);
    addComboBox(comboGender, gender);
    addComboBox(comboAddress, address);
    checkButton(false, btnUpdate,btnDelete);
    checkButton(true, btnAdd);
  }//GEN-LAST:event_btnNewActionPerformed

  private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
    txtID.setText(mod.getValueAt(table.getSelectedRow(), 1).toString());
    txtName.setText(mod.getValueAt(table.getSelectedRow(), 2).toString());
    txtDOB.setText(mod.getValueAt(table.getSelectedRow(), 4).toString());
    txtPhone.setText(mod.getValueAt(table.getSelectedRow(), 6).toString());
    txtID.selectAll();
    txtID.requestFocus();
    checkButton(true, btnUpdate,btnDelete);
    checkButton(false, btnAdd);
  }//GEN-LAST:event_tableMouseClicked

  private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    if(!table.getSelectionModel().isSelectionEmpty()){
      int index = table.getSelectedRow()*6;
      int click = JOptionPane.showConfirmDialog(this, "Are you sure to update", "Update", JOptionPane.YES_NO_OPTION);
      if(click == JOptionPane.YES_OPTION){
        ls.set(index, txtID.getText());
        ls.set(index+1, txtName.getText());
        ls.set(index+2, comboGender.getSelectedItem().toString());
        ls.set(index+3, txtDOB.getText());
        ls.set(index+4, comboAddress.getSelectedItem().toString());
        ls.set(index+5, txtPhone.getText());
        addElement(ls, mod);
        table.setModel(mod);
        checkButton(false, btnUpdate,btnDelete);
        checkButton(true, btnAdd);
      }
    }
  }//GEN-LAST:event_btnUpdateActionPerformed

  private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    if(!table.getSelectionModel().isSelectionEmpty()){
      int index = table.getSelectedRow()*6;
      for(int i=6-1; i>=0; i--)
        ls.remove(index+i);
      addElement(ls, mod);
      table.setModel(mod);
      checkButton(false, btnUpdate,btnDelete);
      checkButton(true, btnAdd);
    }
  }//GEN-LAST:event_btnDeleteActionPerformed

  private void txtSearchNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchNameKeyPressed
    TableRowSorter<SubDefaultTableModel> tr = new TableRowSorter<>(mod);
    table.setRowSorter(tr);
    tr.setRowFilter(RowFilter.regexFilter(txtSearchName.getText(), 2));
  }//GEN-LAST:event_txtSearchNameKeyPressed

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
  private javax.swing.JButton btnDelete;
  private javax.swing.JButton btnNew;
  private javax.swing.JButton btnUpdate;
  private javax.swing.JComboBox<String> comboAddress;
  private javax.swing.JComboBox<String> comboGender;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable table;
  private javax.swing.JTextField txtDOB;
  private javax.swing.JTextField txtID;
  private javax.swing.JTextField txtName;
  private javax.swing.JTextField txtPhone;
  private javax.swing.JTextField txtSearchName;
  // End of variables declaration//GEN-END:variables
}
