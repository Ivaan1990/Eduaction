package ClassesTasks.counter;

import java.util.Random;
import java.util.Scanner;

public class DecimalDemo implements Runnable {

    Thread t;

    public DecimalDemo() {

        t = new Thread(this);
        t.start();

    }

    @Override
    public void run() {

        System.out.println("Нажмите 1 чтобы начать рандомный счетчик");

        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        if (target == 1) {

            Decimal ob = new Decimal();
            Random r = new Random();
            int random = r.nextInt(30);

            try {
                ob.startRandomCounter(random);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } else {

            System.out.print("Enter number, from you want start, a counter: ");
            Scanner sc = new Scanner(System.in);
            double val = sc.nextDouble();

            try {
                Decimal ob = new Decimal(val);
                ob.choiceAction();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
