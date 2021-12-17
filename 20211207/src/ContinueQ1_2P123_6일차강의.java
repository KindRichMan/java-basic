import java.util.Scanner;

public class ContinueQ1_2P123_6일차강의 {

	public static void main(String[] args) {
		
		//1부터 n까지 총합을 ㄱ하되 홀수끼리만 더한
		// 총합을 구하는 ㄱ문을 작성해주세요.
		//conftinue문을 반드시 사용하는 로직으로 작성해주세요.
		//n은 스캐너로 입력받습니다.
		
		// 1. 정수 입력받기.
		Scanner scan = new Scanner(System.in);
		System.out.println("목표정수를 입력해주세요.");
		int goal = scan.nextInt();
		
		int total = 0;
		int count = 0;
		
		// 2. 반복문 만들기
		while(count > goal) {
			count += 1;{
				if(count % 2 == 0) {
					continue;
				}
				total += count;
				//
			}
			
		}

	}

}
