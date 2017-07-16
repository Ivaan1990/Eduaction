package Course_Java_Arrays;
// Создать массив, состоящий из троек подряд идущих одинаковых элементов.

public class Exp_11 {
    public static void main (String[] args) {
        int[] nums = new int [1240];
        int one = 1;

        for (int i = 1; i < nums.length; i ++) {
            nums[i] = one;

            if (i % 3 == 0) {
                ++one;
            }
            System.out.print (nums[i] + " ");
        }
    }
}
