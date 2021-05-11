
package Unit6.OOP.Class.Inheritance;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author CHINDA
 */
public class Ex {
  public static void main(String[] args) {
    ClsStatic obj = new ClsStatic();
    obj.id = 10;
    obj.name = "Koem chinda";
    ClsStatic obj1 = new ClsStatic();
    ClsStatic.id = 20;
    obj1.name="Da";
    System.out.println(obj);
    System.out.println(obj1);
//    Date date = new Date();
//    Calendar cal = Calendar.getInstance();
//    cal.setTime(date);
  }
}
