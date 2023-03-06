package employee;
import java.util.*;
import Component.DateTime;

public abstract class Employee {
    public static int generateId = 1;
    protected int id;
    protected String fullname,phone,email, departmentName;
    protected DateTime birthday;
    protected ArrayList<Certificate> certificates;
    protected ArrayList<Company> companies;
    protected double salary;
    Scanner sc = new Scanner(System.in);

    public Employee() {
    }

    public Employee(int id2, String fullname, String phone, String email, DateTime birthday, ArrayList<Certificate> certificates, ArrayList<Company> companies, double salary, String departmentName) {
        this.id = Employee.generateId;
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
        this.certificates = certificates;
        this.companies = companies;
        this.salary = salary;
        this.departmentName = departmentName;
        Employee.generateId++;
    }
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
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
    public double getSalary()
    {
        return this.salary;
    }
    public  void setSalary(double salarys)
    {
        this.salary = salarys;
    }

    public ArrayList<Company> getCompany()
    {
        return this.companies;
    }
    public void setCompany(ArrayList<Company> companies)
    {
        this.companies =  companies;
    }
    public String getDepartment() {
        return this.departmentName;
    }

    public void setDepartment(String departmentName) {
        this.departmentName = departmentName;
    }
    public void Input()
    {
        System.out.println("Ma Nhan Vien: " + Employee.generateId);
        System.out.println("Ho & ten: ");
        String b= new String();
        b=sc.nextLine();

        System.out.println("So dien thoai: ");
        String c= new String();
        c= sc.nextLine();

        System.out.println("Email: ");
        String d= new String();
        d=sc.nextLine();
        
        System.out.println("Ngay Thang Nam sinh: ");
        DateTime dt = new DateTime();
        dt.Input();

        System.out.println("So luong bang cap: ");
        ArrayList<Certificate> cer = new ArrayList<Certificate>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Certificate k = new Certificate();
            k.Input();
            cer.add(k);
        }

        
        System.out.println("So luong cong ty da lam viec: ");
        ArrayList<Company> com = new ArrayList<Company>();
        n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Company k = new Company();
            k.Input();
            com.add(k);
        }
        System.out.print("Luong: ");
        double luong  = sc.nextDouble();
    
        this.id = Employee.generateId;
        this.fullname = b;
        this.phone = c;
        this.email = d;
        this.birthday = dt;
        this.certificates = cer;
        this.companies = com;
        this.salary = luong;
    }
    
    public void Output()
    {
        System.out.println("");
        System.out.println("Id: "+ this.getId() + '\n' + "Ho & Ten: " + this.getFullname() + '\n' + "So dien thoai: " + this.getPhone() + '\n' + "Email: " + this.getEmail());
        System.out.println("Ngay sinh: " + this.getBirthday().getDay() + "/" + this.getBirthday().getMonth() + "/" + this.getBirthday().getYear());
        System.out.println("Bang cap: ");
        for(int i=0;i<certificates.size();i++)
        {
            System.out.println('\t' + "" + this.certificates.get(i));
        }
        System.out.println("Lich su lam viec: ");
        for(int i=0;i< this.companies.size();i++)
        {
            System.out.println('\t' + "" + this.companies.get(i));
        }
        System.out.println("Luong: " + this.getSalary());
        System.out.println("Bo phan lam viec: " + this.getDepartment());
        
    }
}
