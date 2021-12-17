import java.util.Scanner;

public class ForQ5P117 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받게 해 주세요.
		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		// 중첩 반복문을 작성해주세요.
		// ex) 3입력시
		// ***
		// ***
		// ***과 같이 출력
		// 가로줄 출력시 system.out.print("*");을
		// 다음줄로 내릴 때만 system.out.println(); 을 씁니다.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("한 변의 너비를 입력해주세요.");
		int count = scan.nextInt();
		
		//i for 문 내부에서 println을 실행하므로 새로 길이를 담당
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < count; j++) {
				//print를 이용해 별을 일렬로 나열시키므로 가로길이를 담당
				System.out.print("*");
			}
			 System.out.println();
		}

	}

}
