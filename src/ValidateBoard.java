public class ValidateBoard {

    public int check(int[] data) {

        // row validation
        // take left value and check with center and right
        for (int row = 0; row < data.length; row+=3) {
            if (data[row] == data[row+1] && data[row] == data[row+2]) {
                return data[row];
            }
        }

        // column validation
        // take the top value and check with middle and bottom
        for (int column = 0; column < 3; column++) {
            if (data[column] == data[column+1] && data[column] == data[column+2]) {
                return data[column];
            }
        }

        // diagonal validation
        // simple code that just check values in cross
        if (data[4] == data[0] && data[4] == data[8]) {
            return data[4];
        } else if (data[4] == data[2] && data[4] == data[6]) {
            return data[4];
        }

        return 2;
    }
}
