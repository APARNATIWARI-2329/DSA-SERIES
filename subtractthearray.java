import java.util.Arrays;

public class subtractthearray {
    public static void main(String[] args) {
        int[] arr1 = {8, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int n = Math.max(n1, n2);
        int[] result = new int[n];
        int i = n1 - 1, j = n2 - 1, k = n - 1;
        int borrow = 0;

        while(k >= 0){
            int digit1 = i >= 0 ? arr1[i] : 0;
            int digit2 = j >= 0 ? arr2[j] : 0;

            digit1 -= borrow;
            
            if(digit1 >= digit2){
                borrow = 0;
            }else{
                digit1 += 10;
                borrow = 1;
            }
            result[k] = digit1 - digit2;
            i--;
            j--;
            k--;
        }
        System.out.println(Arrays.toString(result));
    }
}
