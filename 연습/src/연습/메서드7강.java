package 연습;

public class 메서드7강 {
       	public static void plus2(int c, int num) {
       		System.out.println(c + num);
       	}
	
	
	
	public static void main(String[] args) {
		plus2(10,40);
		
		        // 중괄호 여닫는 부분을 "지역"이라고 합니다.
				// 중괄호 닫히며 해당 "지역"과 "지역" 내 자료들은 함께 소멸합니다.
				// System.out.println(c);
				// System.out.println(num);
				// 메인구역과 plus2구역이 나뉘는데 각 구역에 있는 명령만 받는다.
			  
	}

}
