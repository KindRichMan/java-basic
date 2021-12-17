package polymorphism;

public class Boy extends Person{
	
	private String hobby;
	
	public Boy(String name, int age, String hobby) {
		super(name,age);
		this.hobby=hobby;
	}
	public void showPerson() {
		super.showPerson();		
		System.out.println("  취미:" + hobby);
	}
	
	

}
