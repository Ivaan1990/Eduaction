package Course_Java;
import static java.lang.System.out;
import java.util.regex.*;

//Удалите в строке все 'abc', за которыми следует цифра.

public class EXP_17 {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("12345abc123");
        String line = s.toString();

        boolean mission = false;

        char[] target;
        target = line.toCharArray();
        for (int i = 0; i < target.length; i++) {
            if (target[i] == 'a') {
                char z = target[i]; // символ
                int index = i;
                mission = true;
            }
        }

        String line2 = "";
        line2 = line2.copyValueOf(target);

        if (!mission) {
            out.print ("Требуемое условие не соблюдено");
        } else {
            String line3 = line2.replaceAll("abc", "");
            out.println (line3);
        }
    }
}

