package threads.basic;

/**
 * Created by Asus on 24.06.2017.
 */
public class RunnableEx implements Runnable {
    @Override
    public void run() {

        System.out.println("Runnable is running " + Thread.currentThread());
    }
}
