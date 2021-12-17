import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		int b = scan.nextInt();
		if (b > 0){
			System.out.println("담배입니다.");
		}else if(b == 0) {
			System.out.println("술입니다.");
		}else {
				System.out.println("바보입니다.");
			}
			
	
		}
		

	}


