package overriding;

public class Pig extends Animal{
	
	public int weignt;
	
	public void howl() {
		System.out.println("꿀꿀");
	}
	public void getInfo() {
		System.out.println("이름은:" + name + ", 나이:" + age + ", 식사:" + food + ", 무게:" + weignt);
	
	}
	

}
