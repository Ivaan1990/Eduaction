package polymorphism;

import polymorphism.IMoveable;

/**
 * Created by Asus on 11.06.2017.
 */
public class Person implements IMoveable {
    int x, y, z;

    @Override
    public void move() {
        x--;
        y++;
        System.out.println("Person is moving");
    }
}
