package Course_Java;
import static java.lang.System.out;

// В данной строке найти количество цифр

public class EXP_10 {

    public static void main (String[] args) {
        int count = 0;
        String s = "jkagdasj1k2snda";
        for (int i = 0; i < s.length(); i ++) {

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                ++count;
            }
        }

        out.print ("Чисел " + (count > 0 ? count : "нет"));

    }
}
