package Course_Java;
/*
Дана строка. Вывести первые три символа и последний три символа, если длина строки больше 5.
 Иначе вывести первый символ столько , какова длина строки.
 */

public class EXP_2 {

    public static void main (String[] args) {

        String s = "Write code";
        int size = s.length();

        if (size > 5){

            for (int i = 0;i < 3; i++) {
                System.out.print(s.charAt(i)+" ");
            }
            System.out.println();
            for (int j = size - 3;j < size; j++) {
                System.out.print(s.charAt(j)+" ");
            }

        } else {
            for (int k = 0;k < size; k++) {
                System.out.print (s.charAt(0)+" ");
            }
        }
    }
}


