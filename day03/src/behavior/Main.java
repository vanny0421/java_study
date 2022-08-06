package behavior;

public class Main {
	
	public static void main(String[] args) {
		
		FatPerson fp = new FatPerson();
		SkinnyPerson skp = new SkinnyPerson();
		Bi bi = new Bi();
		Lesbian l = new Lesbian();
		Black b = new Black();
		
		Behavior[] arr = new Behavior[5];
		
		arr[0] = fp;
		arr[1] = skp;
		arr[2] = bi;
		arr[3] = l;
		arr[4] = b;
		
		System.out.println(fp);
		System.out.println(skp);
		System.out.println(bi);
		System.out.println(l);
		System.out.println(b);
		System.out.println("-------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
//			fp.eat();
//			skp.eat();
//			bi.eat();
//			l.eat();
//			b.eat();
//			break;
		}
		
	}
}
