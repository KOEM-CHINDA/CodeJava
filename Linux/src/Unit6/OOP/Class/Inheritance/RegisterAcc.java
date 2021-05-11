
package Unit6.OOP.Class.Inheritance;

/**
 *
 * @author CHINDA
 */
public class RegisterAcc {

  /**
   * @return the comfirmPass
   */
  public String getComfirmPass() {
    return comfirmPass;
  }

  /**
   * @param comfirmPass the comfirmPass to set
   */
  public void setComfirmPass(String comfirmPass) {
    this.comfirmPass = comfirmPass;
  }

  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPass() {
    return pass;
  }
  public void setPass(String pass) {
    this.pass = pass;
  }
  public RegisterAcc() {
  }

  public RegisterAcc(String userName, String email, String pass, String comfirmPass) {
    this.userName = userName;
    this.email = email;
    this.pass = pass;
    this.comfirmPass = comfirmPass;
  }
  
  
  private String userName;
  private String email;
  private String pass;
  private String comfirmPass;
}
