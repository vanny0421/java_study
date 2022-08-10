package maplestory;

public class Wizard implements Behavior {
	
	RedPotion rp = new RedPotion();
	BluePotion bp = new BluePotion();
	PowerElixir pe = new PowerElixir();
	Potion[] p;
	
	public Wizard() {
		p = new Potion[3];
		
		p[0] = rp;
		p[1] = bp;
		p[2] = pe;
	}
	
	
	@Override
	public void attack() {
	
	}
}
