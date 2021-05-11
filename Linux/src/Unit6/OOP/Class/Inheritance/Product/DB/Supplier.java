
package Unit6.OOP.Class.Inheritance.Product.DB;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Supplier extends PersonCls{
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public Supplier() {
  }

  public Supplier(int id, String name, String gender,String phone, String email,Date date,String place) {
    super(id, name, gender, place, date);
    this.phone = phone;
    this.email = email;
  }
  @Override
  public String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yy");
    return super.getId()+"\t"+super.getName()+"\t"+super.getGender()+"\t"+getPhone()+"\t"+getEmail()+"\t"+sdf.format(super.getDate())+"\t"+super.getPlaceOfBirth();
  }
  
  private String phone;
  private String email;
}
