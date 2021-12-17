package game.accessmodifier;

public class Main01 {

	public static void main(String[] args) {
		//Mangician을 생성해주세요.
		Magician m1 =new Magician("아저띠");
		
		
		//교전 전에 getInfo()로
		//정보부터 조회해주세요.
		
		m1.getInfo();
			//hunt()로 사냥해주세요.
		m1.hunt();
		m1.getInfo();
		
		m1.fireball();
		m1.heal();
	    m1.getInfo();
		
	   }
		
		

	}


