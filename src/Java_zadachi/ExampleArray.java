package Java_zadachi;
import static java.lang.System.out;

public class ExampleArray implements ExampleHAND {

    private int[][] nums;
    private int line; // строка
    private int column; // столбец

    public ExampleArray() {

    }

    public ExampleArray (String name, int line, int column) {

        this.line = line;
        this.column = column;

        out.println(name);

        this.nums = new int [line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                nums[i][j] = randomMinMax(0, 35);
            }
        }

    }

    public int randomMinMax(int min, int max) {

        max -= min;
        return (int) (Math.random() * ++max) + min;

    }

    public void maxElement() {

     /* максимальный элемент в строке, становится на нулевый индекс строки */

        for (int i = 0; i < line; i++) {

            int max = nums[i][0];
            int maxIndex = 0;

            for (int j = 0; j < column; j++) {

                if (nums[i][j] > max) { //TODO обычный алгоритм нахождения max
                    max = nums[i][j];
                    maxIndex = j; //TODO запоминает индекс max
                }

            }

            int val = nums[i][maxIndex];
            nums[i][maxIndex] = nums[i][0];
            nums[i][0] = val;

        }

    }

    public void minElement() {

        /* минимальный элемент в строке, становится на второй индекс строки */

        for (int i = 0; i < line; i++) {

            int min = nums[i][0];
            int minIndex = 0;

            for (int j = 0; j < column; j++) {
                if (nums[i][j] < min) {
                    min = nums[i][j];
                    minIndex = j;
                }
            }

            int val = nums[i][minIndex];
            nums[i][minIndex] = nums[i][2];
            nums[i][2] = val;

        }
    }

    public void showSpiralMultiply() {

        /* 2. Заполните массив числами, которые увеличиваются на 1 по спирали. */

    }

    public int[] getLineMultiply() {

        int[] array = new int[nums.length];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {

                if (j == 0) array[i] = nums[i][j];
                else {
                    array[i] *= nums[i][j];
                }
            }
        }
        return array;
    }

    public int[] getMyFirstEx() {

        int[] array = new int[nums.length];

        try {
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {
                    if (j == 0) array[i] = nums[i][j];
                    else array[i] /= nums[i][j];
                }
            }
        } catch (ArithmeticException ex) {
            out.println ("На нуль делить НЕЛЬЗЯ!!!");
        }
        return array;
    }

    @Override
    public void showNewPrint() {

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                out.format("%5d", nums[i][j]);// форматируем принт
            }

            out.println();
        }
    }

    @Override
    public void whach_Array_sum() {

    }

}
