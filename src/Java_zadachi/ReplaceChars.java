package Java_zadachi;
import static java.lang.System.out;
/**
 * Created by Asus on 19.03.2017.
 */
/*
9. У вас есть двухмерный массив [n][n], придумайте способ поменять столбцы и строки местами.
 */
public class ReplaceChars {
    public static void main (String[] args) {

        char[][] symbols = {

                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},

        };
        out.println ("Origin array:");
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < symbols[i].length; j++) {
                out.print(symbols[i][j] + " ");
            }
            out.println("");
        }
        out.print('\n');
        out.println ("Replace array:");
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < symbols[i].length; j++) {
                symbols[0][2] = symbols[1][0];
                symbols[1+1][0+2] = symbols[2-1][2-2];
                out.print(symbols[i][j] + " ");
            }
            out.println (" ");
        }
    }
}
