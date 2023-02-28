package employee;
import java.util.*;
import Component.DateTime;

public abstract class Employee {
    protected String id,fullname,phone,email;
    protected DateTime birthday;
    protected ArrayList<Certificate> certificates;


    public Employee() {
    }

    public Employee(String id, String fullname, String phone, String email, DateTime birthday, ArrayList<Certificate> certificates) {
        this.id = id;
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
        this.certificates = certificates;
    }
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DateTime getBirthday() {
        return this.birthday;
    }

    public void setBirthday(DateTime birthday) {
        this.birthday = birthday;
    }

    public ArrayList<Certificate> getCertificates() {
        return this.certificates;
    }

    public void setCertificates(ArrayList<Certificate> certificates) {
        this.certificates = certificates;
    }

}
