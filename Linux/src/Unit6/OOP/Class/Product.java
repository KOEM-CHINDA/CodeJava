
package Unit6.OOP.Class;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Product {

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the qtyInstock
   */
  public int getQtyInstock() {
    return qtyInstock;
  }

  /**
   * @param qtyInstock the qtyInstock to set
   */
  public void setQtyInstock(int qtyInstock) {
    this.qtyInstock = qtyInstock;
  }

  /**
   * @return the qtyOutStock
   */
  public int getQtyOutStock() {
    return qtyOutStock;
  }

  /**
   * @param qtyOutStock the qtyOutStock to set
   */
  public void setQtyOutStock(int qtyOutStock) {
    this.qtyOutStock = qtyOutStock;
  }

  /**
   * @return the priceIn
   */
  public double getPriceIn() {
    return priceIn;
  }

  /**
   * @param priceIn the priceIn to set
   */
  public void setPriceIn(double priceIn) {
    this.priceIn = priceIn;
  }

  /**
   * @return the priceOut
   */
  public double getPriceOut() {
    return priceOut;
  }

  /**
   * @param priceOut the priceOut to set
   */
  public void setPriceOut(double priceOut) {
    this.priceOut = priceOut;
  }
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  private int id;
  private String name;
  private int qtyInstock;
  private int qtyOutStock;
  private double priceIn;
  private double priceOut;
  
  public int qtyInStock(){
    return getQtyInstock()-getQtyOutStock();
  }
  public double amount(){
    return getQtyInstock() * getPriceIn();
  }

  public Product() {
  }

  public Product(int id, String name, int qty, double price) {
    this.id = id;
    this.name = name;
    this.qtyInstock = qty;
    this.priceIn = price;
  }


  public Product clone() {
    Product temp = new Product(getId(), getName(), getQtyInstock(), getPriceIn());
    return temp;
  }
  
  public void input(){
    Scanner cin = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("$#,##0.00");
    System.out.print("Enter ID: ");
    setId(cin.nextInt());
    System.out.print("Enter Name: ");
    cin.nextLine();
    setName(cin.nextLine());
    System.out.print("Enter Qty: ");
    setQtyInstock(cin.nextInt());
    System.out.print("Enter Price: ");
    setPriceIn(cin.nextDouble());
    System.out.println(df.format(amount()));
  }
  
  @Override
  public String toString() {
    DecimalFormat df1 = new DecimalFormat("PD00");
    DecimalFormat df2 = new DecimalFormat("$#,##0.00");
    return df1.format(getId())+"\t"+getName().toUpperCase()+"\t"+getQtyInstock()+"\t"+df2.format(getPriceIn())+"\t"+df2.format(getPriceOut());
  }
  
}
