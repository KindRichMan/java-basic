package game.inhertance;

public class Magician extends Commoner {
	private int mDam;//마법데미지
	
	public Magician(String name) {
		super(name);
		this.mDam=6;
		
	}
	public void getInfo() {
	
		System.out.println("아이디:" + name + ", 레벨 :"+  1 + ", 체력" + hp + ", 마나:"+ mp + ", 마법데미지: " + mDam);
	}
}
