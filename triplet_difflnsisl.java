import java.util.Arrays;

public class triplet_difflnsisl {
    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 4, 9, 6};
        int L = 2;

        int count = 0;

        Arrays.sort(arr); //{2 ,3 ,4 ,5 ,6 ,9}

        for (int i = 0; i < arr.length - 1; i++) {

            int a = arr[i];
            int j = i + 2; // Start j from i + 2 to ensure at least one element between i and j
            if(arr[j] - a == L) {
                count++;// If the next element is already greater than L, we can start j from i + 1
            }
        }
        System.out.println("Total triplets found: " + count);
    }
}