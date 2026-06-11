public  class func_prime {
    public static void main(String[] args) {
       int n = 10;

       for(int i = 2 ; i <= n ; i++){
           boolean result = isprime(i);
           if(result){
               System.out.print(i + " ");
           }
       }
    }
    static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}
