package Course_Java;

public class testCLASS {

    static void showSpiral (int[][] a) {

        int x = 0;
        int y = 0;
        int k = 0;
        int n = a.length;

        for (int i = 0; i < n * n; i ++){
            a[x][y] = i + i;
            if (x == k && y < n - 1 -k)
                y++;
        }
    }


    public static void main(String[] args) {

        int[][] a = new int [4][4];
        showSpiral(a);
        for (int i = 0; i < a.length; i ++) {
            for (int j = 0; j < a[i].length; j ++ ) {
               System.out.format ("%3d", a[i][j]);
            }
            System.out.println();
        }
    }

}