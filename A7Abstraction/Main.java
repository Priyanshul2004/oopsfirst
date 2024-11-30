package A7Abstraction;

abstract class Animal {
    abstract void makeSound(); // Abstract method (no implementation)
}

// Subclass that provides implementation
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Create a Dog object
        myDog.makeSound();         // Call the abstract method
    }
}

