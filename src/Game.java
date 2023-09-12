import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Game Mode:");
        System.out.println("1. For Human vs. Human");
        System.out.println("2. For Human vs. AI");

        int choice = scanner.nextInt();
        TicTacToe t = new TicTacToe();

        Player p1;
        Player p2;

        /**
        Player p1 = new HumanPlayer("Player_1", 'X');
        Player p2 = new AIPlayer("Player_2", 'O');
        **/

        if (choice == 1) {
             p1 = new HumanPlayer("Player_1", 'X');
             p2 = new HumanPlayer("Player_2", 'O');
            System.out.println("Playing Mode: Human vs. Human");
        }
        else if (choice == 2) {
            p1 = new HumanPlayer("Player_1", 'X');
            p2 = new AIPlayer("Player_2", 'O');
            System.out.println("Playing Mode: Human vs. AI");

        }
        else {
            System.out.println("Invalid Choice. Exiting The Game!");
            return;
        }
        Player cp; // Current Player
        cp = p1;

        while (true) {

        System.out.println(cp.name + " Turn");
        cp.makeMove();
        TicTacToe.dispBoard();

        if(TicTacToe.checkColWin() || TicTacToe.checkDiagWin() || TicTacToe.checkRowWin())
        {
            System.out.println(cp.name + " has WON!");
            break;
        }
        else if (TicTacToe.checkDraw()) {
            System.out.println("The Game Is A Draw!!");
            break;
        }
        else
        {
            if(cp == p1)
            {
                cp = p2;
            } else
            {
                cp = p1;
            }
        }
        }

    }
}
