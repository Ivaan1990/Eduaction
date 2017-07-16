package ClassesTasks.counter.examples;

/**
 * Created by Asus on 16.07.2017.
 */
public class Printer implements Runnable {
    Monitors monitors;
    Thread t;
    int delay;

    public Printer(Monitors monitors, int delay) {

        this.monitors = monitors;
        this.delay = delay;
        this.t = new Thread(this);
        t.start();

    }

    @Override
    public void run() {
        for(;;){
            System.out.println(monitors.getI());

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
