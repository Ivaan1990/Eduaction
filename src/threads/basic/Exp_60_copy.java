package threads.basic;

/**
 * Created by Asus on 24.06.2017.
 */
public class Exp_60_copy implements Runnable {

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print (array[i] + "  ");
        }
        System.out.println();
    }


    static void moveEvenLeft (int[] array) {
        // метод смены элемента массива с четным номером, на соседний элемент слева
        for (int i = 0; i < array.length; i++) {
            try {
                if (i % 2 == 0)
                {
                    int indexi = i - 1;
                    int temp = array[i];
                    array[i] = array[indexi];
                    array[indexi] = temp;
                }

            } catch (ArrayIndexOutOfBoundsException ex){}
        }
    }

    @Override
    public void run() {
        int[] nums = {10, 20, 30, 40, 50, 60, 70};

        printArray(nums);
        moveEvenLeft(nums);
        printArray(nums);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread() + " was interupted");
        }
        System.out.println("Exp_60_copy has been ended");
    }
}
