// important
public class printbuil {
    public static void main(String[] args) {
        int[] arr = {3 , 5 , 6 , 4 , 1};
        int max = arr[0];

        for(int n : arr){
            max = Math.max(max , n);
        }

        for(int i = max ; i >= 1 ; i--){
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[j] >= i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
