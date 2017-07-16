package Course_Java;
import static java.lang.System.out;

// Замените в строке все вхождения 'word' на 'letter'.

public class EXP_12 {

    public static void main(String[] args) {

        StringBuilder line = new StringBuilder("My word is bette life");
        String s1 = line.toString();

        String target = "letter";
        char a[];

        a = s1.toCharArray();
        char b[] = new char [a.length];

        for (int i = 0; i < a.length; i ++ ) {
            if (a[i] == 'w' || a[i] == 'o' || a[i] == 'r' || a[i] == 'd') {
                char z = a[i];
                b[i] = z;
            }
            //out.print (b[i]);
            //out.print (a);
        }
        String ex = "";
        ex = ex.copyValueOf(b);
        out.print(ex);
        //out.print (a);
        //String l = " letter";
        //StringBuilder s2 = line.replace(2, 7, l);
        //out.print(s2);
    }
}
