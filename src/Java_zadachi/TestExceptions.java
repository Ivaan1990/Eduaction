package Java_zadachi;
import static java.lang.System.out;

/**
 * Created by Asus on 20.03.2017.
 */
public class TestExceptions {

    static void doRisky (String test) throws Exception {
        out.println ("Начало опасного метода");
        if ("1".equals(test)) {
            throw new Exception();
        }
        out.println ("Конец опасного метода");
        return;
    }

    public static void main (String[] args) {
        String test = "Test";
        try {
            out.println ("Начало try");
            doRisky (test);
            out.println ("Конец try");
        } catch (Exception se) {
            out.println ("Исключение");
        } finally {
            out.println ("finally");
        }
    }
}
