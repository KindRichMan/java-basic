package polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		//부모타입은 Person으로 자식은 Student까지 받을 수 있음.
		Person p1 = new Person("김무환",30);
		Person s1 = new Student("김예지",5 ,100);
		
	//p1과 s1의 showPerson은 다르게 돌아갑니다.
	p1.showPerson();//Person측 showPerson
	s1.showPerson();//Student측 showPerson
	
	//신분밝히기용 showStudent()를 호출시도해보세요.
	//s1은 Person타입이므로 Person에 소속된 자원만 호출할 수 있습니다.**중요중요
	// s1.showStudent();

}
}