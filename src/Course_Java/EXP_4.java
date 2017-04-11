package Course_Java;
import static java.lang.System.out;
/*
Дана строка. Показать номера символов, совпадающих с последним символом строки.
 */

public class EXP_4 {
    public static void main(String[] args) {

        String s = "What the exp line";
        char last = s.charAt(s.length() - 1);//последний символ
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == last) {
                out.print (i + " ");
                ++count;
            }
        }
        out.println ("\nCовпадений: " + count);
    }
}