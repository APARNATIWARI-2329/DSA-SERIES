
// Parent class
class Animal {

    // Parent method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {

    // Overriding parent's method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another child class
class Cat extends Animal {

    // Overriding parent's method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class poly {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // Different outputs using the same method call
        a1.sound();
        a2.sound();
    }
}