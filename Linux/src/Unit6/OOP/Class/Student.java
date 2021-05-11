
package Unit6.OOP.Class;

import java.text.DecimalFormat;

public class Student {

  public String getMajor() {
    return major;
  }
  
  public void setMajor(String major) {
    this.major = major;
  }

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

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  private int id;
  private String name;
  private String gender;
  private String dob;
  private String address;
  private String major;

  public Student() {
  }

  public Student(int id, String name, String gender, String dob, String address, String major) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.dob = dob;
    this.address = address;
    this.major = major;
  }
  
  @Override
  public String toString() {
    DecimalFormat df = new DecimalFormat("ST00");
    return df.format(id)+"\t"+name.toUpperCase()+"\t"+gender+"\t"+dob+"\t"+address+"\t"+major;
  }
  
}
