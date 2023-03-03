package employee;

import java.util.Scanner;

public class Certificate {
    String cerID,cerName,cerRank;
    Scanner sc = new Scanner(System.in);
    public Certificate() {
    }

    public Certificate(String cerID, String cerName, String cerRank) {
        this.cerID = cerID;
        this.cerName = cerName;
        this.cerRank = cerRank;
    }
    
    public String getCerID() {
        return this.cerID;
    }

    public void setCerID(String cerID) {
        this.cerID = cerID;
    }

    public String getCerName() {
        return this.cerName;
    }

    public void setCerName(String cerName) {
        this.cerName = cerName;
    }

    public String getCerRank() {
        return this.cerRank;
    }

    public void setCerRank(String cerRank) {
        this.cerRank = cerRank;
    }
    @Override
    public String toString() {
        return "Id:" + this.getCerID() + " | Ten bang: " + this.getCerName() + " | Xep loai: " + this.getCerRank();
    }
    public void Input()
    {
        System.out.print('\t'+"Ma bang cap:  ");
        String a = new String();
        a = sc.nextLine();
        System.out.print('\t'+"Ten bang cap: ");
        String b = new String();
        b = sc.nextLine();
        System.out.print('\t'+"Xep loai: ");    
        String c= new String();
        c= sc.nextLine();
        this.cerID = a;
        this.cerName = b; 
        this.cerRank = c;
    }
    
}
