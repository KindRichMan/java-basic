import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		    // 배열은 일반 변수와 달리 하나의 변수명에 여러 값을
		   // 입력할 수 있고 자료형에[]를 붙이는 것으로 선언합니다.
		   // 배열은 크기를 정해서 생성할수도 있고, 정하지 않고 생성할수도
		   // 있는데, 설정된 크기 이상으로 자료를 넣을수 없습니다.
		   // 배열의 크기(저장가능개수)는 "배열의 길이"라 표현합니다.
		   // 배열명.length를 이용해 배열크기를 알 수있습니다.

		int[] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		
		double[] b = {5,6,7,8,6.3, 8.3,44};
		System.out.println(Arrays.toString(b));
		
		int[] c =new int[10];
		System.out.println(Arrays.toString(c));
		
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
	}

}
