package threads.test;

import threads.basic.Input;
import threads.basic.PrimeNumbers;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object monitor = new Object();

        Input input =  new Input(monitor);
        Thread.sleep(10);
        synchronized (input){
            System.out.println("monitor entered");
            new PrimeNumbers("A", 5, monitor);
            new PrimeNumbers("B", 5, monitor);
            new PrimeNumbers("C", 5, monitor);
        }

    }

}
