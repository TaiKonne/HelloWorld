package employee;

import java.util.*;

import Component.DateTime;
public class Experience extends Employee {
    int expyear;
    ArrayList<String> proSkill = new ArrayList<String>();

    Scanner sc = new Scanner(System.in);
    public Experience(){}
    public Experience(int expyear, ArrayList<String> proSkill) {
        this.expyear = expyear;
        this.proSkill = proSkill;
    }
    public Experience(int id, String fullname , String phone , String email, DateTime birthday , ArrayList<Certificate> certificates,ArrayList<Company> companies  , double salary , int expyear , ArrayList<String> proskill, String departmentName)
    {
        super(id, fullname, phone, email, birthday, certificates,companies ,salary, departmentName);
        this.expyear = expyear;
        this.proSkill = proskill;
    }
    public int getExpyear() {
        return this.expyear;
    }

    public void setExpyear(int expyear) {
        this.expyear = expyear;
    }

    public ArrayList<String> getProSkill() {
        return this.proSkill;
    }

    public void setProSkill(ArrayList<String> proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {

        return "" + 
            "Nam kinh nghiem: " + this.getExpyear()  + "| Ky nang chuyen nganh: " + this.getProSkill() ;
    }
    // String id, String fullname , String phone , String email, DateTime birthday , ArrayList<Certificate> certificates , int expyear , ArrayList<String> proskill
    public void Input()
    {
        super.Input();
        System.out.println("So nam kinh nghiem: ");
        int y = sc.nextInt();

        System.out.println("So ky nang chuyen nganh: ");
        int kn = sc.nextInt();
        sc.nextLine();
        ArrayList<String> skill = new ArrayList<String>();
        for(int i=0;i<kn;i++)
        {   System.out.print('\t'+"Ten ky nang: ");
            String l = new String();
            l = sc.nextLine();
            skill.add(l);
        }
        this.expyear = y;
        this.proSkill = skill;
    }

    public void Output()
    {
        super.Output();
        System.out.println("So nam kinh nghiem: " + this.getExpyear());
        System.out.println("Ky nang chuyen nganh: ");
        for(int i=0;i<proSkill.size();i++)
        {
            System.out.println('\t' + proSkill.get(i));
        }
    }
}
