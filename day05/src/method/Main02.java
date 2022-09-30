package method;

public class Main02 {

	public static void main(String[] args) {
		plus(10, 20);
		minus(20, 10);
		times(2, 10);
		divide(10, 2);
	}
	
	public static void plus(int x, int y) {
		System.out.println(x + y);
	}
	
	public static void minus(int x, int y) {
		System.out.println(x - y);
	}
	
	public static void times(int x, int y) {
		System.out.println(x * y);
	}
	
	public static void divide(int x, int y) {
		System.out.println(x / y);
	}
}
