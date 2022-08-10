package maplestory2;

public class Thief implements Behavior {
	
	String weapon = "표창";
	
	@Override
	public void attack() {
		System.out.println("도적이 " + weapon + "을 날렸습니다.");
	}

	@Override
	public void recover() {
		// TODO Auto-generated method stub
		
	}

}
