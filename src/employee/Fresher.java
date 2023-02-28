package employee;
import java.util.*;
import Component.DateTime;
public class Fresher extends Employee {
    DateTime gradate;
    String grarank;
    String schoolname;
    public Fresher() {}
    public Fresher(DateTime gradate, String grarank, String schoolname) {
        this.gradate = gradate;
        this.grarank = grarank;
        this.schoolname = schoolname;
    }
    public Fresher(String id, String fullname , String phone , String email, DateTime birthday , ArrayList<Certificate> certificates, DateTime gradate, String grarank, String schoolname) {
        super(id, fullname, phone, email, birthday, certificates);
        this.gradate = gradate;
        this.grarank = grarank;
        this.schoolname = schoolname;
    }

    public DateTime getGradate() {
        return this.gradate;
    }

    public void setGradate(DateTime gradate) {
        this.gradate = gradate;
    }

    public String getGrarank() {
        return this.grarank;
    }

    public void setGrarank(String grarank) {
        this.grarank = grarank;
    }

    public String getSchoolname() {
        return this.schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
    @Override
    public String toString() {
        return "{" +
            " gradate='" + getGradate() + "'" +
            ", grarank='" + getGrarank() + "'" +
            ", schoolname='" + getSchoolname() + "'" +
            "}";
    }

}
