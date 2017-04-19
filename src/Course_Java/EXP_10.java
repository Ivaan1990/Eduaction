package Course_Java;
import static java.lang.System.out;

// В данной строке найти количество цифр

public class EXP_10 {

    static boolean checkNum (char ch) {
        return ch >= '0' && ch <= '9';
    }

    public static void main (String[] args) {
        int count = 0;
        String s = "jkagdas2jksn4da";
        for (int i = 0; i < s.length(); i ++) {

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                ++count;
            }
        }

        if (count == 0) out.print ("Чисел нет");
        if (count > 0) out.print ("Чисел в строке: " + count);

    }
}
