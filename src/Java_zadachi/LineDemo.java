package Java_zadachi;

import java.util.Scanner;

/**
 * Created by Asus on 14.03.2017.
 */

public class LineDemo {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        String s;
        s = in.nextLine();

        StringBuilder buffer = new StringBuilder(s);

        if (s.charAt(0) == s.charAt(4) && s.charAt(1) == s.charAt(3)){
            System.out.print ("Палиндром");

        } else {
            System.out.print (buffer);
        }

    }
}
