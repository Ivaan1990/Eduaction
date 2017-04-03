package Java_zadachi;
import java.util.Arrays;

import static java.lang.System.out;

public class ExampleTester {

    public static void main(String[] args) {
        boolean one = true;
        int[][] array = {

                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},

        };

        out.println("Original:");
        try {
            for (int i = 0; i < array.length; i++) {

                int max = array[i].length;
                int index = 0;

                for (int j = 0; j < array[i].length; j++) {

                    array[0][j] = j + 1;
                    array[i][2] = array[0][2] + i;
                    array[3][j] = array[3][2] + j;
                    out.format("%4d", array[i][j]);
                }

                int temp = array[max][index];
                array[max][index] = array[max - 1 - i][index];
                array[max - 1 - i][index] = temp;
                out.println();

            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            out.print("\nException IndexOUT");
        }
    }
}



