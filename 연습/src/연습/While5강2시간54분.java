package 연습;

public class While5강2시간54분 {
  public static void main(String[] args) {
	        // 반복문의 경우 3개의 요소가 필요합니다.
			// 1. 조건시(참 거짓 판단으로 실행 유지 여부 결정)
			// 2. 변수(조건식을 처음에는 true였다가 일정 시점뒤에필요에 따라 false로 만들기 위해서)
			// 3. 변수 증감(변수증감을 줘야 변수값이 변동이 생김)
			// for문 같은 경우 위 3개 요소를 한 줄에 담는다면
			// while은 따로 떨어뜨려 두는 것이 특징입니다.
			// 따라서 한 줄에 있냐, 떨어져 있냐만 빼면 사실상 같은 구문입니다.
			
			// i while문 변수 생성
	  int i = 2; 
	  while(i < 10) {
		  
		  int j = 1;
		  while(j <10) {
		System.out.println(i +"*" + j + "=" + i*j);
		  j++;
		  }
		  System.out.println("========");
		   i++;
		  
	  }
}
}
