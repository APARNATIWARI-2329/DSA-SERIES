// TIME COMPLEXITY IS :- O(n)
// print hii n times using recursion
import java.util.Scanner;

public class recursion {   // Class name ko capital letter se start karo (Java convention)
    public static void printName(int n) {   // Method name camelCase me: printName
        if (n <= 0) {
            return;
        }
        System.out.println("hii");
        printName(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = sc.nextInt();
        printName(i);
        sc.close();
    }
}
