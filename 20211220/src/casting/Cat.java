package casting;

public class Cat extends Animal{
	
	public Cat(String name, int age) {
		super(name, age );
	}
	//Cat 특유의 행동을 메서드로 만들어 콘솔에 xx를 합니다. 라고 찍어주세요
	public void acTion() {
		System.out.println("두발로 걷습니다.");
	}
	public void sit() {//오버라이딩
		System.out.println("고양이가 앉습니다.");
	}
	
	

}
