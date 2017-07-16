package Course_Java_Arrays;
//Создать массив, на четных местах в котором стоят единицы, а на нечетных местах - числа,
// равные остатку от деления своего номера на 5.

public class Exp_10 {
    public static void main (String[] args) {
        int [] nums = new int [10];

        for ( int i = 0; i < nums.length; i ++) {
            nums[i] = i + 1;

            if (i % 2 == 0) {
                int one = 1;
                nums[i] = one;
            } else {

                float a = i / 5f;
                String s = String.valueOf(a);
                int index = s.lastIndexOf(".");
                String s2 = s.substring(index + 1, s.length());
                int x = Integer.parseInt(s2);
                nums[i] = x;
            }
            System.out.print (nums[i] + " ");
        }

    }
}
