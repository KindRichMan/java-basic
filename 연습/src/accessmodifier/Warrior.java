package accessmodifier;

public class Warrior {
	// name, hp, mp, lv, atk, def, exp;
	//선언
	public String name;
	public int hp;
	public int mp;
	public int lv;
	public int atk;
	public int def;
	public int  exp;
	
	//생성자를 만들어주시되, name만 ㅅ용자에게 입력받고, 나머지는
	
	public Warrior(String n) {
		name = n;
		hp = 20;
		mp = 10;
		lv = 1;
		atk = 3;
		def = 0;
		exp = 0;
		System.out.println("전사 생성완료");
		System.out.println("아이디: " + name + "체력:" + hp + "경험치:" + exp );
	}
	
	public void hunt() {
		hp -=2;
		exp +=10;
		System.out.println("현재체력이" + hp +"가 되었고, 경험치가" + exp + "되었습니다.");
	}
	
	

}
