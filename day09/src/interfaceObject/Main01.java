package interfaceObject;

public class Main01 {

	public static void main(String[] args) {
		
		Character ch = new Character("주인공");
		ch.walk();
		ch.run();
		ch.attack();
		ch.attack();
		ch.shield();
		ch.pickup();
		
		System.out.println("-------------------");
		
		Monster mon = new Monster("악당");
		mon.run();
		mon.walk();
		mon.shield();
		mon.attack();
	}
}
