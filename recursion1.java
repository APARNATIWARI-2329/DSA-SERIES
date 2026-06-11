// print 1 to n using recursion
// TIME COMPLEXITY - O(N)
import java.util.Scanner;
public class recursion1 {
    public static void num(int i ,int n) {
        if(i>n){
            return;
        }
        System.out.println(i);
        num(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :- ");
        int n=sc.nextInt();
        num(1,n);
    }
}
