package override;

public class Main03 {
	
	public static void main(String[] args) {
		Army am = new Army("육군");
		Navy nv = new Navy("해군");
		AirForce af = new AirForce("공군");
		
		am.attack();
		am.tank();
		System.out.println("-----------------");
		nv.attack();
		nv.nucleus();		
		System.out.println("-----------------");
		af.attack();
		af.bombing();
	}
}
