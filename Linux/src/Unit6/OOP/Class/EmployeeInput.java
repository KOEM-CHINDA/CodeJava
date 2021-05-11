
package Unit6.OOP.Class;

import PlugIn.MyInput;
import PlugIn.SubDefaultTableModel;
import PlugIn.SubJTable;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author CHINDA
 */
public class EmployeeInput extends javax.swing.JFrame {

  private SubJTable stable;
  private SubDefaultTableModel mod;
  private ArrayList<EmployeeCls> ls;
  private EmployeeCls emp;
  public EmployeeInput() {
    initComponents();
    th.start();
    setLocationRelativeTo(this);
    setResizable(false);
    setTextFeild(false,txtPropertyDob,txtPropertySalary);
    addCombo(comboGender, comGender);
    addCombo(comboPOB, comPob);
    addCombo(comboPosition, comPositon);
  }

  private String comPob[] = { "Banteay Meanchey", "Battambang", "Kampong Cham", "Kampong Chhnang", "Kampong Speu", "Kampong Thom", "Kampot", "Kandal", "Kep", "Koh Kong", "Kratie", "Mondulkiri", "Phnom Penh", "Preah Vihear", "Prey Veng", "Pursat", "Ratanak Kiri", "Siem Reap", "Preah Sihanouk", "Stung Treng", "Svay Rieng", "Takeo", "Oddar Meanchey", "Pailin", "Tboung Khmum" };
  private String comGender[] = {"Male","Female"};
  private String comPositon[] = { "Mobile Developer", "Desktop Developer", "Web Developer", "Computer Science", "Mathematic", "Accounting", "Marketing", "Public Administrator", "Management" };

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
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    txtSalary = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    comboPOB = new javax.swing.JComboBox<>();
    comboPosition = new javax.swing.JComboBox<>();
    comboGender = new javax.swing.JComboBox<>();
    btnAdd = new javax.swing.JButton();
    btnNew = new javax.swing.JButton();
    btnNext = new javax.swing.JButton();
    btnUpdate = new javax.swing.JButton();
    comboDay = new javax.swing.JComboBox<>();
    comboMonth = new javax.swing.JComboBox<>();
    comboYear = new javax.swing.JComboBox<>();
    btnHome = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    table = new SubJTable();
    jPanel4 = new javax.swing.JPanel();
    lbID = new javax.swing.JLabel();
    txtPropertyID = new javax.swing.JTextField();
    txtPropertyDob = new javax.swing.JTextField();
    txtPropertySalary = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    setTitle("Employee Input");
    setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    jPanel1.setBackground(new java.awt.Color(153, 255, 255));

    lbDate.setFont(new java.awt.Font("Khmer OS Content", 1, 18)); // NOI18N
    lbDate.setForeground(new java.awt.Color(255, 0, 0));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabel1.setFont(new java.awt.Font("Khmer OS Content", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 0, 0));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Employee's Information");

    jPanel2.setBackground(new java.awt.Color(102, 153, 255));
    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee's Information"));

    jLabel2.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    jLabel2.setText("ID");

    txtID.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    txtID.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        txtIDMouseClicked(evt);
      }
    });
    txtID.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtIDKeyTyped(evt);
      }
    });

    txtName.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    txtName.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtNameKeyTyped(evt);
      }
    });

    jLabel3.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    jLabel3.setText("Name");

    jLabel4.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    jLabel4.setText("Sex");

    jLabel5.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    jLabel5.setText("DOB");

    jLabel6.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    jLabel6.setText("POB");

    jLabel7.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    jLabel7.setText("POS");

    txtSalary.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    txtSalary.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        txtSalaryMouseClicked(evt);
      }
    });
    txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtSalaryKeyTyped(evt);
      }
    });

    jLabel8.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    jLabel8.setText("Salary");

    comboPOB.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N

    comboPosition.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N

    comboGender.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N

    btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/plus_x24.png"))); // NOI18N
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddActionPerformed(evt);
      }
    });

    btnNew.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    btnNew.setText("New");
    btnNew.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNewActionPerformed(evt);
      }
    });

    btnNext.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/next_x24.png"))); // NOI18N
    btnNext.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNextActionPerformed(evt);
      }
    });

    btnUpdate.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/refresh_Color_x24.png"))); // NOI18N
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnUpdateActionPerformed(evt);
      }
    });

    comboDay.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    comboDay.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        comboDayMouseClicked(evt);
      }
    });

    comboMonth.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    comboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
    comboMonth.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        comboMonthMouseClicked(evt);
      }
    });
    comboMonth.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        comboMonthActionPerformed(evt);
      }
    });

    comboYear.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    comboYear.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        comboYearMouseClicked(evt);
      }
    });
    comboYear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        comboYearActionPerformed(evt);
      }
    });

    btnHome.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/home_24.png"))); // NOI18N
    btnHome.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnHomeActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(comboPosition, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comboGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(comboPOB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                  .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(comboDay, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
          .addComponent(comboDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(comboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(comboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(comboPOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(comboPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnNext))
        .addGap(0, 0, Short.MAX_VALUE))
    );

    jPanel3.setBackground(new java.awt.Color(102, 153, 255));
    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee's List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Khmer OS Content", 1, 12))); // NOI18N

    table.setBackground(new java.awt.Color(102, 153, 255));
    table.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
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

    jPanel4.setBackground(new java.awt.Color(102, 153, 255));
    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Property"));
    jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbID.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    lbID.setText("Formate");
    jPanel4.add(lbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

    txtPropertyID.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    txtPropertyID.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPropertyIDKeyTyped(evt);
      }
    });
    jPanel4.add(txtPropertyID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 130, -1));

    txtPropertyDob.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    txtPropertyDob.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPropertyDobKeyTyped(evt);
      }
    });
    jPanel4.add(txtPropertyDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 130, -1));

    txtPropertySalary.setFont(new java.awt.Font("Khmer OS Content", 1, 14)); // NOI18N
    txtPropertySalary.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPropertySalaryKeyTyped(evt);
      }
    });
    jPanel4.add(txtPropertySalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 130, -1));

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
  private Thread th = new Thread(new Runnable() {
    @Override
    public void run() {
      try {
        while(true){
          Date date = new Date();
          SimpleDateFormat sdf = new SimpleDateFormat("EEE dd/MMMM/yyyy hh:mm:ss a");
          lbDate.setText(sdf.format(date));
          Thread.sleep(1000);
        }
      } catch (Exception e) {}
    }
  });
  private void addCombo(JComboBox combo,String str[]){
    combo.removeAllItems();
    for(String temp:str)
      combo.addItem(temp);
  }
  private void clearText(JTextField ...txt){
    for(JTextField temp:txt)
      temp.setText("");
    txt[0].requestFocus();
  }
  private boolean checkText(JTextField...txt){
    for(JTextField temp:txt){
      String str = temp.getText().trim();
      if(str.equals("")){
        temp.requestFocus();
        Toolkit.getDefaultToolkit().beep();
        return false;
      }
    }
    return true;
  }
  private void setDay(){
    Calendar calen = Calendar.getInstance();
    int month = comboMonth.getSelectedIndex();
    int year = Integer.parseInt(""+comboYear.getSelectedItem());
    calen.set(year, month, 1);
    int maxDay = calen.getActualMaximum(Calendar.DAY_OF_MONTH);
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
  private void setTextFeild(boolean b,JTextField...txt){
    for(JTextField temp:txt)
      temp.setVisible(b);
  }
  public void addElement(ArrayList<EmployeeCls> ls,SubDefaultTableModel mod){
    mod.removeAllRows();
    for(int i=0; i<ls.size(); i++){
      for(int j=0; j<i; j++)
        if(ls.get(j).getId()==ls.get(i).getId()){
          ls.remove(i);
          JOptionPane.showMessageDialog(this, "ID is duplicate!!!!!");
          txtID.selectAll();
          txtID.requestFocus();
          return;
        }
      mod.addRow(ls.get(i).toString().split("\t"));
    }
    
  }
  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
    stable = (SubJTable)table;
    mod = new SubDefaultTableModel();
    ls = new ArrayList<>();
    emp = new EmployeeCls();
    stable.setModel(mod);
    Calendar calen = Calendar.getInstance();
    int year = calen.get(Calendar.YEAR);
    for(int i =year-50; i<=year+50; i++){
      comboYear.addItem(""+i);
    }
    int month = calen.get(Calendar.MONTH);
    comboMonth.setSelectedIndex(month);
    comboYear.setSelectedItem(""+year);
    int day = calen.get(Calendar.DATE);
    comboDay.setSelectedItem(day+"");
    mod.addColumn("ID");
    mod.addColumn("Name");
    mod.addColumn("Gender");
    mod.addColumn("DOB");
    mod.addColumn("POB");
    mod.addColumn("Position");
    mod.addColumn("Salary");
    stable.setRowHeight(25);
    stable.setColumnWidth(0, 40);
    stable.setColumnWidth(1, 120);
    stable.setColumnWidth(2, 40);
    stable.setColumnWidth(3, 80);
    stable.setColumnWidth(4, 110);
    stable.setColumnWidth(5, 120);  
    stable.setColumnWidth(6, 60);
    ls = EmployeeData.ls;
    if(ls.size()>=0)
        addElement(ls, mod);
  }//GEN-LAST:event_formWindowOpened

  private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    clearText(txtID,txtName,txtSalary);
    addCombo(comboGender, comGender);
    addCombo(comboPOB, comPob);
    addCombo(comboPosition, comPositon);
  }//GEN-LAST:event_btnNewActionPerformed

  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    if(checkText(txtID,txtName,txtSalary)){
      int id = Integer.parseInt(txtID.getText());
      String name = txtName.getText().trim();
      String gender = comboGender.getSelectedItem().toString();
      int day = Integer.parseInt(comboDay.getSelectedItem().toString());
      int month = comboMonth.getSelectedIndex();
      int year = Integer.parseInt(comboYear.getSelectedItem().toString());
      String pob = comboPOB.getSelectedItem().toString();
      String position = comboPosition.getSelectedItem().toString();
      double salary = Double.parseDouble(txtSalary.getText());
      Calendar calen = Calendar.getInstance();
      calen.set(year, month, day);
      Date date = calen.getTime();
      emp = new EmployeeCls(id, name, gender, date, pob, position, salary);
      ls.add(emp);
      addElement(ls, mod);
      System.out.println(ls.size());
    }
  }//GEN-LAST:event_btnAddActionPerformed
  private int index;
  private void setComboPOB(JComboBox combo){
    for(int i=0; i<combo.getItemCount(); i++){
      if(emp.getPob().equals(combo.getItemAt(i))){
        combo.setSelectedIndex(i);
      }
    }
  }
  private void setComboPosition(JComboBox combo){
    for(int i=0; i<combo.getItemCount(); i++){
      if(emp.getPosition().equals(combo.getItemAt(i))){
        combo.setSelectedIndex(i);
      }
    }
  }
  private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
    index = stable.getSelectedRow();
    EmployeeCls emp = ls.get(index);
    String strID = txtPropertyID.getText().trim();
    txtID.setText(mod.getValueAt(stable.getSelectedRow(), 0).toString().replace(strID, ""));
    txtName.setText(mod.getValueAt(stable.getSelectedRow(), 1).toString().toLowerCase());
    setComboPOB(comboPOB);
    setComboPosition(comboPosition);
    txtSalary.setText(mod.getValueAt(stable.getSelectedRow(), 6).toString().replace("$", "").replace(",", ""));
  }//GEN-LAST:event_tableMouseClicked

  private void comboMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMonthActionPerformed
    setDay();
  }//GEN-LAST:event_comboMonthActionPerformed

  private void comboYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboYearActionPerformed
    setDay();
  }//GEN-LAST:event_comboYearActionPerformed

  private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    if(!stable.getSelectionModel().isSelectionEmpty()){
      emp = ls.get(index);
      //ls.get(index).setId(0);
      emp.setId(Integer.parseInt(txtID.getText()));
      emp.setName(txtName.getText());
      emp.setGender(comboGender.getSelectedItem().toString());
      emp.setPob(comboPOB.getSelectedItem().toString());
      emp.setPosition(comboPosition.getSelectedItem().toString());
      emp.setSalary(Double.parseDouble(txtSalary.getText()));
      int day = Integer.parseInt(comboDay.getSelectedItem().toString());
      int month = comboMonth.getSelectedIndex();
      int year = Integer.parseInt(comboYear.getSelectedItem().toString());
      Calendar calen = Calendar.getInstance();
      calen.set(year, month, day);
      Date date = calen.getTime();
      emp.setDate(date);
      int click = JOptionPane.showConfirmDialog(this, "Are you want to Update?", "Update", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
      if(click == JOptionPane.YES_OPTION){
         ls.set(index, emp);
         addElement(ls, mod);
      }
    }
  }//GEN-LAST:event_btnUpdateActionPerformed

  private void txtPropertyIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPropertyIDKeyTyped
    String str = txtPropertyID.getText().trim();
    if(evt.getKeyChar()==10){
      EmployeeCls emp1 = emp;
      emp1.setPropertyID(str);
      addElement(ls, mod);
    }
  }//GEN-LAST:event_txtPropertyIDKeyTyped

  private void comboMonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMonthMouseClicked
    setTextFeild(false, txtPropertyID,txtPropertySalary);
    txtPropertyDob.setVisible(true);
  }//GEN-LAST:event_comboMonthMouseClicked

  private void txtPropertyDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPropertyDobKeyTyped
    String str = txtPropertyDob.getText().trim();
    if(evt.getKeyChar()==10){
      EmployeeCls emp1 = emp;
      emp1.setPropertyDate(str);
      addElement(ls, mod);
    }
  }//GEN-LAST:event_txtPropertyDobKeyTyped

  private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
    setTextFeild(false, txtPropertyDob,txtPropertySalary);
    txtPropertyID.setVisible(true);
  }//GEN-LAST:event_txtIDMouseClicked

  private void comboDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboDayMouseClicked
    comboMonthMouseClicked(evt);
  }//GEN-LAST:event_comboDayMouseClicked

  private void txtSalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalaryMouseClicked
    setTextFeild(false, txtPropertyID,txtPropertyDob);
    txtPropertySalary.setVisible(true);
  }//GEN-LAST:event_txtSalaryMouseClicked

  private void txtPropertySalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPropertySalaryKeyTyped
   String str = txtPropertySalary.getText().trim();
    if(evt.getKeyChar()==10){
      EmployeeCls emp1 = emp;
      emp1.setPropertySalary(str);
      addElement(ls, mod);
    }
  }//GEN-LAST:event_txtPropertySalaryKeyTyped

  private void comboYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboYearMouseClicked
    comboMonthMouseClicked(evt);
  }//GEN-LAST:event_comboYearMouseClicked

  private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
    MyInput.inputInteger(evt, txtID, 4);
  }//GEN-LAST:event_txtIDKeyTyped

  private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
    MyInput.inputCharacter(evt);
  }//GEN-LAST:event_txtNameKeyTyped

  private void txtSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyTyped
    MyInput.inputFloat(evt, txtSalary, 4);
  }//GEN-LAST:event_txtSalaryKeyTyped

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        EmployeeData.ls = ls;
        this.dispose();
        EmployeeListInfor.main(null);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        this.dispose();
        EmployeeLogIn.main(null);
        
    }//GEN-LAST:event_btnHomeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int click = JOptionPane.showConfirmDialog(this, "Do you want exit", "Exit", JOptionPane.YES_NO_OPTION);
        if(click == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_formWindowClosing

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
      java.util.logging.Logger.getLogger(EmployeeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(EmployeeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(EmployeeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(EmployeeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
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
  private javax.swing.JButton btnNew;
  private javax.swing.JButton btnNext;
  private javax.swing.JButton btnUpdate;
  private javax.swing.JComboBox<String> comboDay;
  private javax.swing.JComboBox<String> comboGender;
  private javax.swing.JComboBox<String> comboMonth;
  private javax.swing.JComboBox<String> comboPOB;
  private javax.swing.JComboBox<String> comboPosition;
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
  private javax.swing.JPanel jPanel4;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbDate;
  private javax.swing.JLabel lbID;
  private javax.swing.JTable table;
  private javax.swing.JTextField txtID;
  private javax.swing.JTextField txtName;
  private javax.swing.JTextField txtPropertyDob;
  private javax.swing.JTextField txtPropertyID;
  private javax.swing.JTextField txtPropertySalary;
  private javax.swing.JTextField txtSalary;
  // End of variables declaration//GEN-END:variables
}
