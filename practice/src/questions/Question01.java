package questions;

class Circle {
	private double pi = 3.141592653589793D;

	double radius = 0;

	Circle(double radius) {
		super();
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return radius * radius * pi;
	}
}

public class Question01 {
	public static void main(String[] args) {
		Circle c1 = new Circle(7);
		
		System.out.println("c1 반지름 : " + c1.getRadius());
		
		System.out.println("c1 의 넓이 : " + c1.getArea());
		
	}
}
