package exception2;

import java.util.Scanner;

public class TryCctch01 {

	public static void main(String[] args) {
		// try~catch구문은 크게 예외가 발생할 가능성이 있는 구문을 적어두는
		// try블러과, 예외가 실제로 발생했을때 대처할 코드를 실행하는
		// catch블럭으로 나뉩니다.
		
		// 
		Scanner scan = new Scanner(System.in);
		System.out.println("1번정수를 입력해주세요");
	     int a = scan.nextInt();
		System.out.println("2번정수를 입력해주세요");
		int b = scan.nextInt();
		
		try {
			//예외가 발생할 가능성이 있는 구문을 전부 때려넣습니다.
			System.out.println("실행 시작!" );
			System.out.println(a/b);
			System.out.println("계산 끝!");
		}catch(Exception e) {
			// catch블록에는 (Exeption e) 가 기본으로 들어간다.
			// Exeption e로 적는 경우 예외 종류를 막론하고 전부 처리 가능하다.
			// 추후에 특정한 종류의 예외를 따로 처리하고 싶은 경운느 다른 예외명을 적으면 된다.
			System.out.println("나누는 숫자는 0이 될 수 없습니다.");
		}finally {
			System.out.println("끝!");
		}
		

	}

}
