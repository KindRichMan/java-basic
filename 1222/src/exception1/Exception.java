package exception1;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// 예외발생 케이스 3
		// 클래스 자료형을 생성할 떄 new로 힙공간에 저장된 데이터를 제공하지 않은겨우
		Scanner scan = null; //null데이터 없음.
          scan.nextInt();
	}

}
