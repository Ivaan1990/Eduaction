package Course_Java;
import static java.lang.System.out;

public class Zadachi5 {
    public static void main (String[] args) {
        int t = 10;
        int f = 10;
        char nums[][] = new char [t][f];

        for (int i = 0; i < t; i ++) {
            for (int j = 0; j < f; j ++) {


                if (j == 0 || i == 0 || i == t - 1 || j == f - 1 || j == i){ // первая фигура
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
