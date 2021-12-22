package casting;

public class Main01 {

	public static void main(String[] args) {
		Animal c1 = new Cat("김고양", 30);
		Animal d1 = new Dog("김개새", 40);
		Animal a1 = new Animal("동물", 50);
		c1.sit();
		d1.sit();
		a1.sit();
		
		
		//c1.ccc();
		Cat cat = (Cat)c1;
		cat.ccc();
		
		Dog dog =(Dog)d1;
		dog.ddd();
	}

}
