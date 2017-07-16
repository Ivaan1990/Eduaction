package Course_Java_Arrays;

//В массиве заменить все числа, большие данного числа, на среднее арифметическое всех чисел массива.

import java.util.Random;

public class Exp_56 {

    public static void main (String[] args) {

        Random r = new Random();
        int[] nums = new int [16];
        int[] numsHelp = new int [nums.length];
        int randomTarget = r.nextInt(nums.length);
        int target = nums.length/2; //данное число
        int average = 0;

        for (int i = 0; i < nums.length; i++) {

            int random = r.nextInt(14);

            if (nums[i] == target) {
                nums[i] = r.nextInt(14);
            }

            nums[i] = random;

            if (i == target) {
                nums[i] = target;
            }

            average += nums[i];
            numsHelp[i] = nums[i];

            System.out.print (nums[i] + " ");
        }

        System.out.println("\n");

        for (int j = 0; j < numsHelp.length; j++){
            if (numsHelp[j] > target) {
                numsHelp[j] = average;
            }

            System.out.print (numsHelp[j] + " ");
        }
    }
}
