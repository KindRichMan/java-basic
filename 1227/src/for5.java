import java.util.Arrays;

public class for5 {

	public static void main(String[] args) {
		
		int[] arr1 = {100, 211, 339, 475, 591, 600};
		System.out.println(Arrays.toString(arr1));
		
		
		System.out.println("배열 내부 요소 갯수");
		System.out.println(arr1.length);
		for(int item : arr1) {
			System.out.println(item);
		    
		}
		//for(int i = 0; i < arr1.length; i++) {
			//System.out.println(arr1[i]);
		}
		

	}


