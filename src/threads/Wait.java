package threads;

public class Wait implements Runnable {

    Thread t;
    boolean pause;

    public Wait () {

        this.pause = pause;
        t = new Thread(this, "wait");
        t.start();

    }

    @Override
    public void run() {

        int i = 0;
        try{
            System.out.println("Started " + Thread.currentThread());
            while (true){
                synchronized (this){
                    //while(pause){
                        if(pause) this.wait();
                    //}
                    System.out.print(++i + " ");
                    Thread.sleep(500);
                }
            }
        }
        catch (InterruptedException e){

        }
    }

    public void pause(){
        pause = true;
        System.out.println("pause " +  Thread.currentThread());
    }

    public synchronized void notifyMe() {
            pause = false;
            this.notify();
        System.out.println("NotifyMe! " + Thread.currentThread());
    }
}
