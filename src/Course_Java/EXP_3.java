package Course_Java;
import static java.lang.System.out;
/*
Сформировать строку из 10 символов. На четных позициях должны находится четные цифры, на нечетных позициях - буквы.
 */

public class EXP_3 {
    public static void main(String[] args) {

            String line = "Make line!";
            for (int i = 0; i < line.length(); i ++) {
                if (i % 2 != 0) {
                    out.print (line.charAt(i) + " ");
                }
                if (i % 2 == 0) {
                    out.print (i + 2 + " ");
                }
            }
    }
}
