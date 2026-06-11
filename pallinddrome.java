public class pallinddrome {
   public static void main(String[] args) {
       int n = 121;
       int rev = 0;
       int num = n;

       while(n > 0){
        int mod = n % 10;
        rev = rev * 10 + mod;
        n /= 10;
       }

       if(rev == num){
        System.out.println("pallindrome");
       }
       else{
        System.out.println("not pallindrome");
       }
   } 
}
