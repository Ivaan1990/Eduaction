package ClassesTasks.counter;

import java.util.Random;
import java.util.Scanner;

/*
*** Класс реализации десятичного счетчика
 */

public class Decimal {

    Random r = new Random();

    private double counter; //значение по умолчанию
    private final double zero_ONE_TENTH = 0.1;

    public Decimal (){

        this.counter += zero_ONE_TENTH;

    }

    public Decimal(double counter) {

        this.counter = counter;
    }

    public double getCounter() {
        return counter;
    }

    public void choiceAction() throws InterruptedException {

        System.out.println("Select actions on the counter:\nPlus '+' or minus '-'");

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        if ("-".equalsIgnoreCase(choice)) {
            for (int i = (int) this.counter; ;i--) {

                this.counter -= zero_ONE_TENTH;
                Thread.sleep(1000);
                System.out.format("%.1f ", this.counter);

            }
        }

        if ("+".equalsIgnoreCase(choice)) {
            for (int i = 0; ; i++) {

                this.counter += zero_ONE_TENTH;
                Thread.sleep(1000);
                System.out.format("%.1f ", this.counter);

            }
        }
    }

    public void startRandomCounter (int random) throws InterruptedException {

        for (int i = random; ;i++) {

            this.counter += zero_ONE_TENTH;
            Thread.sleep(1000);
            System.out.format("%.1f ", this.counter);
        }
    }

}
