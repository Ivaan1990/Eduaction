package Java_zadachi;
import java.util.Arrays;

import static java.lang.System.out;

public class ExampleTester {

    public static void main (String[] args) {

        int[][] array = {

                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},

        };

        out.println ("Original:");

        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[i].length; j ++) {

                array[0][j] += j + 1;
                array[i][2] += 1;
                array[3][j] += 1;
                array[2][0] += 1;

                out.format ("%4d", array[i][j]);
            }
            out.println();

        }
    }
}


