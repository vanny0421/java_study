package singleton;

class Computer {
	static Computer computer = new Computer();
	
	private Computer() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	static public Computer booting() {
		return computer;
	}
	
	
	public void browsing() {
		System.out.println("브라우징을 한다..");
	}
	
	public void searching() {
		System.out.println("검색을 한다..");
	}
	
	public String coding() {
		return "코딩을 한다..";
	}
	
}

public class Home {

	public static void main(String[] args) {
		
		Computer computer = Computer.booting();
		
		computer.searching();
		System.out.println(computer.coding());
		
		
//		Computer computer = new Computer();

//		System.out.println(computer.coding());
//		DBdriver dbdriver = new DBdriver();

	}
}
