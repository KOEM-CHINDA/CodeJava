
package Unit5.Methods;

import PlugIn.SubDefaultTableModel;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author chinda
 */
public class EmployeeInfor extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    public EmployeeInfor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    txtID = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txtName = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    comboGender = new javax.swing.JComboBox<>();
    comboAddress = new javax.swing.JComboBox<>();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    comboPosition = new javax.swing.JComboBox<>();
    btnNew = new javax.swing.JButton();
    btnInsert = new javax.swing.JButton();
    btnUpdate = new javax.swing.JButton();
    btnDelete = new javax.swing.JButton();
    jLabel8 = new javax.swing.JLabel();
    lbSalary = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    table = new javax.swing.JTable();
    jPanel4 = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    txtSearchName = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    setTitle("Employee Information");
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

    jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Employee Information");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(14, 14, 14)
        .addComponent(jLabel1)
        .addContainerGap(20, Short.MAX_VALUE))
    );

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee Input"));

    jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    jLabel2.setText("ID");

    txtID.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    txtID.setText("12");

    jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    jLabel3.setText("Name");

    txtName.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    txtName.setText("koem chinda");
    txtName.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtNameKeyTyped(evt);
      }
    });

    jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    jLabel4.setText("Gender");

    comboGender.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N

    comboAddress.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N

    jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    jLabel5.setText("Adress");

    jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    jLabel6.setText("Position");

    comboPosition.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    comboPosition.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        comboPositionActionPerformed(evt);
      }
    });

    btnNew.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    btnNew.setText("New");
    btnNew.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNewActionPerformed(evt);
      }
    });

    btnInsert.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    btnInsert.setText("Insert");
    btnInsert.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnInsertActionPerformed(evt);
      }
    });

    btnUpdate.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    btnUpdate.setText("Update");
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnUpdateActionPerformed(evt);
      }
    });

    btnDelete.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    btnDelete.setText("Delete");
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDeleteActionPerformed(evt);
      }
    });

    jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    jLabel8.setText("Salary");

    lbSalary.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    lbSalary.setText("$ 00.00");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                  .addGap(26, 26, 26))
                .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jLabel2)
                  .addGap(78, 78, 78)))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel3)
                  .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(txtID)
              .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
              .addComponent(lbSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(comboPosition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(comboAddress, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(comboGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btnNew)
            .addGap(18, 18, 18)
            .addComponent(btnInsert)
            .addGap(18, 18, 18)
            .addComponent(btnUpdate)
            .addGap(18, 18, 18)
            .addComponent(btnDelete)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(comboAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(comboPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(lbSalary))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnNew)
          .addComponent(btnInsert)
          .addComponent(btnUpdate)
          .addComponent(btnDelete))
        .addGap(20, 20, 20))
    );

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));
    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee Infor"));

    table.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
    table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {

      }
    ));
    table.setRowHeight(20);
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
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addComponent(jScrollPane1)
        .addContainerGap())
    );

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));
    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

    jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    jLabel7.setText("Search Name");

    txtSearchName.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
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
        .addComponent(jLabel7)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(26, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents
    SubDefaultTableModel mod;
    ArrayList<String> ls = new ArrayList<>();
    private String position[] = {"Moble App","Computer App","Web Developer","Accounting"};
    private String gender[] =  {"Male","Female"};
    private String address[] = { "Banteay Meanchey", "Battambang", "Kampong Cham", "Kampong Chhnang", "Kampong Speu", "Kampong Thom", "Kampot", "Kandal", "Kep", "Koh Kong", "Kratie", "Mondulkiri", "Phnom Penh", "Preah Vihear", "Prey Veng", "Pursat", "Ratanak Kiri", "Siem Reap", "Preah Sihanouk", "Stung Treng", "Svay Rieng", "Takeo", "Oddar Meanchey", "Pailin", "Tboung Khmum" };
    private String salary[] ={"$800.00","$500.00","$600.00","$350.00"};
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        mod = new SubDefaultTableModel();
        table.setModel(mod);
        mod.addColumn("No");
        mod.addColumn("ID");
        mod.addColumn("Name");
        mod.addColumn("Gender");
        mod.addColumn("Address");
        mod.addColumn("Position");
        mod.addColumn("Salary");
        table.getColumnModel().getColumn(0).setPreferredWidth(20);
        table.getColumnModel().getColumn(1).setPreferredWidth(30);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(40);
        table.getColumnModel().getColumn(4).setPreferredWidth(130);
        setComboBox(comboGender, gender);
        setComboBox(comboAddress, address);
        setComboBox(comboPosition, position);
        checkButton(false, btnUpdate,btnDelete);
    }//GEN-LAST:event_formWindowOpened
    private void refresh(ArrayList ls,SubDefaultTableModel mod){
        int n = 1;
        mod.removeAllRows();
        for(int i=0; i<ls.size(); i+=6){
            for(int j=0; j<i; j+=6)
                //id not Duplicat
               if(ls.get(j).equals(ls.get(i))){
                   JOptionPane.showMessageDialog(this, "ID is duplicate");
                   for(int k=6-1; k>=0; k--)
                       ls.remove(i+k);
                       //ls.remove(k);
                   txtID.selectAll();
                   txtID.requestFocus();
                   return;
               }
            mod.addRow(new Object[]{n,ls.get(i),ls.get(i+1),ls.get(i+2),ls.get(i+3),ls.get(i+4),ls.get(i+5)});
            
            n++;
        }
        table.setModel(mod);
        clearText(txtID,txtName);
    }
    private void setComboBox(JComboBox combo,String[] str){
        combo.removeAllItems();
        for(String temp:str)
            combo.addItem(temp);
    }
    private boolean check(JTextField... txt){
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
    private void clearText(JTextField... txt){
        for(JTextField temp:txt){
            temp.setText("");
            txt[0].requestFocus();
        }
    }
    private void checkButton(boolean b,JButton... btn){
        for(JButton temp:btn)
            temp.setEnabled(b);
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int click = JOptionPane.showConfirmDialog(this, "Do you want to exit", "Exit", JOptionPane.YES_NO_OPTION);
        if(click  == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if(check(txtID,txtName)){
            ls.add(txtID.getText());
            ls.add(txtName.getText());
            ls.add(comboGender.getSelectedItem().toString());
            ls.add(comboAddress.getSelectedItem().toString());
            ls.add(comboPosition.getSelectedItem().toString());
            ls.add(lbSalary.getText());
            refresh(ls, mod);
            
            checkButton(false, btnUpdate,btnDelete);
            setComboBox(comboGender, gender);
            setComboBox(comboAddress, address);
            //setComboBox(comboPosition, position);
            System.out.println(ls.size());
            
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        if(Character.isDigit(evt.getKeyChar())){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void comboPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPositionActionPerformed
      lbSalary.setText(salary[comboPosition.getSelectedIndex()]);
    }//GEN-LAST:event_comboPositionActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clearText(txtID,txtName);
        setComboBox(comboGender, gender);
        setComboBox(comboAddress, address);
        checkButton(false, btnUpdate,btnDelete);
        checkButton(true, btnInsert);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       if(!table.getSelectionModel().isSelectionEmpty()){
           int index = table.getSelectedRow()*6;
           int click = JOptionPane.showConfirmDialog(this, "Do you to want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
           if(click == JOptionPane.YES_OPTION){
            for(int i=5; i>=0; i--)
                 ls.remove(index+i);
             refresh(ls, mod);
           }
           clearText(txtID,txtName);
       }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        txtID.setText(mod.getValueAt(table.getSelectedRow(), 1).toString());
        txtName.setText(mod.getValueAt(table.getSelectedRow(), 2).toString());
        txtID.selectAll();
        txtID.requestFocus();
        checkButton(true, btnUpdate,btnDelete);
        checkButton(false, btnInsert);
    }//GEN-LAST:event_tableMouseClicked

    private void txtSearchNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchNameKeyPressed
        TableRowSorter<SubDefaultTableModel> tr = new TableRowSorter<>(mod);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearchName.getText(), 2));
    }//GEN-LAST:event_txtSearchNameKeyPressed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(!table.getSelectionModel().isSelectionEmpty()){
            int index = table.getSelectedRow()*6;
            int click = JOptionPane.showConfirmDialog(this, "Do you want to update data?", "Update", JOptionPane.YES_NO_OPTION);
            if(click == JOptionPane.YES_OPTION){
                ls.set(index, txtID.getText());
                ls.set(index+1, txtName.getText());
                ls.set(index+2, comboGender.getSelectedItem().toString());
                ls.set(index+3, comboAddress.getSelectedItem().toString());
                ls.set(index+4, comboPosition.getSelectedItem().toString());
                ls.set(index+5, lbSalary.getText());
                refresh(ls, mod);
                table.setModel(mod);
            }
            clearText(txtID,txtName);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeInfor().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnDelete;
  private javax.swing.JButton btnInsert;
  private javax.swing.JButton btnNew;
  private javax.swing.JButton btnUpdate;
  private javax.swing.JComboBox<String> comboAddress;
  private javax.swing.JComboBox<String> comboGender;
  private javax.swing.JComboBox<String> comboPosition;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbSalary;
  private javax.swing.JTable table;
  private javax.swing.JTextField txtID;
  private javax.swing.JTextField txtName;
  private javax.swing.JTextField txtSearchName;
  // End of variables declaration//GEN-END:variables
}
