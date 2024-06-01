import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        // 11 12 13 21 22 23 31 32 33 codes for input plotting (numbers only for convenience)
        int[] dataBoard = new int[]{6,6,6,6,6,6,6,6,6};

        ValidateBoard validateBoard = new ValidateBoard();
        board.print(dataBoard);

        Scanner input = new Scanner(System.in);
        int turn = 0;
        turns:
        while (turn < 9) {
            int whoseTurn = turn % 2 == 1 ? 5 : 0;
            System.out.print(board.swapCharacters(String.valueOf(whoseTurn)) + "'s turn: ");
            String inputCode = input.next().toUpperCase();
            turn++;
            System.out.println();
            switch (inputCode) {
                case "A1" -> {
                    if (dataBoard[0] != 6) {
                        System.out.println("Invalid placement");
                    } else {
                        dataBoard[0] = whoseTurn;
                    }
                    board.print(dataBoard);
                }
                case "B1" -> {
                    if (dataBoard[1] != 6) {
                        System.out.println("Invalid placement");
                    } else {
                        dataBoard[1] = whoseTurn;
                    }
                    board.print(dataBoard);
                }
                case "C1" -> {
                    if (dataBoard[2] != 6) {
                        System.out.println("Invalid placement");
                    } else {
                        dataBoard[2] = whoseTurn;
                    }
                    board.print(dataBoard);
                }
                case "A2" -> {
                    if (dataBoard[3] != 6) {
                        System.out.println("Invalid placement");
                    } else {
                        dataBoard[3] = whoseTurn;
                    }
                    board.print(dataBoard);
                }
                case "B2" -> {
                    if (dataBoard[4] != 6) {
                        System.out.println("Invalid placement");
                    } else {
                        dataBoard[4] = whoseTurn;
                    }
                    board.print(dataBoard);
                }
                case "C2" -> {
                    if (dataBoard[5] != 6) {
                        System.out.println("Invalid placement");
                    } else {
                        dataBoard[5] = whoseTurn;
                    }
                    board.print(dataBoard);
                }
                case "A3" -> {
                    if (dataBoard[6] != 6) {
                        System.out.println("Invalid placement");
                    } else {
                        dataBoard[6] = whoseTurn;
                    }
                    board.print(dataBoard);
                }

                case "B3" -> {
                    if (dataBoard[7] != 6) {
                        System.out.println("Invalid placement");
                    } else {
                        dataBoard[7] = whoseTurn;
                    }
                    board.print(dataBoard);
                }

                case "C3" -> {
                    if (dataBoard[8] != 6) {
                        System.out.println("Invalid placement");
                    } else {
                        dataBoard[8] = whoseTurn;
                    }
                    board.print(dataBoard);
                }

                case "EXIT" -> {
                    System.out.println("Game forfeit.");
                    break turns;
                }

                default -> {
                    board.print(dataBoard);
                    System.out.println("Not a valid code");
                    turn-=1;
                }


            }


            String result = board.swapCharacters(String.valueOf(validateBoard.check(dataBoard)));
            if (result.equals("O") || result.equals("X")) {
                System.out.println(board.horizontalLine(16, '='));
                System.out.println(board.horizontalLine(6, ' ')+ result + " Won");
                System.out.println(board.horizontalLine(16, '='));
                break;
            } else if (result.equals("Tie") && turn > 8) {
                System.out.println(board.horizontalLine(16, '='));
                System.out.println(result);
                System.out.println(board.horizontalLine(16, '='));
                break;
            }
        }
    }
}