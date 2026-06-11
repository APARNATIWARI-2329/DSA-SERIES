public class right_tri_reverse{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
                // space
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
                // star
            for (int k = 1; k <= i ; k++) {
                System.out.print("*");
            }
                // newline
            System.out.println();
            
        }
    }
}