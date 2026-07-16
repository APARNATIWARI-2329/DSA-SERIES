public class hollowspere {
    public static void main(String[] args) {
        //  print hollow sphere pattern
        System.out.println("Hollow Sphere Pattern:");
        int r = 5; // You can change the radius as needed
        for (int i = 0; i <= r; i++) { 
            
            for (int j = 0; j <= r; j++) {
                if (i == 0 || i == r || j == 0 || j == r) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
