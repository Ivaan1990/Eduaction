package Java_zadachi;
import static java.lang.System.out;

public class ExampleCool extends  ExampleArray implements ExampleHAND {

    private int size;
    private int[] nums;

    ExampleCool() {

    }

    public ExampleCool(int size) {

        super("Array№2", 0, 0);

        this.size = size;
        this.nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = super.randomMinMax(-5, 5);
        }

    }

    @Override
    public void showNewPrint() {

        for (int i = 0; i < size; i++) {
            out.format("%4d", nums[i]);// форматируем принт
        }
        out.println();
    }

    @Override
    public void whach_Array_sum() {

        int sum_1 = 0;
        int sum_2 = 0;

        try {

            for (int i = 0; i < this.size / 2; i++) {
                sum_1 += nums[i];
            }

            for (int j = this.size; j > this.size/2 ; j--) {
                sum_2 += nums[j];
            }

            out.println(sum_1);
            out.print(sum_2);

        } catch (ArrayIndexOutOfBoundsException e) {
            out.print("Вышли за пределы массива");
        }
    }
}




