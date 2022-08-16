package behavior;

public class Main {
	
	public static void main(String[] args) {
		
		RagdollCat rd = new RagdollCat();
		Quakka q = new Quakka();
		RedPanda rp = new RedPanda();
		NorwegianForestCat nf = new NorwegianForestCat();
		Groodle g = new Groodle();
		
		Animals[] arr = new Animals[5];
		
		arr[0] = rd;
		arr[1] = q;
		arr[2] = rp;
		arr[3] = nf;
		arr[4] = g;
		
		System.out.println(rd);
		System.out.println(q);
		System.out.println(rp);
		System.out.println(nf);
		System.out.println(g);
		System.out.println("-------------------------");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].eat();
		}
	}
}
