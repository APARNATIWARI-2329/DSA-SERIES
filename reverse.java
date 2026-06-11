public class reverse {
    public static void main(String[] args) {
        
        int r = 194;
        int rev = 0;
    
        while(r > 0){
            int mod = r % 10;
            rev = rev * 10 + mod;
            r /= 10;
        }

        System.out.println(rev);
    }
}
