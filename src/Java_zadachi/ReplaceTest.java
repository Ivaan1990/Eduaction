package Java_zadachi;

import java.util.Arrays;
import static java.lang.System.out;

/**
 * Created by Asus on 15.03.2017.
 */
public class ReplaceTest {

    /*У вас есть двухмерный массив наполненный случайными числами,
    в той же последовательности перенесите эти числа в одномерный массив.*/

    public static void main(String[] args) {

        int size = 5; // количество строк
        int size2 = 4; // количество столбцов

        int[][] nums = new int [size][size2];
        int[] nums2 = new int [size*size2];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                nums[i][j] = (int) (Math.random() * 100);
            }
        }

        for ( int i = 0; i < size; i ++ ) {
            for ( int j = 0; j < size2; j ++ ) {
                out.print (nums[i][j] + " ");
            }
            out.println();
        }

        out.print ("\n");

        int z, i, j;
        for ( i = 0; i < size; i ++ ) {
            for ( j = 0; j < size2; j ++ ) {
                z = nums[i][j];
                nums2[i * j] = z;
                out.print ("[" + nums2[i * j] + "] ");
            }
        }

        out.println (" ");
        out.print ("Длина массива " + nums2.length + " элемента(ов)");

    }

}
