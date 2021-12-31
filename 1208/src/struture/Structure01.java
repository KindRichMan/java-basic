package struture;

import java.util.Arrays;

public class Structure01 {

	public static void main(String[] args) {
		        // 이제부터는 실행코드와 정의 코드를 분리합니다.
				// main이 있는 클래스는 실행만 하고
				// 실제 로직은 다른.java파일에 저장합니다.
				
				// 커스텀 디자인 자료형은
				// 아래와 같이 new 자료형(); 문법으로 생성합니다.
				Person p1 = new Person();//실행부
				System.out.println(p1);
				// p1내부에 정의한 변수를
				// p1.변수명 = 대입할 값; 형태로 저장합니다.
				p1.name="김무환";
				System.out.println(p1.name);
				p1.age= 12;
				System.out.println(p1.age);
				p1.pNum="010.2810.1111";
				System.out.println(p1.pNum);
				p1.uNum=123;
				System.out.println(p1.uNum);
				
				
	}

}
