public class sandbox {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            // space
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            // newline
            System.out.println();
        }
        for(int i = 2 ; i <= 5 ; i++){
            // space
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            // newline
            System.out.println();
        }
    }
}
