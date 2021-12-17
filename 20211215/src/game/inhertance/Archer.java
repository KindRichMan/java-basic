package game.inhertance;

public class Archer extends Commoner {
	private int rDam;//원거리 데미지
	
	public Archer(String name) {
	super(name);
	this.rDam=10;

}
	public void getInfo() {
		System.out.println("아이디:" + name + ", 레벨 :"+  1 + ", 체력" + hp + ", 마나:"+ mp +", 원거리데미지:" + rDam);
}
}