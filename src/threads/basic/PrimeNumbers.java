package threads.basic;



/**
 * Created by Asus on 24.06.2017.
 */
public class PrimeNumbers implements Runnable {

    private Thread t;
    private Object monitor;

    public PrimeNumbers() {
        t = new Thread(this);
        t.start();

    }

    public PrimeNumbers(String name, int priority, Object monitor){

        this.monitor = monitor;
        t = new Thread(this);
        t.setName(name);
        t.setPriority(priority);//1-10
        t.start();

    }

    public void stopThread(){

    }

    @Override
    public void run () {
        synchronized (monitor){
            int i = 0;
            for (;;i ++) {
                if (i % 7 == 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print (i + " ");
                }
            }
        }
    }
}
