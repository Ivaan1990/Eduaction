package Course_Java_Arrays;

// Создать массив, состоящий из троек подряд идущих одинаковых элементов.

public class Exp_7 {
    public static void main(String[] args) {
        int j = 0;
        int[] nums = new int [12];
        for (int i = 1;i < nums.length; i++){
            nums[i] = j;

            if (i % 3 == 0) {
                j++;
            }
            System.out.print (nums[i] + " ");
        }
    }
}
