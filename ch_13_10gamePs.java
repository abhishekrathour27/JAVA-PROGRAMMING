import java.util.Random;
import java.util.Scanner;

class game {
    int cmpNum, userNum;

    public game() {
        Random rand = new Random();
        cmpNum = rand.nextInt(50);
      //  System.out.println(cmpNum);
    }

    // public void userInput() {
    //     System.out.println("Enter your guess...");
    //     Scanner sc = new Scanner(System.in);
    //     userNum = sc.nextInt();
    // }

    int count = 0;

    public void isCorrectNumber() {
        while (true) {
            System.out.println("Enter your guess...");
            Scanner sc = new Scanner(System.in);
            userNum = sc.nextInt();
            if (cmpNum == userNum) {
                System.out.printf("You guessed right in %d times", count);
                break;
            } else if (userNum < cmpNum) {
                System.out.println("Low...");
                count++;
               
            } else if (userNum > cmpNum) {
                System.out.println("High...");
                count++;
              
            }
        }
    }
}

public class ch_13_10gamePs {

    public static void main(String[] args) {
        game g = new game();
        // g.userInput();
        g.isCorrectNumber();
    }
}