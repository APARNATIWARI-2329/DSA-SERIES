public class countpairdivisiblebyk {

    public static void main(String[] args) {
// Count pairs whose sum is divisible by k
        int[] arr = {2, 2, 1, 7, 5, 3};

        int k = 4;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if ((arr[i] + arr[j]) % k == 0) {
                    count++;
                }
            }
        }

        System.out.println("Number of pairs = " + count);
    }
}