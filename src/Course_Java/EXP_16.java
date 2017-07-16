package Course_Java;
//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.

public class EXP_16 {
    public static void main(String[] args) {

        String line = "   Hi,   how   you   do ?     ";
        String final_Line = line.replaceAll (" +", " ");
        System.out.print (final_Line.trim());

    }
}
