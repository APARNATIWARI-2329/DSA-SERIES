public class diff_eveninteger
{
    public static void main(String[] args) {
        // 1st method :
        int[] arr = {1 , 5 , 78 , 8 , 6 , 9 , 10};
        int lst_idx = -1;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0 && arr[i] % 2 == 0){
                if(lst_idx != -1){
                    ans = Math.min(ans , i - lst_idx);
                }
                lst_idx = i;
            }
        }
        System.out.println("minimum distance between two even positive integer is : " + ans);

        // 2nd method : 
        // for(int i = 0 ; i < arr.length ; i++){
        //     if(arr[i] > 0 && arr[i] % 2 == 0){
        //         for(int j = i + 1 ; j < arr.length ; j++){
        //             if(arr[j] > 0 && arr[j] % 2 == 0){
        //                 min_dis = Math.min(Math.abs(j - i) , min_dis);
        //             }
        //         }
        //     }
        // }
        // System.out.println("minimum distance between two even positive integer is : " + min_dis);
    }
}