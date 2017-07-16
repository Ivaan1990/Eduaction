package Course_Java;

/**
 * Created by Asus on 24.04.2017.
 */
public class SpiralDemo {
    public static void main(String[] args) {

        int[][] array = {

                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},

        };

        System.out.println("Original:");

        for (int i = 0; i < array.length; i++) {

            int max = array[i].length;
            int index = 0;

            for (int j = 0; j < array[i].length; j++) {

                array[0][j] = j + 1;
                array[i][2] = array[0][2] + i;
                if (array[3][2] > 0) {
                    array[3][j] = array[max][2] + j;
                }
                System.out.format("%4d", array[i][j]);

            }
            System.out.println();
        }
    }
}
