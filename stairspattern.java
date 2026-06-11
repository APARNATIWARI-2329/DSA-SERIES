public class stairspattern {
    public static void main(String[] args) {
        int n = 8;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            if(i % 2 != 0){
                System.out.print("*");
            }
           System.out.println();  
        }
    }
}
