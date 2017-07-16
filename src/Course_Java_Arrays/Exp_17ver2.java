package Course_Java_Arrays;

import java.util.Random;

/**
 * Created by Asus on 04.06.2017.
 */
public class Exp_17ver2 {
    public static void main(String[] args) {
        int[] nums = new int [14];
        Random r = new Random();
        int random = r.nextInt(3);
        for (int i = 0; i < nums.length; i ++) {
            nums[i] = random;
            if (nums[i] == 2 || nums[i] == 1) {

            }
        }
    }
}
