package Java_zadachi;
import static java.lang.System.out;
import java.lang.*;

public class ArraysArithmetic {

    static boolean match_nums (double[][] array_1, double[][] array_2) {
        if (array_1 == array_2) {
            return true;
        }
        return false;
    }

    static double sumArrays(double[][] array_1, double[][] array_2) {
        // сумма массивов
        double sum = 0;
        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_1[i].length; j++) {
                sum += array_1[i][j] + array_2[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        double[][] nums_1 = {

                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2},

        };

        double[][] d;
        d = nums_1;

        double[][] nums_2 = {

                {3, 3, 3},
                {3, 3, 3},
                {3, 3, 3},
                {3, 3, 3},

        };
        for (int i = 0; i < nums_1.length; i++) {
            for (int j = 0; j < nums_1[i].length; j++) {
                if (j == 1 || i == 1) {
                    nums_1[1][j] += 3;
                } else {
                    nums_1[i][2] += 44;
                }
                out.print ("\t" + nums_1[i][j]);
            }
            out.println();
        }
        out.println("Сумма матриц = " + sumArrays(nums_1, nums_2));
        out.print(match_nums(nums_1, d)); //true, значения массивов равны
    }
}
