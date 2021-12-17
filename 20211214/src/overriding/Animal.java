package overriding;

public class Animal {
	//Animal 클래스를 정의해주세요.
	//특성은 3가지를 가집니다.
	//메서드는 울기 howl()을 가지고 내부에는
	//system.out.println("동물이 웁니다.")
	//Animal을 상속한 동물 2종을 여러분이 만들어주시면 됩니다.
	//특성이 하나가 더 추가되도록 해 주세요.
	
	public String name;
	public int age;
	public String food;
	
	public void getInfo() {
	System.out.println("이름은:" + name + ", 나이:" + age + ", 식사:" + food );
	}
	
	public void howl() {
		System.out.println("동물이 웁니다.");
		
	}
	
		
	}


