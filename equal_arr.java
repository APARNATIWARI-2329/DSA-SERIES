import java.util.Arrays;

public class equal_arr {
    public static void main(String[] args) {
        int[] arr1 = {1 , 5 , 78 , 8 , 6 , 8 , 9 , 10};
        int[] arr2 = {1 , 5 , 78 , 8 , 6 , 9 , 10};
        Arrays.sort(arr1);
        Arrays.sort(arr2);  
        boolean is_equal = true;

        if(arr1.length != arr2.length){
            is_equal = false;
        }
        else{
            for(int i = 0 ; i < arr1.length ; i++){
                if(arr1[i] != arr2[i]){
                    is_equal = false;
                    break;
                }
            }
        }

        if(is_equal){
            System.out.println("both array are equal");
        }
        else{
            System.out.println("both array are not equal");
        }
    }
}
