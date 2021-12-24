import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 너비를 입력해주세요.");
		int count = scan.nextInt();
	
		int i = 0;
		while(i < count) {
			int j = 0;
			while(j < count) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			
			
		}	
		}

	}


