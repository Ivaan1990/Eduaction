package Course_Java;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.out;

    //Найдите количество вхождения 'aba' в строку.

public class EXP_14 {
    public static void main(String[] args) {

        int countABA = 0;

        String s = "aba";
        String line = "abaabsaba";

        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher(line);

        while (m.find()) {
            countABA++;
            }

        if (countABA > 0)out.print("Кол-во подстрок в строке: " + countABA);
        if (countABA == 0 ) out.print("'aba' нету в строке");
        }


}

