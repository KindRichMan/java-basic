package interactiou;

public class Seller {
	
	private int money; //매출
	private int mango; //재고
	
	public Seller(int mango) {
		this.money = 0;
		this.money = mango;
		
	}
	public void sellMango(int mango) {
		if(this.mango < mango ) {
			System.out.println("망고가 모자랍니다. 현재 재고 : " + this.mango );
			return;
		}
		
		this.mango -=mango;
		this.money += mango * 4000;
		}
	public void showSeller() {
		System.out.println("=======================상인 정보=====================");
		System.out.println("현재소지금: " + this.money + ", 현재망고재고 :" + this.mango);
		System.out.println("----------------------------------------");
	}
	public int getMango() {
		return this.mango;
	}

}
