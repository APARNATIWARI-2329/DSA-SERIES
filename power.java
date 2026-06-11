public class power {
    public static void main(String[] args) {
        int x = 4 , y = 24; 
        if(x == y) System.out.println("true");
        if(x == 1 && y != 1) System.out.println("false");
        int pow = 1;
        while(pow < y){
            pow *= x;
        }
        if(pow == y) System.out.println("true");
        else System.out.println("false");
    }
}