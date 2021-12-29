
public class Continue01 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) {
			if(i==6 || i==8) {
				System.out.println("출력되지 않습니다.");
				continue;
				
			}
			System.out.println("이번숫자는 " + i + "입니다.");
		}

	}

}
