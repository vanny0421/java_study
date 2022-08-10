package maplestory;

public class Thief implements Behavior {
	PowerElixir pe = new PowerElixir();
	Potion[] p;
	
	public Thief() {
		p = new Potion[1];
		
		p[0] = pe;
	}
	@Override
	public void attack() {
		
	}
}
