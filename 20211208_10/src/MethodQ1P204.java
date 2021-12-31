import java.util.Scanner;

public class MethodQ1P204 {
	// 화씨온도를 입력하면 섭씨온도로 바꿔주는 메서드를 작성해보겠습니다.
	// 메서드 이름은 fToF이고, double을 리턴합니다.
	// 리턴받은 결과값은 main메서드에서 system.out.println()으로 출력해주세요.
	// 화씨 =(섭씨 x1.8) + 32
	// 1. 양변에 32를 뺍니다.( 변경된 식 => 화씨 - 32 = 섭씨 X 1.8)
	// 2. 양변을 1.8로 나눕니다.( 변경된 식 => (화씨 -32)/1.8 = 섭씨
	// 위와 같이 섭씨 온도를 유도해낼 수 있습니다.
	public static double ftoC(double f) {
		// 섭씨온도 c
		double c =(f - 32)/1.8;
		return c;
	   }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("오늘의 화씨온도를 입력해주세요.");
		double f = scan.nextDouble();
		
		double c = ftoC(f);
		System.out.println("오늘의 섭씨온도는: " + c +"도 입니다.");

	}
	

}
