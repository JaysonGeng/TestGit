import java.util.*;

public class MyDate {
    private int year, mouth, day;

    public void dareInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("please input the nowtime");
        System.out.println("year:");
        year = scan.nextInt();
        System.out.println("mouth:");
        mouth = scan.nextInt();
        System.out.println("day:");
        day = scan.nextInt();
    }

    public boolean isLeapYear() {
        boolean b;
        if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0)
            b = true;
        else b = false;
        return b;
    }

    public int daysOfMouth() {

        int days = 31;
        if (mouth == 4 || mouth == 6 || mouth == 9 || mouth == 11)
            days = 30;
        else {
            if (mouth == 2)
                if (isLeapYear())
                    days = 29;
                else days = 28;
        }
        return days;
    }

    public void addoneday() {
        if (mouth == 12 && day == 31) {
            year++;
            mouth = 1;
            day = 1;
        } else if (day == daysOfMouth()) {
            mouth++;
            day = 1;
        } else day++;
    }

    public void decrease() {

        if (mouth == 1 && day == 1) {
            year--;
            mouth = 12;
            day = 31;
        } else if (day == 1) {
            mouth--;
            day = daysOfMouth();
        } else day--;
    }

    public void dateOutput() {
        System.out.println("the new date is:" + year + "年" + mouth + "月" + day + "日");
    }

    public void setdate(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    public void getDistance() {

        int year1, mouth1, day1;
        int year2, mouth2, day2;
        Scanner scan = new Scanner(System.in);
        System.out.println("please input the first date");
        System.out.println("year1:");
        year1 = scan.nextInt();
        System.out.println("mouth1:");
        mouth1 = scan.nextInt();
        System.out.println("day1:");
        day1 = scan.nextInt();

        System.out.println("please input the seconde date");
        System.out.println("year2:");
        year2 = scan.nextInt();
        System.out.println("mouth2:");
        mouth2 = scan.nextInt();
        System.out.println("day2:");
        day2 = scan.nextInt();

        int Distance = 0;

        boolean c = false;

        if (year1 > year2) {
            c = true;
        } else {
            if (mouth1 > mouth2)
                c = true;
            else if (day1 > day2)
                c = true;
        }

        int year3, mouth3, day3;

        if (c) {
            setdate(year1, mouth1, day1);
            year3 = year2;
            mouth3 = mouth2;
            day3 = day2;
        } else {
            setdate(year2, mouth2, day2);
            year3 = year1;
            mouth3 = mouth1;
            day3 = day1;

        }

        while (year != year3 || mouth != mouth3 || day != day3) {
            Distance++;
            addoneday();
        }
        System.out.println("the Distance is:"+Distance);
    }

}