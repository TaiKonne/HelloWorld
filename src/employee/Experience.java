package employee;

import java.util.*;

import javax.print.DocFlavor.STRING;

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
    public Experience(String id, String fullname , String phone , String email, DateTime birthday , ArrayList<Certificate> certificates, double salary , int expyear , ArrayList<String> proskill)
    {
        super(id, fullname, phone, email, birthday, certificates, salary);
        this.expyear = expyear;
        this.proSkill = proSkill;
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
            " expyear='" + getExpyear() + "'" +
            ", proSkill='" + getProSkill() + "'" +
            "";
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
        {   System.out.println("Ten ky nang: ");
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