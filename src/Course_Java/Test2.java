package Course_Java;
import java.util.regex.*;

public class Test2 {

    public static boolean test(String testString){
        Pattern p = Pattern.compile("^[0-9]+");
        Matcher m = p.matcher(testString);
        return m.matches();

    }
    public static void main(String[] args) {
        System.out.print (test("aaa4"));
    }
}
