public class Game {

    public static void main(String[] args) {

        TicTacToe t = new TicTacToe();
        Player p1 = new Player("Player_1", 'X');
        Player p2 = new Player("Player_2", 'O');

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
        } else
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
