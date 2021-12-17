package game.accessmodifier;

public class Warrior extends Commoner {
	public Warrior(String name) {
	super(name);
	
}
   public void doubleAttack() {
	   System.out.println("더블공격을 시작합니다.");
	   setExp(getExp()+25);
	   setHp(getHp()-4);
	  } 
   public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		//hp -=2;를 직접 실행할 수 없으므로(private라서)
	    //public인 setter(setHp)를 이용합니다.
       //serHp(5)인 경우, 기존의 값 대신 hp변수에 5로 교체해달라는 요청임.
	    //현재 원하는것은, 현 hp값에서 사냥할때마다 2씩 체력이 깍이는 것입니다.
		setHp(getHp()-2);
	}	
	   
	    public void getInfo() {
		//심지어 private요소는 수정이 아닌 조회도 불가능합니다.
		System.out.println("현재체력: " + getHp());
		//체력뿐만 아니라 머지 요소들도 조회할 수  있도록 코드를 추가해주세요.
		
		System.out.println("현재마나 : " + getMp());
		System.out.println("현재레벨 : " + getLv());
		System.out.println("현재경험치 : " + getExp());
		System.out.println("현재아이디 : " + getName());
	}
}