package Java_zadachi;
import static java.lang.System.out;

public class Zadachi5 {
    public static void main (String[] args) {

        int size = 10;
        char nums[][] = new char [size][size];
        int smh = 0;

        for (int i = 0; i < size; i ++) {

            if (i < size/2) {
                smh = size / 2 + i;
            } else {
                smh = i - size/2;
            }
            for (int j = 0; j < size; j ++) {


                if (j == 0 || i == 0 || i == size - 1 || j == size - 1 || j == i || j == size - smh + 4){ // первая фигура
                //if (j == 0 || j == i || i == f - 1){ // вторая фигура
                //if (j == f - 1 || i == t - 1){
                //if (j == 0 || j == i || i == t + j){
                    nums[i][j] = '*';
                } else {
                    nums[i][j] = ' ';
                }
                out.format ("%1c", nums[i][j]);
            }
            out.println();
        }
    }
}
