import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        // Computer move
        Random rand = new Random();
        int computerMove = rand.nextInt(3);
        int playerMove;
        while (true) {
            // Player move
            System.out.println("Enter 0 for rock , 1 for paper, 2 for scissor");
            Scanner sc = new Scanner(System.in);
            playerMove = sc.nextInt();
            if (playerMove == 0 || playerMove == 1 || playerMove == 2) {
                break;
            }
            System.out.println("Enter valid move");
        }
        System.out.println("Computer move : "+computerMove);
        if(playerMove == computerMove){
           System.out.println("Draw");
        }
        else if(playerMove == 0 && computerMove == 2){
            System.out.println("You win");
        }
        else if(playerMove == 1 && computerMove == 0){
            System.out.println("You win");
        }
        else if(playerMove == 2 && computerMove == 1){
            System.out.println("You win");
        }
        else{
            System.out.println("Computer win");
        }
        
    }
}
