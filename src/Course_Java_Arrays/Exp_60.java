package Course_Java_Arrays;
//Заменить каждый элемент массива с четным номером на соседний слева элемент.

public class Exp_60 {

    static int[] smth(int[] arr){
        int[] ar = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 0){
                ar[i] = arr[i];
            }
            else{
                ar[i] = arr[i-1];
            }
        }
    return ar;
    }
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


    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60, 70};


        printArray(smth(nums));

    }
}
