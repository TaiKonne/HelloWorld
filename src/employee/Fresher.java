package employee;

import java.util.*;
import Component.DateTime;

public class Fresher extends Employee {
    DateTime gradate;
    String grarank;
    String schoolname;
    Scanner sc = new Scanner(System.in);

    public Fresher() {
    }

    public Fresher(DateTime gradate, String grarank, String schoolname) {
        this.gradate = gradate;
        this.grarank = grarank;
        this.schoolname = schoolname;
    }

    public Fresher(int id, String fullname, String phone, String email, DateTime birthday,
            ArrayList<Certificate> certificates, ArrayList<Company> companies, double salary, DateTime gradate,
            String grarank, String schoolname, String departmentName) {
        super(id, fullname, phone, email, birthday, certificates, companies, salary, departmentName);
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
        return "Thoi gian tot nghiep: " + this.getGradate() + " | Xep loai: " + this.getGrarank()
                + " | Truong tot nghiep: " + this.getSchoolname();
    }

    public void Input() {

        super.Input();
        System.out.print("Thoi gian tot nghiep: ");
        DateTime t = new DateTime();
        t.Input();

        System.out.print("Loai tot nghiep: ");
        String h = new String();
        h = sc.nextLine();

        System.out.print("Ten truong: ");
        String z = new String();
        z = sc.nextLine();

        this.gradate = t;
        this.grarank = h;
        this.schoolname = z;
    }

    public void Output() {
        super.Output();
        System.out.println("Thoi gian tot nghiep: " + this.getGradate().getDay() + "/" + this.getGradate().getMonth()
                + "/" + this.getGradate().getYear()
                + '\n' + "Loai tot nghiep: " + this.getGrarank() + '\n' + "Ten truong: " + this.getSchoolname());
    }

}
