package structure;

public class Car { //정의부
	//멤버변수
	//멤버변수는 어떤 특정한 사물이나 객체의 "정보,상태"를 나타냅니다.

	
	public String model;//멤버변수
	public int price;//멤버변수
	public String owner;//멤버변수
	
	//멤버ㅓ 메서드 어떤 특정한 사물이나 객체의 "동작" 나타냅니다.
	public void getInfo() {// 멤버메서드(getInfo조회하기)
		System.out.println(owner + "님의 차 정보입니다.");
		System.out.println("차종명:" + model + 
				           ",가격" + price +
				           ",주인: owner");
	}
}
