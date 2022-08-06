package condition;

public class Main07 {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
			case 'A':
			case 'B':
			case 'C':
				System.out.println("PASS");
				break;
			default:
				System.out.println("NOT-PASS");
				break;
		}
		
	}
}
