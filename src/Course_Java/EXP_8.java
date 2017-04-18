package Course_Java;
import static java.lang.System.out;
/*
Дана строка. Разделить строку на фрагменты по три подряд идущих символа.
 В каждом фрагменте средний символ заменить на случайный символ, не совпадающий ни с одним из символов этого фрагмента.
 Показать фрагменты, упорядоченные по алфавиту.
 */
public class EXP_8 {

    static String divideLine (String target) {

        String line = "qwertyuioplkjhgfdsazxcvbnm";
        char[] chars;
        chars = line.toCharArray();

        int size = chars.length;
        int randomVal = (int) (Math.random() * size);
        char[]symb;

        symb = target.toCharArray();
        int count = 0; // счетчик на совпадения среднего символа

        for (int i = 0; i < symb.length; i++){

            symb[1] = chars[randomVal];
            if (symb[1] == symb[0] || symb[1] == symb[2]) {
                ++count;
                symb[1] = chars[randomVal];
            } else {
                symb[1] = chars[randomVal];
            }
        }
        String finLine = "";
        finLine = finLine.copyValueOf(symb);
        return finLine;
    }

    static String transformAlf (String target) {

        char[] symbl;
        symbl = target.toCharArray();

        for (int i = 0; i < symbl.length; i ++) {
            for(int j = i + 1; j < symbl.length; j++){

                if(symbl[i] > symbl[j]){
                    char t = symbl[i];
                    symbl[i] = symbl[j];
                    symbl[j] = t;
                }
            }
        }
        String done = "";
        done = done.copyValueOf(symbl);
        return done;
    }

    public static void main (String[] args) {

        StringBuffer s = new StringBuffer("onetwothr");

        StringBuffer s1 = new StringBuffer(s.subSequence(0, 3));
        StringBuffer sTwo = new StringBuffer(s.subSequence(3, 6));
        StringBuffer sTre = new StringBuffer(s.subSequence(6, 9));

        String s2 = s1.toString();
        String s3 = sTwo.toString();
        String s4 = sTre.toString();

        String finalLine = divideLine(s2)+divideLine(s3)+divideLine(s4);
        System.out.println (finalLine);
        System.out.print(transformAlf(finalLine));
//
    }

}