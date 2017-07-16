package threads;

/**
 * Created by Asus on 16.07.2017.
 */
public class Wait implements Runnable {

    Thread t;

    public Wait () {
        t = new Thread(this);
        t.start();

    }


    @Override
    public void run() {
        System.out.println("Started");
        while(true){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("resumed");
        }
    }
}
