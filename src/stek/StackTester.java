package stek;

/**
 * Created by Asus on 10.03.2017.
 */
public class StackTester {

    public static void main (String[] args) {

        Stack ob = new Stack(100);
        System.out.println("Заполняем стэк");
        for (int i = 0; i < 95; i++) {
            ob.push((char) ('a' + i));
        }
        ob.pop();

    }

}
