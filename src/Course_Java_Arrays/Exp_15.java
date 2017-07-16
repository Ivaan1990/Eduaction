package Course_Java_Arrays;
import java.util.Random;

//Сформировать массив из случайных целых чисел от 0 до 9 , в котором единиц от 3 до 5 и двоек больше троек.

public class Exp_15 {

    static void printArray (int[] nums) {

        for (int i = 0; i < nums.length; i ++) {
            System.out.print (nums[i] + "  ");
        }
    }

    public static void main (String[] args) {

        int[] nums = new int [20];
        Random random = new Random();
        int countThree = 0, countOne = 0, countSecond = 0;
        boolean targetOne = false;

        for (int i = 0; i < nums.length; i ++) {
            int r = random.nextInt(9);
            nums[i] = r;
            if (nums[i] == 3) {
                countThree++;
            }
            if (nums[i] == 1) {
                countOne++;
            }
            if (nums[i] == 2) {
                countSecond++;
            }
        }

        //printArray(nums);
        System.out.println();

        if (countOne <= 3) {
            int one = 1;

            for (int j = 0; j < 3; j ++) {
                int r = random.nextInt(9);
                if (nums[r] != 1) {
                    nums[r] = one;
                    countOne++;
                    targetOne = true;
                }
            }

            if (countOne > 5) {
                // TODO
            }
        }

        //printArray(nums);
        System.out.println();

        if (countThree > countSecond) { // если двоек меньше троек, добавляет двоек
            int two = 2;
            int count = countThree + countSecond;

            for (int i = 0; i < count; i ++) {
                int r = random.nextInt(9);
                nums[r] = two;
                countSecond++;
            }
            printArray(nums);
        } else {
            printArray(nums);
        }

        System.out.println();
        System.out.print ("\nЕдиниц в массиве " + countOne);
        System.out.print ("\nТроек в массиве " + countThree);
        System.out.print ("\nДвоек в массиве " + countSecond);
        if (!targetOne) System.out.print ("\nединичек было достаточно, поэтому не добавилось");
    }
}
