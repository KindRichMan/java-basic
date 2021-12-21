package interface1;

public class  Car implements Vehicle {

	@Override
	public void accel() {
		// TODO Auto-generated method stub
		if(speed + CAR_INCREASE_SPD > CAR_MAX_SPD > CAR_MAX_SPD) {
			
		}
	}

	@Override
	public void breakSpeed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reFuel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showStatus() {
		System.out.println("현재 속도 :" + speed);
		System.out.println("현재 연료 :" + gas);
		System.out.println("현재 기관사 :" + name);
		System.out.println("===============================================");
		
	}


}
