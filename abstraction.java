
// Abstract class
// It cannot be instantiated (no object can be created)
abstract class Animal {

    // Abstract method
    // Only declaration is given.
    // Child classes MUST provide the implementation.
    abstract void sound();

    // Normal method
    // This method already has an implementation.
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Child class
// Dog inherits Animal class
class Dog extends Animal {

    // Providing implementation of abstract method
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Another child class
class Cat extends Animal {

    // Providing implementation of abstract method
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class abstraction {

    public static void main(String[] args) {

        // We cannot create object of abstract class
        // Animal a = new Animal(); ❌ Error

        // Create Dog object
        Animal dog = new Dog();

        // Calls Dog's implementation
        dog.sound();

        // Calls inherited normal method
        dog.sleep();

        System.out.println();

        // Create Cat object
        Animal cat = new Cat();

        // Calls Cat's implementation
        cat.sound();

        // Calls inherited normal method
        cat.sleep();
    }
}