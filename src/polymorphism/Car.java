package polymorphism;

import Animals.ISound;

/**
 * Created by Asus on 11.06.2017.
 */
public class Car implements IMoveable, ISound {
    int x, y, z;

    @Override
    public void move() {
        x++;
        System.out.println("Car is moving");
    }

    @Override
    public void sound() {
        System.out.println("Бип бип");
    }
}
