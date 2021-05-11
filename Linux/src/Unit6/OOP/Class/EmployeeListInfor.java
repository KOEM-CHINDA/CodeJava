
package Unit6.OOP.Class;

import PlugIn.MyInput;
import PlugIn.SubJTable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CHINDA
 */
public class EmployeeListInfor extends javax.swing.JFrame {
  private ArrayList<EmployeeCls> ls;
  private DefaultTableModel mod ;
  private SubJTable stable;
  public EmployeeListInfor() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel3 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    table = new SubJTable();
    btnRemove = new javax.swing.JButton();
    btnSort = new javax.swing.JButton();
    btnBack = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    txtSearch = new javax.swing.JTextField();
    btnHome = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    lbDate = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    setTitle("Employee List Information");
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    jPanel3.setBackground(new java.awt.Color(102, 153, 255));
    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee's List"));

    table.setBackground(new java.awt.Color(102, 153, 255));
    table.setFont(new java.awt.Font("Khmer OS Content", 1, 12)); // NOI18N
    table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {

      }
    ));
    jScrollPane1.setViewportView(table);

    btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Delete_x24.png"))); // NOI18N
    btnRemove.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRemoveActionPerformed(evt);
      }
    });

    btnSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/sort_x24.png"))); // NOI18N
    btnSort.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSortActionPerformed(evt);
      }
    });

    btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/previous_x24.png"))); // NOI18N
    btnBack.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBackActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    jLabel1.setText("Search by Name");

    txtSearch.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    txtSearch.addCaretListener(new javax.swing.event.CaretListener() {
      public void caretUpdate(javax.swing.event.CaretEvent evt) {
        txtSearchCaretUpdate(evt);
      }
    });
    txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtSearchKeyTyped(evt);
      }
    });

    btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/home_24.png"))); // NOI18N
    btnHome.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnHomeActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(612, 612, 612)
        .addComponent(btnBack)
        .addGap(18, 18, 18)
        .addComponent(btnHome)
        .addGap(18, 18, 18)
        .addComponent(btnSort)
        .addGap(18, 18, 18)
        .addComponent(btnRemove)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(btnHome)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel1)
              .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(btnBack)
              .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnRemove)
                .addComponent(btnSort)))))
        .addContainerGap())
    );

    jPanel1.setBackground(new java.awt.Color(153, 255, 255));

    lbDate.setFont(new java.awt.Font("AKbalthom KhmerGothic", 1, 18)); // NOI18N
    lbDate.setForeground(new java.awt.Color(255, 0, 0));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabel2.setFont(new java.awt.Font("Khmer OS Content", 1, 24)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 0, 0));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("EMPLOYEE LIST");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents
    private Thread th = new Thread(new Runnable() {
      @Override
      public void run() {
          try {
              while(true){
                  Date date = new Date();
                  SimpleDateFormat sdf = new SimpleDateFormat("EEE dd/MMMM/YYYY hh:mm:ss a");
                  lbDate.setText(sdf.format(date));
                  Thread.sleep(1000);
              }
          } catch (Exception e) {
          }
 
      }
    });
    private void addElement(ArrayList<EmployeeCls> ls,DefaultTableModel mod){
        for(int i=mod.getRowCount()-1; i>=0; i--)
            mod.removeRow(i);
        for(EmployeeCls temp:ls)
            mod.addRow(temp.toString().split("\t"));
        stable.setModel(mod);
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        th.start();
        ls = EmployeeData.ls;
        stable = (SubJTable) table;
        mod = (DefaultTableModel)stable.getModel();
        mod.addColumn("ID");
        mod.addColumn("Name");
        mod.addColumn("Gender");
        mod.addColumn("DOB");
        mod.addColumn("POB");
        mod.addColumn("Position");
        mod.addColumn("Salary");
        stable.setRowHeight(20);
        stable.setColumnWidth(0, 40);
        stable.setColumnWidth(1, 120);
        stable.setColumnWidth(2, 40);
        stable.setColumnWidth(3, 80);
        stable.setColumnWidth(4, 130);
        stable.setColumnWidth(5, 120);  
        stable.setColumnWidth(6, 60);
        for(EmployeeCls temp:ls)
            mod.addRow(temp.toString().split("\t"));
    }//GEN-LAST:event_formWindowOpened

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        for(int i=0; i<ls.size(); i++)
            for(int j=i+1; j<ls.size(); j++)
                if(ls.get(i).getName().compareTo(ls.get(j).getName())>0){
                    EmployeeCls emp = ls.get(i);
                    ls.set(i, ls.get(j));
                    ls.set(j, emp);
                }
        addElement(ls, mod);
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        EmployeeData.ls = ls;
        this.dispose();
        EmployeeInput.main(null);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
       while(!stable.getSelectionModel().isSelectionEmpty()){
           int index = stable.getSelectedRow();
           int click = JOptionPane.showConfirmDialog(this, "Are you want to remove?", "Remove", JOptionPane.YES_NO_OPTION);
           if(click == JOptionPane.YES_OPTION){
            mod.removeRow(index);
            ls.remove(index);
           }
       }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchCaretUpdate
        String str = txtSearch.getText().trim();
        str = str.toLowerCase().trim();
        ArrayList<EmployeeCls> ls1 = new ArrayList<>();
        if(str.equals("")){
            addElement(ls, mod);
            return;
        }
        for(int i=0; i<ls.size(); i++){
            if(str.length()>ls.get(i).getName().length())
                continue;
            String str1 = ls.get(i).getName().substring(0, str.length());
                if(str.equals(str1)){
                    ls1.add(ls.get(i));
                }
            }
        addElement(ls1, mod);
       
        
    }//GEN-LAST:event_txtSearchCaretUpdate

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        EmployeeLogIn.main(null);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int click = JOptionPane.showConfirmDialog(this, "Do you want to exit", "Exit", JOptionPane.YES_NO_OPTION);
        if(click == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
       MyInput.inputCharacter(evt);
    }//GEN-LAST:event_txtSearchKeyTyped

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
      java.util.logging.Logger.getLogger(EmployeeListInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(EmployeeListInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(EmployeeListInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(EmployeeListInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new EmployeeListInfor().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBack;
  private javax.swing.JButton btnHome;
  private javax.swing.JButton btnRemove;
  private javax.swing.JButton btnSort;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbDate;
  private javax.swing.JTable table;
  private javax.swing.JTextField txtSearch;
  // End of variables declaration//GEN-END:variables
}
