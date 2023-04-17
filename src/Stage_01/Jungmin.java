package Stage_01;
import java.util.Scanner;
public class Jungmin {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();

        stdIn.close();

        System.out.println(a + b + c);
    }
}
