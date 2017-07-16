package Animals;

/**
 * Created by Asus on 04.03.2017.
 */
public class Dog extends Animal {

    public Dog(int age) {
        super(age);
    }

    @Override
    public void sound() {
        System.out.println("Gav!!");
    }
}
