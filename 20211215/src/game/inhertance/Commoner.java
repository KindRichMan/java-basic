package game.inhertance;

public class Commoner {//변수
	//아이디,레벨,체력,마나수치
	protected String name;
	protected int lv;
	protected int hp;
	protected int mp;
	
	// 생성자는 레벨1, 체력20, 마나10을 기본으으로, 아이디는 입력받아 처리
	public Commoner(String name){//생성자
		//생성자 내부에서 멤버변수를 초기화할때는 this.를 붙이는 경우가 많습니다.
		this.name =name;
		this.lv =1;
		this.hp =20;
		this.mp =10;
	}
		public void getInfo() {
			System.out.println("아이디:" + name + ", 레벨 :"+  1 + ", 체력" + hp + ", 마나:"+ mp);
		}
		
				
		
	}
	


