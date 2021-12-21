import java.util.Scanner;

public class ForQ3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단을 입력해주세요.");
		int dan = scan.nextInt();
		
		if(1 < dan && dan < 10 ) {
			for(int i = 1; i < 10; i++) {
			System.out.println(dan +"*" + i + "=" + dan*i);
			}
			}else {
			System.out.println("구구단의 유효 범위는 2~9단입니다.");
		}

	}

}
