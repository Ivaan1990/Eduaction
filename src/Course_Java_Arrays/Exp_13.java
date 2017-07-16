package Course_Java_Arrays;
//Сформировать массив из случайных чисел, в которых ровно две единицы,
// стоящие на случайных позициях.

public class Exp_13 {
    public static void main (String[] args) {

        int[] nums = new int [20];
        int max = 50, min = 5;
        int start = 0, end = 19;
        int index = (int) (Math.random() * ++end) + start; // рандом для массива

        for (int i = 0; i < nums.length; i ++) {
            nums[i] = (int) (Math.random() * ++max) + min;

            if (i == index || i == index/2) {
                nums[i] = 1;
            }

            System.out.print(nums[i] + " ");
        }
    }
}
// done