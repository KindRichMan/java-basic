package interaction;

public class Buyer {
	private int money;
	private int mango;
	private int apple;
	
	public Buyer(int mango, int apple) {
		this.money = money;
		this.mango =0;
		this.apple = 0;
	}
	public void buyMango(Seller seller, int mango) {
		if((mango*4000) > this.money){
			System.out.println("돈이 모자랍니다. 소지금 :" + this.money);
			return;}
		if(seller.getMango() < mango) {
			System.out.println("망고재고가 부족합니다. 망고 재고 : " + seller.getMango());
			return;
		}
		this.money -= mango*4000;
		this.mango += mango;
	
		seller.sellMango(mango);
	}
		
		public void buyApple(Seller seller, int apple) {
			if((apple*3000) > this.money) {
				System.out.println("돈이 모자랍니다. 소지금:" + this.money);
				return;
			}
			if(seller.getApple() < apple) {
				System.out.println("사과재고가 부족합니다. 사과 재고 : " + seller.getApple() );
				return;
			}
			this.apple -= apple*4000;
			this.apple += apple;
			seller.sellApple(apple);
		}
		public void showBuyer() {
			System.out.println("----------------구매자 정보--------------------");
			System.out.println("소지중인 망고 개수 :" + mango + ", 소지중인 사과 개수: " + apple + ", 잔여금액 :" + money);
			System.out.println("-----------------------------------------");
		}
	}


