package Course_Java_Arrays;
import java.util.Random;
//Заполните массив случайным образом нулями, единицами и двойками так, чтобы первая двойка в массиве
//встречалась раньше первой единицы, TODO количество единиц было в точности равно суммарному количеству нулей и двоек.

public class Exp_17 {

    static int randomMinMax(int min, int max) {

        max -= min;
        return (int) (Math.random() * ++max) + min;

    }

    public static void main (String[] args) {

        int[] nums = new int [15];
        int zero = 0, one = 0, two = 0;
        Random r = new Random();
        int indexTwo = 0, indexOne = 0, countOne = 0;
        int[] numsTest = {0, 0, 1, 2, 2, 2, 2, 1, 1 ,1};

        for (int i = 0; i < nums.length; i ++) {

            int randomNum = randomMinMax (0,2);
            nums[i] = randomNum;

            if (nums[i] == 0) {
                zero++;
            }
            if (nums[i] == 1) {
                indexOne = i;
                countOne++;
            }
            if (nums[i] == 2) {
                indexTwo = i;
                two++;
            }
        }
        //System.out.print ("\nИндекс двойки " + indexTwo + "\nИндекс единицы " + indexOne);
        int SalaryOfTwoZero = two + zero;

        if (countOne < SalaryOfTwoZero) {
            for (int j = 0; j < countOne; j ++) {
                int randomIndex = r.nextInt(nums.length);
                nums[randomIndex] = 1;
            }

        }

        for (int i : nums) {
            System.out.print (nums[i] + " ");
        }
    }
}
