// Parent class
class Animal {

    // Method of parent class
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inherits Animal
class Dog extends Animal {

    // Method of child class
    void bark() {
        System.out.println("Dog barks");
    }
}

public class inherit {
    public static void main(String[] args) {

        // Create object of child class
        Dog d = new Dog();

        // Inherited method
        d.sound();

        // Child's own method
        d.bark();
    }
}