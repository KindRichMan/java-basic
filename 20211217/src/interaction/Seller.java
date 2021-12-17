package interaction;

public class Seller {
	private int money;
	private int mango;
	private int apple;
	
	
	public Seller(int mango, int apple ) {
		this.money = 0;
		this.mango = mango;
		this.apple = apple;
	}   
	 public void sellmango(int mango) {
		 if(this.mango < mango) {
			 System.out.println("망고가 모자랍니다. 현재 재고:" + this.mango);
			 return;
		 }
		 this.mango -= mango;
		 this.money += mango *4000;
	 }
	 public void sellapple(int apple) {
		 if(this.apple < apple) {
			 System.out.println("사과가 모자랍니다. 현재 재고:" + this.apple);
			 return;
		 }
		 this.apple -= apple;
		 this.money += apple * 3000;
	 }
	 public void showSeller() {
		 System.out.println("--------------상인 정보------------------");
		 System.out.println("현재소지금:"+this.money + ", 현재망고재고:" + this.mango + ", 현재사과재고: " + this.apple );
		 System.out.println("--------------------------------------------------");
		 }
		 public int getMango() {
			 return this.mango;
		}	 
		 public int getApple() {
			 return this.apple;
		 
	 }
	 
	 

}
