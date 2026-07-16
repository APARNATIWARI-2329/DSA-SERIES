public class predictoutput {
    public static void main(String[] args) {

        int b = 24 , c = 24;
        int sum = 0;
        int sum2 = 0;
        while (b > 0) {
            int num = b & 1; // as 24 is even number so it will give 0
            sum += num;
            b /= 10;
        }
        while (c > 0) {
            int num = c ^ 1; // as 24 is even number so it will give 0
            sum2 += num;
            c /= 10;
        }

        System.out.println(sum);
        System.out.println(sum2);
    }
}

