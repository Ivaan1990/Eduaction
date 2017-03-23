package Java_zadachi;

import static java.lang.System.out;
import java.util.Scanner;

/**
 * Created by Asus on 21.03.2017.
 *///1. Придумайте способ превращения числа, в массив из его разрядов.  Пример: 562 -> [5,6,2].

public class RanksDemo {

    public static void main(String[] args) {

        int num = 34542;
        int val, i = 0;
        //Scanner ob = new Scanner(System.in);
        //val = ob.nextInt();
        int[] nums = new int[5];

        while (num > 0) {

            num /= 10;
            nums[i] = num;
            ++i;
            out.print(num + " ");

        }

        out.print ("\n");

        for (int j = 0; j < nums.length; j++) {

            out.print ("[" + nums[j] + "]");

        }
    }
}


