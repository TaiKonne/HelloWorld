package employee;
import java.util.*;
import Component.DateTime;

public abstract class Employee {
    protected String id,fullname,phone,email;
    protected DateTime birthday;
    protected ArrayList<Certificate> certificates;
    Scanner sc = new Scanner(System.in);

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

    public void Input()
    {
        System.out.println("Ma Nhan Vien: ");
        String a= new String();
        a=sc.nextLine();
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
        this.id = a;
        this.fullname = b;
        this.phone = c;
        this.email = d;
        this.birthday = dt;
        this.certificates = cer;
    }
    
    public void Output()
    {
        System.out.println("Id: "+ this.getId() + '\n' + "Ho & Ten: " + this.getFullname() + '\n' + "sdt: " + this.getPhone() + '\n' + "Email: " + this.getEmail());
        System.out.println("Ngay sinh: " + this.getBirthday().getDay() + "/" + this.getBirthday().getMonth() + "/" + this.getBirthday().getYear());
        System.out.println("| Bang cap: ");
        for(int i=0;i<certificates.size();i++)
        {
            System.out.println( '\t' + "" + certificates.get(i));
        }
    }
}
