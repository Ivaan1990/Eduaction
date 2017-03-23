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

    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);
        int a;
        out.print ("Введите число: ");

        a = sc.nextInt();

        for (int i = 1; i < 9; i ++) {
            for ( int j = 1; j < 10; j ++ ) {
                i = a * j;
                out.println(a + "" + " * " + j + " = " + i);
            }
        }
    }
}

