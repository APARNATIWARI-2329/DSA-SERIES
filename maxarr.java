import java.util.Arrays;
public class maxarr {
	public static void main(String[] args) {
		int[] arr = {2,4,25,68,2,98};
		Arrays.sort(arr);
		System.out.println("the maximum number in the array is : "+ arr[arr.length - 1 ]);
	}
}
