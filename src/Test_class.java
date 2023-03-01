import java.util.*;
import employee.*;
import Component.*;

public class Test_class {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        ArrayList<Employee> a = new ArrayList<Employee>();
        System.out.println("Nhap so luong nhan vien can them: ");
        int n =sc.nextInt();
        ManageFactory b = new ManageFactory(a,n);
        b.Input();
        b.Output();
        System.out.println("Nhap Id can tim: ");
        String k = new String();
        k= sc.next();
        b.RemoveEmployee(k);
        System.out.println("Sau khi xoa: ");
        b.Output();
        // b.FindEmployee(k);
        // System.out.println(ans);
        sc.close();
    }
}
