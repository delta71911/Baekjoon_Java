package Stage_02;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int year = stdIn.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0)
                System.out.println("1");
            else if (year % 400 == 0)
                System.out.println("1");
            else
                System.out.println("0");
        }
        else
            System.out.println("0");
    }
}
