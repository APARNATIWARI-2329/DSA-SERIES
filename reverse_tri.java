public class reverse_tri {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int k = 1; k <= 5 - i + 1; k++) {
                System.out.print("* ");
            }
            // newline
            System.out.println();
        }
    }
}
