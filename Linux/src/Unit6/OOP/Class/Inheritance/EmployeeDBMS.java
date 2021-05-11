
package Unit6.OOP.Class.Inheritance;

import java.util.ArrayList;

public class EmployeeDBMS {
    private static ArrayList<EmployeeCls> db = new ArrayList<>();

    public EmployeeDBMS() {
    }
    public EmployeeDBMS(EmployeeCls emp) {
        db.add(emp);
    }
    public void addEmp(EmployeeCls emp){
        db.add(emp);
    }
    public void updateEmp(int index, EmployeeCls emp){
        db.set(index, emp);
    }
    public void removeEmp(int index){
        db.remove(index);
    }
    public EmployeeCls getIndex(int index){
        return db.get(index);
    }
    public ArrayList<EmployeeCls> getAllEmp(){
      return db;
    }
    public int getSize(){
      return db.size();
    }
    public ArrayList<EmployeeCls> getFilterName(String name){
      ArrayList<EmployeeCls> ls = new ArrayList<>();
      if(name.length()==0)
        return getAllEmp();
      for(int i=0; i<db.size(); i++){
        String subName = db.get(i).getName();
        if(name.length()>subName.length())
          continue;
        subName = subName.substring(0,name.length());
        if(name.equals(subName))
          ls.add(db.get(i));
      }
      return ls;
    }
    public void sortByName(){
      for(int i=0; i<db.size(); i++){
        for(int j=1+i; j<db.size(); j++){
          if(db.get(i).getName().compareTo(db.get(j).getName())>0){
            EmployeeCls emp = db.get(i);
            db.set(i, db.get(j));
            db.set(j, emp);
          }
        }
      }
    }
}
