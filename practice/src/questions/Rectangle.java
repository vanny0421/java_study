package questions;

public class Rectangle {
	
	int x;
	int y;
	int width;
	int height;
	int circumference;
	int area;
	Point point;
	
	public Rectangle(Point lt, Point rb) {
		this.x = lt.getX();
		this.y = lt.getY();
		this.x = rb.getX();
		this.y = rb.getY();
	};
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x= x1;
		this.y = y1;
		this.x = x2;
		this.y = y2;
	}
	
	public int getWidth() {
		if (width == 0) {
			return x;
		} else {
			return width;
		}
	}
	public int getHeight() {
		if (height == 0) {
			return y;
		} else {
			return height;
		}
	}
	public int getCircumference() {
		if (width == 0 && height == 0) {
			return ( x + y ) * 2;
		} else {
			return ( width + height ) * 2;
		}
	}
	public int getArea() {
		if (width == 0 && height == 0) {
			return x * y;
		} else {
			return width * height;
		}
	}

	void show() {
//		if (this.x == 0 && this.y == 0) {
//			System.out.println("[직사각형 " + this.width + "x" + this.height + " : (" + x + ", " + y + "), (" + width + ", " + height + ")]");
//		} else if (this.width == 0 && this.height == 0) {
//			System.out.println("[직사각형 " + this.x + "x" + this.y + " : (" + x + ", " + y + "), (" + width + ", " + height + ")]");
//		}
		if (this.x == 0 && this.y == 0) {
			System.out.println("[직사각형 " + x + "x" + y + " : (" + x + ", " + y + "), (" + width + ", " + height + ")]");
		} else if (this.width == 0 && this.height == 0) {
			System.out.println("[직사각형 " + this.x + "x" + this.y + " : (" + x + ", " + y + "), (" + width + ", " + height + ")]");
		}
	}
}
