package interface1;

//Vehicle을
public class Train implements Vehicle {
	private int seed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.seed = 0;
		this.gas =MAX_GAS;
		this.name = name;
	}

	@Override
	public void accel() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}
		
	

}
