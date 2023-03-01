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
    public void FindEmployee(String ids) //Tim thay la xuat thong tin ra
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
    public void EditInfor(String ids)
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
        {
            System.out.println("Not found");
        }
        else 
        {
            if(a.get(k) instanceof Experience)
            {
                Experience tmp = (Experience) a.get(k);
                System.out.println("Chon thong tin can thay doi: ");
                System.out.println("0. Thoat" +'\n' +"1. Ho & ten" +'\n' + "2. Email" +'\n' +"3. So dien thoai" +'\n' +"4. Ngay sinh" +'\n' + "5. Bang cap" +'\n' + "6. Luong" + '\n' + "7. So Nam kinh nghiem" + '\n' + "8. Ky nang chuyen nganh");

                int choose = sc.nextInt();
                sc.nextLine();
                if(choose == 1)
                {
                    System.out.println("Ho va ten moi:");
                    String newfullname = new String();
                    newfullname = sc.nextLine();
                    a.get(k).setFullname(newfullname);
                }
                else if(choose ==2)
                {
                    System.out.println("Email moi: ");
                    String newEmail = new String();
                    newEmail = sc.nextLine();
                    a.get(k).setEmail(newEmail);
                }
                else if(choose ==3)
                {
                    System.out.println("So dien thoai moi: ");
                    String newPhone = new String();
                    newPhone = sc.nextLine();
                    a.get(k).setPhone(newPhone);
                }
                else if(choose ==4)
                {
                    System.out.println("Ngay Thang nam sinh moi:");
                    System.out.println('\t' + "Ngay:");
                    int dd = sc.nextInt();
                    System.out.println('\t' + "Thang:");
                    int mm = sc.nextInt();
                    System.out.println('\t' + "Nam:");
                    int yy = sc.nextInt();
                    DateTime newNgaysinh = new DateTime(dd,mm,yy);
                    a.get(k).setBirthday(newNgaysinh);
                }
                else if(choose == 5)
                {
                    System.out.println("So luong bang cap moi:");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    ArrayList<Certificate> newbangcap = new ArrayList<Certificate>();
                    for(int i=0;i<sl ;i++)
                    {
                        Certificate z = new Certificate();
                        z.Input();
                        newbangcap.add(z);
                    }
                    a.get(k).setCertificates(newbangcap);
                }
                else if(choose == 6)
                {
                    System.out.println("Muc luong moi:");
                    double newLuong = sc.nextDouble();
                    a.get(k).setSalary(newLuong);
                }
                else if(choose ==7)
                {
                    System.out.println("So nam kinh nghiem:");
                    int newExpyear = sc.nextInt();
                    tmp.setExpyear(newExpyear);
                }
                else if(choose == 8)
                {
                    System.out.println("So ky nang chuyen nganh: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    ArrayList<String> newproSkill = new ArrayList<String>();
                    for(int i =0;i<sl;i++)
                    {
                        String z = new String();
                        z = sc.nextLine();
                        newproSkill.add(z);
                    }
                    tmp.setProSkill(newproSkill);
                }
                else return;
            }
            else if(a.get(k) instanceof Fresher)
            {
                Fresher tmp = (Fresher) a.get(k);
                System.out.println("Chon thong tin can thay doi: ");
                System.out.println("0. Thoat" +'\n' +"1. Ho & ten" +'\n' + "2. Email" +'\n' +"3. So dien thoai" +'\n' +"4. Ngay sinh" +'\n' + "5. Bang cap" +'\n' + "6. Luong" + '\n' + "7. Thoi gian tot nghiep" + '\n' + "8. Loai tot nghiep" + '\n' + "9. Truong tot nghiep");
                int choose = sc.nextInt();
                sc.nextLine();
                if(choose == 1)
                {
                    System.out.println("Ho va ten moi:");
                    String newfullname = new String();
                    newfullname = sc.nextLine();
                    a.get(k).setFullname(newfullname);
                }
                else if(choose ==2)
                {
                    System.out.println("Email moi: ");
                    String newEmail = new String();
                    newEmail = sc.nextLine();
                    a.get(k).setEmail(newEmail);
                }
                else if(choose ==3)
                {
                    System.out.println("So dien thoai moi: ");
                    String newPhone = new String();
                    newPhone = sc.nextLine();
                    a.get(k).setPhone(newPhone);
                }
                else if(choose ==4)
                {
                    System.out.println("Ngay Thang nam sinh moi:");
                    System.out.println('\t' + "Ngay:");
                    int dd = sc.nextInt();
                    System.out.println('\t' + "Thang:");
                    int mm = sc.nextInt();
                    System.out.println('\t' + "Nam:");
                    int yy = sc.nextInt();
                    DateTime newNgaysinh = new DateTime(dd,mm,yy);
                    a.get(k).setBirthday(newNgaysinh);
                }
                else if(choose == 5)
                {
                    System.out.println("So luong bang cap moi:");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    ArrayList<Certificate> newbangcap = new ArrayList<Certificate>();
                    for(int i=0;i<sl ;i++)
                    {
                        Certificate z = new Certificate();
                        z.Input();
                        newbangcap.add(z);
                    }
                    a.get(k).setCertificates(newbangcap);
                }
                else if(choose == 6)
                {
                    System.out.println("Muc luong moi:");
                    double newLuong = sc.nextDouble();
                    a.get(k).setSalary(newLuong);
                }
                else if(choose == 7)
                {
                    System.out.println("Thoi gian tot nghiep moi:");
                    System.out.println('\t' + "Ngay:");
                    int dd = sc.nextInt();
                    System.out.println('\t' + "Thang:");
                    int mm = sc.nextInt();
                    System.out.println('\t' + "Nam:");
                    int yy = sc.nextInt();
                    DateTime newgraDate = new DateTime(dd,mm,yy);
                    tmp.setGradate(newgraDate);
                }
                else if(choose==8)
                {
                    System.out.println("Loai tot nghiep moi:");
                    String newgraRank = new String();
                    newgraRank = sc.nextLine();
                    tmp.setGrarank(newgraRank);
                }
                else if(choose==9)
                {
                    System.out.println("Ten truong:");
                    String newschoolname = new String();
                    newschoolname = sc.nextLine();
                    tmp.setSchoolname(newschoolname);
                }
                else return;
            }
            else 
            {
                Intern tmp = (Intern) a.get(k);
                System.out.println("Chon thong tin can thay doi: ");
                System.out.println("0. Thoat" +'\n' +"1. Ho & ten" +'\n' + "2. Email" +'\n' +"3. So dien thoai" +'\n' +"4. Ngay sinh" +'\n' + "5. Bang cap" +'\n' + "6. Luong" + '\n' + "7. Chuyen nganh" + '\n' + "8. Truong tot nghiep" + '\n' + "9. Hoc ky dang hoc");
                int choose = sc.nextInt();
                sc.nextLine();
                if(choose == 1)
                {
                    System.out.println("Ho va ten moi:");
                    String newfullname = new String();
                    newfullname = sc.nextLine();
                    a.get(k).setFullname(newfullname);
                }
                else if(choose ==2)
                {
                    System.out.println("Email moi: ");
                    String newEmail = new String();
                    newEmail = sc.nextLine();
                    a.get(k).setEmail(newEmail);
                }
                else if(choose ==3)
                {
                    System.out.println("So dien thoai moi: ");
                    String newPhone = new String();
                    newPhone = sc.nextLine();
                    a.get(k).setPhone(newPhone);
                }
                else if(choose ==4)
                {
                    System.out.println("Ngay Thang nam sinh moi:");
                    System.out.println('\t' + "Ngay:");
                    int dd = sc.nextInt();
                    System.out.println('\t' + "Thang:");
                    int mm = sc.nextInt();
                    System.out.println('\t' + "Nam:");
                    int yy = sc.nextInt();
                    DateTime newNgaysinh = new DateTime(dd,mm,yy);
                    a.get(k).setBirthday(newNgaysinh);
                }
                else if(choose == 5)
                {
                    System.out.println("So luong bang cap moi:");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    ArrayList<Certificate> newbangcap = new ArrayList<Certificate>();
                    for(int i=0;i<sl ;i++)
                    {
                        Certificate z = new Certificate();
                        z.Input();
                        newbangcap.add(z);
                    }
                    a.get(k).setCertificates(newbangcap);
                }
                else if(choose == 6)
                {
                    System.out.println("Muc luong moi:");
                    double newLuong = sc.nextDouble();
                    a.get(k).setSalary(newLuong);
                }
                else if(choose == 7)
                {
                    System.out.println("Chuyen nganh dang hoc:");
                    String newmajors = new String();
                    newmajors = sc.nextLine();
                    tmp.setMajor(newmajors);
                }
                else if(choose==8)
                {
                    System.out.println("Ten truong:");
                    String newschoolname = new String();
                    newschoolname = sc.nextLine();
                    tmp.setSchoolname(newschoolname);
                }
                else if(choose==9)
                {
                    System.out.println("Hoc ky dang hoc:");
                    int newSemester = sc.nextInt();
                    tmp.setSemester(newSemester);
                }
                else return;
            }
        }
    }
}