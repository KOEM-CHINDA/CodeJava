
package Unit6.OOP.Class;

import PlugIn.SubDefaultTableModel;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author CHINDA
 */
public class StudentListInfor extends javax.swing.JFrame {

  public StudentListInfor() {
    initComponents();
  }
  private ArrayList<Student> ls;
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel3 = new javax.swing.JPanel();
    psTable = new javax.swing.JScrollPane();
    table = new javax.swing.JTable();
    btnBack = new javax.swing.JButton();
    btnRemove = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    txtSearch = new javax.swing.JTextField();
    btnSort = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    lbDate = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Student Information");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    jPanel3.setBackground(new java.awt.Color(116, 162, 235));
    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Student List"));

    table.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
    table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {

      }
    ));
    psTable.setViewportView(table);

    btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/previous_x24.png"))); // NOI18N
    btnBack.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBackActionPerformed(evt);
      }
    });

    btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Delete_x24.png"))); // NOI18N
    btnRemove.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRemoveActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel2.setText("Search Name");

    txtSearch.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtSearchKeyTyped(evt);
      }
    });

    btnSort.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
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
      .addComponent(psTable, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addComponent(psTable, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(btnBack)
              .addComponent(btnRemove)))
          .addComponent(btnSort, javax.swing.GroupLayout.Alignment.TRAILING)))
    );

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    lbDate.setBackground(new java.awt.Color(255, 0, 0));
    lbDate.setFont(new java.awt.Font("AKbalthom KhmerGothic", 1, 18)); // NOI18N
    lbDate.setForeground(new java.awt.Color(255, 0, 0));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lbDate, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        .addContainerGap())
    );

    jLabel1.setFont(new java.awt.Font("AKbalthom KhmerGothic", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(179, 34, 50));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Student Information");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents
  private Runnable r = new Runnable() {
    @Override
    public void run() {
      try {
        while (true) {          
          Date date = new Date();
          SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss a");
          lbDate.setText(sdf.format(date));
          Thread.sleep(1000);
        }
      } catch (Exception e) {
      }
    }
  };
  private  Thread th ;
  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    ImageIcon icon = new ImageIcon("Images_Icon/SRU_100.png");
    this.setIconImage(icon.getImage());
    th = new Thread(r);
    th.start();
    ls = StudentData.ls;
    DefaultTableModel mod = (DefaultTableModel)table.getModel();
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
    ls.forEach(temp -> {
      mod.addRow(temp.toString().split("\t"));
    });
    //table.setModel(mod);
  }//GEN-LAST:event_formWindowOpened

  private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      StudentData.ls = ls;
      StudentInfor.main(null);
      this.dispose(); 
  }//GEN-LAST:event_btnBackActionPerformed

  private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
    DefaultTableModel mod = (DefaultTableModel)table.getModel();
    int click = JOptionPane.showConfirmDialog(this, "Are you to remove data?", "Remove", JOptionPane.YES_NO_OPTION);
    if(click == JOptionPane.YES_OPTION){
      while(!table.getSelectionModel().isSelectionEmpty()){
        int index = table.getSelectedRow();
        mod.removeRow(index);
        ls.remove(index);
      }
    }
    System.out.println(ls.size());
  }//GEN-LAST:event_btnRemoveActionPerformed

  private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
    if(!Character.isDigit(evt.getKeyChar())){
      DefaultTableModel mod = (DefaultTableModel)table.getModel();
      String val = txtSearch.getText().trim();
      val+=evt.getKeyChar();
      val = val.toUpperCase().trim();
      TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(mod);
      table.setRowSorter(tr);
      tr.setRowFilter(RowFilter.regexFilter(val, 1));
    }else{
      evt.consume();
      Toolkit.getDefaultToolkit().beep();
    }
  }//GEN-LAST:event_txtSearchKeyTyped

  private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
    DefaultTableModel mod = (DefaultTableModel)table.getModel();
    Collections.sort(ls,new Comparator<Student>(){
      public int compare(Student stu1,Student stu2){
        return Integer.valueOf(stu1.getId()).compareTo(stu2.getId());
      }
    });
    for(int i=mod.getRowCount()-1; i>=0; i-- )
      mod.removeRow(i);
    for(Student temp:ls)
      mod.addRow(temp.toString().split("\t"));
    System.out.println(ls.size());
  }//GEN-LAST:event_btnSortActionPerformed

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
      java.util.logging.Logger.getLogger(StudentListInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(StudentListInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(StudentListInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(StudentListInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new StudentListInfor().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBack;
  private javax.swing.JButton btnRemove;
  private javax.swing.JButton btnSort;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JLabel lbDate;
  private javax.swing.JScrollPane psTable;
  private javax.swing.JTable table;
  private javax.swing.JTextField txtSearch;
  // End of variables declaration//GEN-END:variables
}
