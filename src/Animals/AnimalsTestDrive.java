package Animals;

/**
 * Created by Asus on 04.03.2017.
 */

public class AnimalsTestDrive {

    public static void main(String[] args) {

        MyAnimalList list = new MyAnimalList();
//        Dog d = new Dog();
//        Cat c = new Cat();
//        list.add(d);
//        list.add(c);
        Cat cat = new Cat(2);
        Dog dog = new Dog(1);
        Animal animal = new Animal(2) { //4 byte
            @Override
            public void sound() {
                System.out.println("1");
            }
        };

        System.out.println(cat.ob);
//        printAge(cat);
//        printAge(dog);
        System.out.println(cat.toString());
        System.out.println(animal.toString());


    }

    static void printAge (Animal animal) {
        System.out.println(animal.getAge());

    }
}
