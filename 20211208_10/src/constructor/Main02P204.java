package constructor;

public class Main02P204 {

	public static void main(String[] args) {
		//실패사례
		BakervallPlayer a = new BakervallPlayer(190,100);//키,점프력 순으로 전달
		a.dunkShoot();
		a.dunkShoot();
		a.dunkShoot();
		a.dunkShoot();
		a.dunkShoot();
		a.dunkShoot();
		
		BakervallPlayer b = new BakervallPlayer(200,120);
		b.dunkShoot();
		b.dunkShoot();
		b.dunkShoot();
        
	 //성공사례

}	
	
	
	
	}


