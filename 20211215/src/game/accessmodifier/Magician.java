package game.accessmodifier;

public class Magician extends Commoner {
	
	public Magician(String name) {//아저띠-메인
		super(name);//아저띠
		// TODO Auto-generated constructor stub
	}
	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		//hp -=2;를 직접 실행할 수 없으므로(private라서)
	    //public인 setter(setHp)를 이용합니다.
        //serHp(5)인 경우, 기존의 값 대신 hp변수에 5로 교체해달라는 요청임.
	    //현재 원하는것은, 현 hp값에서 사냥할때마다 2씩 체력이 깍이는 것입니다.
		setHp(getHp()-2);
	}	
	// fireball 메서드를 생성해주세요.
	// 마나가 3줄고, 경험치는 20증가합니다.
	public void fireball() {
		System.out.println("마법사가 화염구를 던집니다.");
		setMp(getMp()-3);
		setExp(getExp()+20);	
		}
		
		
		//heal 메서드를 새성해주세요.
		//마나가 2줄고 체력이 10회복됩니다.
	public void heal() {
		System.out.println("마법사가 회복주문을 실행합니다.");
		setMp(getMp()-2);
		setHp(getHp()+10);	}
	   
	   //exp += 10;
	 //경험치도 마찬가지로 setExp()
	 //exp +=10;을 직접 실행할 수 없으므로
		// 현재 원하는 것은, exp값에서 사냥할때마다 10씩 경험치가 증가하는 것입니다.

	   
	
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
