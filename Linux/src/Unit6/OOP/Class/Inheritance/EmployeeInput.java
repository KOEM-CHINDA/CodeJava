
package Unit6.OOP.Class.Inheritance;

import PlugIn.MyInput;
import PlugIn.SubDefaultTableModel;
import PlugIn.SubJTable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author chinda
 */
public class EmployeeInput extends javax.swing.JFrame {

  private SubJTable stable;
  private SubDefaultTableModel mod;
  private EmployeeDBMS db;
  private String gender[] ={"Male","Female"};
  private String pob[] ={ "Banteay Meanchey", "Battambang", "Kampong Cham", "Kampong Chhnang", "Kampong Speu", "Kampong Thom", "Kampot", "Kandal", "Kep", "Koh Kong", "Kratie", "Mondulkiri", "Phnom Penh", "Preah Vihear", "Prey Veng", "Pursat", "Ratanak Kiri", "Siem Reap", "Preah Sihanouk", "Stung Treng", "Svay Rieng", "Takeo", "Oddar Meanchey", "Pailin", "Tboung Khmum" };
  private String pos[] = { "Mobile Developer", "Desktop Developer", "Web Developer", "Computer Science", "Mathematic", "Accounting", "Marketing", "Public Administrator", "Management" };
    public EmployeeInput() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    lbDate = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    txtID = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    txtName = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    comboGender = new javax.swing.JComboBox<>();
    jLabel4 = new javax.swing.JLabel();
    comboPOB = new javax.swing.JComboBox<>();
    jLabel5 = new javax.swing.JLabel();
    comboDay = new javax.swing.JComboBox<>();
    comboMonth = new javax.swing.JComboBox<>();
    comboYear = new javax.swing.JComboBox<>();
    jLabel6 = new javax.swing.JLabel();
    comboPostion = new javax.swing.JComboBox<>();
    jLabel7 = new javax.swing.JLabel();
    txtSalary = new javax.swing.JTextField();
    btnAdd = new javax.swing.JButton();
    btnUpdate = new javax.swing.JButton();
    btnHome = new javax.swing.JButton();
    btnPreview = new javax.swing.JButton();
    jLabel8 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    table = new SubJTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Input Data");
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    lbDate.setFont(new java.awt.Font("AKbalthom KhmerGothic", 1, 14)); // NOI18N
    lbDate.setForeground(new java.awt.Color(255, 0, 0));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    jPanel2.setBackground(new java.awt.Color(51, 51, 51));
    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
    jPanel2.setForeground(new java.awt.Color(255, 255, 255));

    jLabel1.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel1.setForeground(java.awt.Color.white);
    jLabel1.setText("ID");

    txtID.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtID.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtIDKeyTyped(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel2.setForeground(java.awt.Color.white);
    jLabel2.setText("Name");

    txtName.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtName.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtNameKeyTyped(evt);
      }
    });

    jLabel3.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel3.setForeground(java.awt.Color.white);
    jLabel3.setText("Gender");

    comboGender.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N

    jLabel4.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel4.setForeground(java.awt.Color.white);
    jLabel4.setText("POB");

    comboPOB.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N

    jLabel5.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel5.setForeground(java.awt.Color.white);
    jLabel5.setText("DOB");

    comboDay.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N

    comboMonth.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    comboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
    comboMonth.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        comboMonthActionPerformed(evt);
      }
    });

    comboYear.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    comboYear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        comboYearActionPerformed(evt);
      }
    });

    jLabel6.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel6.setForeground(java.awt.Color.white);
    jLabel6.setText("Postion");

    comboPostion.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N

    jLabel7.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel7.setForeground(java.awt.Color.white);
    jLabel7.setText("Salary");

    txtSalary.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtSalaryKeyPressed(evt);
      }
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtSalaryKeyTyped(evt);
      }
    });

    btnAdd.setBackground(new java.awt.Color(255, 255, 255));
    btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/plus_x24.png"))); // NOI18N
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddActionPerformed(evt);
      }
    });

    btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
    btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/refresh_Color_x24.png"))); // NOI18N
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnUpdateActionPerformed(evt);
      }
    });

    btnHome.setBackground(new java.awt.Color(255, 255, 255));
    btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/home_24.png"))); // NOI18N
    btnHome.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnHomeActionPerformed(evt);
      }
    });

    btnPreview.setBackground(new java.awt.Color(255, 255, 255));
    btnPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/next_x24.png"))); // NOI18N
    btnPreview.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPreviewActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(comboPostion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(comboGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(comboPOB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(comboDay, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(comboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(comboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtID))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(txtSalary)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)))))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(11, 11, 11)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(comboPOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(comboDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(comboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(comboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(comboPostion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnAdd)
          .addComponent(btnUpdate))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnHome)
          .addComponent(btnPreview))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabel8.setFont(new java.awt.Font("Kh Content", 1, 24)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 0, 0));
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel8.setText("Employee Input");

    jPanel3.setBackground(new java.awt.Color(51, 51, 51));
    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));

    table.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
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
      .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
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
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
      .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    stable.setColumnWidth(0, 50);
    stable.setColumnWidth(1, 90);
    stable.setColumnWidth(2, 50);
    stable.setColumnWidth(3, 60);
    stable.setColumnWidth(4, 110);
    stable.setColumnWidth(5, 120);
    stable.setColumnWidth(6, 50);
    setCombo(comboGender, gender);
    setCombo(comboPOB, pob);
    setCombo(comboPostion, pos);
    calendar();
    if(db.getAllEmp() != null){
      showElement(db.getAllEmp(), mod);
    }
  }//GEN-LAST:event_formWindowOpened
  
  private void comboMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMonthActionPerformed
    setDay();
  }//GEN-LAST:event_comboMonthActionPerformed

  private void comboYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboYearActionPerformed
    setDay();
  }//GEN-LAST:event_comboYearActionPerformed

  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    if(stable.getSelectionModel().isSelectionEmpty()){
      checkElement();
      clearText(txtID,txtName,txtSalary);
      calendar();
      setCombo(comboGender, gender);
      setCombo(comboPOB, pob);
      setCombo(comboPostion, pos);
      System.out.println(db.getSize());
    }else
      JOptionPane.showMessageDialog(this, "Can't Add Data in Table?", "Error", JOptionPane.ERROR_MESSAGE);
    
  }//GEN-LAST:event_btnAddActionPerformed

  private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
    MyInput.inputInteger(evt);
  }//GEN-LAST:event_txtIDKeyTyped

  private void txtSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyTyped
    MyInput.inputFloat(evt, txtSalary, 4);
  }//GEN-LAST:event_txtSalaryKeyTyped

  private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
    MyInput.inputCharacter(evt);
  }//GEN-LAST:event_txtNameKeyTyped

  private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
    int index = stable.getSelectedRow();
    EmployeeCls emp =db.getIndex(index);
    txtID.setText(emp.getId()+"");
    txtName.setText(emp.getName());
    upCombo(comboGender, emp.getGender());
    upCombo(comboPOB, emp.getPob());
    upCombo(comboPostion,emp.getPosition());    
    txtSalary.setText(emp.getSalary()+"");
  }//GEN-LAST:event_tableMouseClicked

  private void txtSalaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyPressed
    if(evt.getKeyChar() == 10)
      checkElement();
  }//GEN-LAST:event_txtSalaryKeyPressed

  private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    if(!stable.getSelectionModel().isSelectionEmpty()){
      int index = stable.getSelectedRow();
      EmployeeCls emp = db.getIndex(index);
      emp.setId(Integer.parseInt(txtID.getText()));
      emp.setName(txtName.getText());
      emp.setGender(comboGender.getSelectedItem().toString());
      emp.setPob(comboPOB.getSelectedItem().toString());
      emp.setDob(date());
      emp.setPosition(comboPostion.getSelectedItem().toString());
      emp.setSalary(Double.parseDouble(txtSalary.getText()));
      int click = JOptionPane.showConfirmDialog(this, "Do you want to update", "Update", JOptionPane.YES_NO_OPTION);
      if(click == JOptionPane.YES_OPTION){
        db.updateEmp(index, emp);
        showElement(db.getAllEmp(), mod);
        clearText(txtID,txtName,txtSalary);
        calendar();
        setCombo(comboGender, gender);
        setCombo(comboPOB, pob);
        setCombo(comboPostion, pos);
      }
      System.out.println(db.getSize());
      
    }
  }//GEN-LAST:event_btnUpdateActionPerformed

  private void btnPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviewActionPerformed
    this.dispose();
    ViewEmployee.main(null);
  }//GEN-LAST:event_btnPreviewActionPerformed

  private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
    this.dispose();
    EmloyeeLogIn.main(null);
  }//GEN-LAST:event_btnHomeActionPerformed
  private void checkElement(){
    if(addElement()!=null){
      db.addEmp(addElement());
      showElement(db.getAllEmp(), mod);
    }
  }
  private void upCombo(JComboBox combo, String str){
    for(int i=0; i<combo.getItemCount(); i++)
      if(str.equals(combo.getItemAt(i))){
        combo.setSelectedIndex(i);
        break;
      }
  }

  private void showElement(ArrayList<EmployeeCls> db, SubDefaultTableModel mod){
    mod.removeAllRows();
    for(int i=0; i<db.size(); i++){
      for(int j=0; j<i; j++){
        if(db.get(i).getId()==db.get(j).getId()){
          db.remove(i);
          JOptionPane.showMessageDialog(this, "ID is duplicat");
          txtID.selectAll();
          txtID.requestFocus();
          break;
        }
          
      }
      mod.addRow(db.get(i).toString().split("\t"));
    }
  }
  private EmployeeCls addElement(){
    if(checkText(txtID,txtName,txtSalary)){
      int  id = Integer.parseInt(txtID.getText());
      String name = txtName.getText();
      String gender = comboGender.getSelectedItem().toString();
      String pob = comboPOB.getSelectedItem().toString();
      String pos = comboPostion.getSelectedItem().toString();
      double salary = Double.parseDouble(txtSalary.getText());
      return new EmployeeCls(id, name, gender, date(), pob, pos, salary);
    }
    return null;
  }
  private void calendar(){
    Calendar calen =  Calendar.getInstance();
    int year = calen.get(calen.YEAR);
    int month = calen.get(calen.MONTH);
    int day = calen.get(calen.DATE);
    for(int i=year-30; i<=year+30; i++){
      comboYear.addItem(i+"");
    }
    comboDay.setSelectedItem(day+"");
    comboMonth.setSelectedIndex(month);
    comboYear.setSelectedItem(year+"");
  }
  private Date date(){
    Calendar calen = Calendar.getInstance();
    int day = Integer.parseInt(comboDay.getSelectedItem().toString());
    int month = comboMonth.getSelectedIndex();
    int year = Integer.parseInt(comboYear.getSelectedItem().toString());
    calen.set(year, month, day);
    Date date = calen.getTime();
    return date;
  }
  private void setDay(){
    Calendar calen = Calendar.getInstance();
    int year = Integer.parseInt(comboYear.getSelectedItem().toString());
    int month = comboMonth.getSelectedIndex();
    calen.set(year, month, 1);
    int maxDay = calen.getActualMaximum(calen.DAY_OF_MONTH);
    String backUpDay = ""+comboDay.getSelectedItem();
    int oldDay = 0;
    if(!backUpDay.equals("null"))
      oldDay = Integer.parseInt(backUpDay);
    comboDay.removeAllItems();
    for(int i=1; i<=maxDay;i++){
      comboDay.addItem(""+i);
    }
    if(oldDay>maxDay)
      comboDay.setSelectedItem(""+maxDay);
    else
      comboDay.setSelectedItem(""+oldDay);
  }
  private void clearText(JTextField ...txt){
    for(JTextField temp:txt)
      temp.setText("");
    txt[0].requestFocus();
  }
  private boolean checkText(JTextField...txt){
    for(JTextField temp:txt){
      String str = temp.getText();
      if(str.equals("")){
        temp.requestFocus();
        return false;
      }
    }
    return true;
  }
  private void setCombo(JComboBox combo,String str[]){
    combo.removeAllItems();
    for(String temp:str)
      combo.addItem(temp);
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
            java.util.logging.Logger.getLogger(EmployeeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeInput().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAdd;
  private javax.swing.JButton btnHome;
  private javax.swing.JButton btnPreview;
  private javax.swing.JButton btnUpdate;
  private javax.swing.JComboBox<String> comboDay;
  private javax.swing.JComboBox<String> comboGender;
  private javax.swing.JComboBox<String> comboMonth;
  private javax.swing.JComboBox<String> comboPOB;
  private javax.swing.JComboBox<String> comboPostion;
  private javax.swing.JComboBox<String> comboYear;
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
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbDate;
  private javax.swing.JTable table;
  private javax.swing.JTextField txtID;
  private javax.swing.JTextField txtName;
  private javax.swing.JTextField txtSalary;
  // End of variables declaration//GEN-END:variables
}
