package ClassesTasks.variables;

public class Launcher implements Runnable{

    Thread t;

    public Launcher() {

        t = new Thread(this);
        t.start();

    }

    @Override
    public void run () {

        Variables var = new Variables(4.0, 5.0);
        var.printVariablse();
        System.out.println("\nSalary = " + var.showSalary() + "\n");

        if (var.getFirst() == var.getSecond()) {
            System.out.println("равны");
        } else {

            if (var.getMax()) {
                System.out.println("First больше");
            }
            if (!var.getMax()) {
                System.out.println("Second больше");
            }
        }

    }

}