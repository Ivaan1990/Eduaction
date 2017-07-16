package ClassesTasks;

import java.io.File;

/**
 * Created by Asus on 13.07.2017.
 */
public class HelpDelete implements Runnable{

    Thread t;
    HelpDelete () {

        t = new Thread(this);
        t.start();
    }


    @Override
    public void run() {

        File file = new File ("");
        if (file.delete()){

            System.out.println("Удален");

        } else {
            System.out.println("Не удален");
        }

    }

}
