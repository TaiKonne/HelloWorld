package employee;

import java.util.Scanner;

public class Company {
    String companyName;
    String companyReview;
    String rating;
    Scanner sc = new Scanner(System.in);
    public Company() {}
    public Company(String companyName, String companyReview, String rating) {
        this.companyName = companyName;
        this.companyReview = companyReview;
        this.rating = rating;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyReview() {
        return this.companyReview;
    }

    public void setCompanyReview(String companyReview) {
        this.companyReview = companyReview;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Ten cong ty: " + this.companyName + " | Danh gia: " + this.companyReview + " | Xep loai: " + this.rating;
    }
    public void Input()
    {
        System.out.print('\t'+ "Ten cong ty: ");
        String a = new String();
        a = sc.nextLine();
        System.out.print('\t'+"Nhan xet: ");
        String b = new String();
        b = sc.nextLine();
        System.out.print('\t'+"Xep loai: ");
        String rating = new String();
        rating = sc.nextLine();
        this.companyName = a;
        this.companyReview = b; 
        this.rating = rating;
    }
}

