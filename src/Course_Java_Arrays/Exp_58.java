package Course_Java_Arrays;
import java.util.Random;
// Поменять местами наибольший и наименьший элементы массива.
public class Exp_58 {

    public static int findMinimal (int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                int index = i;
            }
        }
        return min;
    }
    public static void main (String[] args) {

        int[] nums = new int [30];
        int max = nums[0];
        int min = nums[0];
        Random r = new Random ();
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < nums.length; i++) {
            int random = r.nextInt(100);
            /*nums[i] = i + 1;*/
            nums[i] = random;
            /*if (nums[i] > max) {
                max = nums[i];
                indexMax = i;
            }*/
            /*else if (nums[i] < min) {
                min = nums[i];
                indexMin = i;
            }*/
            if (nums[i] < min) {
                min = nums[i];
                indexMin = i;
            }
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nИндекс максимального элемента до смены мест " + indexMax + "\nМинимального " + indexMin);
        System.out.println();
        /*int temp = nums[nums.length - 1];
        nums[nums.length - 1] = nums[0];
        nums[0] = temp;*/
        int temp = nums[indexMax];
        nums[indexMax] = nums[indexMin];
        nums[indexMin] = temp;
        for (int i = 0; i < nums.length; i++) {
            System.out.print (nums[i] + " ");
        }
        System.out.print("\nmax = " + max + "\nmin = " + min);
        System.out.println("\nА теперь индекс максимального элемента " + indexMin);
        System.out.print("New Min = " + findMinimal(nums));
    }
}
