
//Make Rock Paper Scissor Game
import java.util.Scanner;
import java.util.Random;

public class ch_9_Game {
    public static void main(String[] args) {
        // Computer move
        String[] rps = { "r", "p", "s" };
        String computerMove = rps[new Random().nextInt(rps.length)];
        String playerMove;
        // Player move
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Player move: (r , p, s)");
            playerMove = sc.nextLine();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                break;
            }
            System.out.println("Not a valid move");
        }
        //Compare PlayerMove & Computer move for decide winner:
        System.out.println("Computer played :" + computerMove);
        if (playerMove.equals(computerMove)) {
            System.out.println("The Game tied !");
        } else if (playerMove.equals("r")) {
            if (computerMove.equals("s")) {
                System.out.println("You win :");
            } else if (computerMove.equals("p")) {
                System.out.println("Computer win :");
            }
        } else if (playerMove.equals("p")) {
            if (computerMove.equals("r")) {
                System.out.println("You win :");
            } else if (computerMove.equals("s")) {
                System.out.println("Computer win :");
            }
        } else if (playerMove.equals("s")) {
            if (computerMove.equals("p")) {
                System.out.println("You win :");
            } else if (computerMove.equals("r")) {
                System.out.println("Computer win :");
            }
        }

    }
}
