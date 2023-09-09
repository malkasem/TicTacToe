import java.util.Scanner;

public class Player {
    String name;
    char token;

   Player(String name, char token) {
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


    boolean isValidMove(int row, int col) {
       if(row >= 0 && row <= 2 &&
           col >= 0 && col <= 2)
       {
           if (TicTacToe.board[row][col] == ' ')
           {
               return true;
           }
       }
       return false;
    }
}
