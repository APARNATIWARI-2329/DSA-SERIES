// import java.util.Scanner;
// public class input{
//     public static void main(String[] args) {
//         System.out.println("hii guyss ");
//         System.out.println("good morning");
//         System.out.println("4+3");
//         System.out.println(4+3);
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your name");
//         String name = sc.nextLine();
//         System.out.println("welcome " + name);

//     }
// }

import java.util.*;
public class input
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && a == c){
            System.out.println("EQUILATERAL TRIANGLE");
        }
        else if(a == b || a == c || b == c){
            System.out.println("ISOSCELES TRIANGLE");
        }
        else if(a != b && a != c && b != c){
            System.out.println("SCALENE TRIANGLE");
        }
	}
}
