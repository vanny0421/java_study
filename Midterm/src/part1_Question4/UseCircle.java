package part1_Question4;

class Point {
	int xPos, yPos;
	
	public Point(int xPos, int yPos) { this.xPos = xPos; this.yPos = yPos; }
	
	public void showPointInfo() { 
		
		System.out.println("[" + this.xPos + ", " + this.yPos + "]"); 
	}
}

class Circle {
	int x, y, radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void showCircleInfo() {
		Point p = new Point(x, y);
		System.out.println("radius: " + this.radius);
		p.showPointInfo();
	}
	
}


public class UseCircle {
	
	public static void main(String[] args) {
		
		Circle c = new Circle(2, 2, 4);
		
		c.showCircleInfo();
	}
}
