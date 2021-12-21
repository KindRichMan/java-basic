import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		
	

	Scanner scan = new Scanner(System.in);
	int su;
	System.out.println("정수입력 :" );
	su = scan.nextInt();
	
	if(su > 0) {
		System.out.println("양수입니다.");
	}else {
		System.out.println("음수입니다.");
	}
	
	}
	
}