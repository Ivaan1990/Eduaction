package Course_Java_Arrays;
import java.util.Random;

// Дан массив. Заменить все числа, меньшие последнего элемента массива, на первый элемент.

public class Exp_57 {

    public static void main (String[] args) {

    Random r = new Random();
    int[] nums = new int [16];

    int size = nums.length - 1;
    int[] numsHelp = new int [nums.length];

        for (int i = 0; i < nums.length; i++) {

            int random = r.nextInt(30);
            nums[i] = random;

            if (nums[i] == 0) {
            int randomIn = r.nextInt(30);
            nums[i] = randomIn;
            }
            System.out.print (nums[i] + " ");
        }

        System.out.println("\n");

        for (int i = size; i >= 0; i--) {

            if (nums[size] > nums[i]) {
                nums[i] = nums[0];
            }

            System.out.print (nums[i] + " ");
        }
        //System.out.print ("\nПервый элемет = "+ nums[0] + "\nПоследний элемент " + nums[size] + " ");
    }
}
