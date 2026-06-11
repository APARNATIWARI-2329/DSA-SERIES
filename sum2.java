public class sum2
{
	public static void main(String[] args) {
		int[] arr = {1 , 5 , 78 , 8 , 6 , 9 , 10};
		int target = 11;
		
		int i = 0 , j = arr.length - 1;
		
		while(i < j){
		    if(arr[i] + arr[j] == target){
		        System.out.println("target found at : " + i + " , " + j);
		        i++;
		        j--;
		    }
		    else if(arr[i] + arr[j] > target){
		        j--;
		    }
		    else{
		        i++;
		    }
		}
	}
}