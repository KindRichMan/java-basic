package 연습;

public class Test {

	public static void main(String[] args) {
		
		int count = 0;
		while(true) {
			count += 1;
			if(count > 5) {
				break;
			}
			System.out.println("현재"+count +"바퀴 도는중.");
		}

	}

}
