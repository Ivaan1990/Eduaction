package Java_zadachi;

import static java.lang.System.out;
import java.util.Scanner;

/**
 * Created by Asus on 23.03.2017.
 */

public class AwesomeNum {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);
        int val;
        val = sc.nextInt();

        if (val == 1) {
            out.print (" *\n" +
                      "**\n" +
                       " *\n" +
                       " *\n" +
                       " *\n" +
                       " *\n" +
                      "***");
        }

        if (val == 2) {
            out.print (" *** \n" +
                       "*   *\n" +
                       "*  * \n" +
                       "  * \n" +
                       " *\n" +
                       "***** ");
        }
    }
}
