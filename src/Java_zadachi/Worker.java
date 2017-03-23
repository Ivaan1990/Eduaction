package Java_zadachi;
import static java.lang.System.out;
/**
 * Created by Asus on 19.03.2017.
 */

public class Worker {

    private String id;
    private int day = 5;

    Worker (String name) {

        this.id = name;
        //this.day = day;

        if ( day > 7 ) {
            this.day = 5;

        }

    }

    double weekCash (double hourCash, double clock) {

        out.print ("За " + this.day + " дней " + this.id + " получит ");
        if (clock > 40) clock = 40;

        double day = hourCash * clock;
        return day;

    }

}
