
package Unit6.OOP.Class.Inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author chinda
 */
public class PersonCls {

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }   
    public void setName(String name) {
        this.name = name;
    }   
    public String getGender() {
        return gender;
    }   
    public void setGender(String gender) {
        this.gender = gender;
    }   
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getPob() {
        return pob;
    }
    public void setPob(String pob) {
        this.pob = pob;
    }

    public PersonCls() {
    }

    public PersonCls(int id, String name, String gender, Date dob, String pob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.pob = pob;
    }
    public PersonCls(int id, String name, String gender, String pob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.pob = pob;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yy");
        return getId()+"\t"+getName()+"\t"+getGender()+"\t"+sdf.format(getDob())+"\t"+getPob();
    }
    
    private int id;
    private String name;
    private String gender;
    private Date dob;
    private String pob;
}