//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        // 11 12 13 21 22 23 31 32 33 codes for input plotting (numbers only for convenience)
        int[] dataBoard = new int[]{5,5,0,5,5,0,5,0,5};
        board.print(dataBoard);
        ValidateBoard validateBoard = new ValidateBoard();
        System.out.println(validateBoard.check(dataBoard));

    }




}