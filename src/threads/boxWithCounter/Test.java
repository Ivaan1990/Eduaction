package threads.boxWithCounter;

/**
 * Created by Asus on 03.02.2018.
 */
public class Test {

    Class<Box> ob = Box.class;
    static {
        System.out.println("class Test loaded");
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main executed");
        System.out.println(Box.class.getConstructors().length);

        Incrementor in = new Incrementor("A");
        Thread t1 = in.getT();


        Thread t2 = new Incrementor("B").getT();


        Thread t3 = new Incrementor("C").getT();
        Thread t4 = new Incrementor("D").getT();
        Thread t5 = new Incrementor("E").getT();

        in.resumeThr();

//        in.name = "Z";
        System.out.println(in);
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("main TERMINATED");
        System.out.println(Box.box_val);
    }
}