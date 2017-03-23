package Java_zadachi;

/**
 * Created by Asus on 13.03.2017.
 */

public class MarafonWinner {

    public static int findWinner (int[] array) {

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                int index = i;
            }

        }
        return min;
    }

    public static void main (String[] args) {

        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma",
                              "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

        System.out.print ("У нас есть победитель, это " + names [8]);
        System.out.print (", его(её) время " + findWinner(times) + " секунд(ы).");

    }

}
