package static1;

public class StaticTest {
	//static이
	public int num1;
	
	public static int num2 = 0;
	
	public StaticTest() {
		this.num1 = 5;
		num2 += 1;
		System.out.println("num1 변수는 변하지 않습니다. : " + num1);
		System.out.println("현재 가입자수 : " + num2 + "명.");
	}
	   
	public static void check() {
		System.out.println("공용 메서드 체크완료.");
	}
}
