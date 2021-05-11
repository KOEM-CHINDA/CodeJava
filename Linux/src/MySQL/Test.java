
package MySQL;
import java.sql.*;
public class Test {
  private static Connection data;
  public static void main(String[] args) {
    try {
      data   = ConnectionMysql.getConnection();
    } catch (Exception e) {
    }
  }
  
}
