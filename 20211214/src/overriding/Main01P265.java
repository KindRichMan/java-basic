package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		//말과 돼지를 생성해보겠습니다.
		
		
		Cat c1 =new Cat();
		c1.name= "야옹이";
		c1.age = 2;
		c1.food="밥밥";
		c1.cuiet="사랑해";
		c1.howl();
		c1.getInfo();
		
		
		Pig p1 =new Pig();
		p1.name="꿀꿀이";
		p1.age=4;
		p1.food="죽죽죽";
		p1.weignt =400;
		p1.howl();
		p1.getInfo();
		



	}

}
