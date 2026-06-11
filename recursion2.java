import java.util.Scanner;
// print n - 1 
// time comlexity :- o(n)

public class recursion2 {

    public static void printnum(int i, int num) {
        if (num < i) {
            return;
        }

        System.out.println(num);
        printnum(i, num - 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:- ");
        int n = sc.nextInt();
        printnum(1, n);
        sc.close();
    }
}
