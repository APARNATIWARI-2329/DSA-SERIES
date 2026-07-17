// Animal class
class Animal {

    // Private static variable
    // It cannot be accessed directly from outside the class.
    private static int count;

    // Private method
    // This method can only be called inside the Animal class.
    private int update(int val) {

        // Store the given value in count
        count = val;

        // Return the updated value
        return count;
    }

    // Public method
    // This method acts as a bridge to access the private method.
    public int call(int val) {

        // Calling the private method from inside the same class
        return update(val);
    }
}

public class encap2 {

    public static void main(String[] args) {

        // Create an object of Animal class
        Animal a = new Animal();

        // Call the public method.
        // The public method internally calls the private method.
        int data = a.call(10);

        // Print the returned value
        System.out.println(data);
    }
}