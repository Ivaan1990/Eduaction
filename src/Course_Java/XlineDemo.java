package Course_Java;
import static java.lang.System.out;

//Дана строка состоящяя из слов раздёленных несколькими пробелами. Вывести строку задом наперед,
// слова разделить одним пробелом.
public class XlineDemo {

    public static void main (String[] args) {

        StringBuilder line = new StringBuilder ("   Один    Два   Три   Четыре  Пять  ");
        String s = line.toString().replaceAll(" +", " ").trim();

        char[] a = s.toCharArray();
        char[] b = new char [a.length];

        for (int i = 0; i < a.length; i ++)
            b[(a.length - 1) - i] = a[i];

        String str = "";
        str = str.copyValueOf(b);
        out.print (str); // TODO done??

    }
}
