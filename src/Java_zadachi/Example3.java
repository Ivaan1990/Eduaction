package Java_zadachi;
import java.util.Arrays;
import static java.lang.System.out;

public class Example3 {
    public static void main (String[] args) {

        int[][] nums = {

                {2, 2, 3},
                {2, 1, 2},
                {3, 2, 1,}

        };

        int[] nums_trns = new int [nums.length];

        for (int i = 0; i < nums.length; i ++) {
            for (int j = 0; j < nums[i].length; j ++) {
                out.format ("%2d", nums[i][j]);

                if (j == 0) nums_trns[i] = nums[i][j];
                else {
                    nums_trns[i] *= nums[i][j];
                }
            }
            out.println();
        }
        out.print ("Произведение строки = " + nums_trns[0]);
    }
}
