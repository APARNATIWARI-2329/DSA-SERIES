
import java.util.Scanner;

public class recursion4 {
    public static void printn(int i , int n){
        if(i>n) return;
        printn(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :- ");
        int n = sc.nextInt();
        printn(1, n);
    }
}
