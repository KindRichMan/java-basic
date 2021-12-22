package heterogeneous;

public class HeterogeneousArray {

	public static void main(String[] args) {
		int[] iArr = {1,2,3,4,5,6,7,8,9,10};
		//int[] intArr = {"a","b",1,2,3,4,}
		
		for(int value : iArr) {
			System.out.print("," + value);
		}
		System.out.println();
		
			Object[] oArr = {"a", "b" , 1, 2, 3.0, 5.1}; 
			for(Object a : oArr) {
				System.out.print("," + a);
			}

	}
	}

