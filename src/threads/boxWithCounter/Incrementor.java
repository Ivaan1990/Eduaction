package threads.boxWithCounter;

import ClassesTasks.trains.Train;

/**
 * Created by Asus on 03.02.2018.
 */
public class Incrementor implements Runnable {

    private Thread t;
    String name;
    Box currentBox;
    Incrementor neighbor;

    static {
        System.out.println("class incrementor loaded");
    }
    public Incrementor(String name) {
        this.name = name;
        t = new Thread(this);
        t.start();
    }

    public Incrementor(String name, Incrementor neighbor) {
        this(name);
        this.neighbor = neighbor;
    }

    public Thread getT() {
        return t;
    }

    public synchronized void resumeThr(){
        notify();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            currentBox = new Box(i + 1, 2*i + 1, 4*i + 1);

            System.out.println(name + " : " + i);

            if (i == 5){
                synchronized (this){
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}

/*

 */
