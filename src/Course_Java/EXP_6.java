package Course_Java;
import static java.lang.System.out;
/*
Дана строка. Определите, какой символ в ней встречается раньше: 'x' или 'w'.
 Если какого-то из символов нет, вывести сообщение об этом.
 */

public class EXP_6 {
    public static void main(String[] args) {

        int val_x = 0;
        int val_w = 0;
        String s = "EwtrimSxing";

        for (int i = 0; i < s.length(); i ++) {

            if (s.charAt(i) == 'x'){
                val_x = i;
            }

            if (s.charAt(i) == 'w'){
                val_w = i;
            }

        }

        if (val_x > val_w) {
            System.out.print ("First w");
        }
        if (val_x < val_w) {
            System.out.print ("First x");
        }

        out.println("\nw is " + val_w);
        out.print("x is " + val_x);

    }
}

