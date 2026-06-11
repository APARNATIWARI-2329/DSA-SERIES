public class secondlast0 {
    public static void main(String[] args) {
        int n  = 257301;
        boolean result = secondlst(n);
        if(result){
            System.out.println(n + " has second last digit as 0.");
        } else {
            System.out.println(n + " does not have second last digit as 0.");
        }
    }

    static boolean secondlst(int n) {
        int secondLastDigit = (n / 10) % 10;
        return secondLastDigit == 0;
    }
}
