package Java_zadachi;
import static java.lang.System.out;
import java.util.Scanner;

/**
 * Created by Asus on 19.03.2017.
 */

/*
6. Разработайте программу, которая будет выводить таблицу умножения введенного пользователем числа с клавиатуры.
 */

public class MultiTableDemo {
    public static int randomMinMax(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {


        int a;

        int min = 2;
        int max = 9;
        a = randomMinMax(min, max);
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j <= 15; j++) {
                i = a * j;
                out.println(a + "" + " * " + j + " = " + i);
                //if (i == 15) break;
            }

        }
        ++a;
    }
}

