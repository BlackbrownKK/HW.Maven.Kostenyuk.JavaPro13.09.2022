import java.io.IOException;


public class PascalsTreangle {

    public void bildPascalsTreangle(int numRows) throws IOException {
        if (numRows <= 0 || numRows >= 20) {
            throw new IOException("Number of rows out of range 1 - 20");
        }
        int[][] result = new int[numRows][numRows];
        for (int line = 0; line < numRows; line++) {
            for (int i = 0; i <= line; i++) {
                if (line == i || i == 0)
                    result[line][i] = 1;
                else
                    result[line][i] = result[line - 1][i - 1] + result[line - 1][i];
                System.out.print(result[line][i] + " ");
            }
            System.out.println("");
        }
    }
}
