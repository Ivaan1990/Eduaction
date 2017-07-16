package Course_Java;
import static java.lang.System.out;

//Удалите в строке все буквы 'x'. за которыми следует 'abc'.

public class EXP_13 {

    static boolean needfulLine(String line) {

        String s1 = "abc";
        if (line == s1) return true;
        return false;

    }

    public static void main(String[] args) {

        StringBuilder s2 = new StringBuilder("kjsahgiuyxabc");
        String s3 = s2.toString();

        if (needfulLine(s3)) {
            out.println(needfulLine(s3));
            out.print(s2);
        } else {
            out.println (needfulLine(s3));
            s2.deleteCharAt(s2.indexOf("x"));
            out.print (s2);
        }
    }
}

/*
TODO 1. Сделать метод для нахождения последовательности символов abc.
TODO 2. Значение нахождения "abc", сравнить с символом 'x', типа [что то -1] ?
*/
