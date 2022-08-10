package maplestory2;

public class Archer implements Behavior {

	String weapon = "활";
	
	@Override
	public void attack() {
		System.out.println("궁수가 " + weapon + "을 쐈습니다.");		
	}

	@Override
	public void recover() {
		
	}

}
