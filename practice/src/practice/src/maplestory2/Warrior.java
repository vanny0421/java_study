package maplestory2;

import java.util.Random;


public class Warrior implements Behavior {

	String weapon = "검";
	
	RedPotion rp = new RedPotion(10);
	BluePotion bp = new BluePotion(200);
	PowerElixir pe = new PowerElixir(0); 
	Random random = new Random();

	Object[] potion;
	
	
	public Warrior() {
		potion = new Object[3]; 
		
//		potion[0] = rp.redPotion;
//		potion[2] = bp.bluePotion;
//		potion[1] = pe.powerElixir;
		
		potion[0] = rp;
		potion[2] = bp;
		potion[1] = pe;
	}
		
	
	@Override
	public void attack() {
		System.out.println("전사가 " + weapon + "을 휘둘렀습니다.");
	}

	@Override
	public void recover() {
		Object pot = potion[random.nextInt(3)];
//		System.out.println(random.nextInt(3));
		//if (rp.cnt == 0) {
		
		
//		if ( ((RedPotion)pot).cnt == 0 && ((BluePotion)pot).cnt == 0 && ((PowerElixir)pot).cnt == 0) {
//			System.out.println("사용할 포션이 없습니다.");
//		} else if ( ((RedPotion)pot).cnt > 0) {
//			System.out.println(((RedPotion)pot).name + "을 사용했습니다. " + (((RedPotion)pot).cnt-1) + "개 남았습니다.");
//		} else if (((BluePotion)pot).cnt > 0) {
//			System.out.println(((BluePotion)pot).name + "을 사용했습니다. " + (((BluePotion)pot).cnt-1) + "개 남았습니다.");
//		} else if (((PowerElixir)pot).cnt > 0) {
//			System.out.println(((PowerElixir)pot).name + "을 사용했습니다. " + (((PowerElixir)pot).cnt-1) + "개 남았습니다.");			
//		}
		
//		System.out.println();
//		System.out.println(rp.redPotion + "이 1개 줄어들어서 " + (rp.cnt-1) + "개 되었습니다.");
	}
}
