package structure;

public class Structure02P190 {
	
	public static void getInfo(person p) {
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("이름:"+p.name +",나이:"+p.age +",연락처:"+p.pNum + ",번호:"+p.uNum);
	}

	// person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(a,b)
		person a = new person();
		
		a.name = ("김대통");
		System.out.println(a.name);
		a.age = (33);
		System.out.println(a.age);
		a.pNum = ("010-1111-1111");
		System.out.println(a.pNum);
		a.uNum =(12234);
		System.out.println(a.uNum);
		
		person p5 =new person();
		
		p5.name =("김무환");
		System.out.println(p5.name);
		p5.age = (24);
		System.out.println(p5.age);
		p5.pNum = ("010-2222-1111");
		System.out.println(p5.pNum);
		p5.uNum =(145674);
		System.out.println(p5.uNum);
		
		
		getInfo(a);//a의 주소값을 getInfo의 p에 전달을 하게 된다.
		getInfo(p5);//P5의 주소값을 getInfo의 p에 전달을 하게 된다.
		//System.out.println(p4.name+"의 정보입니다.");
		//System.out.println("이름 :"+ p4.name +",나이" +p4.age +",연락처"+p4.pNum + ",번호"+p4.uNum);

		//System.out.println(p5.name+"의 정보입니다.");
		//System.out.println("이름 :"+ p5.name +",나이" +p5.age +",연락처"+p5.pNum + ",번호"+p5.uNum);
	}

}
