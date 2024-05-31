//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        // 11 12 13 21 22 23 31 32 33 codes for input plotting (numbers only for convenience)
        int[] dataBoard = new int[]{0,5,0,5,5,0,0,0,5};

        ValidateBoard validateBoard = new ValidateBoard();
        board.print(dataBoard);
        if (board.swapCharacters(String.valueOf(validateBoard.check(dataBoard))).equals("Tie")) {
            System.out.println(board.swapCharacters(String.valueOf(validateBoard.check(dataBoard))));
        } else {
            System.out.println(board.swapCharacters(String.valueOf(validateBoard.check(dataBoard)))+ " Won");
        }

    }
}