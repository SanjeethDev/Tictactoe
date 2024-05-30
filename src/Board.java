public class Board {
    public void print(int[] data) {
        // data will be 0 1 2
        // written as   3 4 5
        // 0-8 index    6 7 8 with outline being the guiders
        String[][] board = new String[][] {
                {" ", "1", "2", "3"},
                {"1", String.valueOf(data[0]), String.valueOf(data[1]), String.valueOf(data[2])},
                {"2", String.valueOf(data[3]), String.valueOf(data[4]), String.valueOf(data[5])},
                {"3", String.valueOf(data[6]), String.valueOf(data[7]), String.valueOf(data[8])}};
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                // O == 0 (zero) ||| X == 1 (one)
                if (board[row][column].equals("0")) {
                    System.out.print("O" + " | ");
                } else if (board[row][column].equals("5")) {
                    System.out.print("X" + " | ");
                } else {
                    System.out.print(board[row][column] + " | ");
                }

            }
            System.out.println("\n" + horizontalLine(16, '-'));

        }
    }

    public String horizontalLine(int characterCount, char printCharacter) {
        return String.valueOf(printCharacter).repeat(Math.max(0, characterCount + 1));
    }
}
