class Student {
    int rollno;
    String name;
    static String college = "Parul University";
    
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
public class oops1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");
        s1.display();
        s2.display();
    }
}
