package threads.basic;

import threads.test.Counter;

import java.util.zip.CheckedOutputStream;

/**
 * Created by Asus on 08.07.2017.
 */
public class Concurent implements Runnable {
    Counter counter;

    public Concurent(Counter counter){
        this.counter = counter;
        new Thread(this).start();

    }

    @Override
    public void run() {
        counter.incCnt();
        //System.out.print(counter.getCnt() + " ");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
