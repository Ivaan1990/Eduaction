package Course_Java_Arrays;
import java.util.Arrays;
import java.util.Random;

//Удалить в массиве все числа, которые повторяются более двух раз.

public class Exp_62 {

    private int[] nums = new int[6]; // атрибут = массив для класса
    private int numsSize = nums.length;

    Exp_62 () {

        Random r = new Random();
        for (int i = 0; i < numsSize; i++) {
            int random = r.nextInt(14);

            if (nums[i] == 0) nums[i] = random;
            nums[i] = random;
            /*System.out.print (nums[i] + " ");        //*--TEST--*/
        }
        /*System.out.println();                //*--TEST--*/
    }

    public void removeTwoMore () {

        int count = 0;
        boolean target = false;
        for (int i = 0; i < numsSize; i++) {
            for (int j = i + 1; j < numsSize; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public void go () { //Удалить в массиве все числа, которые повторяются более двух раз.

        for (int i = 0; i < numsSize; i++) {
            for (int j = i + 1; j < numsSize; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        Exp_62 ob = new Exp_62();

        ob.go();
        ob.removeTwoMore();

    }
}
