package ClassesTasks.counter.examples;


/**
 * Created by Asus on 08.07.2017.
 */

public class DecimalWithMonitors {

    public static void main(String[] args) throws InterruptedException {

        Monitors monitor = new Monitors();
        new Difference(monitor,10,1000);
        Thread.sleep(10);
        new Difference(monitor,-2,2000);
        Thread.sleep(10);
        new Printer(monitor,3000);

    }

}
