package pto.ch03;

public class ExecuteAnimal {
    public static void animal(Animal animal) {
        animal.sound();
    }
    static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        System.out.println("----------");
        Animal animal = null;
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
        System.out.println("----------");
        animal(new Dog());
        animal(new Cat());
    }
}
