import java.util.*;
import employee.*;

//Test push 
public class Test_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> a = new ArrayList<Employee>();
        ManageFactory b = new ManageFactory(a);
        System.out.println("Chon cac muc trong Menu: ");
        System.out.println("0. Thoat" + '\n' + "1. Them Nhan Vien" + '\n' + "2. In " + '\n' + "3. Sua Thong Tin" + '\n'
                + "4. Xoa Thong Tin" + '\n' + "5. Tim Kiem Nhan Vien" + '\n' + "6. Tang Luong Nhan Vien" + '\n'
                + "7. Xem lich su cac cong ty nhan vien da lam viec" + '\n' + "8. Sap xep danh sach nhan vien" + '\n'
                + "9. Tim kiem cac nhan vien co ki nang phu hop voi du an" + '\n'
                + "10. Tim kiem cac thuc tap sinh can hoc them cac kien thuc");
        int n = 0;
        while (true) {
            System.out.print("Nhap lua chon: ");
            n = sc.nextInt();
            sc.nextLine();
            if (n == 1) {
                b.Input();
            } else if (n == 2) {
                b.Output();
            } else if (n == 3) {
                b.EditInfor();
            } else if (n == 4) {
                b.RemoveEmployee();
            } else if (n == 5) {
                b.FindEmployee();
            } else if (n == 6) {
                b.UpdateSalary();
            } else if (n == 7) {
                b.WorkHistory();
            } else if (n == 8) {
                b.SortEmployee();
            } else if (n == 9) {
                b.FindEmployeesForProject();
            } else if (n == 10) {
                b.Trainlearning();
            } else if (n == 0)
                return;
        }
    }
}
