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
        int count;
        for (int i = 0; i < array.length; i++) {

            int max = array[i][0];
            int index = 0;

            for (int j = 0; j < array[i].length; j++) {

                array[0][j] = j + 1;
                array[i][2] = array[0][2] + i;
                /*if (array[i][j] > max) {
                    max = array[i][j];
                    array[3][j] = max;
                    index = j;
                }
                //array[3][index] = array[3][2] + j;
                //array[3][j] = array[3][2] + j;
                    //j = array[3][2]; array[1][2]
                    //array[3][j] = j + 1;
                    //array[2][0] += 1; */
                    out.format("%4d", array[i][j]);
                }
            out.println();
        }
    }
}



