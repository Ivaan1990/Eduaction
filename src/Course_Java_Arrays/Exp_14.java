package Course_Java_Arrays;
//Заполните массив случайным образом нулями и единицами так,
// чтобы количество единиц было больше количества нулей.

public class Exp_14 {

    static int randomMinMax(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {

        int[] nums = new int[20];
        int countOne = 0, countZero = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = randomMinMax(0, 1);

            if (nums[i] == 1) {
                ++countOne;
            } else {
                ++countZero;
            }
            System.out.print(nums[i] + " ");
        }
        countZero = countZero/2;

        if (countOne > countZero) {
            System.out.print ("\nЕдиниц больше");
        } else {
            System.out.print ("\nО Нет ! Нулей больше");
        }
    }
}

