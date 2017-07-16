package threads.basic;

/**
 * Created by Asus on 24.06.2017.
 */
public class EmptyLines implements Runnable {

    Thread t;

    public EmptyLines () {

        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (;;) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
            }
        }
    }

