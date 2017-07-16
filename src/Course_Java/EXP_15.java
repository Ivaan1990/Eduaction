package Course_Java;
import java.util.regex.*;

//Удалите в строке все буквы 'x'. за которыми следует 'abc'.

public class EXP_15 {

    public static void main(String[] args) {

        StringBuilder line = new StringBuilder("xxxabcxxx");
        String s1 = line.toString();

        Pattern p = Pattern.compile("abc");
        Matcher m = p.matcher(line);

        for (int i = 0; i < line.length(); i++) {
            m.find(i);

        }
        line.delete(0, 3);
       //line.delete(3, 8);
       /* while (m.find()){
            line.delete(0,2);
        }*/
        System.out.print(line);
    }
}
