
//Multiplication table of n number
import java.util.Scanner;

public class ch_10_1PS {
    public static void main(String[] args) {
        System.out.println("Enter number for table");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }

    }
}