
package Unit6.OOP.Class;


import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.table.DefaultTableModel;


public class ProductInfor extends javax.swing.JPanel {

  /**
   * @return the mod
   */
  public static DefaultTableModel getMod() {
    return mod;
  }

  /**
   * @param aMod the mod to set
   */
  public static void setMod(DefaultTableModel aMod) {
    mod = aMod;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public Icon getImage() {
    return image;
  }

  public void setImage(Icon image) {
    this.image = image;
    lbImage.setIcon(image);
  }

 
  public int getPid() {
    return pid;
  }

  public void setPid(int pid) {
    this.pid = pid;
    DecimalFormat df = new DecimalFormat("PD000");
    txtProductID.setText("ID: "+df.format(pid));
  }

  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
    txtProductName.setText("Name: "+pname);
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
    DecimalFormat df = new DecimalFormat("$ #,##0.00");
    lbPrice.setText("Price: "+df.format(price));
  }

  public ProductInfor() {
    initComponents();
    btnCancel.setVisible(false);
  }

  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lbImage = new javax.swing.JLabel();
    txtProductID = new javax.swing.JTextField();
    lbPrice = new javax.swing.JLabel();
    btnBuy = new javax.swing.JButton();
    txtProductName = new javax.swing.JTextField();
    btnCancel = new javax.swing.JButton();

    setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

    lbImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Product/No.jpg"))); // NOI18N

    txtProductID.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    txtProductID.setText("ID:");
    txtProductID.setFocusable(false);

    lbPrice.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    lbPrice.setText("Price:");

    btnBuy.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    btnBuy.setText("Buy");
    btnBuy.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuyActionPerformed(evt);
      }
    });

    txtProductName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    txtProductName.setText("Name: ");
    txtProductName.setFocusable(false);

    btnCancel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    btnCancel.setText("Cancel");
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtProductID)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(btnCancel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnBuy))
          .addGroup(layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(lbPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addComponent(txtProductName, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
          .addComponent(lbImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lbPrice)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnBuy)
          .addComponent(btnCancel))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
   qty++;
   btnBuy.setText("Buy("+qty+")");
   btnCancel.setVisible(true);
  }//GEN-LAST:event_btnBuyActionPerformed

  private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    qty--;
    btnBuy.setText("Buy("+qty+")");
    if(qty==0){
      btnBuy.setText("Buy");
      btnCancel.setVisible(false);
    }
   
    
  }//GEN-LAST:event_btnCancelActionPerformed
  private Icon image;
  private int pid;
  private String pname;
  private double price;
  private int qty;
  private static DefaultTableModel mod = new DefaultTableModel(new String[]{"ID","Name","Price","Qty","Amout"}, 0);
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBuy;
  private javax.swing.JButton btnCancel;
  private javax.swing.JLabel lbImage;
  private javax.swing.JLabel lbPrice;
  private javax.swing.JTextField txtProductID;
  private javax.swing.JTextField txtProductName;
  // End of variables declaration//GEN-END:variables
}
