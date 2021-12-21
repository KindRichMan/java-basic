import java.util.Scanner;

public class whiletest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		String num = scan.nextLine();
		int count = 0;
		
		int loop = Integer.parseInt(num);
		while(count < loop) {
			count += 1;
			System.out.println("반복문을 실행합니다." + count);
		}
	
	}

}
