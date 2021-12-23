package interface1;

public class AIRPLANE implements Vehicle {
	
	private int speed;
	private int gas;
	private String name;
	
	public AIRPLANE(String name) {
		this.speed = 0;
		this.gas =AIR_MAX_GAS;
		this.name=name;
	}

	@Override
	public void accel() {
		if(speed+AIR_HI_SPD > AIR_MAX_SPD) {
			speed = AIR_MAX_SPD;
		}else {
			speed += AIR_HI_SPD;
		}
		gas -=AIR_DOWN_GAS;
	}

	@Override
	public void breakSpeed() {
		if(speed -AIR_DOWN_SPD < MIN_SPD) {
		speed = MIN_SPD;
		}else {
			speed -= AIR_DOWN_SPD;
		}
		}

	@Override
	public void reFuel() {
		if(gas + AIR_HI_GAS >AIR_MAX_GAS) {
			gas = AIR_MAX_GAS;
		}else {
			gas +=AIR_HI_GAS;
		}
		
	}

	@Override
	public void showSTATUS() {
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료 : " + gas);
		System.out.println("현재 차주 : " + name);	
		System.out.println("================================");
	}

}
