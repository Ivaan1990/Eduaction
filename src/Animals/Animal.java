package Animals;

public abstract class Animal implements ISound {

    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public abstract void sound();
}
