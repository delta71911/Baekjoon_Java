package Stage_01;
import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        stdIn.close();

        System.out.println(a * (b % 10));
        System.out.println(a * (b % 100 / 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}
