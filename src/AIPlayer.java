import java.util.Random;
import java.util.Scanner;

public class AIPlayer extends Player {

    AIPlayer(String name, char token) {
        this.name = name;
        this.token = token;
    }

     void makeMove() {
        Scanner scan = new Scanner(System.in);
        int row;
        int col;
        do {
            System.out.println("Enter The Row And The Col:"); // As Long As IsValidMove Keep Make A Move
            Random r = new Random();
            row = r.nextInt(3);
            col = r.nextInt(3);
        }
        while (!isValidMove(row, col));

        TicTacToe.placeToken(row, col, token);
    }
}
