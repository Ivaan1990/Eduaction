package Java_zadachi;

import java.util.Scanner;

/**
 * Created by Asus on 19.03.2017.
 */
public class CheckInteger {

    // ]1. Сделайте программу, которая будет проверять является ли число типа double целым.

    public static void main(String[] args) {

        double d = 1;

        System.out.print("Число  " + d + ( d % 1 == 0 ? " - целое" : " - не целое" ));

    }

}
