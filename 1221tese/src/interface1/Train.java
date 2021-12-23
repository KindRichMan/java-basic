package interface1;

public class Train implements Vehicle {
	
	private int speed;
	private int gas;
	private String name;
	
	
	public Train(String name) {
		this.gas = TRAIN_MAX_GAS;
		this.speed =0;
		this.name = name;
		
	}

	@Override
	public void accel() {
		if(speed + TRAIN_CAR_HI_SPD > TRAIN_GOOD_SPD) {
			speed = TRAIN_GOOD_SPD;
		}else {
			speed +=TRAIN_CAR_HI_SPD;
		}
		gas -=TRAIN_CAR_DOWN_GAS;
	}

	@Override
	public void breakSpeed() {
		if(speed-TRAIN_CAR_DOWN_SPD < MIN_SPD) {
			speed = MIN_SPD; 
		}else {
			speed -=TRAIN_CAR_DOWN_SPD;
		}
		
	}

	@Override
	public void reFuel() {
		if(gas + TRAIN_CAR_HI_GAS > TRAIN_MAX_GAS) {
			gas = TRAIN_MAX_GAS;
		}else {
			gas += TRAIN_CAR_HI_GAS;
		}
	}

	@Override
	public void showSTATUS() {
		System.out.println("현재 속도 :" + speed);
		System.out.println("현재 연료 :" + gas);
		System.out.println("현재 차주 :" + name );
		System.out.println("=============================" );
	}
	

}
