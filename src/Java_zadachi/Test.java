package Java_zadachi;
import static java.lang.System.out;


import java.util.Scanner;

/**
 * Created by Asus on 18.03.2017.
 */
public class Test {

    public static void main(String[] args) {

        byte count = 4;
        byte column = 14;
        int val = 0;
        for (int i = 0; i < count; i++) {

            if (i < count/2) {
                val = count/2 + i;
            } else {
                val = i - count/2;
            }

            for (int j = 0; j < column; j++) {
                if (j == i || j == i + 7 || j == column - val + 3) {
                    out.print("*");
                } else {
                    out.print(" ");
                }
            }
            out.println();
        }
    }
}
