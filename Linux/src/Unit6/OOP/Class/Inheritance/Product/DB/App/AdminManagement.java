/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit6.OOP.Class.Inheritance.Product.DB.App;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import Unit6.OOP.Class.Inheritance.Product.DB.*;
import java.awt.Toolkit;

/**
 *
 * @author CHINDA
 */
public class AdminManagement extends javax.swing.JFrame {
  //color lb
  private final Color hover = new Color(245, 66, 152);
  private final Color exit = new Color(204,204,255);
  private final Color click = new Color(154,154,104);
  private final Color navigation = new Color(102,102,102);
  private boolean hide = true;
  private SupplierDB dbSup;
  private ProductDB dbPro;
  ViewProduct vPro = new ViewProduct();
  ViewSupplier vSup = new ViewSupplier();
  AddSupplier sup = new AddSupplier();
  AddProduct pro = new AddProduct();
  
  public AdminManagement() {
    initComponents();
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    pNavigation = new javax.swing.JPanel();
    pSubNavigation = new javax.swing.JPanel();
    pSetting = new javax.swing.JPanel();
    lbHome = new javax.swing.JLabel();
    pBack = new javax.swing.JPanel();
    lbBack = new javax.swing.JLabel();
    pSubMenu = new javax.swing.JPanel();
    pHeader = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    pAddProduct = new javax.swing.JPanel();
    lbAddProduct = new javax.swing.JLabel();
    pAddSupplier = new javax.swing.JPanel();
    lbAddSupplier = new javax.swing.JLabel();
    pViewProduct = new javax.swing.JPanel();
    lbViewProduct = new javax.swing.JLabel();
    pViewSupplier = new javax.swing.JPanel();
    lbViewSupplier = new javax.swing.JLabel();
    pExit = new javax.swing.JPanel();
    lbExit = new javax.swing.JLabel();
    pMain = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    pNavigation.setPreferredSize(new java.awt.Dimension(200, 200));
    pNavigation.setLayout(new java.awt.BorderLayout());

    pSubNavigation.setBackground(new java.awt.Color(102, 102, 102));
    pSubNavigation.setPreferredSize(new java.awt.Dimension(50, 575));
    pSubNavigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    pSetting.setBackground(new java.awt.Color(102, 102, 102));

    lbHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/home_24.png"))); // NOI18N
    lbHome.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbHomeMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbHomeMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbHomeMouseExited(evt);
      }
    });

    javax.swing.GroupLayout pSettingLayout = new javax.swing.GroupLayout(pSetting);
    pSetting.setLayout(pSettingLayout);
    pSettingLayout.setHorizontalGroup(
      pSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pSettingLayout.createSequentialGroup()
        .addComponent(lbHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    pSettingLayout.setVerticalGroup(
      pSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pSettingLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lbHome)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pSubNavigation.add(pSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 40));

    pBack.setBackground(new java.awt.Color(102, 102, 102));

    lbBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Rigth_x24.png"))); // NOI18N
    lbBack.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbBackMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbBackMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbBackMouseExited(evt);
      }
    });

    javax.swing.GroupLayout pBackLayout = new javax.swing.GroupLayout(pBack);
    pBack.setLayout(pBackLayout);
    pBackLayout.setHorizontalGroup(
      pBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pBackLayout.createSequentialGroup()
        .addComponent(lbBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    pBackLayout.setVerticalGroup(
      pBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pBackLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lbBack)
        .addContainerGap(10, Short.MAX_VALUE))
    );

    pSubNavigation.add(pBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

    pNavigation.add(pSubNavigation, java.awt.BorderLayout.LINE_START);

    pSubMenu.setBackground(new java.awt.Color(204, 204, 255));
    pSubMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    pHeader.setBackground(new java.awt.Color(0, 102, 102));
    pHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
    pHeader.setPreferredSize(new java.awt.Dimension(150, 50));
    pHeader.setLayout(new java.awt.BorderLayout());

    jLabel1.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/User_Group_x24.png"))); // NOI18N
    jLabel1.setText("SRU TEAM");
    pHeader.add(jLabel1, java.awt.BorderLayout.CENTER);

    pSubMenu.add(pHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

    pAddProduct.setBackground(new java.awt.Color(204, 204, 255));
    pAddProduct.setPreferredSize(new java.awt.Dimension(150, 50));
    pAddProduct.setLayout(new java.awt.BorderLayout());

    lbAddProduct.setBackground(new java.awt.Color(204, 204, 255));
    lbAddProduct.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/plus_x24.png"))); // NOI18N
    lbAddProduct.setText("Add Product");
    lbAddProduct.setPreferredSize(new java.awt.Dimension(150, 34));
    lbAddProduct.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbAddProductMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbAddProductMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbAddProductMouseExited(evt);
      }
    });
    pAddProduct.add(lbAddProduct, java.awt.BorderLayout.CENTER);

    pSubMenu.add(pAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 30));

    pAddSupplier.setBackground(new java.awt.Color(204, 204, 255));
    pAddSupplier.setPreferredSize(new java.awt.Dimension(150, 50));
    pAddSupplier.setLayout(new java.awt.BorderLayout());

    lbAddSupplier.setBackground(new java.awt.Color(204, 204, 255));
    lbAddSupplier.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbAddSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/supplier_32px.png"))); // NOI18N
    lbAddSupplier.setText("Add Supplier");
    lbAddSupplier.setPreferredSize(new java.awt.Dimension(150, 34));
    lbAddSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbAddSupplierMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbAddSupplierMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbAddSupplierMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        lbAddSupplierMousePressed(evt);
      }
    });
    pAddSupplier.add(lbAddSupplier, java.awt.BorderLayout.CENTER);

    pSubMenu.add(pAddSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 150, 30));

    pViewProduct.setBackground(new java.awt.Color(204, 204, 255));
    pViewProduct.setPreferredSize(new java.awt.Dimension(150, 50));
    pViewProduct.setLayout(new java.awt.BorderLayout());

    lbViewProduct.setBackground(new java.awt.Color(204, 204, 255));
    lbViewProduct.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbViewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/coins_24px.png"))); // NOI18N
    lbViewProduct.setText("View Product");
    lbViewProduct.setPreferredSize(new java.awt.Dimension(150, 34));
    lbViewProduct.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbViewProductMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbViewProductMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbViewProductMouseExited(evt);
      }
    });
    pViewProduct.add(lbViewProduct, java.awt.BorderLayout.CENTER);

    pSubMenu.add(pViewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 150, 30));

    pViewSupplier.setBackground(new java.awt.Color(204, 204, 255));
    pViewSupplier.setPreferredSize(new java.awt.Dimension(150, 50));
    pViewSupplier.setLayout(new java.awt.BorderLayout());

    lbViewSupplier.setBackground(new java.awt.Color(204, 204, 255));
    lbViewSupplier.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbViewSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/database_view_24px.png"))); // NOI18N
    lbViewSupplier.setText("View Supplier");
    lbViewSupplier.setPreferredSize(new java.awt.Dimension(150, 34));
    lbViewSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbViewSupplierMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbViewSupplierMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbViewSupplierMouseExited(evt);
      }
    });
    pViewSupplier.add(lbViewSupplier, java.awt.BorderLayout.CENTER);

    pSubMenu.add(pViewSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 30));

    pExit.setBackground(new java.awt.Color(204, 204, 255));
    pExit.setPreferredSize(new java.awt.Dimension(150, 50));
    pExit.setLayout(new java.awt.BorderLayout());

    lbExit.setBackground(new java.awt.Color(204, 204, 255));
    lbExit.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/color_multi_x24.png"))); // NOI18N
    lbExit.setText("Exit");
    lbExit.setPreferredSize(new java.awt.Dimension(150, 34));
    lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbExitMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbExitMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbExitMouseExited(evt);
      }
    });
    pExit.add(lbExit, java.awt.BorderLayout.CENTER);

    pSubMenu.add(pExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 150, 30));

    pNavigation.add(pSubMenu, java.awt.BorderLayout.CENTER);

    getContentPane().add(pNavigation, java.awt.BorderLayout.LINE_START);

    pMain.setBackground(new java.awt.Color(204, 204, 255));
    pMain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    pMain.setPreferredSize(new java.awt.Dimension(407, 393));
    pMain.setLayout(new java.awt.BorderLayout());
    getContentPane().add(pMain, java.awt.BorderLayout.CENTER);

    setBounds(0, 0, 958, 575);
  }// </editor-fold>//GEN-END:initComponents

  private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
    pExit.setBackground(click);
    int click = JOptionPane.showConfirmDialog(this, "Do you to exit?", "Exit", JOptionPane.YES_NO_OPTION);
    if(click == JOptionPane.YES_OPTION)
      System.exit(0);
  }//GEN-LAST:event_lbExitMouseClicked

  private void lbAddProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddProductMouseEntered
    pAddProduct.setBackground(hover);
  }//GEN-LAST:event_lbAddProductMouseEntered

  private void lbAddProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddProductMouseExited
    pAddProduct.setBackground(exit);
  }//GEN-LAST:event_lbAddProductMouseExited

  private void lbAddSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddSupplierMouseEntered
    pAddSupplier.setBackground(hover);
  }//GEN-LAST:event_lbAddSupplierMouseEntered

  private void lbAddSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddSupplierMouseExited
    pAddSupplier.setBackground(exit);
  }//GEN-LAST:event_lbAddSupplierMouseExited

  private void lbViewProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbViewProductMouseEntered
    pViewProduct.setBackground(hover);
  }//GEN-LAST:event_lbViewProductMouseEntered

  private void lbViewProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbViewProductMouseExited
    pViewProduct.setBackground(exit);
  }//GEN-LAST:event_lbViewProductMouseExited

  private void lbViewSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbViewSupplierMouseEntered
    pViewSupplier.setBackground(hover);
  }//GEN-LAST:event_lbViewSupplierMouseEntered

  private void lbViewSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbViewSupplierMouseExited
    pViewSupplier.setBackground(exit);
  }//GEN-LAST:event_lbViewSupplierMouseExited

  private void lbExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseEntered
    pExit.setBackground(hover);
  }//GEN-LAST:event_lbExitMouseEntered

  private void lbExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseExited
    pExit.setBackground(exit);
  }//GEN-LAST:event_lbExitMouseExited

  private void lbHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseEntered
    pSetting.setBackground(hover);
  }//GEN-LAST:event_lbHomeMouseEntered

  private void lbHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseExited
    pSetting.setBackground(navigation);
  }//GEN-LAST:event_lbHomeMouseExited

  private void lbBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseEntered
    pBack.setBackground(hover);
  }//GEN-LAST:event_lbBackMouseEntered

  private void lbBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseExited
    pBack.setBackground(navigation);
  }//GEN-LAST:event_lbBackMouseExited

  private void lbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseClicked
    pBack.setBackground(click);
    if(hide == true){
      Icon icon = new ImageIcon(getClass().getResource("/Images_Icon/Left_x24.png"));
      lbBack.setIcon(icon);
      this.pNavigation.setPreferredSize(new Dimension(50,pNavigation.getHeight()));
      SwingUtilities.updateComponentTreeUI(this);
      hide = false;
    }else{
      Icon icon = new ImageIcon(getClass().getResource("/Images_Icon/Rigth_x24.png"));
      lbBack.setIcon(icon);
      pNavigation.setPreferredSize(new Dimension(200,pNavigation.getHeight()));
      SwingUtilities.updateComponentTreeUI(this);
      hide = true;
    }
  }//GEN-LAST:event_lbBackMouseClicked

  private void lbAddProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddProductMouseClicked
    pAddProduct.setBackground(click);
    pro.setDB(dbPro);
    addPanel(pro);
    
  }//GEN-LAST:event_lbAddProductMouseClicked

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    Dimension df = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(df);
    dbSup = new SupplierDB();
    dbPro = new ProductDB();
  }//GEN-LAST:event_formWindowOpened

  private void lbViewProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbViewProductMouseClicked
    pViewProduct.setBackground(click);
    if(dbPro.getAll()!=null){
      vPro.setDB(dbPro);
      vPro.setElement(dbPro.getAll());
    }
    addPanel(vPro);
    
  }//GEN-LAST:event_lbViewProductMouseClicked

  private void lbAddSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddSupplierMouseClicked
    pAddSupplier.setBackground(click);
    sup.setDB(dbSup);
    addPanel(sup);
  }//GEN-LAST:event_lbAddSupplierMouseClicked

  private void lbViewSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbViewSupplierMouseClicked
    pViewSupplier.setBackground(click);
    if(dbSup.getAll()!=null){
      vSup.setDB(dbSup);
      vSup.addElement(dbSup.getAll());
    }
    addPanel(vSup);
  }//GEN-LAST:event_lbViewSupplierMouseClicked

  private void lbAddSupplierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddSupplierMousePressed
    //pAddSupplier.setBackground(new Color(255,0,0));
  }//GEN-LAST:event_lbAddSupplierMousePressed

  private void lbHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseClicked
    LogIn.main(null);
    this.dispose();
  }//GEN-LAST:event_lbHomeMouseClicked
  private void addPanel(JPanel panel){
    pMain.removeAll();
    pMain.add(panel);
    pMain.validate();
    pMain.repaint();
  }
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
      java.util.logging.Logger.getLogger(AdminManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(AdminManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(AdminManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(AdminManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new AdminManagement().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel lbAddProduct;
  private javax.swing.JLabel lbAddSupplier;
  private javax.swing.JLabel lbBack;
  private javax.swing.JLabel lbExit;
  private javax.swing.JLabel lbHome;
  private javax.swing.JLabel lbViewProduct;
  private javax.swing.JLabel lbViewSupplier;
  private javax.swing.JPanel pAddProduct;
  private javax.swing.JPanel pAddSupplier;
  private javax.swing.JPanel pBack;
  private javax.swing.JPanel pExit;
  private javax.swing.JPanel pHeader;
  private javax.swing.JPanel pMain;
  private javax.swing.JPanel pNavigation;
  private javax.swing.JPanel pSetting;
  private javax.swing.JPanel pSubMenu;
  private javax.swing.JPanel pSubNavigation;
  private javax.swing.JPanel pViewProduct;
  private javax.swing.JPanel pViewSupplier;
  // End of variables declaration//GEN-END:variables
}
