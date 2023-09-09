public class Game {

    public static void main(String[] args) {

        TicTacToe t = new TicTacToe();
        t.dispBoard();



        t.dispBoard();
        System.out.println(t.checkColWin());
        System.out.println(t.checkRowWin());
        System.out.println(t.checkDiagWin());



    }
}
