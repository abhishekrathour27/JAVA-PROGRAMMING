//Program for if Stuent avg > 40 and he got above 33 in all subject than he qualify for Interance

import java.util.Scanner;

public class ch_7_Ifelse {
    public static void main(String[] args) {
        int s1, s2, s3;
        System.out.println("Enter marks :");
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        int per = (s1 + s2 + s3) / 3;
        if (per > 40 && s1 > 33 && s2 > 33 && s3 > 33) {
            System.out.println("You are eligible for take adimission");
        } else {
            System.out.println("You are not eligible for adimission");
        }

    }
}
