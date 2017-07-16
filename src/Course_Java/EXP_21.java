package Course_Java;
// Дан текст. Найти слова, состоящие из цифр, и сумму чисел, которые образуют эти слова
/*
регулярное выражение должно находить:
слово из цифр
и сумму этих чисел в слове
 */
import java.util.Arrays;

public class EXP_21 {

    static boolean findinLineNum (String s) {
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                return  true;
            }
        }
        return false;
    }

    public static void main (String[] args) {
        String line = "aaa gg2g1g qq";
        if (findinLineNum(line)) {
            String[] words = line.split(" ");
            String s = Arrays.toString(words);
            System.out.print (s);
        } else {
            System.out.print ("В строке, цифр нет");
        }
    }
}
