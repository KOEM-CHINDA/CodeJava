
package Unit4.Array;

import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CHINDA
 */
public class StudentMagament extends javax.swing.JFrame {

  /**
   * Creates new form StudentMagament
   */
  DefaultTableModel mod;
  String sub[] ={"IT", "MATH","ACCOUNTING"};
  String gen[] = {"Male","Female"};
  public StudentMagament() {
    initComponents();
    mod = (DefaultTableModel)table.getModel();
    for(String temp:gen)
      comboGender.addItem(temp);
    for(String temp:sub)
      comboDEP.addItem(temp);
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    lbName = new javax.swing.JLabel();
    txtName = new javax.swing.JTextField();
    lbGender = new javax.swing.JLabel();
    comboGender = new javax.swing.JComboBox<>();
    lbDOB = new javax.swing.JLabel();
    txtDOB = new javax.swing.JTextField();
    lbDEP = new javax.swing.JLabel();
    comboDEP = new javax.swing.JComboBox<>();
    btnAdd = new javax.swing.JButton();
    btnSearch = new javax.swing.JButton();
    btnUpdate = new javax.swing.JButton();
    btnSort = new javax.swing.JButton();
    btnClose = new javax.swing.JButton();
    btnRemove = new javax.swing.JButton();
    btnView = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    table = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Kh Content", 1, 24)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("STUDENT MANAGENMENT");

    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbName.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    lbName.setText("NAME");
    jPanel1.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 120, -1));

    txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 150, -1));

    lbGender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbGender.setText("GENDER");
    jPanel1.add(lbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 63, 120, -1));

    comboGender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel1.add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 58, 150, -1));

    lbDOB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbDOB.setText("DOB");
    jPanel1.add(lbDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 114, 120, -1));

    txtDOB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel1.add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 108, 150, -1));

    lbDEP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbDEP.setText("DEP");
    jPanel1.add(lbDEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 165, 120, -1));

    comboDEP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel1.add(comboDEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 150, -1));

    btnAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btnAdd.setText("ADD");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddActionPerformed(evt);
      }
    });
    jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 80, -1));

    btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btnSearch.setText("Search");
    btnSearch.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSearchActionPerformed(evt);
      }
    });
    jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 80, -1));

    btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btnUpdate.setText("Update");
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnUpdateActionPerformed(evt);
      }
    });
    jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 80, -1));

    btnSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btnSort.setText("Sort");
    btnSort.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSortActionPerformed(evt);
      }
    });
    jPanel1.add(btnSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 80, -1));

    btnClose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btnClose.setText("Exit");
    btnClose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCloseActionPerformed(evt);
      }
    });
    jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 80, -1));

    btnRemove.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btnRemove.setText("Remove");
    btnRemove.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRemoveActionPerformed(evt);
      }
    });
    jPanel1.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 80, -1));

    btnView.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btnView.setText("View Back");
    btnView.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnViewActionPerformed(evt);
      }
    });
    jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 80, -1));

    table.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "No", "Name", "Gender", "DOB", "DEP"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, true, true, true, true
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    table.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tableMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(table);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
  int index = 0;
  String name[] = new String[100];
  String gender[] = new String[100];
  String dob[] = new String[100];
  String dep[] = new String[100];
  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    name[index] = txtName.getText();
    gender[index] = ""+comboGender.getSelectedItem();
    dob[index] = txtDOB.getText();
    dep[index] = ""+comboDEP.getSelectedItem();
    mod.addRow(new Object[]{index+1,name[index],gender[index],dob[index],dep[index]});
    System.out.println(Arrays.toString(new Object[]{index+1,name[index],gender[index],dob[index],dep[index]}));
    index++;
  }//GEN-LAST:event_btnAddActionPerformed

  private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
    while(!table.getSelectionModel().isSelectionEmpty()){
      int x = table.getSelectedRow();
      mod.removeRow(x);
      for(int i=0; i<index; i++){
        if(x==i){
          for(int j=i+1; j<index; j++,i++){
            name[i] = name[j]; 
            gender[i] = gender[j];
            dob[i] = dob[j];
            dep[i] = dep[j];
          }
          index--;
          break;
        }
      }
    }
  }//GEN-LAST:event_btnRemoveActionPerformed
  int id = 0;
  private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    if(table.getSelectedRowCount()==1){
      String upName = txtName.getText();
      String upGender = ""+comboGender.getSelectedItem();
      String upDob = txtDOB.getText();
      String upDep = ""+comboDEP.getSelectedItem();
      mod.setValueAt(upName, table.getSelectedRow(), 1);
      mod.setValueAt(upGender, table.getSelectedRow(), 2);
      mod.setValueAt(upDob, table.getSelectedRow(), 3);
      mod.setValueAt(upDep, table.getSelectedRow(), 4);
      for(int i=0; i<index; i++){
        if(id==i){
          name[i] = upName;
          gender[i] = upGender;
          dob[i] = upDob;
          dep[i] = upDep;
        }
      }
    }
  }//GEN-LAST:event_btnUpdateActionPerformed

  private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
    id = table.getSelectedRow();
    String upName = mod.getValueAt(table.getSelectedRow(), 1).toString();
    String upDob = mod.getValueAt(table.getSelectedRow(), 3).toString();
    txtName.setText(upName);
    txtDOB.setText(upDob);
    
  }//GEN-LAST:event_tableMouseClicked

  private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
    int click = JOptionPane.showConfirmDialog(this, "Do you to exit", "Exit", JOptionPane.YES_NO_OPTION);
    if(click == JOptionPane.YES_OPTION)
      System.exit(0);
  }//GEN-LAST:event_btnCloseActionPerformed

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    ImageIcon icon = new ImageIcon("Images_Icon/Black_user_64.png");
    this.setIconImage(icon.getImage());
  }//GEN-LAST:event_formWindowOpened

  private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    if(id>=0){
      for(int i=0; i<index; i++)
        if(id==i)
          System.out.println(i+1+"\t"+name[i]+"\t"+gender[i]+"\t"+dob[i]+"\t"+dep[i]);
    }else{
      Toolkit.getDefaultToolkit().beep();
      JOptionPane.showMessageDialog(this, "Please select data into table");
    }    
      
    
  }//GEN-LAST:event_btnSearchActionPerformed

  private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
    if(index>=0){
      
    }else{
      Toolkit.getDefaultToolkit().beep();
      JOptionPane.showMessageDialog(this, "Please select data into table");
    }
  }//GEN-LAST:event_btnSortActionPerformed

  private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
   System.out.println("----------------------------");
    for(int i=0; i<index; i++)
      System.out.println(name[i]+"\t"+gender[i]+"\t"+dob[i]+"\t"+dep[i]);
  }//GEN-LAST:event_btnViewActionPerformed

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
      java.util.logging.Logger.getLogger(StudentMagament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(StudentMagament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(StudentMagament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(StudentMagament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new StudentMagament().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAdd;
  private javax.swing.JButton btnClose;
  private javax.swing.JButton btnRemove;
  private javax.swing.JButton btnSearch;
  private javax.swing.JButton btnSort;
  private javax.swing.JButton btnUpdate;
  private javax.swing.JButton btnView;
  private javax.swing.JComboBox<String> comboDEP;
  private javax.swing.JComboBox<String> comboGender;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbDEP;
  private javax.swing.JLabel lbDOB;
  private javax.swing.JLabel lbGender;
  private javax.swing.JLabel lbName;
  private javax.swing.JTable table;
  private javax.swing.JTextField txtDOB;
  private javax.swing.JTextField txtName;
  // End of variables declaration//GEN-END:variables
}
