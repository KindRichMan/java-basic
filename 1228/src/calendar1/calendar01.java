package calendar1;

import java.util.Calendar;

public class calendar01 {

	public static void main(String[] args) {
		        // Calendar는 현재 시간을 일반 시간이 아닌 요일, 오전/오후 등으로
				// 달력기준으로 표기해주는 방식입니다.
				// Canendar.getInstance(); 를 이용해 사용합니다.
				// 추상클래스이므로 new키워드를 쓸 수 없습니다.
		Calendar now = Calendar.getInstance();
		System.out.println("년도 :" + now.get(Calendar.YEAR));
		
		System.out.println("월 :" + now.get(Calendar.MONDAY));
		System.out.println("요일 : " + now.get(Calendar.DAY_OF_WEEK));
		System.out.println("오전, 오후여부 :" + now.get(Calendar.AM_PM));
		System.out.println("시 :"+ now.get(Calendar.HOUR));
		System.out.println("분 :" + now.get(Calendar.MINUTE));
		System.out.println("초 :" + now.get(Calendar.SECOND));
		

		
	}

}
