public class convert0to5 {
    public static void main(String[] args) {
        int n = 3527004;
        int rev = reverse(n);
        int secondrev = reverse(rev);
        System.out.println("new number : " +secondrev);
    }
    private static int reverse(int n) {
        int rev = 0;
        
        while(n > 0){
            int digit = n % 10;
            if(digit == 0){
                digit = 5;
            }
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }
}        