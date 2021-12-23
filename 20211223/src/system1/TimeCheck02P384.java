package system1;

public class TimeCheck02P384 {
	public static void doIt(String[] s, int i) throws ArrayIndexOutOfBoundsException {
		// 내부가 인덱스 조회이므로, 언제든 ArrayIndexOfBoundsException
		System.out.println(s[i]);
	}
	public static void main(String[] args) {
		// try~catch구문의 소요시간을 구해주세요.
		// 내부에는 여러분들이 원하는 속성의 예외를 발생시키세요.
		// throw로 발생시키면 됩니다.
		long start = System.currentTimeMillis();
		System.out.println("시작시간" +start);

	
	String[] greetings = {"안녕", "hi","니하오", "싸왓디"};
	int i = (int)(Math.random() * 5);// 정수 0, 1, 2, 3, 4
	
	try {
		doIt(greetings, i);
		}catch (Exception e) {
			System.out.println("main지역에서 처리했습니다.");
		}
	long end = System.currentTimeMillis();
	System.out.println("끝난시간 :" + end);
	System.out.println("소요시간 :" + (end - start));
}
}
