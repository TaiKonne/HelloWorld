package employee;

import java.util.*;
import Component.DateTime;

public class Intern extends Employee {
    String major, schoolname;
    int semester;
    int StatusIntern = 0;
    Scanner sc = new Scanner(System.in);

    public Intern() {
    }

    public Intern(String major, String schoolname, int semester) {
        this.major = major;
        this.schoolname = schoolname;
        this.semester = semester;
    }

    public Intern(int id, String fullname, String phone, String email, DateTime birthday,
            ArrayList<Certificate> certificates, ArrayList<Company> companies, double salary, String major,
            String schoolname, int semester, String departmentName, int StatusIntern) {
        super(id, fullname, phone, email, birthday, certificates, companies, salary, departmentName);
        this.major = major;
        this.schoolname = schoolname;
        this.semester = semester;
        this.StatusIntern = StatusIntern;
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

    public int getStatusIntern() {
        return this.StatusIntern;
    }

    public void setStatusIntern(int StatusIntern) {
        this.StatusIntern = StatusIntern;
    }

    public void Input() {
        super.Input();
        System.out.print("Ten chuyen nganh: ");
        String h = new String();
        h = sc.nextLine();

        System.out.print("Ten truong: ");
        String z = new String();
        z = sc.nextLine();

        System.out.print("Hoc ki dang hoc: ");
        int zz = sc.nextInt();
        this.major = h;
        this.schoolname = z;
        this.semester = zz;
    }
    public void Output() {
        super.Output();
        System.out.println("Ten chuyen nganh:" + this.getMajor() + '\n' + 
                            "Ten truong:" + this.getSchoolname() + '\n' + 
                            "Hoc ki: " + this.getSemester());        
        System.out.println((this.StatusIntern==0 ? "--> Chua duoc train" : "--> Dang duoc train"));
    }
}
