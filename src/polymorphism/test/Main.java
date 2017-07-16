package polymorphism.test;
import Animals.*;
import polymorphism.*;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        Person person = new Person();
        IMoveable[] ob = new IMoveable[2];
        ob[0] = car;
        ob[1] = person;

        /*for (int i = 0; i < ob.length; i++) {
            ob[i].move();
        } */

        ISound[] array = new ISound[4];

        array[0] = car;
        array[1] = new AirPlane();
        array[2] = new Cat(2);
        array[3] = new Dog (1);

        for (int i = 0; i < array.length; i++) {
            array[i].sound();
        }

    }

    static void smthFunc (ISound ob) {
        ob.sound();
    }

}
