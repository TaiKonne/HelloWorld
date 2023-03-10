import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import employee.*;
import Component.*;
import data.dataContext;

public class ManageFactory {
    private ArrayList<Employee> a = new ArrayList<Employee>();
    Scanner sc = new Scanner(System.in);

    public ManageFactory() {
    }

    public ManageFactory(ArrayList<Employee> a) {
        this.a = a;
    }

    public void Input() {
        System.out.println("--------- THEM NHAN VIEN ---------");
        dataContext data = new dataContext();
        int type;
        do {
            System.out.println('\t' + "Nhap lua chon: " + "1. Experience" + "| 2. Fresher" + "| 3. Intern");
            System.out.print("--> ");
            type = sc.nextInt();
            if (type != 1 && type != 2 && type != 3) {
                System.out.println("Nhap lai! ");
                System.out.println('\t' + "Nhap lai lua chon: " + "1. Experience" + "| 2. Fresher" + "| 3. Intern");
                System.out.print("--> ");
            }
            if (type == 1) {
                // Experience k = new Experience();
                // k.Input();
                for (Experience exp : data.addEmployExperience()) {
                    a.add(exp);
                }
                return;

            } else if (type == 2) {
                // Fresher k = new Fresher();
                // k.Input();
                for (Fresher fresh : data.addEmployFresher()) {
                    a.add(fresh);
                }
                return;
            } else if (type == 3) {
                // Intern k = new Intern();
                // k.Input();
                for (Intern inter : data.addEmployIntern()) {
                    a.add(inter);
                }
                return;
            }
        } while (type != 1 && type != 2 && type != 3);
    }

    public void Output() {
        System.out.println("--------- DANH SACH NHAN VIEN ---------");
        for (int i = 0; i < a.size(); i++) {
            a.get(i).Output();
        }
    }

    public void FindEmployee() // Tim thay la xuat thong tin ra
    {
        System.out.println("--------- TIM KIEM THONG TIN NHAN VIEN ---------");
        System.out.print("Nhap Id can tim: ");
        int ids = sc.nextInt();
        int k = -1;
        for (int i = 0; i < a.size(); i++) {
            if (ids == a.get(i).getId()) {
                k = i;
                break;
            }
        }
        if (k == -1)
            System.out.println("Not found");
        else
            a.get(k).Output();
    }

    public void RemoveEmployee() {
        System.out.println("--------- XOA NHAN VIEN ---------");
        System.out.print("Nhap Id can tim: ");
        int ids = sc.nextInt();
        int k = -1;
        for (int i = 0; i < a.size(); i++) {
            if (ids == a.get(i).getId()) {
                k = i;
                break;
            }
        }
        if (k == -1)
            System.out.println("Not found");
        else
            a.remove(k);
    }

    public void EditInfor() {
        System.out.println("--------- CHINH SUA THONG TIN NHAN VIEN ---------");
        System.out.print("Nhap Id can tim: ");
        int ids = sc.nextInt();
        int k = -1;
        for (int i = 0; i < a.size(); i++) {
            if (ids == a.get(i).getId()) {
                k = i;
                break;
            }
        }
        if (k == -1) {
            System.out.println("Not found");
        } else {
            if (a.get(k) instanceof Experience) {
                Experience tmp = (Experience) a.get(k);
                System.out.println("Chon thong tin can thay doi: ");
                System.out.println("0. Thoat" + '\n' + "1. Ho & ten" + '\n' + "2. Email" + '\n' + "3. So dien thoai"
                        + '\n' + "4. Ngay sinh" + '\n' + "5. Bang cap" + '\n' + "6. Luong" + '\n'
                        + "7. So Nam kinh nghiem" + '\n' + "8. Ky nang chuyen nganh");
                System.out.print("--> ");
                int choose = sc.nextInt();
                sc.nextLine();
                if (choose == 1) {
                    System.out.print("Ho va ten moi: ");
                    String newfullname = new String();
                    newfullname = sc.nextLine();
                    a.get(k).setFullname(newfullname);
                } else if (choose == 2) {
                    System.out.print("Email moi: ");
                    String newEmail = new String();
                    newEmail = sc.nextLine();
                    a.get(k).setEmail(newEmail);
                } else if (choose == 3) {
                    System.out.print("So dien thoai moi: ");
                    String newPhone = new String();
                    newPhone = sc.nextLine();
                    a.get(k).setPhone(newPhone);
                } else if (choose == 4) {
                    System.out.println("Ngay Thang nam sinh moi:");
                    System.out.print('\t' + "Ngay: ");
                    int dd = sc.nextInt();
                    System.out.print('\t' + "Thang: ");
                    int mm = sc.nextInt();
                    System.out.print('\t' + "Nam: ");
                    int yy = sc.nextInt();
                    DateTime newNgaysinh = new DateTime(dd, mm, yy);
                    a.get(k).setBirthday(newNgaysinh);
                } else if (choose == 5) {
                    System.out.print("So luong bang cap moi: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    ArrayList<Certificate> newbangcap = new ArrayList<Certificate>();
                    for (int i = 0; i < sl; i++) {
                        Certificate z = new Certificate();
                        z.Input();
                        newbangcap.add(z);
                    }
                    a.get(k).setCertificates(newbangcap);
                } else if (choose == 6) {
                    System.out.print("Muc luong moi: ");
                    double newLuong = sc.nextDouble();
                    a.get(k).setSalary(newLuong);
                } else if (choose == 7) {
                    System.out.print("So nam kinh nghiem: ");
                    int newExpyear = sc.nextInt();
                    tmp.setExpyear(newExpyear);
                } else if (choose == 8) {
                    System.out.print("So ky nang chuyen nganh: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    ArrayList<String> newproSkill = new ArrayList<String>();
                    for (int i = 0; i < sl; i++) {
                        String z = new String();
                        z = sc.nextLine();
                        newproSkill.add(z);
                    }
                    tmp.setProSkill(newproSkill);
                } else
                    return;
            } else if (a.get(k) instanceof Fresher) {
                Fresher tmp = (Fresher) a.get(k);
                System.out.println("Chon thong tin can thay doi: ");
                System.out.println("0. Thoat" + '\n' + "1. Ho & ten" + '\n' + "2. Email" + '\n' + "3. So dien thoai"
                        + '\n' + "4. Ngay sinh" + '\n' + "5. Bang cap" + '\n' + "6. Luong" + '\n'
                        + "7. Thoi gian tot nghiep" + '\n' + "8. Loai tot nghiep" + '\n' + "9. Truong tot nghiep");
                System.out.print("--> ");
                int choose = sc.nextInt();
                sc.nextLine();
                if (choose == 1) {
                    System.out.print("Ho va ten moi: ");
                    String newfullname = new String();
                    newfullname = sc.nextLine();
                    a.get(k).setFullname(newfullname);
                } else if (choose == 2) {
                    System.out.print("Email moi: ");
                    String newEmail = new String();
                    newEmail = sc.nextLine();
                    a.get(k).setEmail(newEmail);
                } else if (choose == 3) {
                    System.out.print("So dien thoai moi: ");
                    String newPhone = new String();
                    newPhone = sc.nextLine();
                    a.get(k).setPhone(newPhone);
                } else if (choose == 4) {
                    System.out.println("Ngay Thang nam sinh moi:");
                    System.out.print('\t' + "Ngay: ");
                    int dd = sc.nextInt();
                    System.out.print('\t' + "Thang: ");
                    int mm = sc.nextInt();
                    System.out.print('\t' + "Nam: ");
                    int yy = sc.nextInt();
                    DateTime newNgaysinh = new DateTime(dd, mm, yy);
                    a.get(k).setBirthday(newNgaysinh);
                } else if (choose == 5) {
                    System.out.print("So luong bang cap moi: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    ArrayList<Certificate> newbangcap = new ArrayList<Certificate>();
                    for (int i = 0; i < sl; i++) {
                        Certificate z = new Certificate();
                        z.Input();
                        newbangcap.add(z);
                    }
                    a.get(k).setCertificates(newbangcap);
                } else if (choose == 6) {
                    System.out.print("Muc luong moi: ");
                    double newLuong = sc.nextDouble();
                    a.get(k).setSalary(newLuong);
                } else if (choose == 7) {
                    System.out.print("Thoi gian tot nghiep moi: ");
                    System.out.print('\t' + "Ngay tot nghiep: ");
                    int dd = sc.nextInt();
                    System.out.print('\t' + "Thang tot nghiep: ");
                    int mm = sc.nextInt();
                    System.out.print('\t' + "Nam tot nghiep: ");
                    int yy = sc.nextInt();
                    DateTime newgraDate = new DateTime(dd, mm, yy);
                    tmp.setGradate(newgraDate);
                } else if (choose == 8) {
                    System.out.print("Loai tot nghiep moi: ");
                    String newgraRank = new String();
                    newgraRank = sc.nextLine();
                    tmp.setGrarank(newgraRank);
                } else if (choose == 9) {
                    System.out.print("Ten truong: ");
                    String newschoolname = new String();
                    newschoolname = sc.nextLine();
                    tmp.setSchoolname(newschoolname);
                } else
                    return;
            } else {
                Intern tmp = (Intern) a.get(k);
                System.out.println("Chon thong tin can thay doi: ");
                System.out.println("0. Thoat" + '\n' + "1. Ho & ten" + '\n' + "2. Email" + '\n' + "3. So dien thoai"
                        + '\n' + "4. Ngay sinh" + '\n' + "5. Bang cap" + '\n' + "6. Luong" + '\n' + "7. Chuyen nganh"
                        + '\n' + "8. Truong tot nghiep" + '\n' + "9. Hoc ky dang hoc");
                System.out.print("--> ");
                int choose = sc.nextInt();
                sc.nextLine();
                if (choose == 1) {
                    System.out.print("Ho va ten moi: ");
                    String newfullname = new String();
                    newfullname = sc.nextLine();
                    a.get(k).setFullname(newfullname);
                } else if (choose == 2) {
                    System.out.print("Email moi: ");
                    String newEmail = new String();
                    newEmail = sc.nextLine();
                    a.get(k).setEmail(newEmail);
                } else if (choose == 3) {
                    System.out.print("So dien thoai moi: ");
                    String newPhone = new String();
                    newPhone = sc.nextLine();
                    a.get(k).setPhone(newPhone);
                } else if (choose == 4) {
                    System.out.println("Ngay Thang nam sinh moi:");
                    System.out.print('\t' + "Ngay: ");
                    int dd = sc.nextInt();
                    System.out.print('\t' + "Thang: ");
                    int mm = sc.nextInt();
                    System.out.print('\t' + "Nam: ");
                    int yy = sc.nextInt();
                    DateTime newNgaysinh = new DateTime(dd, mm, yy);
                    a.get(k).setBirthday(newNgaysinh);
                } else if (choose == 5) {
                    System.out.print("So luong bang cap moi: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    ArrayList<Certificate> newbangcap = new ArrayList<Certificate>();
                    for (int i = 0; i < sl; i++) {
                        Certificate z = new Certificate();
                        z.Input();
                        newbangcap.add(z);
                    }
                    a.get(k).setCertificates(newbangcap);
                } else if (choose == 6) {
                    System.out.print("Muc luong moi: ");
                    double newLuong = sc.nextDouble();
                    a.get(k).setSalary(newLuong);
                } else if (choose == 7) {
                    System.out.print("Chuyen nganh dang hoc: ");
                    String newmajors = new String();
                    newmajors = sc.nextLine();
                    tmp.setMajor(newmajors);
                } else if (choose == 8) {
                    System.out.print("Ten truong: ");
                    String newschoolname = new String();
                    newschoolname = sc.nextLine();
                    tmp.setSchoolname(newschoolname);
                } else if (choose == 9) {
                    System.out.print("Hoc ky dang hoc: ");
                    int newSemester = sc.nextInt();
                    tmp.setSemester(newSemester);
                } else
                    return;
            }
        }
    }

    public void UpdateSalary() {
        System.out.println("--------- CAP NHAT LUONG NHAN VIEN ---------");
        System.out.print("Nam can xet: ");
        int yy = sc.nextInt();
        System.out.print("Phan tram luong muon tang: ");
        int percent = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) instanceof Experience) {
                Experience t = (Experience) a.get(i);
                if (t.getExpyear() >= yy) {
                    double x = t.getSalary() * percent / 100;
                    t.setSalary(t.getSalary() + x);
                }
            }
        }
    }

    public void WorkHistory() {
        System.out.println("--------- XEM LICH SU LAM VIEC ---------");
        System.out.print("Nhap Id can tim: ");
        int ids = sc.nextInt();
        int k = -1;
        for (int i = 0; i < a.size(); i++) {
            if (ids == a.get(i).getId()) {
                k = i;
                break;
            }
        }
        if (k == -1)
            System.out.println("Not found");
        else {
            for (int j = 0; j < a.get(k).getCompany().size(); j++) {
                System.out.println(a.get(j).getCompany());
            }
        }
    }

    public void SortEmployee() { // sort lương nhân viên theo tùy chọn và theo từng loại nhân viên được chọn
        System.out.println("--------- SAP XEP DANH SACH NHAN VIEN ---------");
        System.out.println("Hinh thuc sap xep");
        System.out.println('\t' + "1. Tang dan" + '\n' + '\t' + "2. Giam dan");
        System.out.print("--> ");
        int typeSort = sc.nextInt();
        System.out.println("Loai nhan vien");
        System.out.println('\t' + "1. experience" + '\n' + '\t' + "2. fresher" + '\n' + '\t' + "3.intern");
        System.out.print("--> ");
        int ex_emloyee = sc.nextInt();
        // ArrayList<Employee> tmp = new ArrayList<Employee>();
        // ArrayList<Employee> a = new ArrayList<Employee>() Experience Intern Fresher
        // Collections.swap(ArrList, 1, 2);

        if (ex_emloyee == 1) // chọn loại kinh nghiệm của nhân viên Experience
        {
            if (typeSort == 1) { // tăng dần
                for (int i = 0; i < a.size() - 1; i++) {
                    for (int j = i + 1; j < a.size(); j++) {
                        if (a.get(i) instanceof Experience && a.get(j) instanceof Experience) {
                            if (a.get(i).getSalary() > a.get(j).getSalary()) {
                                Collections.swap(a, i, j);
                            }
                        }
                    }
                }
            } else {
                for (int i = 0; i < a.size() - 1; i++) {
                    for (int j = i + 1; j < a.size(); j++) {
                        if (a.get(i) instanceof Experience && a.get(j) instanceof Experience) {
                            if (a.get(i).getSalary() < a.get(j).getSalary()) {
                                Collections.swap(a, i, j);
                            }
                        }
                    }
                }
            }
        } else if (ex_emloyee == 2) { // Fresher
            if (typeSort == 1) { // tăng dần
                for (int i = 0; i < a.size() - 1; i++) {
                    for (int j = i + 1; j < a.size(); j++) {
                        if (a.get(i) instanceof Fresher && a.get(j) instanceof Fresher) {
                            if (a.get(i).getSalary() > a.get(j).getSalary()) {
                                Collections.swap(a, i, j);
                            }
                        }
                    }
                }
            } else {
                for (int i = 0; i < a.size() - 1; i++) {
                    for (int j = i + 1; j < a.size(); j++) {
                        if (a.get(i) instanceof Fresher && a.get(j) instanceof Fresher) {
                            if (a.get(i).getSalary() < a.get(j).getSalary()) {
                                Collections.swap(a, i, j);
                            }
                        }
                    }
                }
            }
        } else {
            if (typeSort == 1) { // tăng dần
                for (int i = 0; i < a.size() - 1; i++) {
                    for (int j = i + 1; j < a.size(); j++) {
                        if (a.get(i) instanceof Intern && a.get(j) instanceof Intern) {
                            if (a.get(i).getSalary() > a.get(j).getSalary()) {
                                Collections.swap(a, i, j);
                            }
                        }
                    }
                }
            } else {
                for (int i = 0; i < a.size() - 1; i++) {
                    for (int j = i + 1; j < a.size(); j++) {
                        if (a.get(i) instanceof Intern && a.get(j) instanceof Intern) {
                            if (a.get(i).getSalary() < a.get(j).getSalary()) {
                                Collections.swap(a, i, j);
                            }
                        }
                    }
                }
            }
        }
        for (Employee x : a) {
            x.Output();
        }
    }

    public void FindEmployeesForProject() {
        System.out.println("--------- CHON KY NANG CAN THIET CHO DU AN ---------");
        ArrayList<String> skills = new ArrayList<String>();
        this.OptionsSkills(skills);

        for (int i = 0; i < skills.size(); i++) {
            skills.set(i, skills.get(i).toUpperCase());
            System.out.println(skills.get(i));
        }
        int ok = 0;
        for (Employee epl : this.a) {
            if (epl instanceof Experience) {
                Experience eplCur = (Experience) epl;
                ArrayList<String> proskill = eplCur.getProSkill();
                for (String skill : proskill) {
                    String skillTarget = skill.toUpperCase();
                    if (skills.contains(skillTarget) == true) {
                        eplCur.Output();
                        ok = 1;
                        break;
                    }
                }
            }
        }
        if (ok == 0) {
            System.out.println("Khong co nhan vien phu hop cho du an !!!");
        }
    }

    public void OptionsSkills(ArrayList<String> skills) {
        System.out.println("Chon ky nang");
        System.out.println('\t' + "1. Mobile");
        System.out.println('\t' + "2. IOS");
        System.out.println('\t' + "3. Frontend");
        System.out.println('\t' + "4. Backend");
        System.out.println('\t' + "0. Xong");
        System.out.print("--> ");
        int op = sc.nextInt();
        if (op == 1) {
            skills.add("Mobile");
            OptionsSkills(skills);
        } else if (op == 2) {
            skills.add("IOS");
            OptionsSkills(skills);
        } else if (op == 3) {
            skills.add("Frontend");
            OptionsSkills(skills);
        } else if (op == 4) {
            skills.add("Backend");
            OptionsSkills(skills);
        } else
            return;
    }

    public void tmp(int op) {
        ArrayList<Intern> intern = new ArrayList<Intern>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) instanceof Intern) {
                a.get(i).Output();
                System.out.println("Chon hinh thuc");
                System.out.println('\t' + "1. Them thuc tap sinh" + '\n' + '\t' + "2. Bo qua thuc tap sinh");
                System.out.print("--> ");
                int choose = 0;
                choose = sc.nextInt();
                if (choose == 1) {
                    intern.add((Intern) a.get(i));
                    Intern tmp = new Intern();
                    tmp = (Intern) a.get(i);
                    int fl = 1;
                    tmp.setStatusIntern(fl);
                    a.set(i, (Intern) tmp);
                }
            }
        }
    }

    public void Trainlearning() {
        System.out.println("--------- TAP HUAN CHO NHAN VIEN THUC TAP ---------");
        System.out.println("Chon ky nang");
        System.out.println('\t' + "1. Mobile");
        System.out.println('\t' + "2. IOS");
        System.out.println('\t' + "3. Frontend");
        System.out.println('\t' + "4. Backend");
        System.out.print("--> ");
        int op = sc.nextInt();
        if (op == 1) {
            tmp(op);
        } else if (op == 2) {
            tmp(op);
        } else if (op == 3) {
            tmp(op);
        } else if (op == 4) {
            tmp(op);
        }
    }

    public void FillterEmployeeByDepartment() {
        System.out.println("--------- LOC NHAN VIEN  THEO BO PHAN ---------");
        System.out.print("Nhap ten bo phan: ");
        String departmentName = sc.next();
        String target = departmentName.toUpperCase();
        for (Employee epl : a) {
            if (epl.getDepartment().toUpperCase().equals(target)) {
                epl.Output();
            }
        }
    }
}
