
import java.util.HashMap;

public class equal_arr2 {
    public static void main(String[] args) {
        int[] arr1 = {1 , 5 , 78 , 8 , 6 , 8 , 9 , 10};
        int[] arr2 = {1 , 5 , 78 , 8 , 6 , 9 , 10};
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int numc:arr1){
            map.put(numc , map.getOrDefault(numc , 0) + 1);
        }

        for(int numc:arr2){
            map.put(numc , map.getOrDefault(numc , 0) - 1);
        }

        boolean is_equal = true;
        for(int count:map.values()){
            if(count != 0){
                is_equal = false;
                break;
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
