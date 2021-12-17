package game.polymorphism;

public class Main02 {

	public static void main(String[] args) {
		Commoner c1 = new Commoner("이순신");
		Monster z1 =new Zealot();
		Monster d1 =new Dragoon();
		Monster da =new Dark();
		
		
		c1.hunt(z1);
		c1.hunt(d1);
		c1.hunt(da);
		c1.hunt(z1);
		c1.hunt(z1);
		c1.hunt(z1);
	}

}
