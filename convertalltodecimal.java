public class convertalltodecimal {
    public static void main(String[] args) {
        int n = 123 , b = 16;
        int ans = 0;
        while(n > 0){
            int r = n % b;
            char ch = convert(r);
            ans = ch + ans;
            n = n / b;  
        }
        System.out.println(ans);
    }
    private static char convert(int r) {
        if(r < 10){
            return (char)(r + '0');
        }else{
            return (char)(r - 10 + 'A');
        }
    }
}
