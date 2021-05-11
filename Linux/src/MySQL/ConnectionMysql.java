
package MySQL;
import java.sql.*;
public class ConnectionMysql {
  private static String ip = "localhost";
  private static String port = "3306";
  private static String dbName = "student";
  public static String user = "root";
  public static String pass = "Da087629243";
  private static String url = "jdbc:mysql://"+ip+":"+port+"/"+dbName;
  private static Connection dataCon;
  public static Connection getConnection(){
    try {
      dataCon= DriverManager.getConnection(url, user, pass);
      System.out.println("Conneted");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return dataCon;
  }
}
