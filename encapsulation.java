// example and explanation 

// Encapsulation is an OOP concept in which data (variables) and methods are wrapped together into a single class. The data is hidden using the private keyword and can be accessed using public getter and setter methods.

// Class that demonstrates Encapsulation
class Student {

    // Private variable (cannot be accessed directly outside the class)
    private String name;

    // Setter method - used to set the value of name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method - used to get the value of name
    public String getName() {
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {

        // Create object of Student class
        Student s = new Student();

        // Set the student's name using setter
        s.setName("Aparna");

        // s.name = "Aparna";   // Error because name is private

        // Get and print the student's name using getter
        System.out.println("Student Name: " + s.getName());
    }
}
