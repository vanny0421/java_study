package maplestory;

public class MapleStroy {
	
	public static void main(String[] args) {
		Wizard w = new Wizard();
		
		for(int i=0;i<w.p.length;i++) {
			w.p[i].recovery();	
		}
		
		Warrior wr = new Warrior();
		
		for(int i=0;i<wr.p.length;i++) {
			wr.p[i].recovery();
		}
		
		Thief tf = new Thief();
		
		for(int i=0;i<tf.p.length;i++) {
			tf.p[i].recovery();
		}
		
	}
}
