package ClassesTasks.counter.examples;

/**
 * Created by Asus on 08.07.2017.
 */
public class Difference implements  Runnable {
    int incriment;
    int delay;
    Monitors monitor;
    Thread t;

    public Difference(Monitors monitor, int incriment, int delay) {

        this.delay = delay;
        this.incriment = incriment;
        this.monitor = monitor;
        t = new Thread(this);
        t.start();

    }

    @Override
    public void run() {
        // todo 2 класс уменьшает на 2 каждые 2 секунды
        ///todo 1 класс увеличивает на 10 каждую секунду
            System.out.println("Diff entered");

            for (;;) {
                synchronized (monitor){
                    monitor.incI(incriment);

                }
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }



}