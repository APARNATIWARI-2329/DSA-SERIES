public class divisor {
    public static void main(String[] args) {
        int n = 12;
        for(int i = 1 ; i <= Math.sqrt(n) ; i++){
            if((n % i) == 0){
                System.out.println(i);

                int sd = n / i;
                if(sd != i){
                    System.out.println(sd);
                }
            }
        
        }
    }
}
