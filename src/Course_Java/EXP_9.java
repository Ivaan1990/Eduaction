package Course_Java;
import static java.lang.System.out;

//Дана строка. Заменить каждый четный символ или на 'a', если символ не равен 'a' или 'b', или на 'c' в противном случае.

public class EXP_9 {
    public static void main(String[] args) {

         String s = "babababa";
         char[] array;
         array = s.toCharArray();

         for (int i = 0; i < array.length; i ++) {
             if (i % 2 == 0) {
                 array[i] = 'a';
             } else {
                 array[i] = 'b';
             }
             out.print (array[i] + " ");
         }
    }
}
