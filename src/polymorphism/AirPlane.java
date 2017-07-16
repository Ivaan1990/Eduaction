package polymorphism;

import Animals.ISound;

public class AirPlane implements ISound {

    @Override
    public void sound() {
        System.out.println("Вжух и полетел");
    }
}
