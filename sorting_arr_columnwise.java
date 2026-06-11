public class sorting_arr_columnwise {
    public static void main(String[] args) {
        int[][] arr = {{4,5,6},{1,3,8},{2,7,9}};

        for(int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = 0; k < arr.length - 1; k++) {
                    if (arr[k][i] > arr[k + 1][i]) {
                        int temp = arr[k][i];
                        arr[k][i] = arr[k + 1][i];
                        arr[k + 1][i] = temp;
                    }
                }
            }
        }

        for (int[] arr1 : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }
}
