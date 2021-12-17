package structure;

public class Structure01P190 {

	public static void main(String[] args) {
		// 이제부터는 실행코드와 정의 코드를 분리합니다.
		// main이 있는 클래스는 실행만 하고
		// 실제 로직은 다른.java파일에 저장합니다.
		
		// 커스텀 디자인 자료형은
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		person p1 = new person();//실행부
		// p1내부에 정의한 변수를
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		
		p1.name = ("김무환");
		System.out.println(p1.name);
		p1.age = (13);
		System.out.println(p1.age);
		p1.pNum = ("010-1212-1222");
	    System.out.println(p1.pNum);
		p1.uNum = (223234);
		System.out.println(p1.uNum);
		System.out.println("========");
		
		
		person p2 = new person();
		// p1내부에 정의한 변수를
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		
		p2.name = ("김예지");
		System.out.println(p2.name);
		p2.age = (5);
		System.out.println(p2.age);
		p2.pNum =("12232321321");
		System.out.println(p2.pNum);
		p2.uNum = (122323213);
		System.out.println(p2.uNum);
		
		person p3= new person();
		
		p3.name =("김용철");
		System.out.println(p3.name);
		p3.age =(33);
		System.out.println(p3.age);
		p3.pNum =("010-222-0000");
		System.out.println(p3.pNum);
		p3.uNum =(123);
		System.out.println(p3.uNum);
		
		System.out.println(p1.name+"의 정보입니다.");
		System.out.println("이름 :"+ p1.name +",나이" +p1.age +",연락처"+p1.pNum + ",번호"+p1.uNum);
		

		
		
		

	}

}
