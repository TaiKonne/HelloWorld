package Component;

import java.util.Scanner;

public class DateTime {
    int day,month,year;
    Scanner sc = new Scanner(System.in);
    public DateTime() {
    }

    public DateTime(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "{" +
            " day='" + getDay() + "'" +
            ", month='" + getMonth() + "'" +
            ", year='" + getYear() + "'" +
            "}";
    }
    public void Input()
    {
        System.out.print('\t'+"Ngay:  ");
        int dd = sc.nextInt();
        System.out.print('\t'+"Thang: ");
        int mm = sc.nextInt();
        System.out.print('\t'+"Nam: ");
        int yyyy = sc.nextInt();
        this.day = dd;
        this.month = mm;
        this.year = yyyy;
    }
}
