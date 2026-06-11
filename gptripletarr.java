public class gptripletarr {
    public static void main(String[] args) {
        // FIND TRIPLETS IN SORTED ARRAY THAT FORM A GP
        int[] arr = {2 , 3 , 4 , 5 , 6 , 8 , 10 , 12 , 20};
        int n = arr.length;

        for(int j = 1; j < n - 1; j++){
            int i = j - 1;
            int k = j + 1;

            while(i >= 0 && k < n){
                int bSqr = arr[j] * arr[j];
                int ac = arr[i] * arr[k];

                if(ac == bSqr){
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    i--;
                    k++;
                }else if(ac < bSqr){
                    k++;
                }else{
                    i--;
                }
            }
        }
    }
}
