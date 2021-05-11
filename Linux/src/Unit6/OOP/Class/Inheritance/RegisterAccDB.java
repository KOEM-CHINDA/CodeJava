
package Unit6.OOP.Class.Inheritance;

import java.util.ArrayList;

public class RegisterAccDB {
  public static ArrayList<RegisterAcc> db = new ArrayList<>();

  public RegisterAccDB() {
  }
  public RegisterAccDB(RegisterAcc res) {
    db.add(res);
  }
  public void add(RegisterAcc res){
    db.add(res);
  }
  public void remove(int index){
    db.remove(index);
  }
  public void set(int index, RegisterAcc res){
    db.set(index, res);
  }
  public ArrayList<RegisterAcc> getAll(){
    return db;
  }
  public int size(){
    return db.size();
  }
  public RegisterAcc getIndex(int index){
    return db.get(index);
  }
}
