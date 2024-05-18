
import java.util.Scanner;

public class ch_3takeInput {
    public static void main(String[] args) {
        System.out.println("Taking input from user:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter any decimal value");
        float f = sc.nextFloat();
        System.out.println(f);
         sc.nextLine();// for charcter creat new object
        System.out.println("A = " + a);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character");
        String b = s.nextLine();
        System.out.println(b);
    }
}
