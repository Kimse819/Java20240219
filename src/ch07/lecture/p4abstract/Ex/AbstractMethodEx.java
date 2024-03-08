package ch07.lecture.p4abstract.Ex;

public class AbstractMethodEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalsound(new Dog());
        animalsound(new Cat());

    }

    private static void animalsound(Animal animal) {
        animal.sound();
    }
}
