
/* На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. */
import static useFulFutires.Array.print;

public class chessGame {
    public static final int size = 8;
    public static int[][] array = new int[size][size];

    public static void main(String[] args) {

        print(array);
        if (!putTheQueen(array, 0)) {
            System.out.println("Решений нет!");
            return;
        }
        print(array);
    }

    public static boolean putTheQueen(int[][] array, int col) {
        if (col >= array.length) {
            return true;
        }
        for (int i = 0; i < array.length; i++) {
            if (checkPosition(array, i, col)) {
                array[i][col] = 1;
                if (putTheQueen(array, col + 1)) {
                    return true;
                }
                array[i][col] = 0;
            }
        }

        return false;
    }

    public static boolean checkPosition(int[][] array, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (array[row][i] > 0) {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (array[i][j] > 0) {
                return false;
            }
        }

        for (int i = row + 1, j = col - 1; i < array.length && j >= 0; i++, j--) {
            if (array[i][j] > 0) {
                return false;
            }
        }

        return true;
    }

}
