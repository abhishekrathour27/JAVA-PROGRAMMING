
//Factorial of n number:
import java.util.Scanner;

public class ch_10_2PS {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
    }
}
