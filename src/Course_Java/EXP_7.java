package Course_Java;
import static java.lang.System.out;
/*
 Дана строка. Если ее длина больше 10, то оставить в строке только первые 6 символов,
  иначе дополнить строку символами 'o' до длины 12.
  https://habrahabr.ru/post/260767/
 */
public class EXP_7 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("sdfaa");
        if (s.length() > 10) {
            out.print(s.subSequence(0, 6));//Возвращает новую последовательность символов, которая является подпоследовательностью этой последовательности.
        } else {
            try {
                s.setLength(12);
                int size = 12;
                int val = 12 - s.length();
                s.append(s, s.length(), size);
                 //out.print (s.append("o", val , size));
                out.print(s);
            } catch (IndexOutOfBoundsException ex) {
                out.print("\nNot ok");
            }
        }
    }
}

