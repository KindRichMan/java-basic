package overrriding;

public class Dog extends Animal{
	public String love;
	
	public void howl() {
		System.out.println("멍멍멍");
	}
	public void getInfo() {
		System.out.println("이름:" + name + ", 나이:" + age + ", 사료:" + food + ", 사랑:" + love); 
	
}
}