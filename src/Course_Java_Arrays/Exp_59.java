package Course_Java_Arrays;
import java.util.Random;
/*
Найти наибольший четный элемент массива и поменять его местами с наименьшим нечетным элементом.
Если одного из таких элементов нет, то всем элементам массива присвоить значение, равное нулю
*/
public class Exp_59 {

    public static int findMinimal(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2 != 0) && array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMaximum(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2 == 0) && array[i] > max) {
                //1.если в скобках правда, выполняется выражение после &&
                max = array[i];
            }
        }
        return max;
    }

    static void fillNums(int[] nums) {
        Random r = new Random();

        for (int i = 0; i < nums.length; i++) {
            int random = r.nextInt(4000);
            nums[i] = random;

        }
        printArray(nums);
        System.out.println();
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print (array[i] + " ");
        }
    }

    static void replaceMinMax(int min, int max, int[] array) {

        int maxNewIndx = 0, minNewIndx = 0;
        for (int i = 0; i < array.length; i++) {

            if (max == array[i]) {
                maxNewIndx = i;
            }
            if (min == array[i]) {
                minNewIndx = i;
            }
        }

        int temp = array[maxNewIndx];
        array[maxNewIndx] = array[minNewIndx];
        array[minNewIndx] = temp;
        System.out.println("Индекс максимального " + maxNewIndx);
        System.out.println("Индекс минимального " + minNewIndx);
        System.out.println("Меняем местами");

    }

    public static void main(String[] args) {
        int[] array = new int[5];

        fillNums(array);
        replaceMinMax(findMinimal(array), findMaximum(array), array);
        printArray(array);

    }

}
