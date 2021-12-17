package thiskeyword;

public class Person {
	// 사람의 정보를 여기 기입합니다.
	private String name;
	private int age;
	private int money;
	private String major;
	
	public Person(String name, int age, int money, String major){
		this.name = name;//name가 파랗게 된 이유는 이 지역에 같은 name라는 문자가 없어서 상위 지역에서 가져와서 파랗게 됨.
		this.age = age;
		this.money=money;
		this.major=major;
		
	}
	
	//이름, 나이, 소지금액, 전공을 콘솔에 찍어주는 getInfo()를작성해주세요.
	public void getInfo() {
		
		System.out.println("이름:"+ this.name);
		System.out.println("나이:" + age);//this.을 넣어도 되고 안넣어도된다.this.은 상위지역
		System.out.println("소지금:" + money);
		System.out.println("전공:" + this.major);
	
		
	}
	

}
