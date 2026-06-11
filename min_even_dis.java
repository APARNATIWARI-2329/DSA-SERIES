
public class min_even_dis {

    public static int minDistanceEven(int[] arr) {
        int prevEven = -1;
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is even
            if (arr[i] % 2 == 0) {
                if (prevEven != -1) {
                    minDist = Math.min(minDist, i - prevEven);
                }
                prevEven = i;
            }
        }

        // Return -1 if fewer than two even integers are found
        return (minDist == Integer.MAX_VALUE) ? -1 : minDist;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 2, 9};
        System.out.println("Minimum distance: " + minDistanceEven(arr)); // Output: 1
    }
}

