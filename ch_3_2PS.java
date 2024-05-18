import java.util.Scanner;

public class ch_3_2PS {
    public static void main(String[] args) {
       int s1,s2,s3;
       int marks,per;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter marks of a Student:");
       s1 = sc.nextInt();
       s2 = sc.nextInt();
       s3 = sc.nextInt();
       marks = s1 + s2 + s3;
       per = marks / 3;
       System.out.println("Percentage = "+per);
       sc.close();

    }
}