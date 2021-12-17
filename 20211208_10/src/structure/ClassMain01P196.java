package structure;

public class ClassMain01P196 {
	//personClass의 메서드는 작성할 필요가 없습니다.
	// 이미 personClass의 내부에 필요한 메서드를 다 작성해놨기때문입니다.

	public static void main(String[] args) {
		// 사람을 두 명 만드어 보세요.
		PersonClass a  = new PersonClass();
		
		a.name = "김무환";
		System.out.println(a.name);
		a.age = 12;
		System.out.println(a.age);
		a.pNum = "030.0300.0202";
		System.out.println(a.pNum);
		a.uNum = 123;
		System.out.println(a.uNum);
		a.hobby = "드론비행";
		System.out.println(a.hobby);
		a.glasses = true;
		System.out.println(a.glasses);
		
		
     PersonClass b = new PersonClass();
		
		b.name = "김예지";
		System.out.println(b.name);
		b.age = 5;
		System.out.println(b.age);
		b.pNum = "122.1233.1111";
		System.out.println(b.pNum);
		b.uNum = 222;
		System.out.println(b.uNum);
		b.hobby = "아빠랑놀기";
		System.out.println(b.hobby);
		b.glasses = false;
		System.out.println(b.glasses);
		
		a.getInfo();
		b.getInfo();
		
		// 만든 사람 두 명의 정보를 콘솔에 찍어보세요.

	}

}
