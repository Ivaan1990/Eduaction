package Java_zadachi;
import static java.lang.System.out;

import java.io.IOException;
import java.util.Scanner;

public class Example2Demo {

    public static void main(String[] args) throws IOException {

        char b;
        out.print ("Программа ожидает ввода: ");

        b = (char) System.in.read();

        if (b >= 'A' & b <= 'Z' || b >= 'a' & b <= 'z') {

            out.print("Вы ввели символ");

        } else if (b >= '0' & b <= '9') {

            out.print("Вы ввели число");

        } else if (b >= '!' & b <= '"' ||
                b >= '(' & b <= ')' ||
                b >= ':' & b <= ';' ||
                b >= ',' & b <= '.') {

            out.print ("Вы ввели знак пунктуации");

        }

        else {
            out.print ("Вы ввели не символ, не число и не знак пунктуации");
        }
    }

}
