import java.util.*;
import employee.*;

public class Test_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> a = new ArrayList<Employee>();
        ManageFactory b = new ManageFactory(a);
        System.out.println("--------- LUA CHON MENU THAO TAC ---------");
        System.out.println("0. Thoat" + '\n' + "1. Them Nhan Vien" + '\n' + "2. In danh sach nhan vien" + '\n' + "3. Chinh Sua Thong Tin nhan vien" + '\n'
                + "4. Sa thai nhan vien" + '\n' + "5. Tim Kiem thong tin Nhan Vien" + '\n' + "6. Cap nhat luong Nhan Vien" + '\n'
                + "7. Lich su lam viec cua nhan vien" + '\n' + "8. Sap xep danh sach nhan vien" + '\n'
                + "9. Tim kiem nhan vien cho du an" + '\n'
                + "10. Loc nhan vien theo bo phan" + '\n'
                + "11. Tap huan cho nhan vien thuc tap" + '\n'
                + "12. Xem lich su thao tac");
        int n = 0;
        while (true) {
            System.out.print("Nhap lua chon: ");
            n = sc.nextInt();
            sc.nextLine();
            if (n == 1) {
                b.Input();
                LOG x = LOG.getInstance();
                x.writeLOG(n);
            } else if (n == 2) {
                b.Output();
                LOG x = LOG.getInstance();
                x.writeLOG(n);
            } else if (n == 3) {
                b.EditInfor();
                LOG x = LOG.getInstance();
                x.writeLOG(n);
            } else if (n == 4) {
                b.RemoveEmployee();
                LOG x = LOG.getInstance();
                x.writeLOG(n);
            } else if (n == 5) {
                b.FindEmployee();
                LOG x = LOG.getInstance();
                x.writeLOG(n);
            } else if (n == 6) {
                b.UpdateSalary();
                LOG x = LOG.getInstance();
                x.writeLOG(n);
            } else if (n == 7) {
                b.WorkHistory();
                LOG x = LOG.getInstance();
                x.writeLOG(n);
            } else if (n == 8) {
                b.SortEmployee();
                LOG x = LOG.getInstance();
                x.writeLOG(n);
            } else if (n == 9) {
                b.FindEmployeesForProject();
                LOG x = LOG.getInstance();
                x.writeLOG(n);
            } else if (n == 10) {
                b.FillterEmployeeByDepartment();
                LOG x = LOG.getInstance();
                x.writeLOG(n);
            } else if (n == 11) {
                b.Trainlearning();
                LOG x = LOG.getInstance();
                x.writeLOG(n);
            } else if (n == 12) {
                LOG x = LOG.getInstance();
                x.writeLOG(n);
                x.OperationHistory();
            } else if (n == 0) {
                System.out.println("--------- THOAT CHUONG TRINH ---------");
                LOG x = LOG.getInstance();
                x.writeLOG(n);
                return;
            }
        }
    }
}
