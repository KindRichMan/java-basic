package constructor;

public class Main01P204 {

	public static void main(String[] args) {
		// 자동차 한 대를 만들어주세요.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름으로 만들어주세요.
		
		Car a = new Car("김무환");
		// 생성자로 gas,speed,owner를 처리
		//a.gas =100;
		//a.speed = 0;
		//a.owner = "김무환";
		
		//차를 뽑자마자 먼저 사애 확인
		a.getInfo();
		// 엑셀을 두 번 밟아주세요.
		a.accelspeed();
		a.accelspeed();				
		// 상태 다시 확인		
			a.getInfo();
	  	
		// 브레이크 밟아주세요.
			a.breakspeed();
		
		// 상태 다시 확인	
			a.getInfo();
			
			//주유를 해보세요.
			a.putGas();
			
			//상태 다시 확인
			a.getInfo();
			
	/////////////////////////////////////
			
			Car b = new Car("김예지");
			
			//b.gas = 150;
			//b.speed = 10;
			//b.owner = "김예지";
			
			b.getInfo();
			//엑셀밟기
			b.accelspeed();
			//상태확인
			b.getInfo();
			
			//엑셀밟기
			b.breakspeed();
			b.breakspeed();
			
			//상태확인
			b.getInfo();
			
			//주유를 해보세요.
			b.putGas();
			b.putGas();
			
			//상태 확인
			b.getInfo();
			
	}

	}


