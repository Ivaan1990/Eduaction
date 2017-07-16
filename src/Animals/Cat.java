package Animals;

public class Cat extends Animal {

    boolean wool;
    Object ob;

    public Cat(int age) {
        super(age);
        this.ob = new Object();
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
