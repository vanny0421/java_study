package practice;

class MacBook {
	int generation;
	String core;
	String screen;
	String speaker;
	
	public MacBook (int generation, String core) {
		this.generation = generation;
		this.core = core;
	}
	
	public MacBook (int generation, String core, String screen) {
		this.generation = generation;
		this.core = core;
		this.screen = screen;
	}
	public MacBook (int generation, String core, String screen, String speaker) {
		this.generation = generation;
		this.core = core;
		this.screen = screen;
		this.speaker = speaker;
	}
}

public class Apple {
	public static void main(String[] args) {
	
		MacBook g1_0001 = new MacBook(1, "Intel");
		MacBook g1_0002 = new MacBook(1, "Intel");
		MacBook g1_0003 = new MacBook(1, "Intel");
		
		MacBook g2_0001 = new MacBook(2, "Intel", "고급");
		MacBook g2_0002 = new MacBook(2, "Intel", "고급");
		
		MacBook g3_0001 = new MacBook(3, "Intel", "고급", "저급");
		
		MacBook g4_0001 = new MacBook(4, "m1", "고급", "야마하");
		MacBook g4_0002 = new MacBook(4, "m1", "고급", "야마하");
		MacBook g4_0003 = new MacBook(4, "m1", "고급", "야마하");
		MacBook g4_0004 = new MacBook(4, "m1", "고급", "야마하");
		MacBook g4_0005 = new MacBook(4, "m1", "고급", "야마하");
	}
}
