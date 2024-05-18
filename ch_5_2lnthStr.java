import java.util.Scanner;

public class ch_5_2lnthStr {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int length = name.length();
        System.out.println(length);
    }
}
