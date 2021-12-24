import java.util.Arrays;

public class EnhancedFor01 {

	public static void main(String[] args) {
		// 향상된 for문은 반복문 진행시 타겟으로 배열을넣습니다.
		// 이 경우 반복실행 횟수는 배열의 내부요소 갯수만큼입니다.
		
		//7개의 요소를 묶ㅇ서 arr1에 저장
		int[] arr1 = {100, 211, 339, 475, 591, 600, 700};
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[3]);
		System.out.println("=============================================");
		
		//향상된 for문
		for(int i: arr1) {
			System.out.println(i);
			
		}

	}

}
