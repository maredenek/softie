package pl.softie.course4.inheritance;

public class Runner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Animal puppy = new Dog();
        puppy.eat();
        ((Dog)puppy).bark();

    }

}
