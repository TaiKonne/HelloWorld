import java.util.ArrayList;
import java.util.Scanner;

import employee.*;
import Component.*;

public class ManageFactory {
    private ArrayList<Employee> a  = new ArrayList<Employee>();
    private int n;
    Scanner sc = new Scanner(System.in);

    public ManageFactory() {
    }

    public ManageFactory(ArrayList<Employee> a, int n) {
        this.a = a;
        this.n = n;
    }

    public void Input()
    {
        int type;
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap lua chon: " + "1. Experience"  + "| 2. Fresher" + "| 3. Intern");
            type =sc.nextInt();
            if(type==1)
            {
                Experience k = new Experience();
                k.Input();
                a.add(k);
            }
            else if(type==2)
            {
                Fresher k = new Fresher();
                k.Input();
                a.add(k);
            }
            else if(type==3)
            {
                Intern k = new Intern();
                k.Input();
                a.add(k);
            }
            else i--;
        }
    }
    public void Output()
    {
        for(int i=0;i<a.size();i++)
        {
            a.get(i).Output();
        }
    }
    public void FindEmployee(String ids)
    {
        int k = -1;
        for(int i=0;i<a.size();i++)
        {
            if(ids.equals(a.get(i).getId()))
            {
                k=i;
                break;
            }
        }
        if(k == -1)
            System.out.println("Not found");
        else a.get(k).Output();
    }
    public void RemoveEmployee(String ids)
    {
        int k = -1;
        for(int i=0;i<a.size();i++)
        {
            if(ids.equals(a.get(i).getId()))
            {
                k=i;
                break;
            }
        }  
        if(k == -1)
            System.out.println("Not found");
        else a.remove(k);
    }

}
