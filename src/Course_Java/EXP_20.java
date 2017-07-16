package Course_Java;
// Дан текст. Найти сумму имеющихся в нем цифр.
public class EXP_20 {
    public static void main (String[] args){

        String line = "di2ffer33ent life, as biggest fun 4 life 2 you";
        int nums = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= '0' && line.charAt(i) <= '9') {
                int x = Character.getNumericValue(line.charAt(i));
                nums += x;
            }
        }
        System.out.print ("Сумма чисел в строке =  " + nums); // ответ
    }

}
