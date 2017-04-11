package Course_Java;
import static java.lang.System.out;

/*
 Дана строка. Вывести первый, последний и средний (если он есть)) символы.
 */

public class EXP_1 {
    public static void main (String[] args) {

        String line = "Электричество";
        out.println("В слове " + line);

        out.println ("первый символ: " + line.charAt(0));

        if (line.length() % 2 == 0) {
            out.println ("средний символ: " + line.charAt(line.length()/2));
        }

        out.println ("последний символ: " + line.charAt(line.length() - 1));

        out.print ("Длина строки = " + line.length());

    }
}
