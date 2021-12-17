package structure;

public class Structure03P190 {
	public static void getCatInfo(Cat p) {
	System.out.println(p.name + "의 정보입니다.");
	System.out.println("이름:" + p.name +",나이:"+ p.age +",품종:"+ p.breed);
	}

	public static void main(String[] args) {
		Cat a = new Cat();
		a.name = "메롱";
		System.out.println(a.name);
		a.age = 3;
		System.out.println(a.age);
		a.breed = "페르시안";
		System.out.println(a.breed);
		
		Cat b = new Cat();
		b.name = "사랑";
		System.out.println(b.name);
		b.age = 5;
		System.out.println(b.age);
		b.breed = "뱅골";
		System.out.println(b.breed);
		
		getCatInfo(a);
		getCatInfo(b);

	}

}
