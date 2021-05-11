
package MySQL.DBMS.Employee;

import Unit6.OOP.Class.Inheritance.*;
import PlugIn.SubDefaultTableModel;
import PlugIn.SubJTable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author CHINDA
 */
public class ViewEmployee extends javax.swing.JFrame {

  
  public ViewEmployee() {
    initComponents();
  }
  private SubJTable stable;
  private SubDefaultTableModel mod;
  private ArrayList<EmployeeCls> ls;
  private EmployeeDBMS db;
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel3 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    table = new SubJTable();
    jLabel1 = new javax.swing.JLabel();
    txtSearchName = new javax.swing.JTextField();
    btnHome = new javax.swing.JButton();
    btnRemove = new javax.swing.JButton();
    btnBack = new javax.swing.JButton();
    btnSort = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    lbDate = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("View List");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    jPanel3.setBackground(new java.awt.Color(51, 51, 51));
    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));

    table.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
    table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {

      }
    ));
    jScrollPane1.setViewportView(table);

    jLabel1.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Search Name");

    txtSearchName.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtSearchName.addCaretListener(new javax.swing.event.CaretListener() {
      public void caretUpdate(javax.swing.event.CaretEvent evt) {
        txtSearchNameCaretUpdate(evt);
      }
    });

    btnHome.setBackground(new java.awt.Color(255, 255, 255));
    btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/home_24.png"))); // NOI18N
    btnHome.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnHomeActionPerformed(evt);
      }
    });

    btnRemove.setBackground(new java.awt.Color(255, 255, 255));
    btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Delete_x24.png"))); // NOI18N
    btnRemove.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRemoveActionPerformed(evt);
      }
    });

    btnBack.setBackground(new java.awt.Color(255, 255, 255));
    btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/previous_x24.png"))); // NOI18N
    btnBack.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBackActionPerformed(evt);
      }
    });

    btnSort.setBackground(new java.awt.Color(255, 255, 255));
    btnSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/sort_x24.png"))); // NOI18N
    btnSort.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSortActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnHome)
          .addComponent(btnRemove)
          .addComponent(btnBack)
          .addComponent(btnSort))
        .addContainerGap(12, Short.MAX_VALUE))
    );

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    lbDate.setFont(new java.awt.Font("AKbalthom KhmerGothic", 1, 14)); // NOI18N
    lbDate.setForeground(new java.awt.Color(255, 0, 0));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(620, Short.MAX_VALUE)
        .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lbDate, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    ImageIcon icon = new ImageIcon("src/Images_Icon/SRU_100.png");
    this.setIconImage(icon.getImage());
    th.start();
    stable = (SubJTable) table;
    mod = new SubDefaultTableModel();
    stable.setModel(mod);
    db = new EmployeeDBMS();
    mod.addColumn("ID");
    mod.addColumn("Name");
    mod.addColumn("Gender");
    mod.addColumn("POB");
    mod.addColumn("DOB");
    mod.addColumn("Position");
    mod.addColumn("Salary");
    stable.setRowHeight(20);
    stable.setColumnWidth(0, 30);
    stable.setColumnWidth(1, 100);
    stable.setColumnWidth(2, 50);
    stable.setColumnWidth(3, 60);
    stable.setColumnWidth(4, 110);
    stable.setColumnWidth(5, 120);
    stable.setColumnWidth(6, 50);
    setTable(db.getAllEmp(), mod);
  }//GEN-LAST:event_formWindowOpened

  private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
    this.dispose();
    EmployeeInput.main(null);
  }//GEN-LAST:event_btnBackActionPerformed

  private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
    if(stable.getSelectedRow()>-1){
      int click = JOptionPane.showConfirmDialog(this, "Do you want to remove?", "Remove", JOptionPane.YES_NO_OPTION);
      if(click == JOptionPane.YES_OPTION)
        while(!stable.getSelectionModel().isSelectionEmpty()){
          int index = stable.getSelectedRow();
          db.removeEmp(index);
          mod.removeRow(index);
        }
      else
        stable.clearSelection();
    }
  }//GEN-LAST:event_btnRemoveActionPerformed

  private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
    db.sortByName();
    setTable(db.getAllEmp(), mod);
  }//GEN-LAST:event_btnSortActionPerformed

  private void txtSearchNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchNameCaretUpdate
    setTable(db.getFilterName(txtSearchName.getText()), mod);
            
  }//GEN-LAST:event_txtSearchNameCaretUpdate

  private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
    this.dispose();
    EmloyeeLogIn.main(null);
  }//GEN-LAST:event_btnHomeActionPerformed
  private void setTable(ArrayList<EmployeeCls> ls, SubDefaultTableModel mod){
    mod.removeAllRows();
    for(int i=0; i<ls.size(); i++)
      mod.addRow(ls.get(i).toString().split("\t"));
  }
  private Thread th = new Thread(new Runnable() {
    @Override
    public void run() {
      try {
        while(true){
          Date date = new Date();
          SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss a");
          lbDate.setText(sdf.format(date));
          Thread.sleep(1000);
        }
      } catch (Exception e) {
      }
      }
  });
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
      java.util.logging.Logger.getLogger(ViewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ViewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ViewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ViewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ViewEmployee().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBack;
  private javax.swing.JButton btnHome;
  private javax.swing.JButton btnRemove;
  private javax.swing.JButton btnSort;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbDate;
  private javax.swing.JTable table;
  private javax.swing.JTextField txtSearchName;
  // End of variables declaration//GEN-END:variables
}
