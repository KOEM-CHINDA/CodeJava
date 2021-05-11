
package Unit6.OOP.Class.Inheritance.Product.DB;
public class ProductCls {
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  public ProductCls() {
  }

  public ProductCls(int id, String name, String category) {
    this.id = id;
    this.name = name;
    this.category = category;
  }

  @Override
  public String toString() {
    return getId()+"\t"+getName()+"\t"+getCategory();
  }
  
  private int id;
  private String name;
  private String category;
}
