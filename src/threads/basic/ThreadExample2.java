package threads.basic;

//todo реализоватть любой из расмотренных примеров в данном подходе
public class ThreadExample2 extends Thread {

    private long minPrime;

    public ThreadExample2 (long minPrime) {

        this.minPrime = minPrime;
        for (int i = 0; i < 3; i++) {
            System.out.print("!" + " ");
        }

        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void run () {
        ThreadExample2 t  = new ThreadExample2(100);
        t.start();
//      долгий код
        try {
            this.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
