
package Unit6.OOP.Class.Inheritance.Product.DB;

import java.util.ArrayList;
public class AccountDB {
    public ArrayList<AccountCls> getDb() {
        return db;
    }
    public static void setDb(ArrayList<AccountCls> aDb) {
        db = aDb;
    }
    public void remove(int index){
        db.remove(index);
    }
    public AccountCls get(int index){
        return db.get(index);
    }
    public int size(){
        return db.size();
    }
    public ArrayList<AccountCls> getAll(){
        return db;
    }
    public void set(int index,AccountCls acc){
        db.set(index, acc);
    }
    public void add(AccountCls acc){
        db.add(acc);
    }
    public AccountDB() {
    }
    public AccountDB(AccountCls acc) {
        db.add(acc);
    }
    private static ArrayList<AccountCls> db = new ArrayList<>();
    
}
