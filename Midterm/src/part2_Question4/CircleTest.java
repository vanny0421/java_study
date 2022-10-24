package part2_Question4;

class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}


class CircleManager {
	static void copy(Circle src, Circle dest) {
		dest.setRadius(src.getRadius());
	}
	static boolean equals(Circle a, Circle b) {
		if(a.getRadius() == b.getRadius()) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class CircleTest {
	
	public static void main(String[] args) {
		
		Circle pizza = new Circle(5);
		Circle waffle = new Circle(1);
		
		boolean res = CircleManager.equals(waffle, pizza);
		
		if(res == true) {
			System.out.println("pizza와 waffle은 크기 같음");
		}
		else {
			System.out.println("pizza와 waffle은 크기 다름");
		}
		
		CircleManager.copy(pizza, waffle);
		
		res = CircleManager.equals(pizza, waffle);
		
		if(res == true) {
			System.out.println("pizza와 waffle은 크기 같음");
		}
		else {
			System.out.println("pizza와 waffle은 크기 다름");
		}
	}
}
