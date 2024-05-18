import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n,i,prime = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        if(n == 0 || n == 1){
            prime = 1;
        }
        for(i = 2; i<n; i++){
            if(n % i == 0){
                prime = 1;
                break;
            }
        }
        if(prime == 0){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a prime number");
        }
       
    }
}
