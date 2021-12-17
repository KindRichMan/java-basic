package interactiou;

public class Buyer {
	private int money; // 소지금액
	private int mango;  // 소지망고개수
	
	public Buyer(int mango, int money){
		this.money = money;
		this.mango = 0;	
	}
	public void buyMango(Seller seller, int mango) {
		if((mango*4000) > this.money){
			System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
			return;
		}
		if(seller.getMango() < mango) {
			System.out.println("망고재고가 부족합니다. 망고 재고 :" + seller.getMango());
			return;
		}
		
		this.money -=mango * 4000;
		this.mango += mango;
		
		seller.sellMango(mango);
	}
	    public void showBuyer() {
	    	System.out.println("-------------구매자 정보---------------");
	    	System.out.println("소지 망고: " + mango+ ", 잔여금액 :" + money);
	    	System.out.println("----------------------------------------------");
	    }
	
   }  
