package threads.test;

/**
 * Created by Asus on 08.07.2017.
 */
public class Counter {
    private int cnt;

    Counter(){
        cnt = 0;
    }

    public void incCnt(){
        synchronized(this) {
            cnt++;
            System.out.print(cnt + " ");
        }

    }

    public synchronized int getCnt() {
        return cnt;
    }
}
