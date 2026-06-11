public class func {
    public static void main(String[] args) {
       int n = 5;
       boolean result = isprime(n);
       System.out.println(n + " is prime: " + result);
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}