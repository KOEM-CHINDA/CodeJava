
package Unit6.OOP.Class;

public class MainStudent {
  public static void main(String[] args) {
    Student obj = new Student();
    obj.setId(12);
    obj.setName("Koem chinda");
    obj.setGender("Male");
    obj.setDob("12/04/2000");
    obj.setAddress("Bavet");
    System.out.println(obj);
  }
}
