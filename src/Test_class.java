import java.util.*;
import employee.*;
import Component.*;

public class Test_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> a = new ArrayList<Employee>();
        System.out.println("Nhap so luong nhan vien can them: ");
        int n =sc.nextInt();
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

        for(int i=0;i<a.size();i++)
        {
            a.get(i).Output();
        }
        sc.close();
    }
}
