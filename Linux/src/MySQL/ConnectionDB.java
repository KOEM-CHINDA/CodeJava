
package MySQL;

/**
 *
 * @author CHINDA
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionDB {

  public static Connection getDataCon() {
    return dataCon;
  }
  public static void setDataCon(Connection aDataCon) {
    dataCon = aDataCon;
  }
  private static Connection dataCon;
  public static void connectionDB(String ip,String dbName,String userName,String password)throws Exception{
      Class.forName("com.mysql.cj.jdbc.Driver");
      setDataCon(DriverManager.getConnection("jdbc:mysql://"+ip+"/"+dbName+"?verifyServerCertificat=true&useSSL=false",userName,password));
  
  }
}
