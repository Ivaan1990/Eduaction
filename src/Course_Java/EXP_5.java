package Course_Java;
import static java.lang.System.out;
/*
Дана строка. Определите общее количество символов '+' и '-' в нем.
 А так же сколько таких символов, после которых следует цифра ноль.
 */

public class EXP_5 {
    public static void main (String[] args) {

        int count = 0, zero = 0;
        String s = "&0&a0s$($z-+0avb$#2asfg+__--+123";

        for (int i = 0; i < s.length(); i ++) {

            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                ++count;
            }
            if (s.charAt(i) == '0') {
                ++zero;
            }

        }
        out.print("Общее количество символов +, - : " + count);
        out.print("\nСимволы перед нулём: " + zero);
    }
}
