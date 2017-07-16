package Course_Java;
// Дан текст. Найдите наибольшее количество идущих подряд цифр.

public class EXP_18 {
    public static void main (String[] args) {

        StringBuffer line2 = new StringBuffer ("hg12543gh234j");
        String line = line2.toString();
        int index = 0;
        int length = 0;
        char[] a;
        a = line.toCharArray();
        for (int i = 0; i < a.length; i ++) {
            if (a[i] == '1') {
                index = i;
            }
            for (int j = index; j < a.length; j++){
                if (a[j] == 'g') {
                    length = j;
                    break;
                }
            }
        }
        int done = length - index;
        System.out.print ("Подряд цифр " + done);
    }
}



