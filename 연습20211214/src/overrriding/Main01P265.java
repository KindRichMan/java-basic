package overrriding;

public class Main01P265 {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.name="야옹이";
		c1.age =5;
		c1.food = "개밥";
		c1.cuiet="사랑해";
		c1.howl();
		c1.getInfo();
		
		Dog d2 =new Dog();
		d2.name="개새끼";
		d2.age =10;
		d2.food = "소고기";
		d2.love= "사랑이";
		d2.howl();
		d2.getInfo();
	}
	

}
