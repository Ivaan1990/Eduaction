package Course_Java_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Exp_61 {

    public static void main (String[] args) {

        int[] array = new int [15];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {

            int random = r.nextInt(50);
            array[i] = random;
        }
        System.out.println(Arrays.toString(array));

        int[] arrayNew = new int[array.length - 1];

        for (int i = 1; i < arrayNew.length; i++) {

            if (i == 0) {

                int target = arrayNew[1];

            } else {
                arrayNew[i] = array[i];
            }
        }

        arrayNew[0] = arrayNew[1];
        arrayNew[1] = r.nextInt(arrayNew.length);
        System.out.println(Arrays.toString(arrayNew));

    }
}
