package threads.boxWithCounter;

public class Box {

    int depth;
    int width;
    int heigth;
    static int box_val;

    static {
        box_val = 0;
        System.out.println("class currentBox loaded");
    }


    public Box(int depth, int width, int heigth) {
        this.depth = depth;
        this.width = width;
        this.heigth = heigth;

        synchronized (Box.class) {
            box_val++;
        }
    }

}