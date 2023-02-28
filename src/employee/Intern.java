package employee;
import java.util.*;
import Component.DateTime;
public class Intern extends Employee{
    String major, schoolname;
    int semester;
    Scanner sc = new Scanner(System.in);
    public Intern() {
    }
    public Intern(String major, String schoolname, int semester) {
        this.major = major;
        this.schoolname = schoolname;
        this.semester = semester;
    }
    public Intern(String id, String fullname , String phone , String email, DateTime birthday , ArrayList<Certificate> certificates, String major, String schoolname, int semester) {
        super(id, fullname, phone, email, birthday, certificates);
        this.major = major;
        this.schoolname = schoolname;
        this.semester = semester;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchoolname() {
        return this.schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void Input()
    {
        super.Input();
        System.out.println("Ten chuyen nganh: ");
        String h = new String();
        h = sc.nextLine();

        System.out.println("Ten truong: ");
        String z = new String();
        z= sc.nextLine();

        System.out.println("Hoc ki dang hoc: ");
        int zz = sc.nextInt();
        this.major = h;
        this.schoolname = z;
        this.semester = zz;
    }
    public void Output()
    {
        super.Output();
        System.out.println("Ten chuyen nganh:" + this.getMajor() +  '\n' + "Ten truong:" + this.getSchoolname() +  '\n' + "Hoc ki: " + this.getSemester());
    }
}
