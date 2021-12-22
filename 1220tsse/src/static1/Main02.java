package static1;

public class Main02 {

	public static void main(String[] args) {
		System.out.println(StaticTest.num2);
		// System.out.println(StaticTest.num1);
		StaticTest.check();
		
		StaticTest s1 = new StaticTest();
		s1.check();
	}

}
