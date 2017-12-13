import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyDate myDate =new MyDate();

        myDate.dareInput();;
        System.out.println("please input the add days");

        int days =in.nextInt();
        while (days!=0){
            myDate.addoneday();
            days--;
        }
        myDate.dateOutput();

        System.out.println("please input the decrease days");
        days =in.nextInt();
        while (days!=0){
            myDate.decrease();
            days--;
        }
        myDate.dateOutput();

        myDate.getDistance();

    }
}
