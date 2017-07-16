package Course_Java;
public class EXP_7$ver2 {
    public static void main(String[] args) {

         String s = "jsvdislsbhdbsj";
        //String s = "gsh";

        if (s.length() > 10) {

            for (int i = 0; i < 6; i++) {
                System.out.print(s.charAt(i));
            }
        } else {

            char[] array;
            int val = 12 - s.length();
            array = s.toCharArray();
            char[] nums = new char [12];

            for (int i = 0; i < nums.length; i++) {
                if (i == 0 || i == 1 || i == 2) {
                    char z = array[i];
                    nums[i] = z;
                } else {
                    nums[i] = 'o';
                }
            }
            System.out.print(nums);
        }
    }
}
