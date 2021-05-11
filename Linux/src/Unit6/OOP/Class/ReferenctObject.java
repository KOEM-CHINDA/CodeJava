
package Unit6.OOP.Class;

public class ReferenctObject {
  public static void main(String[] args) {
    Product pro1 = new Product(12, "Coca", 10, 2);
    Product pro2 = pro1.clone();
    pro1.setId(13);
    System.out.println(pro1);
    System.out.println(pro2);
  }
}
