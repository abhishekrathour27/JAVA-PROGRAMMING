
// Sum of first N even number
import java.util.Scanner;

public class ch_10_0psLoop {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i = i + 2) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
