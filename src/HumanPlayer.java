import java.util.Scanner;

public class HumanPlayer extends Player{

    HumanPlayer(String name, char token) {
    this.name = name;
    this.token = token;
    }

    void makeMove() {
        Scanner scan = new Scanner(System.in);
        int row;
        int col;
        do {
            System.out.println("Enter The Row And The Col:"); // As Long As IsValidMove Keep Make A Move
            row = scan.nextInt();
            col = scan.nextInt();
        }
        while (!isValidMove(row, col));

        TicTacToe.placeToken(row, col, token);
    }
}
