package ClassesTasks.array;

import java.util.*;

/**
 * Created by Reinevan on 04.07.2017.
 */

public class Array {

    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    LinkedList<Integer> arr = new LinkedList<>();
    private final int size_NUMBERS = 10;
    List<Integer> l;

    Array () {
        numbers.ensureCapacity(100);
    }

    void test(){
        l = arr;
        l = numbers;
//        numbers.get(1) == numbers[1]
//        numbers.set(1,87) == (numbers[2] = 87)
    }
    void goRandom () {

        try {
            for (int i = 0; i < size_NUMBERS; i++) {

                Random r = new Random();
                int random = r.nextInt(15);

                // заполняем arraylist рандоными числами
                numbers.add(i, random);
                System.out.print(numbers.get(i).intValue() + " ");

            }

        } catch (ArrayIndexOutOfBoundsException ex) {}

    }

    public int find_MORE_SPECIFIED (int specif) {

        int count = 0;
        for (int i = 0; i < size_NUMBERS; i++) {
            if (numbers.get(i).intValue() > specif) count++;
        }
        return count;

    }

    public void replace_numbers () {

        for (int i = 0; i < size_NUMBERS; i++) {

            Random r = new Random ();
            int random = r.nextInt(size_NUMBERS);
        }
    }

    public void simpleArray() {
        String[] final_array = {};
        final_array = (numbers.toArray(new String[size_NUMBERS]));
        for (int i = 0; i < size_NUMBERS; i++) {
            System.out.print (final_array[i] + " ");
        }
    }

    public static void main(String[] args) {

        Array ob = new Array();
        ob.goRandom();
        System.out.print (
                "\nКоличество чисел, которые больше чем введённое " + ob.find_MORE_SPECIFIED(15)
                //"\n" + "Сконверированный в обычный String\n" + ob.simpleArray()
        );
        ob.simpleArray();
    }
}
