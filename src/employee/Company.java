package employee;

import java.util.Scanner;

public class Company {

    protected String companyName;
    protected String companyReview;
    protected int rating;
    Scanner sc = new Scanner(System.in);
    public Company() {}
    public Company(String companyName, String companyReview, int rating) {
        this.companyName = companyName;
        this.companyReview = companyReview;
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Ten cong ty nhan vien tung lam viec: " + this.companyName + " | Danh gia cua cong ve nhan vien: " + this.companyReview + " | Xep loai: " + this.rating;
    }
    public void Input()
    {
        System.out.println("Ten cong ty: ");
        String a = new String();
        a = sc.nextLine();
        System.out.println("Danh gia cua cong ty: ");
        String b = new String();
        b = sc.nextLine();
        System.out.println("Xep loai: ");
        int rating = sc.nextInt();
        this.companyName = a;
        this.companyReview = b; 
        this.rating = rating;
    }
}

