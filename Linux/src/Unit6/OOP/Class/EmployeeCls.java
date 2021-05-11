
package Unit6.OOP.Class;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author CHINDA
 */
public class EmployeeCls {

    
  public String getPropertyDate() {
    return propertyDate;
  }
  
  public void setPropertyDate(String propertyDate) {
    EmployeeCls.propertyDate = propertyDate;
  }

  public String getPropertyID() {
    return propertyID;
  }
  
  public void setPropertyID(String propertyID) {
    EmployeeCls.propertyID = propertyID;
  }

  public String getPropertySalary() {
    return propertySalary;
  }

  public void setPropertySalary(String propertySalary) {
    EmployeeCls.propertySalary = propertySalary;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
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
  public String getPob() {
    return pob;
  }
  public void setPob(String pob) {
    this.pob = pob;
  }
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }
  public double getSalary() {
    return salary;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }
  private int id;
  private String name;
  private String gender;
  private Date date;
  private String pob;
  private String position;
  private double salary;
  private static String propertyDate="dd/MM/yy";
  private static String propertyID = "";
  private static String propertySalary = "";
  public EmployeeCls() {
  }

  public EmployeeCls( int id, String name, String gender, Date date, String pob, String position, double salary) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.date = date;
    this.pob = pob;
    this.position = position;
    this.salary = salary;
  }
  public EmployeeCls(int id, String name, String gender, String pob, String position, double salary) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.pob = pob;
    this.position = position;
    this.salary = salary;
  }
  @Override
  public String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat(getPropertyDate());
    DecimalFormat dfId = new DecimalFormat(getPropertyID());
    DecimalFormat dfSalary = new DecimalFormat(getPropertySalary());
    return dfId.format(id)+"\t"+name.toUpperCase()+"\t"+gender+"\t"+sdf.format(date)+"\t"+pob+"\t"+position+"\t"+dfSalary.format(salary);
    }
  
}
