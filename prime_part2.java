public class prime_part2 {
    public static void main(String[] args) {
        int  n = 28;
        if(n <= 1){
            System.out.println(n + " is not prime.");
        } 

        else if(n == 2 || n == 3 || n % 2 == 0 || n % 3 == 0){
            System.out.println(n + " is not prime.");
        }

        else{
            boolean isPrime = true;
            for(int i = 5; i * i <= n; i += 6){
                if(n % i == 0 || n % (i + 2) == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(n + " is prime.");
            } else {
                System.out.println(n + " is not prime.");
            }
        }
    }
}
