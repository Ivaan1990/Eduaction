package threads.basic;

import java.io.IOException;

/**
 * Created by Asus on 08.07.2017.
 */
public class Input implements Runnable {

    Object monitor;

    public Input(Object monitor){

        this.monitor = monitor;
        new Thread(this).start();

    }

    @Override
    public void run() {
        syncMeth();
    }

    private synchronized void syncMeth(){

        System.out.println("Print something");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
