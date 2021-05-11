
package Unit6.OOP.Class.Inheritance.Product.DB;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ProductShopCls extends ProductCls{
  public int getQty() {
    return qty;
  }
  public void setQty(int qty) {
    this.qty = qty;
  }
  public double getPriceIn() {
    return priceIn;
  }
  public void setPriceIn(double priceIn) {
    this.priceIn = priceIn;
  }
  public double getPriceOut() {
    return priceOut;
  }
  public void setPriceOut(double priceOut) {
    this.priceOut = priceOut;
  }
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
  public ProductShopCls() {
  }
  public ProductShopCls(int id,String name,String category,int qty,double priceIn,double priceOut,Date date) {
    super(id, name, category);
    this.qty = qty;
    this.priceIn = priceIn;
    this.priceOut = priceOut;
    this.date = date;
  }
  @Override
  public String toString() {
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");
    return super.toString()+"\t"+getQty()+"\t"+nf.format(getPriceIn())+"\t"+nf.format(getPriceOut())+"\t"+sdf.format(date);
  }
  public String viewProduct(){
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");
    return super.toString()+"\t"+getQty()+"\t"+nf.format(getPriceIn())+"\t"+nf.format(getPriceOut());
  }
  private int qty;
  private double priceIn;
  private double priceOut;
  private Date date;
}
