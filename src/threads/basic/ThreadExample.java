package threads.basic;

/**
 * Created by Asus on 24.06.2017.
 */
public class ThreadExample implements Runnable {

    Thread t;

    public ThreadExample(){
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        System.out.println("!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t + " has ended");
    }
}
