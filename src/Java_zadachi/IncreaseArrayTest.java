package Java_zadachi;

import java.util.Arrays;
import static java.lang.System.out;

/**
 * Created by Asus on 22.03.2017.
 */

public class IncreaseArrayTest {

    static int[] multiArray (int[] array) {

        for (int i = 0; i < array.length; i ++ ) {
            array[i] *= 2;
        }

        return array;
    }

    public static void main (String[] args) {

        int[] nums = {2, 4, 6, 1, 8};
        out.print (Arrays.toString(multiArray(nums)) + " ");

    }
}
