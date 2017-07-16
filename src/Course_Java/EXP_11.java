package Course_Java;
import java.util.regex.*;
import static java.lang.System.out;

// Дана строка. Определить, содержит ли строка только символы 'a', 'b', 'c' или нет.

public class EXP_11 {



    static boolean haveSymbls (String target) {

        for (int i = 0; i < target.length(); i++) {
            if (target.length() < 3) return false;
                else if (target.charAt(i) == 'a' || target.charAt(i) == 'b' || target.charAt(i) == 'c') return true;
        }
        return false;
    }



    public static void main (String[] args) {

        String s = "sssabcsabcabc";
        Pattern p = Pattern.compile("abc");
        Matcher m = p.matcher(s);

        while (m.find()){
           // if (m.find() == true)
                out.print ("+");
            //return;
        }

    }
}
