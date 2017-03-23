package Java_zadachi;

/**
 * Created by Asus on 18.03.2017.
 */
import static java.lang.System.out;

public class PullZeroDemo {

    static int convertZero ( int x ) {

        x = 0;
        return x;

    }

    public static void main (String[] args) {

        int[][] nums = {

                {4, 2, 3, 1},
                {2, 1, 1, 2},
                {1, 2, 3, 1},
        };

        for (int i = 0; i < nums.length; i ++) {
            for (int j = 0; j < nums[i].length; j ++) {
                int z = convertZero(2);
                nums[i][2] = z;
                out.print (nums[i][j] + " ");
            }

            out.println ("");
        }
        out.print('\n');

    }
    /*
Создайте метод, который в качестве аргумента получает число и полностью обнуляет столбец, который соответствует заданному числу.
 */

}
