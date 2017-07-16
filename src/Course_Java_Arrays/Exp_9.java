package Course_Java_Arrays;
// 1.Создать массив, каждый элемент которого равен квадрату своего номера.

public class Exp_9 {
    public static void main(String[] args) {
        // 1.
        int[] nums = new int [10];
        for (int i = 0; i < nums.length; i ++) {
            nums[i] = i * 2;
            System.out.print (nums[i] + " ");
        }

    }
}
