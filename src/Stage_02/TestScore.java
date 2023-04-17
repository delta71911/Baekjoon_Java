package Stage_02;
import java.util.Scanner;
public class TestScore {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int score = stdIn.nextInt();
        stdIn.close();

        if (score >= 90)
            System.out.println("A");
        else if (score >= 80)
            System.out.println("B");
        else if (score >= 70)
            System.out.println("C");
        else if (score >= 60)
            System.out.println("D");
        else
            System.out.println("f");
    }
}
