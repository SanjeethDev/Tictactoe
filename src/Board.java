public class Board {
    // Function to pretty print the game board
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
                System.out.print(swapCharacters(board[row][column]) + " | ");
            }
            System.out.println("\n" + horizontalLine(16, '-'));

        }
    }

    // Returns a string with specified character and length
    public String horizontalLine(int characterCount, char printCharacter) {
        return String.valueOf(printCharacter).repeat(Math.max(0, characterCount + 1));
    }

    // Swaps characters from numbers to O & X
    public String swapCharacters(String rawCharacter) {
        return switch (rawCharacter) {
            case "0" -> "O";
            case "5" -> "X";
            case "4" -> "Tie";
            default -> rawCharacter;
        };

    }

}
