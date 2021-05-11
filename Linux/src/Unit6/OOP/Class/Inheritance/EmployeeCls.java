
package Unit6.OOP.Class.Inheritance;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class EmployeeCls extends PersonCls{

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

    public EmployeeCls() {
    }

  public EmployeeCls(int id, String name, String gender, Date dob, String pob,String position, double salary) {
    super(id, name, gender, dob, pob);
    this.position = position;
    this.salary = salary;
  }
    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.ROOT);
        return super.toString()+"\t"+getPosition()+"\t"+nf.format(getSalary());
    }
    private String position;
    private double salary;
}
