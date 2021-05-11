
package Unit5.Methods;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author CHINDA
 */
public class TestDate {
  public static void main(String[] args) {
//    Date date = new Date();//Mon,10/May/2021 10:34:34 AM
//    SimpleDateFormat sdf = new SimpleDateFormat("EEE,dd/MMM/yyyy hh:mm:ss a");
//    System.out.println(sdf.format(date));
    Date date = new Date();
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    int day = cal.get(cal.DATE);
    int month = cal.get(cal.MONTH)+1;
    int year = cal.get(cal.YEAR);
    System.out.println(day+"\t"+month+"\t"+year);
    
  }
  
}
