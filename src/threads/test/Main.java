package threads.test;

import threads.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Wait ob = new Wait();
        Thread.sleep(2000);
        ob.pause();
        Thread.sleep(5000);
        ob.notifyMe();
        //ob.run();
        //System.in.read()
        /*todo wait Не трогаем. Сделать внешнее управление потоком wait с помощью ввода символов
         черз консоль. p - pause, r-resume остальные символы игнорируем*/
    }

}
