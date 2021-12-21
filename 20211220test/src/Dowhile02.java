import java.util.Scanner;

public class Dowhile02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				System.out.println("주문금액을 입력해주세요.");
				int a = scan.nextInt();
				do {
					System.out.println("주문금액은" + a + "원입니다.");
					System.out.println("배달을 완료했습니다.");
					System.out.println("다음 배달금액을 입력해주세요.");
					 a = scan.nextInt();
				}while(a >= 15000);
				System.out.println("금액이 모자라 배달 서비스가 종료됩니다.");
					
	 
			
			
		}

	}



