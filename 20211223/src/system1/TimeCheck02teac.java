package system1;

public class TimeCheck02teac {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("시작시간 :" + start);
		try {
			throw new ArithmeticException();
			}catch (Exception e) {
				e.printStackTrace();
			}
		//끝나는 시간 측정
		//long end = System.currentTimeMillis()

	}

}
