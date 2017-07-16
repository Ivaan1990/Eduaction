package Course_Java_Arrays;
import java.util.Random;
import static java.lang.System.out;

/*
Создайте массив, в котором количество отрицательных чисел равно количеству положительных
и положительные числа расположены на случайных местах в массиве.
*/

public class Exp_16 {

    static int randomMinMax (int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {

        int[] nums = new int [14];
        boolean target = false;
        int moreZero = 0;
        int lowZero = 0;


        if (nums.length/2 != 0) {
            int val = -nums.length/2; // fun

            for (int i: nums) {
                int temp = randomMinMax(0,7);
                if (nums[i] > 0) {

                   // val += temp;
                    val += 1;
                    nums[i] = temp;
                    moreZero++;

                } else {

                    val += 1;
                    nums[i] = val;
                    lowZero++;
                }

                out.print (nums[i] + " ");
            }

        } else {
            out.print ("Can not print");
        }

        out.print ("\nПоложительных чисел: " + moreZero);// ?
        out.print ("\nОтрицательных чисел: " + lowZero);// ?
        // TODO
    }

}
