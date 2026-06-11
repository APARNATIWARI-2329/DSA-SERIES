public class secomdmax_arr {
    public static void main(String[] args) {
        int[] arr = {2,4,25,68,2,98};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        System.out.println("the second maximum number in the array is : "+ secondMax);
    }
}
