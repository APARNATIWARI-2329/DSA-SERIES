public class arr2dsum {
    public static void main(String[] args) {
        
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] sumArr = new int[arr.length][arr[0].length];

        for(int i = 0 ; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sumArr[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of two 2D arrays:");
        for (int[] sumArr1 : sumArr) {
            for (int j = 0; j < sumArr1.length; j++) {
                System.out.print(sumArr1[j] + " ");
            }
            System.out.println();
        }
    }
}
