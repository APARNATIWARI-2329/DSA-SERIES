import java.util.Scanner;

public class takeinput {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline

            String str = sc.nextLine();
            char ch = sc.next().charAt(0);
            double num = sc.nextDouble();

            System.out.println("Integer is : " + a);
            System.out.println("String is : " + str);
            System.out.println("Character is : " + ch);
            System.out.println("Double value is : " + num);
        
    }
}