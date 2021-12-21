package interface1;

public class Airplane implements Vehicle {
	
	private int speed;
	private int gas;
	private String name;
	
	public Vehicle(Strig name) {
		this.speed = 0;
		this.gas = MAX_GAS;
		this.name = name;
		
	}

	
	@Override
	public void accel() {
		if(speed + AIRPLANE_INCREASE_SPD < AIRPLANE_MAX_spd) {
			speed += AIRPLANE_INCREASE_SPD;
		}else {
			speed = AIRPLANE_MAX_spd;
		}
		
	}

	@Override
	public void breakSpeed() {
		if(speed - AIRPLANE_DEREASE_SPD < MIN_SPD ) {
			speed = MIN_SPD;
		}else {
			speed -= AIRPLANE_DEREASE_SPD;
	}
		
	}

	@Override
	public void reFuel() {
		if(gas + AIRPLANE_INCREASE_GAS  < AIRPLANE_MAX_GAS ) {
			gas += AIRPLANE_INCREASE_GAS;
		}else {
			gas = AIRPLANE_MAX_GAS;
		}
		gas -= 150;
		
	}

	@Override
	public void showStatus() {
		System.out.println("현재 속도 :" + speed);
		System.out.println("현재 연료 :" + gas);
		System.out.println("현재 기관사 :" + name);
		System.out.println("===============================================");
		
	}

}
