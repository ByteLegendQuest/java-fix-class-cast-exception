package com.bytelegend;
import java.util.stream.Stream;
public class Challenge {
    public static void main(String[] args) {
        allDogsWalk(new Fish("Fish"), new Dog("Dog"));
    }

    /**
     * `allDogsWalk(Animal... animals)` method makes all `Dog` objects in the `animals` array walk
     * (`Dog.walk()`).
     */
    public static void allDogsWalk(Animal... animals) {
        Stream.of(animals)
                .filter(animal -> animal instanceof Dog)
                .forEach(animal -> ((Dog) animal).walk());
    }
}

class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(getName() + " is swimming");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void walk() {
        System.out.println(getName() + " is walking");
    }
}
