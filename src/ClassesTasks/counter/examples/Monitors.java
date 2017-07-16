package ClassesTasks.counter.examples;

/**
 * Created by Asus on 08.07.2017.
 */

public class Monitors {

    private int i = 0;
    //todo 1 класс увеличивает на 10 каждую секунду, 2 класс уменьшает на 2 каждые 2 секунды, 3 класс печатает значение каждые 3 секунды

    public synchronized int getI() {
            return i;
    }
    @Deprecated
    public void setI (int i) {
        this.i = i;
    }

    public synchronized void incI(int a){
        i += a;
    }
}
