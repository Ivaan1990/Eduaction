package Java_zadachi;
import static java.lang.System.out;


import java.util.Scanner;

/**
 * Created by Asus on 18.03.2017.
 */
public class Test {

    public static void main (String[] args) {

        out.print("Введите число: ");

        Scanner sc = new Scanner (System.in); // строка создает объект Scanner

        int a; // переменая которая будет хранить значение введенное с клавиатуры

        a = sc.nextInt(); // считывает число введённое с клавиатуры

        a *= a ;

        out.print ("Квадрат введённого числа равен " + a);

    }
}
