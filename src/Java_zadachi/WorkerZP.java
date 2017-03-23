package Java_zadachi;
import static java.lang.System.out;
/**
 * Created by Asus on 19.03.2017.
 */
public class WorkerZP {

    /*
4. Создайте метод, который будет считать сколько денег получает работник в неделю.
Метод должен принимать на входе два аргумента (зарплата в час, кол-во проработанных часов).
Условия:
1) Каждый час после 40 считается за полтора.
2) Работник не может работать больше, чем 60 часов в неделю.
3) Работник не может получать меньше 8 долларов в час.
 */

    public static void main(String[] args) {

        Worker ob1 = new Worker ("Ivan");
        Worker ob2 = new Worker ("Victoria");

        out.print (ob2.weekCash (120, 40) + " рублей");

    }
}
